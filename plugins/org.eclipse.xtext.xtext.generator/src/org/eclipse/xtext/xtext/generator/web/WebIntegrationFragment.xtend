/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.web

import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import com.google.inject.Provider
import com.google.inject.name.Names
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import org.eclipse.emf.mwe2.runtime.Mandatory
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2
import org.eclipse.xtext.xtext.generator.CodeConfig
import org.eclipse.xtext.xtext.generator.Issues
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TextFileAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.model.annotations.WebServletAnnotation
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming
import org.eclipse.xtext.xtext.generator.xbase.XbaseUsageDetector

import static extension org.eclipse.xtext.GrammarUtil.*
import static extension org.eclipse.xtext.util.Strings.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*
import static extension org.eclipse.xtext.xtext.generator.util.GrammarUtil2.*

/**
 * Main generator fragment for web integration.
 */
class WebIntegrationFragment extends AbstractGeneratorFragment2 {
	
	private static enum Framework {
		ORION, ACE, CODEMIRROR
	}
	
	static val REQUIREJS_VERSION = '2.1.17'
	static val REQUIREJS_TEXT_VERSION = '2.0.10-3'
	static val JQUERY_VERSION = '2.1.4'
	static val ACE_VERSION = '1.1.9'
	static val CODEMIRROR_VERSION = '5.5'
	
	@Inject FileAccessFactory fileAccessFactory
	@Inject CodeConfig codeConfig
	@Inject extension XtextGeneratorNaming
	@Inject extension GrammarNaming
	@Inject extension XbaseUsageDetector
	
	val enabledPatterns = new HashSet<String>
	val suppressedPatterns = new HashSet<String>
	
	Framework framework
	boolean generateJsHighlighting = true
	String highlightingModuleName
	String highlightingPath
	String keywordsFilter = '\\w*'
	boolean generateServlet = false
	boolean useServlet3Api = true
	boolean generateJettyLauncher = false
	boolean generateHtmlExample = false
	
	/**
	 * Choose one of the supported frameworks: {@code "Orion"}, {@code "Ace"}, or {@code "CodeMirror"}
	 */
	@Mandatory
	def void setFramework(String frameworkName) {
		this.framework = Framework.valueOf(frameworkName.toUpperCase)
	}
	
	/**
	 * Whether JavaScript-based syntax highlighting should be generated. The default is {@code true}.
	 */
	def void setGenerateJsHighlighting(boolean generateJsHighlighting) {
		this.generateJsHighlighting = generateJsHighlighting
	}
	
	/**
	 * Name of the syntax highlighting RequireJS module to be generated.
	 */
	def void setHighlightingModuleName(String moduleName) {
		this.highlightingModuleName = moduleName
	}
	
	/**
	 * The path of the syntax highlighting JavaScript file to be generated. The default is to
	 * derive the path from the {@code highlightingModuleName} property.
	 */
	def void setHighlightingPath(String path) {
		this.highlightingPath = path
	}
	
	/**
	 * Regular expression for filtering those language keywords that should be highlighted. The default
	 * is {@code \w*}, i.e. keywords consisting only of letters and digits.
	 */
	def void setKeywordsFilter(String keywordsFilter) {
		this.keywordsFilter = keywordsFilter
	}
	
	/**
	 * Whether a servlet for DSL-specific services should be generated. The default is {@code false}.
	 */
	def void setGenerateServlet(boolean generateServlet) {
		this.generateServlet = generateServlet
	}
	
	/**
	 * Whether the Servlet 3 API ({@code WebServlet} annotation) should be used for the generated servlet.
	 * The default is {@code true}.
	 */
	def void setUseServlet3Api(boolean useServlet3Api) {
		this.useServlet3Api = useServlet3Api
	}
	
	/**
	 * Whether a Java main-class for launching a local Jetty server should be generated. The default
	 * is {@code false}.
	 */
	def void setGenerateJettyLauncher(boolean generateJettyLauncher) {
		this.generateJettyLauncher = generateJettyLauncher
	}
	
	/**
	 * Whether an example {@code index.html} file for testing the web-based editor should be generated.
	 * The default is {@code false}.
	 */
	def void setGenerateHtmlExample(boolean generateHtmlExample) {
		this.generateHtmlExample = generateHtmlExample
	}
	
