################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/gc_implementation/g1/bufferingOopClosure.cpp \
../src/share/vm/gc_implementation/g1/collectionSetChooser.cpp \
../src/share/vm/gc_implementation/g1/concurrentG1Refine.cpp \
../src/share/vm/gc_implementation/g1/concurrentG1RefineThread.cpp \
../src/share/vm/gc_implementation/g1/concurrentMark.cpp \
../src/share/vm/gc_implementation/g1/concurrentMarkThread.cpp \
../src/share/vm/gc_implementation/g1/dirtyCardQueue.cpp \
../src/share/vm/gc_implementation/g1/g1AllocRegion.cpp \
../src/share/vm/gc_implementation/g1/g1Allocator.cpp \
../src/share/vm/gc_implementation/g1/g1Allocator_ext.cpp \
../src/share/vm/gc_implementation/g1/g1BiasedArray.cpp \
../src/share/vm/gc_implementation/g1/g1BlockOffsetTable.cpp \
../src/share/vm/gc_implementation/g1/g1CardCounts.cpp \
../src/share/vm/gc_implementation/g1/g1CodeCacheRemSet.cpp \
../src/share/vm/gc_implementation/g1/g1CollectedHeap.cpp \
../src/share/vm/gc_implementation/g1/g1CollectedHeap_ext.cpp \
../src/share/vm/gc_implementation/g1/g1CollectorPolicy.cpp \
../src/share/vm/gc_implementation/g1/g1ErgoVerbose.cpp \
../src/share/vm/gc_implementation/g1/g1EvacFailure.cpp \
../src/share/vm/gc_implementation/g1/g1GCPhaseTimes.cpp \
../src/share/vm/gc_implementation/g1/g1HRPrinter.cpp \
../src/share/vm/gc_implementation/g1/g1HotCardCache.cpp \
../src/share/vm/gc_implementation/g1/g1Log.cpp \
../src/share/vm/gc_implementation/g1/g1MMUTracker.cpp \
../src/share/vm/gc_implementation/g1/g1MarkSweep.cpp \
../src/share/vm/gc_implementation/g1/g1MarkSweep_ext.cpp \
../src/share/vm/gc_implementation/g1/g1MonitoringSupport.cpp \
../src/share/vm/gc_implementation/g1/g1OopClosures.cpp \
../src/share/vm/gc_implementation/g1/g1PageBasedVirtualSpace.cpp \
../src/share/vm/gc_implementation/g1/g1ParScanThreadState.cpp \
../src/share/vm/gc_implementation/g1/g1RegionToSpaceMapper.cpp \
../src/share/vm/gc_implementation/g1/g1RemSet.cpp \
../src/share/vm/gc_implementation/g1/g1RemSetSummary.cpp \
../src/share/vm/gc_implementation/g1/g1SATBCardTableModRefBS.cpp \
../src/share/vm/gc_implementation/g1/g1StringDedup.cpp \
../src/share/vm/gc_implementation/g1/g1StringDedupQueue.cpp \
../src/share/vm/gc_implementation/g1/g1StringDedupStat.cpp \
../src/share/vm/gc_implementation/g1/g1StringDedupTable.cpp \
../src/share/vm/gc_implementation/g1/g1StringDedupThread.cpp \
../src/share/vm/gc_implementation/g1/g1_globals.cpp \
../src/share/vm/gc_implementation/g1/heapRegion.cpp \
../src/share/vm/gc_implementation/g1/heapRegionManager.cpp \
../src/share/vm/gc_implementation/g1/heapRegionRemSet.cpp \
../src/share/vm/gc_implementation/g1/heapRegionSet.cpp \
../src/share/vm/gc_implementation/g1/heapRegionType.cpp \
../src/share/vm/gc_implementation/g1/ptrQueue.cpp \
../src/share/vm/gc_implementation/g1/satbQueue.cpp \
../src/share/vm/gc_implementation/g1/sparsePRT.cpp \
../src/share/vm/gc_implementation/g1/survRateGroup.cpp \
../src/share/vm/gc_implementation/g1/vm_operations_g1.cpp 

