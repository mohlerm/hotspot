################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/gc_implementation/shared/adaptiveSizePolicy.cpp \
../src/share/vm/gc_implementation/shared/ageTable.cpp \
../src/share/vm/gc_implementation/shared/allocationStats.cpp \
../src/share/vm/gc_implementation/shared/cSpaceCounters.cpp \
../src/share/vm/gc_implementation/shared/collectorCounters.cpp \
../src/share/vm/gc_implementation/shared/concurrentGCThread.cpp \
../src/share/vm/gc_implementation/shared/gSpaceCounters.cpp \
../src/share/vm/gc_implementation/shared/gcAdaptivePolicyCounters.cpp \
../src/share/vm/gc_implementation/shared/gcId.cpp \
../src/share/vm/gc_implementation/shared/gcPolicyCounters.cpp \
../src/share/vm/gc_implementation/shared/gcStats.cpp \
../src/share/vm/gc_implementation/shared/gcTimer.cpp \
../src/share/vm/gc_implementation/shared/gcTrace.cpp \
../src/share/vm/gc_implementation/shared/gcTraceSend.cpp \
../src/share/vm/gc_implementation/shared/gcTraceTime.cpp \
../src/share/vm/gc_implementation/shared/gcUtil.cpp \
../src/share/vm/gc_implementation/shared/generationCounters.cpp \
../src/share/vm/gc_implementation/shared/hSpaceCounters.cpp \
../src/share/vm/gc_implementation/shared/immutableSpace.cpp \
../src/share/vm/gc_implementation/shared/markSweep.cpp \
../src/share/vm/gc_implementation/shared/mutableNUMASpace.cpp \
../src/share/vm/gc_implementation/shared/mutableSpace.cpp \
../src/share/vm/gc_implementation/shared/objectCountEventSender.cpp \
../src/share/vm/gc_implementation/shared/parGCAllocBuffer.cpp \
../src/share/vm/gc_implementation/shared/spaceCounters.cpp \
../src/share/vm/gc_implementation/shared/spaceDecorator.cpp \
../src/share/vm/gc_implementation/shared/suspendibleThreadSet.cpp \
../src/share/vm/gc_implementation/shared/vmGCOperations.cpp 

OBJS += \
./src/share/vm/gc_implementation/shared/adaptiveSizePolicy.o \
./src/share/vm/gc_implementation/shared/ageTable.o \
./src/share/vm/gc_implementation/shared/allocationStats.o \
./src/share/vm/gc_implementation/shared/cSpaceCounters.o \
./src/share/vm/gc_implementation/shared/collectorCounters.o \
./src/share/vm/gc_implementation/shared/concurrentGCThread.o \
./src/share/vm/gc_implementation/shared/gSpaceCounters.o \
./src/share/vm/gc_implementation/shared/gcAdaptivePolicyCounters.o \
./src/share/vm/gc_implementation/shared/gcId.o \
./src/share/vm/gc_implementation/shared/gcPolicyCounters.o \
./src/share/vm/gc_implementation/shared/gcStats.o \
./src/share/vm/gc_implementation/shared/gcTimer.o \
./src/share/vm/gc_implementation/shared/gcTrace.o \
./src/share/vm/gc_implementation/shared/gcTraceSend.o \
./src/share/vm/gc_implementation/shared/gcTraceTime.o \
./src/share/vm/gc_implementation/shared/gcUtil.o \
./src/share/vm/gc_implementation/shared/generationCounters.o \
./src/share/vm/gc_implementation/shared/hSpaceCounters.o \
./src/share/vm/gc_implementation/shared/immutableSpace.o \
./src/share/vm/gc_implementation/shared/markSweep.o \
./src/share/vm/gc_implementation/shared/mutableNUMASpace.o \
./src/share/vm/gc_implementation/shared/mutableSpace.o \
./src/share/vm/gc_implementation/shared/objectCountEventSender.o \
./src/share/vm/gc_implementation/shared/parGCAllocBuffer.o \
./src/share/vm/gc_implementation/shared/spaceCounters.o \
./src/share/vm/gc_implementation/shared/spaceDecorator.o \
./src/share/vm/gc_implementation/shared/suspendibleThreadSet.o \
./src/share/vm/gc_implementation/shared/vmGCOperations.o 

CPP_DEPS += \
./src/share/vm/gc_implementation/shared/adaptiveSizePolicy.d \
./src/share/vm/gc_implementation/shared/ageTable.d \
./src/share/vm/gc_implementation/shared/allocationStats.d \
./src/share/vm/gc_implementation/shared/cSpaceCounters.d \
./src/share/vm/gc_implementation/shared/collectorCounters.d \
./src/share/vm/gc_implementation/shared/concurrentGCThread.d \
./src/share/vm/gc_implementation/shared/gSpaceCounters.d \
./src/share/vm/gc_implementation/shared/gcAdaptivePolicyCounters.d \
./src/share/vm/gc_implementation/shared/gcId.d \
./src/share/vm/gc_implementation/shared/gcPolicyCounters.d \
./src/share/vm/gc_implementation/shared/gcStats.d \
./src/share/vm/gc_implementation/shared/gcTimer.d \
./src/share/vm/gc_implementation/shared/gcTrace.d \
./src/share/vm/gc_implementation/shared/gcTraceSend.d \
./src/share/vm/gc_implementation/shared/gcTraceTime.d \
./src/share/vm/gc_implementation/shared/gcUtil.d \
./src/share/vm/gc_implementation/shared/generationCounters.d \
./src/share/vm/gc_implementation/shared/hSpaceCounters.d \
./src/share/vm/gc_implementation/shared/immutableSpace.d \
./src/share/vm/gc_implementation/shared/markSweep.d \
./src/share/vm/gc_implementation/shared/mutableNUMASpace.d \
./src/share/vm/gc_implementation/shared/mutableSpace.d \
./src/share/vm/gc_implementation/shared/objectCountEventSender.d \
./src/share/vm/gc_implementation/shared/parGCAllocBuffer.d \
./src/share/vm/gc_implementation/shared/spaceCounters.d \
./src/share/vm/gc_implementation/shared/spaceDecorator.d \
./src/share/vm/gc_implementation/shared/suspendibleThreadSet.d \
./src/share/vm/gc_implementation/shared/vmGCOperations.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/gc_implementation/shared/%.o: ../src/share/vm/gc_implementation/shared/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