	/**
	 * Enable a default pattern for syntax highlighting. See the documentation of the chosen
	 * framework for details.
	 */
	def void addEnablePattern(String pattern) {
		enabledPatterns += pattern
	}
	
	/**
	 * Suppress a default pattern for syntax highlighting. See the documentation of the chosen
	 * framework for details. 
	 */
	def void addSuppressPattern(String pattern) {
		suppressedPatterns += pattern
	}
	
	protected def TypeReference getServerLauncherClass(Grammar grammar) {
		new TypeReference(grammar.webBasePackage + '.' + 'ServerLauncher')
	}
	
	protected def TypeReference getServletClass(Grammar grammar) {
		new TypeReference(grammar.webBasePackage + '.' + GrammarUtil.getSimpleName(grammar) + 'Servlet')
	}
	
	override checkConfiguration(Issues issues) {
		super.checkConfiguration(issues)
		if (framework === null)
			issues.addError('The property \'framework\' is required.')
		if (generateJsHighlighting && projectConfig.webApp === null)
			issues.addWarning('The \'webApp\' outlet is not defined in the project configuration; JS syntax highlighting is disabled.')
		if (generateServlet && projectConfig.webSrc === null)
			issues.addWarning('The \'webSrc\' outlet is not defined in the project configuration; the generated servlet is disabled.')
		if (generateJettyLauncher && projectConfig.webSrc === null)
			issues.addWarning('The \'webSrc\' outlet is not defined in the project configuration; the Jetty launcher is disabled.')
		if (generateHtmlExample && projectConfig.webApp === null)
			issues.addWarning('The \'webApp\' outlet is not defined in the project configuration; the example HTML page is disabled.')
		for (pattern : enabledPatterns.filter[suppressedPatterns.contains(it)]) {
			issues.addError('The pattern \'' + pattern + '\' cannot be enabled and suppressed.')
		}
	}
	
	override generate() {
		if (generateJsHighlighting && projectConfig.webApp !== null) {
			val langId = language.fileExtensions.head
			if (highlightingModuleName.nullOrEmpty) {
				highlightingModuleName = switch framework {
					case ORION: 'xtext-resources/generated/' + langId + '-syntax'
					case ACE, case CODEMIRROR: 'xtext-resources/generated/mode-' + langId
				}
			} else if (highlightingModuleName.endsWith('.js'))
				highlightingModuleName = highlightingModuleName.substring(0, highlightingModuleName.length - 3)
			if (highlightingPath.nullOrEmpty)
				highlightingPath = highlightingModuleName + '.js'
			
			generateJavaScript(langId).writeTo(projectConfig.webApp)
		}
		
		if (generateServlet && projectConfig.webSrc !== null) {
			generateServlet()
		}
		if (generateJettyLauncher && projectConfig.webSrc !== null) {
			generateServerLauncher()
		}
		if (generateHtmlExample && projectConfig.webApp !== null) {
			generateIndexDoc()
			generateStyleSheet()
		}
		
		// TODO move this configuration to an IDE module?
		val StringConcatenationClient lexerStatement =
			'''binder.bind(�'org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer'.typeRef�.class).annotatedWith(�Names�.named(�'org.eclipse.xtext.ide.LexerIdeBindings'.typeRef�.CONTENT_ASSIST)).to(�grammar.internalContentAssistLexerClass�.class);'''
		new GuiceModuleAccess.BindingFactory()
			.addConfiguredBinding('ContentAssistLexer', lexerStatement)
			.addTypeToType('org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser'.typeRef,
				grammar.contentAssistParserClass)
			.contributeTo(language.webGenModule)
	}
	