OBJS += \
./src/share/vm/gc_implementation/g1/bufferingOopClosure.o \
./src/share/vm/gc_implementation/g1/collectionSetChooser.o \
./src/share/vm/gc_implementation/g1/concurrentG1Refine.o \
./src/share/vm/gc_implementation/g1/concurrentG1RefineThread.o \
./src/share/vm/gc_implementation/g1/concurrentMark.o \
./src/share/vm/gc_implementation/g1/concurrentMarkThread.o \
./src/share/vm/gc_implementation/g1/dirtyCardQueue.o \
./src/share/vm/gc_implementation/g1/g1AllocRegion.o \
./src/share/vm/gc_implementation/g1/g1Allocator.o \
./src/share/vm/gc_implementation/g1/g1Allocator_ext.o \
./src/share/vm/gc_implementation/g1/g1BiasedArray.o \
./src/share/vm/gc_implementation/g1/g1BlockOffsetTable.o \
./src/share/vm/gc_implementation/g1/g1CardCounts.o \
./src/share/vm/gc_implementation/g1/g1CodeCacheRemSet.o \
./src/share/vm/gc_implementation/g1/g1CollectedHeap.o \
./src/share/vm/gc_implementation/g1/g1CollectedHeap_ext.o \
./src/share/vm/gc_implementation/g1/g1CollectorPolicy.o \
./src/share/vm/gc_implementation/g1/g1ErgoVerbose.o \
./src/share/vm/gc_implementation/g1/g1EvacFailure.o \
./src/share/vm/gc_implementation/g1/g1GCPhaseTimes.o \
./src/share/vm/gc_implementation/g1/g1HRPrinter.o \
./src/share/vm/gc_implementation/g1/g1HotCardCache.o \
./src/share/vm/gc_implementation/g1/g1Log.o \
./src/share/vm/gc_implementation/g1/g1MMUTracker.o \
./src/share/vm/gc_implementation/g1/g1MarkSweep.o \
./src/share/vm/gc_implementation/g1/g1MarkSweep_ext.o \
./src/share/vm/gc_implementation/g1/g1MonitoringSupport.o \
./src/share/vm/gc_implementation/g1/g1OopClosures.o \
./src/share/vm/gc_implementation/g1/g1PageBasedVirtualSpace.o \
./src/share/vm/gc_implementation/g1/g1ParScanThreadState.o \
./src/share/vm/gc_implementation/g1/g1RegionToSpaceMapper.o \
./src/share/vm/gc_implementation/g1/g1RemSet.o \
./src/share/vm/gc_implementation/g1/g1RemSetSummary.o \
./src/share/vm/gc_implementation/g1/g1SATBCardTableModRefBS.o \
./src/share/vm/gc_implementation/g1/g1StringDedup.o \
./src/share/vm/gc_implementation/g1/g1StringDedupQueue.o \
./src/share/vm/gc_implementation/g1/g1StringDedupStat.o \
./src/share/vm/gc_implementation/g1/g1StringDedupTable.o \
./src/share/vm/gc_implementation/g1/g1StringDedupThread.o \
./src/share/vm/gc_implementation/g1/g1_globals.o \
./src/share/vm/gc_implementation/g1/heapRegion.o \
./src/share/vm/gc_implementation/g1/heapRegionManager.o \
./src/share/vm/gc_implementation/g1/heapRegionRemSet.o \
./src/share/vm/gc_implementation/g1/heapRegionSet.o \
./src/share/vm/gc_implementation/g1/heapRegionType.o \
./src/share/vm/gc_implementation/g1/ptrQueue.o \
./src/share/vm/gc_implementation/g1/satbQueue.o \
./src/share/vm/gc_implementation/g1/sparsePRT.o \
./src/share/vm/gc_implementation/g1/survRateGroup.o \
./src/share/vm/gc_implementation/g1/vm_operations_g1.o 

