#!/usr/bin/python
#array = ['startup.helloworld', 'startup.compiler.compiler', 'startup.compiler.sunflow', 'startup.compress', 'startup.crypto.aes', 'startup.crypto.rsa', 'startup.crypto.signverify', 'startup.mpegaudio', 'startup.scimark.fft', 'startup.scimark.lu', 'startup.scimark.monte_carlo', 'startup.scimark.sor', 'startup.scimark.sparse', 'startup.serial', 'startup.sunflow', 'startup.xml.transform', 'startup.xml.validation', 'compress', 'crypto.aes', 'crypto.rsa', 'crypto.signverify', 'derby', 'mpegaudio', 'scimark.fft.large', 'scimark.lu.large', 'scimark.sor.large', 'scimark.sparse.large', 'scimark.fft.small', 'scimark.lu.small', 'scimark.sor.small', 'scimark.sparse.small', 'scimark.monte_carlo', 'serial', 'sunflow', 'xml.transform xml.validation']
array = ['compress', 'crypto.aes', 'crypto.rsa', 'crypto.signverify', 'derby', 'mpegaudio', 'scimark.fft.large', 'scimark.lu.large', 'scimark.sor.large', 'scimark.sparse.large', 'scimark.fft.small', 'scimark.lu.small', 'scimark.sor.small', 'scimark.sparse.small', 'scimark.monte_carlo', 'serial', 'sunflow', 'xml.transform xml.validation']
oldsum = 0
for bench in array:
    print('sh run-benchmark.sh baseline '+ bench + ' | tee warmupbench/'+ bench + '.baseline')
    print('sh run-benchmark.sh create '+ bench + ' | tee warmupbench/'+ bench + '.create')
    print('sh run-benchmark.sh use '+ bench + ' | tee warmupbench/'+ bench + '.use')

