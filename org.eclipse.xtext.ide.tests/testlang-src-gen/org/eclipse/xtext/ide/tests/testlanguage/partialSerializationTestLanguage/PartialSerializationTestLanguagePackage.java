/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.PartialSerializationTestLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface PartialSerializationTestLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "partialSerializationTestLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/ide/tests/testlanguage/PartialSerializationTestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "partialSerializationTestLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PartialSerializationTestLanguagePackage eINSTANCE = org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ModelImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLAZZ = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryValueImpl <em>Mandatory Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryValueImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getMandatoryValue()
   * @generated
   */
  int MANDATORY_VALUE = 1;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VALUE__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VALUE__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VALUE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalValueImpl <em>Optional Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalValueImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getOptionalValue()
   * @generated
   */
  int OPTIONAL_VALUE = 2;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VALUE__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VALUE__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VALUE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyOptionalValuesImpl <em>Many Optional Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyOptionalValuesImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getManyOptionalValues()
   * @generated
   */
  int MANY_OPTIONAL_VALUES = 3;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_OPTIONAL_VALUES__CLAZZ = MODEL__CLAZZ;

  /**
   * The number of structural features of the '<em>Many Optional Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_OPTIONAL_VALUES_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyMandatoryValuesImpl <em>Many Mandatory Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyMandatoryValuesImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getManyMandatoryValues()
   * @generated
   */
  int MANY_MANDATORY_VALUES = 4;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_MANDATORY_VALUES__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_MANDATORY_VALUES__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Many Mandatory Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_MANDATORY_VALUES_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildImpl <em>Mandatory Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getMandatoryChild()
   * @generated
   */
  int MANDATORY_CHILD = 5;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_CHILD__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_CHILD__CHILD = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_CHILD_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildImpl <em>Optional Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getOptionalChild()
   * @generated
   */
  int OPTIONAL_CHILD = 6;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_CHILD__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_CHILD__CHILD = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_CHILD_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildListsImpl <em>Two Child Lists</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildListsImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getTwoChildLists()
   * @generated
   */
  int TWO_CHILD_LISTS = 7;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILD_LISTS__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Direct Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILD_LISTS__DIRECT_CHILDREN = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Childs List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILD_LISTS__CHILDS_LIST = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Two Child Lists</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILD_LISTS_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildsImpl <em>Two Childs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildsImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getTwoChilds()
   * @generated
   */
  int TWO_CHILDS = 8;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILDS__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Direct Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILDS__DIRECT_CHILD = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opt Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILDS__OPT_CHILD = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Two Childs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWO_CHILDS_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildsImpl <em>Child With Sub Childs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildsImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getChildWithSubChilds()
   * @generated
   */
  int CHILD_WITH_SUB_CHILDS = 9;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_WITH_SUB_CHILDS__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_WITH_SUB_CHILDS__CHILDREN = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Child With Sub Childs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_WITH_SUB_CHILDS_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildImpl <em>Child With Sub Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getChildWithSubChild()
   * @generated
   */
  int CHILD_WITH_SUB_CHILD = 10;

  /**
   * The feature id for the '<em><b>Sub Childs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_WITH_SUB_CHILD__SUB_CHILDS = 0;

  /**
   * The number of structural features of the '<em>Child With Sub Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_WITH_SUB_CHILD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.SubChildImpl <em>Sub Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.SubChildImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getSubChild()
   * @generated
   */
  int SUB_CHILD = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CHILD__NAME = 0;

  /**
   * The number of structural features of the '<em>Sub Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CHILD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildListImpl <em>Mandatory Child List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildListImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getMandatoryChildList()
   * @generated
   */
  int MANDATORY_CHILD_LIST = 12;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_CHILD_LIST__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_CHILD_LIST__CHILDREN = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory Child List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_CHILD_LIST_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildListImpl <em>Optional Child List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildListImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getOptionalChildList()
   * @generated
   */
  int OPTIONAL_CHILD_LIST = 13;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_CHILD_LIST__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_CHILD_LIST__CHILDREN = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional Child List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_CHILD_LIST_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ImportImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 14;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.NodeImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getNode()
   * @generated
   */
  int NODE = 15;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__IMPORTS = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__REFS = MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CHILDREN = MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__REF = MODEL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.EClassRefImpl <em>EClass Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.EClassRefImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getEClassRef()
   * @generated
   */
  int ECLASS_REF = 16;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_REF__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_REF__REF = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EClass Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_REF_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.WithTransientContainerImpl <em>With Transient Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.WithTransientContainerImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getWithTransientContainer()
   * @generated
   */
  int WITH_TRANSIENT_CONTAINER = 17;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSIENT_CONTAINER__CLAZZ = MODEL__CLAZZ;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSIENT_CONTAINER__CHILD = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>With Transient Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITH_TRANSIENT_CONTAINER_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyValuesImpl <em>Many Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyValuesImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getManyValues()
   * @generated
   */
  int MANY_VALUES = 18;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_VALUES__CLAZZ = MANY_OPTIONAL_VALUES__CLAZZ;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_VALUES__NAME = MANY_OPTIONAL_VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Many Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_VALUES_FEATURE_COUNT = MANY_OPTIONAL_VALUES_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Model#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clazz</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Model#getClazz()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Clazz();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryValue <em>Mandatory Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Value</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryValue
   * @generated
   */
  EClass getMandatoryValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryValue#getName()
   * @see #getMandatoryValue()
   * @generated
   */
  EAttribute getMandatoryValue_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalValue <em>Optional Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Value</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalValue
   * @generated
   */
  EClass getOptionalValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalValue#getName()
   * @see #getOptionalValue()
   * @generated
   */
  EAttribute getOptionalValue_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyOptionalValues <em>Many Optional Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many Optional Values</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyOptionalValues
   * @generated
   */
  EClass getManyOptionalValues();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyMandatoryValues <em>Many Mandatory Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many Mandatory Values</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyMandatoryValues
   * @generated
   */
  EClass getManyMandatoryValues();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyMandatoryValues#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyMandatoryValues#getName()
   * @see #getManyMandatoryValues()
   * @generated
   */
  EAttribute getManyMandatoryValues_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChild <em>Mandatory Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChild
   * @generated
   */
  EClass getMandatoryChild();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChild#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChild#getChild()
   * @see #getMandatoryChild()
   * @generated
   */
  EReference getMandatoryChild_Child();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChild <em>Optional Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChild
   * @generated
   */
  EClass getOptionalChild();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChild#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChild#getChild()
   * @see #getOptionalChild()
   * @generated
   */
  EReference getOptionalChild_Child();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChildLists <em>Two Child Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Child Lists</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChildLists
   * @generated
   */
  EClass getTwoChildLists();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChildLists#getDirectChildren <em>Direct Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Direct Children</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChildLists#getDirectChildren()
   * @see #getTwoChildLists()
   * @generated
   */
  EReference getTwoChildLists_DirectChildren();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChildLists#getChildsList <em>Childs List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Childs List</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChildLists#getChildsList()
   * @see #getTwoChildLists()
   * @generated
   */
  EReference getTwoChildLists_ChildsList();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChilds <em>Two Childs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Two Childs</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChilds
   * @generated
   */
  EClass getTwoChilds();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChilds#getDirectChild <em>Direct Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Direct Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChilds#getDirectChild()
   * @see #getTwoChilds()
   * @generated
   */
  EReference getTwoChilds_DirectChild();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChilds#getOptChild <em>Opt Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.TwoChilds#getOptChild()
   * @see #getTwoChilds()
   * @generated
   */
  EReference getTwoChilds_OptChild();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChilds <em>Child With Sub Childs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child With Sub Childs</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChilds
   * @generated
   */
  EClass getChildWithSubChilds();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChilds#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChilds#getChildren()
   * @see #getChildWithSubChilds()
   * @generated
   */
  EReference getChildWithSubChilds_Children();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChild <em>Child With Sub Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child With Sub Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChild
   * @generated
   */
  EClass getChildWithSubChild();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChild#getSubChilds <em>Sub Childs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Childs</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChild#getSubChilds()
   * @see #getChildWithSubChild()
   * @generated
   */
  EReference getChildWithSubChild_SubChilds();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.SubChild <em>Sub Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.SubChild
   * @generated
   */
  EClass getSubChild();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.SubChild#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.SubChild#getName()
   * @see #getSubChild()
   * @generated
   */
  EAttribute getSubChild_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChildList <em>Mandatory Child List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Child List</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChildList
   * @generated
   */
  EClass getMandatoryChildList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChildList#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.MandatoryChildList#getChildren()
   * @see #getMandatoryChildList()
   * @generated
   */
  EReference getMandatoryChildList_Children();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChildList <em>Optional Child List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Child List</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChildList
   * @generated
   */
  EClass getOptionalChildList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChildList#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.OptionalChildList#getChildren()
   * @see #getOptionalChildList()
   * @generated
   */
  EReference getOptionalChildList_Children();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getImports()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getRefs()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Refs();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getChildren()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Children();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.Node#getRef()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.EClassRef <em>EClass Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass Ref</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.EClassRef
   * @generated
   */
  EClass getEClassRef();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.EClassRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.EClassRef#getRef()
   * @see #getEClassRef()
   * @generated
   */
  EReference getEClassRef_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.WithTransientContainer <em>With Transient Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>With Transient Container</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.WithTransientContainer
   * @generated
   */
  EClass getWithTransientContainer();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.WithTransientContainer#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.WithTransientContainer#getChild()
   * @see #getWithTransientContainer()
   * @generated
   */
  EReference getWithTransientContainer_Child();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyValues <em>Many Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many Values</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyValues
   * @generated
   */
  EClass getManyValues();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyValues#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ManyValues#getName()
   * @see #getManyValues()
   * @generated
   */
  EAttribute getManyValues_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PartialSerializationTestLanguageFactory getPartialSerializationTestLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ModelImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CLAZZ = eINSTANCE.getModel_Clazz();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryValueImpl <em>Mandatory Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryValueImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getMandatoryValue()
     * @generated
     */
    EClass MANDATORY_VALUE = eINSTANCE.getMandatoryValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANDATORY_VALUE__NAME = eINSTANCE.getMandatoryValue_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalValueImpl <em>Optional Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalValueImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getOptionalValue()
     * @generated
     */
    EClass OPTIONAL_VALUE = eINSTANCE.getOptionalValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_VALUE__NAME = eINSTANCE.getOptionalValue_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyOptionalValuesImpl <em>Many Optional Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyOptionalValuesImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getManyOptionalValues()
     * @generated
     */
    EClass MANY_OPTIONAL_VALUES = eINSTANCE.getManyOptionalValues();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyMandatoryValuesImpl <em>Many Mandatory Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyMandatoryValuesImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getManyMandatoryValues()
     * @generated
     */
    EClass MANY_MANDATORY_VALUES = eINSTANCE.getManyMandatoryValues();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_MANDATORY_VALUES__NAME = eINSTANCE.getManyMandatoryValues_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildImpl <em>Mandatory Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getMandatoryChild()
     * @generated
     */
    EClass MANDATORY_CHILD = eINSTANCE.getMandatoryChild();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY_CHILD__CHILD = eINSTANCE.getMandatoryChild_Child();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildImpl <em>Optional Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getOptionalChild()
     * @generated
     */
    EClass OPTIONAL_CHILD = eINSTANCE.getOptionalChild();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_CHILD__CHILD = eINSTANCE.getOptionalChild_Child();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildListsImpl <em>Two Child Lists</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildListsImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getTwoChildLists()
     * @generated
     */
    EClass TWO_CHILD_LISTS = eINSTANCE.getTwoChildLists();

    /**
     * The meta object literal for the '<em><b>Direct Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_CHILD_LISTS__DIRECT_CHILDREN = eINSTANCE.getTwoChildLists_DirectChildren();

    /**
     * The meta object literal for the '<em><b>Childs List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_CHILD_LISTS__CHILDS_LIST = eINSTANCE.getTwoChildLists_ChildsList();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildsImpl <em>Two Childs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.TwoChildsImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getTwoChilds()
     * @generated
     */
    EClass TWO_CHILDS = eINSTANCE.getTwoChilds();

    /**
     * The meta object literal for the '<em><b>Direct Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_CHILDS__DIRECT_CHILD = eINSTANCE.getTwoChilds_DirectChild();

    /**
     * The meta object literal for the '<em><b>Opt Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWO_CHILDS__OPT_CHILD = eINSTANCE.getTwoChilds_OptChild();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildsImpl <em>Child With Sub Childs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildsImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getChildWithSubChilds()
     * @generated
     */
    EClass CHILD_WITH_SUB_CHILDS = eINSTANCE.getChildWithSubChilds();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_WITH_SUB_CHILDS__CHILDREN = eINSTANCE.getChildWithSubChilds_Children();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildImpl <em>Child With Sub Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ChildWithSubChildImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getChildWithSubChild()
     * @generated
     */
    EClass CHILD_WITH_SUB_CHILD = eINSTANCE.getChildWithSubChild();

    /**
     * The meta object literal for the '<em><b>Sub Childs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_WITH_SUB_CHILD__SUB_CHILDS = eINSTANCE.getChildWithSubChild_SubChilds();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.SubChildImpl <em>Sub Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.SubChildImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getSubChild()
     * @generated
     */
    EClass SUB_CHILD = eINSTANCE.getSubChild();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_CHILD__NAME = eINSTANCE.getSubChild_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildListImpl <em>Mandatory Child List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.MandatoryChildListImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getMandatoryChildList()
     * @generated
     */
    EClass MANDATORY_CHILD_LIST = eINSTANCE.getMandatoryChildList();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY_CHILD_LIST__CHILDREN = eINSTANCE.getMandatoryChildList_Children();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildListImpl <em>Optional Child List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.OptionalChildListImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getOptionalChildList()
     * @generated
     */
    EClass OPTIONAL_CHILD_LIST = eINSTANCE.getOptionalChildList();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_CHILD_LIST__CHILDREN = eINSTANCE.getOptionalChildList_Children();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ImportImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.NodeImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__IMPORTS = eINSTANCE.getNode_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__REFS = eINSTANCE.getNode_Refs();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__REF = eINSTANCE.getNode_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.EClassRefImpl <em>EClass Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.EClassRefImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getEClassRef()
     * @generated
     */
    EClass ECLASS_REF = eINSTANCE.getEClassRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_REF__REF = eINSTANCE.getEClassRef_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.WithTransientContainerImpl <em>With Transient Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.WithTransientContainerImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getWithTransientContainer()
     * @generated
     */
    EClass WITH_TRANSIENT_CONTAINER = eINSTANCE.getWithTransientContainer();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WITH_TRANSIENT_CONTAINER__CHILD = eINSTANCE.getWithTransientContainer_Child();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyValuesImpl <em>Many Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.ManyValuesImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.impl.PartialSerializationTestLanguagePackageImpl#getManyValues()
     * @generated
     */
    EClass MANY_VALUES = eINSTANCE.getManyValues();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_VALUES__NAME = eINSTANCE.getManyValues_Name();

  }

} //PartialSerializationTestLanguagePackage
