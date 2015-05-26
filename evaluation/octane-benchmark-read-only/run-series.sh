#!/bin/sh
#-agentlib:hprof=cpu=times
#scimark monte_carlo
#./run-benchmark.sh baseline_jdk9 scimark.monte_carlo
#./run-benchmark.sh baseline scimark.monte_carlo
#./run-benchmark.sh baseline_noosr $1
./run-benchmark.sh create scimark.monte_carlo
./run-benchmark.sh use scimark.monte_carlo
#scimark fft.large
#./run-benchmark.sh baseline_jdk9 scimark.fft.large
#./run-benchmark.sh baseline scimark.fft.large
#./run-benchmark.sh baseline_noosr $1
./run-benchmark.sh create scimark.fft.large
./run-benchmark.sh use scimark.fft.large
#scimark lu.large
#./run-benchmark.sh baseline_jdk9 scimark.lu.large
#./run-benchmark.sh baseline scimark.lu.large
#./run-benchmark.sh baseline_noosr $1
./run-benchmark.sh create scimark.lu.large
./run-benchmark.sh use scimark.lu.large

