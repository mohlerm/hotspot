#!/bin/sh
#-agentlib:hprof=cpu=times
#CREATE
if [ "$1" = "create" ] 
then
  echo "creating profiles"
#  /home/marcel/cloud/ETH/6thSemesterFS15/BachelorThesis/hs-comp/build/linux-x86_64-normal-server-slowdebug/jdk/bin/jjs -J-XX:+UnlockDiagnosticVMOptions -J-XX:+UseOnStackReplacement -J-XX:+UnlockExperimentalVMOptions -XX:-PrintCompilation -XX:+TraceDeoptimization -XX:+DumpProfiles run.js
  /home/marcel/cloud/ETH/6thSemesterFS15/BachelorThesis/hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:CompileCommandFile=compileCommands.txt -J-XX:+UnlockExperimentalVMOptions -J-XX:-PrintDeoptimizationCount -J-XX:+DumpProfiles run.js
elif [ "$1" = "baseline_noosr" ]
then
  echo "baseline no OSR"
  /home/marcel/cloud/ETH/6thSemesterFS15/BachelorThesis/hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockDiagnosticVMOptions -J-XX:-UseOnStackReplacement run.js
elif [ "$1" = "baseline_jdk9" ]
then
  echo "baseline official jdk9"
  /home/marcel/bin/jdk1.9.0/bin/jjs run.js
elif [ "$1" = "baseline" ]
then
  echo "baseline"
  /home/marcel/cloud/ETH/6thSemesterFS15/BachelorThesis/hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:-PrintDeoptimizationCount run.js
#RUN
else
  echo "use profiles"
#  /home/marcel/cloud/ETH/6thSemesterFS15/BachelorThesis/hs-comp/build/linux-x86_64-normal-server-slowdebug/jdk/bin/jjs -J-XX:+UnlockDiagnosticVMOptions -J-XX:+UseOnStackReplacement -J-XX:+UnlockExperimentalVMOptions -J-XX:-PrintCompilation -J-XX:-TraceDeoptimization -J-XX:+PrintCacheProfiles -J-XX:+CacheProfiles run.js
  /home/marcel/cloud/ETH/6thSemesterFS15/BachelorThesis/hs-comp/build/linux-x86_64-normal-server-release/jdk/bin/jjs -J-XX:+UnlockExperimentalVMOptions -J-XX:-PrintDeoptimizationCount -J-XX:+CacheProfiles -J-XX:CacheProfilesMode=1 -J-XX:-PrintCompileQueueSize -J-XX:-PrintCacheProfiles run.js
fi
