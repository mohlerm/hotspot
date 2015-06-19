#!/usr/bin/python
#array = ['startup.helloworld', 'startup.compiler.compiler', 'startup.compiler.sunflow', 'startup.compress', 'startup.crypto.aes', 'startup.crypto.rsa', 'startup.crypto.signverify', 'startup.mpegaudio', 'startup.scimark.fft', 'startup.scimark.lu', 'startup.scimark.monte_carlo', 'startup.scimark.sor', 'startup.scimark.sparse', 'startup.serial', 'startup.sunflow', 'startup.xml.transform', 'startup.xml.validation', 'compress', 'crypto.aes', 'crypto.rsa', 'crypto.signverify', 'derby', 'mpegaudio', 'scimark.fft.large', 'scimark.lu.large', 'scimark.sor.large', 'scimark.sparse.large', 'scimark.fft.small', 'scimark.lu.small', 'scimark.sor.small', 'scimark.sparse.small', 'scimark.monte_carlo', 'serial', 'sunflow', 'xml.transform xml.validation']
array = ['compress', 'crypto.aes', 'crypto.rsa', 'crypto.signverify', 'derby', 'mpegaudio', 'scimark.fft.large', 'scimark.lu.large', 'scimark.sor.large', 'scimark.sparse.large', 'scimark.fft.small', 'scimark.lu.small', 'scimark.sor.small', 'scimark.sparse.small', 'scimark.monte_carlo', 'serial', 'sunflow']
oldsum = 0
for bench in array:
    for i in range(1,3):
        if i<10:
            print('sh run-benchmark.sh baseline '+ bench + ' | tee baseline/'+ bench + '.baseline.0'+str(i))
        else:
            print('sh run-benchmark.sh baseline '+ bench + ' | tee baseline/'+ bench + '.baseline.'+str(i))
    print('sh run-benchmark.sh create '+ bench + ' | tee '+ bench + '.create')
    for i in range(1,3):
        if i<10:
            print('sh run-benchmark.sh use0 '+ bench + ' | tee mode0/'+ bench + '.use.0'+str(i))
        else:
            print('sh run-benchmark.sh use0 '+ bench + ' | tee mode0/'+ bench + '.use.'+str(i))

    #for i in range(1,3):
    #    if i<10:
    #        print('sh run-benchmark.sh use1 '+ bench + ' | tee mode1/'+ bench + '.use.0'+str(i))
    #    else:
    #        print('sh run-benchmark.sh use1 '+ bench + ' | tee mode1/'+ bench + '.use.'+str(i))

    #for i in range(1,3):
    #    if i<10:
    #        print('sh run-benchmark.sh use2 '+ bench + ' | tee mode2/'+ bench + '.use.0'+str(i))
    #    else:
    #        print('sh run-benchmark.sh use2 '+ bench + ' | tee mode2/'+ bench + '.use.'+str(i))


