#!/usr/bin/python
oldsum = 0
for i in range(1,61):
    if i<10:
        print('sh run-benchmark.sh baseline | tee baseline/octane.baseline.0'+str(i))
    else:
        print('sh run-benchmark.sh baseline | tee baseline/octane.baseline.'+str(i))
for i in range(1,61):
    if i<10:
        print('sh run-benchmark.sh use0 | tee mode0/octane.use.0'+str(i))
    else:
        print('sh run-benchmark.sh use0 | tee mode0/octane.use.'+str(i))
for i in range(1,61):
    if i<10:
        print('sh run-benchmark.sh use1 | tee mode1/octane.use.0'+str(i))
    else:
        print('sh run-benchmark.sh use1 | tee mode1/octane.use.'+str(i))
for i in range(1,61):
    if i<10:
        print('sh run-benchmark.sh use2 | tee mode2/octane.use.0'+str(i))
    else:
        print('sh run-benchmark.sh use2 | tee mode2/octane.use.'+str(i))


