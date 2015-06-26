#!/bin/sh
#-agentlib:hproff=cpu=times
#CREATE
if [ "$1" = "hpcreate" ]
then
  echo "creating profiles"
  ../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-agentlib:hprof=cpu=times -J-XX:+UnlockExperimentalVMOptions -J-XX:+PrintDeoptimizationCount -J-XX:+DumpProfiles $2
elif [ "$1" = "hpbaseline_noosr" ]
then
  echo "baseline no OSR"
  /disk2/hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-agentlib:hprof=cpu=times -J-XX:+UnlockDiagnosticVMOptions -J-XX:-UseOnStackReplacement $2
elif [ "$1" = "hpbaseline_jdk8" ]
then
  echo "baseline official jdk8"
  /usr/lib/jvm/java-openjdk/bin/jjs -J-agentlib:hprof=cpu=times $2
elif [ "$1" = "hpbaseline" ]
then
  echo "baseline"
  ../../../../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-agentpath:/home/marcel/bin/yjp-2015-build-15062/bin/linux-x86-64/libyjpagent.so -J-XX:+UnlockExperimentalVMOptions -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCompileQueueSize $2
#RUN
elif [ "$1" = "hpuse1" ]
then
  echo "use profiles with mode 1"
  ../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-agentlib:hprof=cpu=times -J-XX:+UnlockExperimentalVMOptions -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=1 -J-XX:-PrintCompileQueueSize -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCacheProfiles $2
elif [ "$1" = "hpuse2" ]
then
  echo "use profiles with mode 2"
  ../../../../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-agentpath:/home/marcel/bin/yjp-2015-build-15062/bin/linux-x86-64/libyjpagent.so -J-XX:+UnlockExperimentalVMOptions -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=2 -J-XX:-PrintCompileQueueSize -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCacheProfiles $2
elif [ "$1" = "hpuse0" ]
then
  echo "use profiles with mode 0"
  ../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-agentlib:hprof=cpu=times -J-XX:+UnlockExperimentalVMOptions -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=0 -J-XX:-PrintCompileQueueSize -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCacheProfiles $2
i
elif [ "$1" = "create" ]
then
  echo "creating profiles"
  ../../../../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:+PrintDeoptimizationCount -J-XX:+DumpProfiles $2
elif [ "$1" = "baseline_noosr" ]
then
  echo "baseline no OSR"
  /disk2/hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockDiagnosticVMOptions -J-XX:-UseOnStackReplacement $2
elif [ "$1" = "baseline_jdk8" ]
then
  echo "baseline official jdk8"
  /usr/lib/jvm/java-openjdk/bin/jjs $2
elif [ "$1" = "baseline" ]
then
  echo "baseline"
  ../../../../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCompileQueueSize $2
#RUN
elif [ "$1" = "use1" ]
then
  echo "use profiles with mode 1"
  ../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=1 -J-XX:-PrintCompileQueueSize -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCacheProfiles $2
elif [ "$1" = "use2" ]
then
  echo "use profiles with mode 2"
  ../../../../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=2 -J-XX:-PrintCompileQueueSize -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCacheProfiles $2
else
  echo "use profiles with mode 0"
  ../hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=0 -J-XX:-PrintCompileQueueSize -J-XX:+PrintDeoptimizationCount -J-XX:-PrintCacheProfiles $2
fi
