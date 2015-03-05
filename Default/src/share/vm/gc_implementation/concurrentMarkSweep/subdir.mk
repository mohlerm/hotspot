################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/gc_implementation/concurrentMarkSweep/adaptiveFreeList.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/cmsCollectorPolicy.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/cmsLockVerifier.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/compactibleFreeListSpace.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/concurrentMarkSweepGeneration.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/concurrentMarkSweepThread.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/freeChunk.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/promotionInfo.cpp \
../src/share/vm/gc_implementation/concurrentMarkSweep/vmCMSOperations.cpp 

OBJS += \
./src/share/vm/gc_implementation/concurrentMarkSweep/adaptiveFreeList.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/cmsCollectorPolicy.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/cmsLockVerifier.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/compactibleFreeListSpace.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/concurrentMarkSweepGeneration.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/concurrentMarkSweepThread.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/freeChunk.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/promotionInfo.o \
./src/share/vm/gc_implementation/concurrentMarkSweep/vmCMSOperations.o 

CPP_DEPS += \
./src/share/vm/gc_implementation/concurrentMarkSweep/adaptiveFreeList.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/cmsCollectorPolicy.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/cmsLockVerifier.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/compactibleFreeListSpace.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/concurrentMarkSweepGeneration.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/concurrentMarkSweepThread.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/freeChunk.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/promotionInfo.d \
./src/share/vm/gc_implementation/concurrentMarkSweep/vmCMSOperations.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/gc_implementation/concurrentMarkSweep/%.o: ../src/share/vm/gc_implementation/concurrentMarkSweep/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


