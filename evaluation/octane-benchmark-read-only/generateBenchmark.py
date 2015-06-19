#!/usr/bin/python
array = ['run-richards.js', 'run-deltablue.js', 'run-crypto.js', 'run-raytrace.js','run-earleyboyer.js','run-regexp.js','run-splay.js','run-navierstokes.js','run-pdfjs.js','run-mandreel.js','run-gamebody.js','run-codeload.js','run-box2d.js','run-typescript.js']
#array = ['run.js']
oldsum = 0
for bench in array:
    for i in range(1,61):
        if i<10:
            print('sh run-benchmark.sh baseline '+ bench + ' | tee baseline/'+ bench + '.baseline.0'+str(i))
        else:
            print('sh run-benchmark.sh baseline '+ bench + ' | tee baseline/'+ bench + '.baseline.'+str(i))
    print('sh run-benchmark.sh create '+ bench + ' | tee '+ bench + '.create')
    for i in range(1,61):
        if i<10:
            print('sh run-benchmark.sh use0 '+ bench + ' | tee mode0/'+ bench + '.use.0'+str(i))
        else:
            print('sh run-benchmark.sh use0 '+ bench + ' | tee mode0/'+ bench + '.use.'+str(i))

    for i in range(1,61):
        if i<10:
            print('sh run-benchmark.sh use1 '+ bench + ' | tee mode1/'+ bench + '.use.0'+str(i))
        else:
            print('sh run-benchmark.sh use1 '+ bench + ' | tee mode1/'+ bench + '.use.'+str(i))

    for i in range(1,61):
        if i<10:
            print('sh run-benchmark.sh use2 '+ bench + ' | tee mode2/'+ bench + '.use.0'+str(i))
        else:
            print('sh run-benchmark.sh use2 '+ bench + ' | tee mode2/'+ bench + '.use.'+str(i))


