import os
import re
import glob
files = glob.glob(r'/disk2/SPECjvm2008_node153/mode2/*.*') + glob.glob(r'/disk2/SPECjvm2008_node154/mode2/*.*') +glob.glob(r'/home/mohlerm/SPECjvm2008_node155/mode2/*.*') +glob.glob(r'/home/mohlerm/SPECjvm2008_node156/mode2/*.*') +glob.glob(r'/home/mohlerm/SPECjvm2008_node157/mode2/*.*') +glob.glob(r'/home/mohlerm/SPECjvm2008_node158/mode2/*.*') +glob.glob(r'/home/mohlerm/SPECjvm2008_node159/mode2/*.*') +glob.glob(r'/home/mohlerm/SPECjvm2008_node160/mode2/*.*')
files.sort()
#print(files)
result = []
for infile in files:
    linestring = infile[33:]
    f = open(infile)
    file = f.read()
    f.close()
    m = re.search(r"Warmup \(120s\) result: (\d*.\d*) ops\/m",file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("Warmup (120s): " + m.group(1))
        linestring = linestring + (m.group(1))
    m = re.search(r"Iteration 1 \(240s\) result: (\d*.\d*) ops\/m",file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("Iteration 1 (240s): " + m.group(1))
        linestring = linestring + (m.group(1))
    m = re.search(r"Iteration 1 \(1 operation\) result: (\d*.\d*) ops\/m",file)
    linestring = linestring +(";")
    if(m is not None):
    #    print("Iteration 1 (1 operation): " + m.group(1))
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

