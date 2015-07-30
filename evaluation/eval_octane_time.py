import os
import re
import glob
import sys
files = glob.glob(r'/disk2/octane_node160/'+str(sys.argv[1])+'/*.*')
files.sort()
#print(files)
result = []
for infile in files:
    linestring = infile[28:]
    f = open(infile)
    file = f.read()
    f.close()
    m = re.search(r"C1 Compile Time:\s*(\d*.\d*) s",file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("Warmup (120s): " + m.group(1))
        linestring = linestring + (m.group(1))
    m = re.search(r"C2 Compile Time:\s*(\d*.\d*) s",file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("Iteration 1 (240s): " + m.group(1))
        linestring = linestring + (m.group(1))
    result.append(linestring)
result.sort()
for b in result:
    print(b);

