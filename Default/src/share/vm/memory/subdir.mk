################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/memory/allocation.cpp \
../src/share/vm/memory/barrierSet.cpp \
../src/share/vm/memory/binaryTreeDictionary.cpp \
../src/share/vm/memory/blockOffsetTable.cpp \
../src/share/vm/memory/cardGeneration.cpp \
../src/share/vm/memory/cardTableModRefBS.cpp \
../src/share/vm/memory/cardTableRS.cpp \
../src/share/vm/memory/collectorPolicy.cpp \
../src/share/vm/memory/defNewGeneration.cpp \
../src/share/vm/memory/filemap.cpp \
../src/share/vm/memory/freeBlockDictionary.cpp \
../src/share/vm/memory/freeList.cpp \
../src/share/vm/memory/gcLocker.cpp \
../src/share/vm/memory/genCollectedHeap.cpp \
../src/share/vm/memory/genMarkSweep.cpp \
../src/share/vm/memory/genRemSet.cpp \
../src/share/vm/memory/generation.cpp \
../src/share/vm/memory/generationSpec.cpp \
../src/share/vm/memory/guardedMemory.cpp \
../src/share/vm/memory/heap.cpp \
../src/share/vm/memory/heapInspection.cpp \
../src/share/vm/memory/iterator.cpp \
../src/share/vm/memory/memRegion.cpp \
../src/share/vm/memory/metachunk.cpp \
../src/share/vm/memory/metaspace.cpp \
../src/share/vm/memory/metaspaceCounters.cpp \
../src/share/vm/memory/metaspaceShared.cpp \
../src/share/vm/memory/metaspaceTracer.cpp \
../src/share/vm/memory/oopFactory.cpp \
../src/share/vm/memory/referencePolicy.cpp \
../src/share/vm/memory/referenceProcessor.cpp \
../src/share/vm/memory/resourceArea.cpp \
../src/share/vm/memory/sharedHeap.cpp \
../src/share/vm/memory/space.cpp \
../src/share/vm/memory/specialized_oop_closures.cpp \
../src/share/vm/memory/tenuredGeneration.cpp \
../src/share/vm/memory/threadLocalAllocBuffer.cpp \
../src/share/vm/memory/universe.cpp 

OBJS += \
./src/share/vm/memory/allocation.o \
./src/share/vm/memory/barrierSet.o \
./src/share/vm/memory/binaryTreeDictionary.o \
./src/share/vm/memory/blockOffsetTable.o \
./src/share/vm/memory/cardGeneration.o \
./src/share/vm/memory/cardTableModRefBS.o \
./src/share/vm/memory/cardTableRS.o \
./src/share/vm/memory/collectorPolicy.o \
./src/share/vm/memory/defNewGeneration.o \
./src/share/vm/memory/filemap.o \
./src/share/vm/memory/freeBlockDictionary.o \
./src/share/vm/memory/freeList.o \
./src/share/vm/memory/gcLocker.o \
./src/share/vm/memory/genCollectedHeap.o \
./src/share/vm/memory/genMarkSweep.o \
./src/share/vm/memory/genRemSet.o \
./src/share/vm/memory/generation.o \
./src/share/vm/memory/generationSpec.o \
./src/share/vm/memory/guardedMemory.o \
./src/share/vm/memory/heap.o \
./src/share/vm/memory/heapInspection.o \
./src/share/vm/memory/iterator.o \
./src/share/vm/memory/memRegion.o \
./src/share/vm/memory/metachunk.o \
./src/share/vm/memory/metaspace.o \
./src/share/vm/memory/metaspaceCounters.o \
./src/share/vm/memory/metaspaceShared.o \
./src/share/vm/memory/metaspaceTracer.o \
./src/share/vm/memory/oopFactory.o \
./src/share/vm/memory/referencePolicy.o \
./src/share/vm/memory/referenceProcessor.o \
./src/share/vm/memory/resourceArea.o \
./src/share/vm/memory/sharedHeap.o \
./src/share/vm/memory/space.o \
./src/share/vm/memory/specialized_oop_closures.o \
./src/share/vm/memory/tenuredGeneration.o \
./src/share/vm/memory/threadLocalAllocBuffer.o \
./src/share/vm/memory/universe.o 

CPP_DEPS += \
./src/share/vm/memory/allocation.d \
./src/share/vm/memory/barrierSet.d \
./src/share/vm/memory/binaryTreeDictionary.d \
./src/share/vm/memory/blockOffsetTable.d \
./src/share/vm/memory/cardGeneration.d \
./src/share/vm/memory/cardTableModRefBS.d \
./src/share/vm/memory/cardTableRS.d \
./src/share/vm/memory/collectorPolicy.d \
./src/share/vm/memory/defNewGeneration.d \
./src/share/vm/memory/filemap.d \
./src/share/vm/memory/freeBlockDictionary.d \
./src/share/vm/memory/freeList.d \
./src/share/vm/memory/gcLocker.d \
./src/share/vm/memory/genCollectedHeap.d \
./src/share/vm/memory/genMarkSweep.d \
./src/share/vm/memory/genRemSet.d \
./src/share/vm/memory/generation.d \
./src/share/vm/memory/generationSpec.d \
./src/share/vm/memory/guardedMemory.d \
./src/share/vm/memory/heap.d \
./src/share/vm/memory/heapInspection.d \
./src/share/vm/memory/iterator.d \
./src/share/vm/memory/memRegion.d \
./src/share/vm/memory/metachunk.d \
./src/share/vm/memory/metaspace.d \
./src/share/vm/memory/metaspaceCounters.d \
./src/share/vm/memory/metaspaceShared.d \
./src/share/vm/memory/metaspaceTracer.d \
./src/share/vm/memory/oopFactory.d \
./src/share/vm/memory/referencePolicy.d \
./src/share/vm/memory/referenceProcessor.d \
./src/share/vm/memory/resourceArea.d \
./src/share/vm/memory/sharedHeap.d \
./src/share/vm/memory/space.d \
./src/share/vm/memory/specialized_oop_closures.d \
./src/share/vm/memory/tenuredGeneration.d \
./src/share/vm/memory/threadLocalAllocBuffer.d \
./src/share/vm/memory/universe.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/memory/%.o: ../src/share/vm/memory/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