	protected def TextFileAccess generateJavaScript(String langId) {
		val keywords = grammar.allKeywords
		val filteredKeywords = keywords.filter[matches(keywordsFilter)].map[convertToJavaString].toList
		val jsFile = fileAccessFactory.createTextFile()
		jsFile.path = highlightingPath
		switch framework {
			
			case ORION: {
				val patterns = createOrionPatterns(langId, keywords, filteredKeywords)
				jsFile.content = '''
					define("�highlightingModuleName�", function() {
						var keywords = "�FOR keyword : filteredKeywords.sort SEPARATOR '|'��keyword��ENDFOR�";
						return {
							id: "xtext.�langId�",
							contentTypes: ["xtext/�langId�"],
							patterns: [
								�FOR pattern : patterns SEPARATOR ',\n'��pattern��ENDFOR�
							]
						};
					});
				'''
			}
			
			case ACE: {
				val patterns = createCodeMirrorPatterns(langId, keywords, filteredKeywords)
				jsFile.content = '''
					define("�highlightingModuleName�", ["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
						var HighlightRules = function() {
							�IF !filteredKeywords.empty�
								var keywords = "�FOR keyword : filteredKeywords.sort SEPARATOR '|'��keyword��ENDFOR�";
							�ENDIF�
							this.$rules = {
								�FOR state : patterns.keySet SEPARATOR ','�
									"�state�": [
										�FOR rule : patterns.get(state) SEPARATOR ',\n'��rule��ENDFOR�
									]
								�ENDFOR�
							};
						};
						oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
						
						var Mode = function() {
							this.HighlightRules = HighlightRules;
						};
						oop.inherits(Mode, mText.Mode);
						Mode.prototype.$id = "xtext/�langId�";
						Mode.prototype.getCompletions = function(state, session, pos, prefix) {
							return [];
						}
						
						return {
							Mode: Mode
						};
					});
				'''
			}
			
			case CODEMIRROR: {
				val patterns = createCodeMirrorPatterns(langId, keywords, filteredKeywords)
				jsFile.content = '''
					define("�highlightingModuleName�", ["codemirror", "codemirror/addon/mode/simple"], function(CodeMirror, SimpleMode) {
						�IF !filteredKeywords.empty�
							var keywords = "�FOR keyword : filteredKeywords.sort SEPARATOR '|'��keyword��ENDFOR�";
						�ENDIF�
						CodeMirror.defineSimpleMode("xtext/�langId�", {
							�FOR state : patterns.keySet SEPARATOR ','�
								�state�: �IF state == 'meta'�{�ELSE�[�ENDIF�
									�FOR rule : patterns.get(state) SEPARATOR ',\n'��rule��ENDFOR�
								�IF state == 'meta'�}�ELSE�]�ENDIF�
							�ENDFOR�
						});
					});
				'''
			}
			
		}
		return jsFile
	}
	
	protected def Collection<String> createOrionPatterns(String langId, Collection<String> keywords,
			Collection<String> filteredKeywords) {
		val inheritsTerminals = grammar.inherits(TERMINALS)
		val inheritsXbase = grammar.inheritsXbase
		val patterns = new ArrayList<String>
		
		if (enabledPatterns.contains('comment_singleLine')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('comment_singleLine'))
			patterns += '{include: "orion.c-like#comment_singleLine"}'
		
		if (enabledPatterns.contains('comment_block')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('comment_block'))
			patterns += '{include: "orion.c-like#comment_block"}'
		
		if (enabledPatterns.contains('string_doubleQuote')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('string_doubleQuote'))
			patterns += '{include: "orion.lib#string_doubleQuote"}'
		
		if (enabledPatterns.contains('string_singleQuote')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('string_singleQuote'))
			patterns += '{include: "orion.lib#string_singleQuote"}'
		
		if (enabledPatterns.contains('number_decimal')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('number_decimal'))
			patterns += '{include: "orion.lib#number_decimal"}'
		
		if (enabledPatterns.contains('number_hex')
				|| inheritsXbase && !suppressedPatterns.contains('number_hex'))
			patterns += '{include: "orion.lib#number_hex"}'
		
		if (enabledPatterns.contains('brace_open')
				|| keywords.contains('{') && !suppressedPatterns.contains('brace_open'))
			patterns += '{include: "orion.lib#brace_open"}'
		
		if (enabledPatterns.contains('brace_close')
				|| keywords.contains('}') && !suppressedPatterns.contains('brace_close'))
			patterns += '{include: "orion.lib#brace_close"}'
		
		if (enabledPatterns.contains('bracket_open')
				|| keywords.contains('[') && !suppressedPatterns.contains('bracket_open'))
			patterns += '{include: "orion.lib#bracket_open"}'
		
		if (enabledPatterns.contains('bracket_close')
				|| keywords.contains(']') && !suppressedPatterns.contains('bracket_close'))
			patterns += '{include: "orion.lib#bracket_close"}'
		
		if (enabledPatterns.contains('parenthesis_open')
				|| keywords.contains('(') && !suppressedPatterns.contains('parenthesis_open'))
			patterns += '{include: "orion.lib#parenthesis_open"}'
		
		if (enabledPatterns.contains('parenthesis_close')
				|| keywords.contains(')') && !suppressedPatterns.contains('parenthesis_close'))
			patterns += '{include: "orion.lib#parenthesis_close"}'
		
		if (enabledPatterns.contains('doc_block'))
			patterns += '{include: "orion.lib#doc_block"}'
		
		if (!filteredKeywords.empty)
			patterns += '''{match: "\\b(?:" + keywords + ")\\b", name: "keyword.�langId�"}'''
		
		return patterns
	}
	
