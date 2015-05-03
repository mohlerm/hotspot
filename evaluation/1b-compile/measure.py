#!/usr/bin/python
import re, sys, os, time  
from subprocess import call, check_call, check_output, CalledProcessError

# useful flags: -Xint (only interpreter), -Xcomp (compile everything)
JAVAPATH = '../../hs-comp/build/linux-x86_64-normal-server-slowdebug/jdk/bin/java'
JAVACPATH = '../hs-comp/build/linux-x86_64-normal-server-fastdebug/jdk/bin/javac'
#JAVAARGS_USE = ['-agentlib:hprof=cpu=times','-XX:+UnlockDiagnosticVMOptions', '-XX:+PrintCompilation', '-XX:-UseOnStackReplacement', '-XX:+UnlockExperimentalVMOptions', '-XX:+TraceDeoptimization', '-Xbatch', '-XX:+CacheProfiles', '-XX:CacheProfilesFile=cached_profiles.log', '-XX:CompileCommandFile=useCommands.txt']

JAVAARGS = ['-agentlib:hprof=cpu=times','-XX:+UnlockDiagnosticVMOptions', '-XX:-UseOnStackReplacement', '-XX:+UnlockExperimentalVMOptions', '-Xbatch']
JAVAARGS_VERBOSE = ['-XX:+PrintCompilation', '-XX:+TraceDeoptimization']
JAVAARGS_USE = ['-XX:+CacheProfiles', '-XX:CacheProfilesFile=cached_profiles.log']
#JAVAARGS_CREATE = ['-XX:+DumpProfiles', '-XX:CompileCommandFile=createCommands.txt']
JAVAARGS_CREATE = ['-XX:CompileCommandFile=createCommands.txt']

NROFRUNS = 3
VERBOSE = True

className = sys.argv[1]
print('argument: %s' % className)

try:
    timelistBaseline = []
    percentlistBaseline = []
    invocationCountBaseline = 0

    hotspotCall = [JAVAPATH]
    hotspotCall.extend(JAVAARGS)
    if(VERBOSE):
        hotspotCall.extend(JAVAARGS_VERBOSE)
    hotspotCall.append(className)

    counter = 0
    while(counter < NROFRUNS):
        print('Run HotSpot with args: %s' % hotspotCall)
        check_call(hotspotCall)
        counter = counter + 1
        f = open('java.hprof.txt','r')
        file = f.read()
        f.close()
        m = re.search(r"total = (\d*)",file)
        timelistBaseline.append(int(m.group(1)))
        m = re.search(r"\d*\s*(\d*\.\d*\%)\s*\d*\.\d*\%\s*\d*\s*\d*\s*DoesCompile.method1",file)
        percentlistBaseline.append(float(str(m.group(1)).replace("%","")))
        m = re.search(r"\d*\s*\d*\.\d*\%\s*\d*\.\d*\%\s*(\d*)\s\d*\sDoesCompile.method1",file)
        invocationCountBaseline = int(m.group(1))



    timelistCreate = []
    percentlistCreate = []
    invocationCountCreate = 0

    hotspotCall = [JAVAPATH]
    hotspotCall.extend(JAVAARGS)
    if(VERBOSE):
        hotspotCall.extend(JAVAARGS_VERBOSE)
    hotspotCall.extend(JAVAARGS_CREATE)
    hotspotCall.append(className)

    counter = 0
    while(counter < NROFRUNS):
        print('Run HotSpot with args: %s' % hotspotCall)
        check_call(hotspotCall)
        counter = counter + 1
        f = open('java.hprof.txt','r')
        file = f.read()
        f.close()
        m = re.search(r"total = (\d*)",file)
        timelistCreate.append(int(m.group(1)))
        m = re.search(r"\d*\s*(\d*\.\d*\%)\s*\d*\.\d*\%\s*\d*\s*\d*\s*DoesCompile.method1",file)
        percentlistCreate.append(float(str(m.group(1)).replace("%","")))
        m = re.search(r"\d*\s*\d*\.\d*\%\s*\d*\.\d*\%\s*(\d*)\s\d*\sDoesCompile.method1",file)
        invocationCountCreate = int(m.group(1))

    timelistUse = []
    percentlistUse = []
    invocationCountUse = 0

    hotspotCall = [JAVAPATH]
    hotspotCall.extend(JAVAARGS)
    if(VERBOSE):
        hotspotCall.extend(JAVAARGS_VERBOSE)
    hotspotCall.extend(JAVAARGS_USE)
    hotspotCall.append(className)

    counter = 0
    while(counter < NROFRUNS):
        print('Run HotSpot with args: %s' % hotspotCall)
        check_call(hotspotCall)
        counter = counter + 1
        f = open('java.hprof.txt','r')
        file = f.read()
        f.close()
        m = re.search(r"total = (\d*)",file)
        timelistUse.append(int(m.group(1)))
        m = re.search(r"\d*\s*(\d*\.\d*\%)\s*\d*\.\d*\%\s*\d*\s*\d*\s*DoesCompile.method1",file)
        percentlistUse.append(float(str(m.group(1)).replace("%","")))
        m = re.search(r"\d*\s*\d*\.\d*\%\s*\d*\.\d*\%\s*(\d*)\s\d*\sDoesCompile.method1",file)
        invocationCountUse = int(m.group(1))

    avgTimeBaseline = (sum(timelistBaseline)/len(timelistBaseline))
    avgTimeCreate = (sum(timelistCreate)/len(timelistCreate))
    avgPercentCreate = (sum(percentlistCreate)/len(percentlistCreate))
    avgPercentBaseline = (sum(percentlistBaseline)/len(percentlistBaseline))  
    avgTimeUse = (sum(timelistUse)/len(timelistUse))
    avgPercentUse = (sum(percentlistUse)/len(percentlistUse)) 
    print("-----------------------------------")
    print(">>>      %%% BASELINE %%%\t<<<")  
    print(">>> Total time:        %s ms" % avgTimeBaseline)
    print(">>> Total percentage:  %s %%" % avgPercentBaseline)
    print(">>> Invocation count:  %s" % invocationCountBaseline)
    print(">>> Time per method:   %s ms" % round((float(avgTimeBaseline)*(avgPercentBaseline/100)/invocationCountBaseline),2)) 
    print("-----------------------------------")
    print(">>>    %%% CREATE PROFILES %%%\t<<<")  
    print(">>> Total time:        %s ms" % avgTimeCreate)
    print(">>> Total percentage:  %s %%" % avgPercentCreate)
    print(">>> Invocation count:  %s" % invocationCountCreate)
    print(">>> Time per method:   %s ms" % round((float(avgTimeCreate)*(avgPercentCreate/100)/invocationCountCreate),2))
    #print(sum(timelist)/len(timelist))
    print("-----------------------------------")
    print(">>> \t%%% USE PROFILES %%%\t<<<")
    print(">>> Total time:        %s ms" % avgTimeUse)
    print(">>> Total percentage:  %s %%" % avgPercentUse)
    print(">>> Invocation count:  %s" % invocationCountUse)
    print(">>> Time per method:   %s ms" % round((float(avgTimeUse)*(avgPercentUse/100)/invocationCountUse),2))
    print("-----------------------------------")    
    print('Execution successful')
    

except CalledProcessError:
    print('Execution failed')

