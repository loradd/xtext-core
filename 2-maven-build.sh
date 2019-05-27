#!/usr/bin/env bash
if [ -z "$JENKINS_URL" ]; then
  # if not set in environment use default
  JENKINS_URL=https://ci.eclipse.org/xtext/
fi

if [ -f "/sys/fs/cgroup/memory/memory.limit_in_bytes" ]; then
  # Running in container; unlimited memory is reported with value 9223372036854771712
  if [ $(cat /sys/fs/cgroup/memory/memory.limit_in_bytes) -lt 9223372036854771712 ]; then
    export MAVEN_OPTS="-XX:MaxRAM=$(( $(cat /sys/fs/cgroup/memory/memory.limit_in_bytes) / 70 * 100))"
  fi
fi

mvn \
  -f releng \
  --batch-mode \
  --update-snapshots \
  -Dmaven.repo.local=.m2/repository \
  -Dtycho.disableP2Mirrors=true \
  -DJENKINS_URL=$JENKINS_URL \
  -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn \
  $@

