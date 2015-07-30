import os
import re
import glob
import sys
#print(str(sys.argv[1]))
files = glob.glob(r'/disk2/octane_node160/'+str(sys.argv[1])+'/*.*')
files.sort()
#print(files)
result = []
for infile in files:
    linestring = infile[28:]
    f = open(infile)
    file = f.read()
    f.close()
    m = re.search(r"Score \(version 9\): (\d*)",file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("Warmup (120s): " + m.group(1))
        linestring = linestring + (m.group(1))
    m = re.search(r"DEOPT COUNTER\: (\d*)", file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("DEOPT Counter: " + m.group(1))
        linestring = linestring +(m.group(1))
    result.append(linestring)
result.sort()
for b in result:
    print(b);