	protected def Multimap<String, String> createCodeMirrorPatterns(String langId, Collection<String> keywords,
			Collection<String> filteredKeywords) {
		val inheritsTerminals = grammar.inherits(TERMINALS)
		val inheritsXbase = grammar.inheritsXbase
		val patterns = LinkedHashMultimap.<String, String>create
		
		val hasSingleLineComment = enabledPatterns.contains('comment_singleLine')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('comment_singleLine')
		if (hasSingleLineComment)
			patterns.put('start', '''{token: "comment", regex: "\\/\\/.*$"}''')
		
		if (enabledPatterns.contains('comment_block')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('comment_block')) {
			patterns.put('start', '''{token: "comment", regex: "\\/\\*", next : "comment"}''')
			patterns.put('comment', '''{token: "comment", regex: ".*?\\*\\/", next : "start"}''')
			patterns.put('comment', '''{token: "comment", regex: ".+"}''')
		}
		
		if (enabledPatterns.contains('string_doubleQuote')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('string_doubleQuote'))
			patterns.put('start', '''{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'}''')
		
		if (enabledPatterns.contains('string_singleQuote')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('string_singleQuote'))
			patterns.put('start', '''{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"}''')
		
		if (enabledPatterns.contains('number_decimal')
				|| (inheritsTerminals || inheritsXbase) && !suppressedPatterns.contains('number_decimal'))
			patterns.put('start', '''{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"}''')
		
		if (enabledPatterns.contains('number_hex')
				|| inheritsXbase && !suppressedPatterns.contains('number_hex'))
			patterns.put('start', '''{token: "constant.numeric", regex: "0[xX][0-9a-fA-F]+\\b"}''')
		
		val bracketOpen = enabledPatterns.contains('bracket_open') || keywords.contains('[') && !suppressedPatterns.contains('bracket_open')
		val parenOpen = enabledPatterns.contains('parenthesis_open') || keywords.contains('(') && !suppressedPatterns.contains('parenthesis_open')
		val braceOpen = enabledPatterns.contains('brace_open') || keywords.contains('{') && !suppressedPatterns.contains('brace_open')
		if (bracketOpen || parenOpen || braceOpen)
			patterns.put('start', '''{token: "lparen", regex: "[�IF bracketOpen�\\[�ENDIF��IF parenOpen�(�ENDIF��IF braceOpen�{�ENDIF�]"}''')
		
		val bracketClose = enabledPatterns.contains('bracket_close') || keywords.contains(']') && !suppressedPatterns.contains('bracket_close')
		val parenClose = enabledPatterns.contains('parenthesis_close') || keywords.contains(')') && !suppressedPatterns.contains('parenthesis_close')
		val braceClose = enabledPatterns.contains('brace_close') || keywords.contains('}') && !suppressedPatterns.contains('brace_close')
		if (bracketClose || parenClose || braceClose)
			patterns.put('start', '''{token: "rparen", regex: "[�IF bracketClose�\\]�ENDIF��IF parenClose�)�ENDIF��IF braceClose�}�ENDIF�]"}''')
		
		if (!filteredKeywords.empty)
			patterns.put('start', '''{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}''')
		
		if (framework == Framework.CODEMIRROR && patterns.containsKey('comment'))
			patterns.put('meta', '''dontIndentStates: ["comment"]''')
		if (framework == Framework.CODEMIRROR && hasSingleLineComment)
			patterns.put('meta', '''lineComment: "//"''')
		
		return patterns
	}
	
