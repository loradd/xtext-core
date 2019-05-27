#!/usr/bin/env bash
if [ -z "$JENKINS_URL" ]; then
  # if not set in environment use default
  JENKINS_URL=https://ci.eclipse.org/xtext/
fi

if [ -f "/sys/fs/cgroup/memory/memory.limit_in_bytes" ]; then
  # Running in container; unlimited memory is reported with value 9223372036854771712 (highest positive signed 64-bit integer (2^63-1), rounded down to multiples of 4096)
  if [ $(cat /sys/fs/cgroup/memory/memory.limit_in_bytes) -lt 9223372036854771712 ]; then
    export GRADLE_OPTS="-XX:MaxRAM=$(( $(cat /sys/fs/cgroup/memory/memory.limit_in_bytes) / 70 * 100))"
  fi
fi

./gradlew \
  clean cleanGenerateXtext build createLocalMavenRepo \
  -PuseJenkinsSnapshots=true \
  -PJENKINS_URL=$JENKINS_URL \
  -PcompileXtend=true \
  -PignoreTestFailures=true \
  --refresh-dependencies \
  --continue \
  $@