CPP_DEPS += \
./src/share/vm/gc_implementation/g1/bufferingOopClosure.d \
./src/share/vm/gc_implementation/g1/collectionSetChooser.d \
./src/share/vm/gc_implementation/g1/concurrentG1Refine.d \
./src/share/vm/gc_implementation/g1/concurrentG1RefineThread.d \
./src/share/vm/gc_implementation/g1/concurrentMark.d \
./src/share/vm/gc_implementation/g1/concurrentMarkThread.d \
./src/share/vm/gc_implementation/g1/dirtyCardQueue.d \
./src/share/vm/gc_implementation/g1/g1AllocRegion.d \
./src/share/vm/gc_implementation/g1/g1Allocator.d \
./src/share/vm/gc_implementation/g1/g1Allocator_ext.d \
./src/share/vm/gc_implementation/g1/g1BiasedArray.d \
./src/share/vm/gc_implementation/g1/g1BlockOffsetTable.d \
./src/share/vm/gc_implementation/g1/g1CardCounts.d \
./src/share/vm/gc_implementation/g1/g1CodeCacheRemSet.d \
./src/share/vm/gc_implementation/g1/g1CollectedHeap.d \
./src/share/vm/gc_implementation/g1/g1CollectedHeap_ext.d \
./src/share/vm/gc_implementation/g1/g1CollectorPolicy.d \
./src/share/vm/gc_implementation/g1/g1ErgoVerbose.d \
./src/share/vm/gc_implementation/g1/g1EvacFailure.d \
./src/share/vm/gc_implementation/g1/g1GCPhaseTimes.d \
./src/share/vm/gc_implementation/g1/g1HRPrinter.d \
./src/share/vm/gc_implementation/g1/g1HotCardCache.d \
./src/share/vm/gc_implementation/g1/g1Log.d \
./src/share/vm/gc_implementation/g1/g1MMUTracker.d \
./src/share/vm/gc_implementation/g1/g1MarkSweep.d \
./src/share/vm/gc_implementation/g1/g1MarkSweep_ext.d \
./src/share/vm/gc_implementation/g1/g1MonitoringSupport.d \
./src/share/vm/gc_implementation/g1/g1OopClosures.d \
./src/share/vm/gc_implementation/g1/g1PageBasedVirtualSpace.d \
./src/share/vm/gc_implementation/g1/g1ParScanThreadState.d \
./src/share/vm/gc_implementation/g1/g1RegionToSpaceMapper.d \
./src/share/vm/gc_implementation/g1/g1RemSet.d \
./src/share/vm/gc_implementation/g1/g1RemSetSummary.d \
./src/share/vm/gc_implementation/g1/g1SATBCardTableModRefBS.d \
./src/share/vm/gc_implementation/g1/g1StringDedup.d \
./src/share/vm/gc_implementation/g1/g1StringDedupQueue.d \
./src/share/vm/gc_implementation/g1/g1StringDedupStat.d \
./src/share/vm/gc_implementation/g1/g1StringDedupTable.d \
./src/share/vm/gc_implementation/g1/g1StringDedupThread.d \
./src/share/vm/gc_implementation/g1/g1_globals.d \
./src/share/vm/gc_implementation/g1/heapRegion.d \
./src/share/vm/gc_implementation/g1/heapRegionManager.d \
./src/share/vm/gc_implementation/g1/heapRegionRemSet.d \
./src/share/vm/gc_implementation/g1/heapRegionSet.d \
./src/share/vm/gc_implementation/g1/heapRegionType.d \
./src/share/vm/gc_implementation/g1/ptrQueue.d \
./src/share/vm/gc_implementation/g1/satbQueue.d \
./src/share/vm/gc_implementation/g1/sparsePRT.d \
./src/share/vm/gc_implementation/g1/survRateGroup.d \
./src/share/vm/gc_implementation/g1/vm_operations_g1.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/gc_implementation/g1/%.o: ../src/share/vm/gc_implementation/g1/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