	protected def generateIndexDoc() {
		val indexFile = fileAccessFactory.createTextFile
		indexFile.path = 'index.html'
		
		indexFile.content = '''
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Strict//EN" "http://www.w3.org/TR/html4/strict.dtd">
			<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
				<meta http-equiv="Content-Language" content="en-us">
				<title>Example Web Editor</title>
				�IF framework == Framework.ORION�
					<link rel="stylesheet" type="text/css" href="orion/code_edit/built-codeEdit.css"/>
					<link rel="stylesheet" type="text/css" href="xtext/�codeConfig.xtextVersion�/xtext-orion.css"/>
				�ELSEIF framework == Framework.ACE�
					<link rel="stylesheet" type="text/css" href="xtext/�codeConfig.xtextVersion�/xtext-ace.css"/>
				�ELSEIF framework == Framework.CODEMIRROR�
					<link rel="stylesheet" type="text/css" href="webjars/codemirror/�CODEMIRROR_VERSION�/lib/codemirror.css"/>
					<link rel="stylesheet" type="text/css" href="webjars/codemirror/�CODEMIRROR_VERSION�/addon/hint/show-hint.css"/>
					<link rel="stylesheet" type="text/css" href="xtext/�codeConfig.xtextVersion�/xtext-codemirror.css"/>
				�ENDIF�
				<link rel="stylesheet" type="text/css" href="style.css"/>
				<script src="webjars/requirejs/�REQUIREJS_VERSION�/require.min.js"></script>
				<script type="text/javascript">
					�IF framework == Framework.ORION�
						require.config({
							paths: {
								"text": "webjars/requirejs-text/�REQUIREJS_TEXT_VERSION�/text",
								"jquery": "webjars/jquery/�JQUERY_VERSION�/jquery.min",
								"xtext/xtext-orion": "xtext/�codeConfig.xtextVersion�/xtext-orion"
							}
						});
						require(["orion/code_edit/built-codeEdit-amd"], function() {
							require(["xtext/xtext-orion"], function(xtext) {
								xtext.createEditor({syntaxDefinition: "�if (generateJsHighlighting) highlightingModuleName else 'none'�"});
							});
						});
					�ELSEIF framework == Framework.ACE�
						require.config({
							paths: {
								"jquery": "webjars/jquery/�JQUERY_VERSION�/jquery.min",
								"ace/ext/language_tools": "webjars/ace/�ACE_VERSION�/src/ext-language_tools",
								"xtext/xtext-ace": "xtext/�codeConfig.xtextVersion�/xtext-ace"
							}
						});
						require(["webjars/ace/�ACE_VERSION�/src/ace"], function() {
							require(["xtext/xtext-ace"], function(xtext) {
								xtext.createEditor({syntaxDefinition: "�if (generateJsHighlighting) highlightingModuleName else 'none'�"});
							});
						});
					�ELSEIF framework == Framework.CODEMIRROR�
						require.config({
							paths: {
								"jquery": "webjars/jquery/�JQUERY_VERSION�/jquery.min",
								"xtext/xtext-codemirror": "xtext/�codeConfig.xtextVersion�/xtext-codemirror"
							},
							packages: [{
								name: "codemirror",
								location: "webjars/codemirror/�CODEMIRROR_VERSION�",
								main: "lib/codemirror"
							}]
						});
						require([�IF generateJsHighlighting�"�highlightingModuleName�", �ENDIF�"xtext/xtext-codemirror"], function(�IF generateJsHighlighting�mode, �ENDIF�xtext) {
							xtext.createEditor(�IF !generateJsHighlighting�{syntaxDefinition: "none"}�ENDIF�);
						});
					�ENDIF�
				</script>
			</head>
			<body>
			
			<div class="container">
				<div class="header">
					<h1>Example �GrammarUtil.getSimpleName(grammar)� Web Editor</h1>
				</div>
				<div class="content">
					<div id="xtext-editor" data-editor-xtext-lang="�language.fileExtensions.head�"></div>
				</div>
			</div>
			
			</body>
			</html>
		'''
		return indexFile
	}
	
