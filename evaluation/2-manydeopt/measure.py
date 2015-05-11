#!/usr/bin/python
import re, sys, os, time  
from subprocess import call, check_call, check_output, CalledProcessError

# useful flags: -Xint (only interpreter), -Xcomp (compile everything)
JAVAPATH = '../../../build/linux-x86_64-normal-server-slowdebug/jdk/bin/java'
JAVACPATH = '../../../build/linux-x86_64-normal-server-slowdebug/jdk/bin/javac'
#JAVAARGS_USE = ['-agentlib:hprof=cpu=times','-XX:+UnlockDiagnosticVMOptions', '-XX:+PrintCompilation', '-XX:-UseOnStackReplacement', '-XX:+UnlockExperimentalVMOptions', '-XX:+TraceDeoptimization', '-Xbatch', '-XX:+CacheProfiles', '-XX:CacheProfilesFile=cached_profiles.log', '-XX:CompileCommandFile=useCommands.txt']

JAVAARGS = ['-agentlib:hprof=cpu=times','-XX:+UnlockDiagnosticVMOptions', '-XX:+UseOnStackReplacement', '-XX:+UnlockExperimentalVMOptions']
JAVAARGS_VERBOSE = ['-XX:+PrintCompilation', '-XX:+TraceDeoptimization', '-XX:+PrintDeoptimizationCount']
JAVAARGS_DEBUG = ['-XX:+PrintCacheProfiles']
JAVAARGS_USE = ['-XX:+CacheProfiles']
JAVAARGS_CREATE = ['-XX:+DumpProfiles']#, '-XX:CompileCommandFile=createCommands.txt']
#JAVAARGS_CREATE = ['-XX:CompileCommandFile=createCommands.txt']

NROFRUNS = 1
VERBOSE = True
DEBUG = False
RUN_BASELINE = True
RUN_CREATE = True  
RUN_USE = True



class EvalResult:
    def __init__(self,methodNames):
        self.timeListDict = {}
        self.percentListDict = {}
        self.invocationCountDict = {}
        for method in methodNames:
            self.timeListDict[method] = []
            self.percentListDict[method] = []
            self.invocationCountDict[method] = []

def printEvalResults(name, methodNames, evalResult):
    print("-----------------------------------")
    print(">>>      %%% "+name+" %%%\t<<<")
    for method in methodNames:
        print(">>>     %%% " + method + " %%%\t<<<")    
        avgTime = (sum(evalResult.timeListDict[method])/len(evalResult.timeListDict[method]))
        avgPercent = (sum(evalResult.percentListDict[method])/len(evalResult.percentListDict[method]))
        avgCount = (sum(evalResult.invocationCountDict[method])/len(evalResult.invocationCountDict[method]))
        print(">>> Total time:        %s ms" % round(avgTime,2))
        print(">>> Total percentage:  %s %%" % round(avgPercent,2))
        print(">>> Invocation count:  %s" % round(avgCount,2))
        print(">>> Time per method:   %s ms" % round((float(avgTime)*(avgPercent/100)/avgCount),2)) 
    print("-----------------------------------")

def runHotspot(javaargs, className, methodNames):
    res = EvalResult(methodNames)

    hotspotCall = [JAVAPATH]
    hotspotCall.extend(JAVAARGS)

    if(VERBOSE):
        hotspotCall.extend(JAVAARGS_VERBOSE)
    if(DEBUG):
        hotspotCall.extend(JAVAARGS_DEBUG)
    if(javaargs == "CREATE"):
        hotspotCall.extend(JAVAARGS_CREATE)
    elif(javaargs == "USE"):
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
        for method in methodNames:
            m = re.search(r"total = (\d*)",file)
            res.timeListDict[method].append(int(m.group(1)))
            #print(res.timeListDict)
            m = re.search(r"\d*\s*(\d*\.\d*\%)\s*\d*\.\d*\%\s*\d*\s*\d*\s*"+className+"."+method,file)
            res.percentListDict[method].append(float(str(m.group(1)).replace("%","")))
            #print(res.percentListDict)
            m = re.search(r"\d*\s*\d*\.\d*\%\s*\d*\.\d*\%\s*(\d*)\s\d*\s*"+className+"."+method,file)
            res.invocationCountDict[method].append(int(m.group(1)))  
            #print(res.invocationCountDict)
    return res

# START
className = sys.argv[1]
print('argument: %s' % className)
methodNames = []
for i in range(2,len(sys.argv)):
  methodNames.append(sys.argv[i])
print('methods: %s' % methodNames)
try:
    evalBaseline = EvalResult(methodNames)
    evalCreate = EvalResult(methodNames)
    evalUse = EvalResult(methodNames)
    if(RUN_BASELINE):
        evalBaseline = runHotspot("BASELINE", className, methodNames)
    if(RUN_CREATE):
        evalCreate = runHotspot("CREATE", className, methodNames)
    if(RUN_USE):
        evalUse = runHotspot("USE", className, methodNames)
    print("------------ RESULTS --------------")
    print("------------ RUNS: "+ str(NROFRUNS) + " --------------")
    if(RUN_BASELINE):
        printEvalResults("BASELINE",methodNames,evalBaseline)
    if(RUN_CREATE):
        printEvalResults("CREATE",methodNames,evalCreate)
    if(RUN_USE):
        printEvalResults("USE",methodNames,evalUse)


    print('Execution successful')
    

except CalledProcessError:
    print('Execution failed')