	protected def generateStyleSheet() {
		val styleFile = fileAccessFactory.createTextFile
		styleFile.path = 'style.css'
		
		styleFile.content = '''
			body {
				width: 100%;
				height: 100%;
				overflow: hidden;
				font: 16px Helvetica,sans-serif;
			}
			
			a {
				color: #22a;
				text-decoration: none;
			}
			
			a:hover {
				text-decoration: underline;
			}
			
			.container {
				display: block;
				position: absolute;
				top: 0;
				bottom: 0;
				left: 0;
				right: 0;
				margin: 20px;
			}
			
			.header {
				display: block;
				position: absolute;
				background-color: #e8e8e8;
				top: 0;
				left: 0;
				right: 0;
				height: 60px;
				padding: 10px;
			}
			
			.content {
				display: block;
				position: absolute;
				top: 90px;
				bottom: 0;
				left: 0;
				width: 640px;
			}
			
			#xtext-editor {
				display: block;
				position: absolute;
				top: 0;
				bottom: 0;
				left: 0;
				right: 0;
				padding: 4px;
				border: 1px solid #aaa;
			}
			�IF framework == Framework.ORION�
				
				/************* Examples for custom icons *************/
				
				/* For all elements of type Greeting or its subtypes */ 
				/*
					.Greeting-icon {
				  		background-image: url('images/Greeting.gif');
				  	}
				 */
				
				/* Only in hovers */ 
				/*
					.xtext-hover .Greeting-icon {
				  		background-image: url('images/Greeting.gif');
				  	}
				 */
			�ENDIF�
		'''
		styleFile.writeTo(projectConfig.webApp)
	}
	
	protected def generateServerLauncher() {
		val xtendFile = fileAccessFactory.createXtendFile(grammar.serverLauncherClass)
		xtendFile.typeComment = '''
			/**
			 * This program starts an HTTP server for testing the web integration of your DSL.
			 * Just execute it and point a web browser to http://localhost:8080/
			 */
		'''
		xtendFile.javaContent = '''
			class �grammar.serverLauncherClass.simpleName� {
				def static void main(String[] args) {
					val server = new �'org.eclipse.jetty.server.Server'.typeRef�(new �'java.net.InetSocketAddress'.typeRef�('localhost', 8080))
					server.handler = new �'org.eclipse.jetty.webapp.WebAppContext'.typeRef� => [
						resourceBase = 'src/main/webapp'
						welcomeFiles = #["index.html"]
						contextPath = "/"
						configurations = #[
							new �'org.eclipse.jetty.annotations.AnnotationConfiguration'.typeRef�,
							new �'org.eclipse.jetty.webapp.WebXmlConfiguration'.typeRef�,
							new �'org.eclipse.jetty.webapp.WebInfConfiguration'.typeRef�,
							new �'org.eclipse.jetty.webapp.MetaInfConfiguration'.typeRef�
						]
						setAttribute(�'org.eclipse.jetty.webapp.WebInfConfiguration'.typeRef�.CONTAINER_JAR_PATTERN, '.*/org\\.eclipse\\.xtext\\.web.*,.*/org.webjars.*')
					]
					val log = new �'org.eclipse.jetty.util.log.Slf4jLog'.typeRef�(�grammar.serverLauncherClass.simpleName�.name)
					try {
						server.start
						log.info('Press enter to stop the server...')
						new Thread[
							val key = System.in.read
							server.stop
							if (key == -1)
								log.warn('The standard input stream is empty.')
						].start
						server.join
					} catch (Exception exception) {
						log.warn(exception.message)
						System.exit(1)
					}
				}
			}
		'''
		xtendFile.writeTo(projectConfig.webSrc)
	}
	
	protected def generateServlet() {
		val xtendFile = fileAccessFactory.createXtendFile(grammar.servletClass)
		if (useServlet3Api) {
			xtendFile.annotations += new WebServletAnnotation => [
				name = 'XtextServices'
				urlPatterns = '/xtext-service/*'
			]
		}
		xtendFile.typeComment = '''
		/**
		 * Deploy this class into a servlet container to enable DSL-specific services.
		 */
		'''
		xtendFile.javaContent = '''
			class �grammar.servletClass.simpleName� extends �'org.eclipse.xtext.web.servlet.XtextServlet'.typeRef� {
				
				val �List�<�ExecutorService�> executorServices = newArrayList
				
				override init() {
					super.init()
					val �Provider�<�ExecutorService�> executorServiceProvider = [�Executors�.newCachedThreadPool => [executorServices += it]]
					new �grammar.webSetup�(executorServiceProvider).createInjectorAndDoEMFRegistration()
				}
				
				override destroy() {
					executorServices.forEach[shutdown()]
					executorServices.clear()
					super.destroy()
				}
				
			}
		'''
		xtendFile.writeTo(projectConfig.webSrc)
	}
	
}