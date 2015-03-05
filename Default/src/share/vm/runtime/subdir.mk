################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/runtime/advancedThresholdPolicy.cpp \
../src/share/vm/runtime/arguments.cpp \
../src/share/vm/runtime/atomic.cpp \
../src/share/vm/runtime/basicLock.cpp \
../src/share/vm/runtime/biasedLocking.cpp \
../src/share/vm/runtime/compilationPolicy.cpp \
../src/share/vm/runtime/deoptimization.cpp \
../src/share/vm/runtime/fieldDescriptor.cpp \
../src/share/vm/runtime/fieldType.cpp \
../src/share/vm/runtime/fprofiler.cpp \
../src/share/vm/runtime/frame.cpp \
../src/share/vm/runtime/globals.cpp \
../src/share/vm/runtime/handles.cpp \
../src/share/vm/runtime/icache.cpp \
../src/share/vm/runtime/init.cpp \
../src/share/vm/runtime/interfaceSupport.cpp \
../src/share/vm/runtime/java.cpp \
../src/share/vm/runtime/javaCalls.cpp \
../src/share/vm/runtime/jniHandles.cpp \
../src/share/vm/runtime/jniPeriodicChecker.cpp \
../src/share/vm/runtime/memprofiler.cpp \
../src/share/vm/runtime/monitorChunk.cpp \
../src/share/vm/runtime/mutex.cpp \
../src/share/vm/runtime/mutexLocker.cpp \
../src/share/vm/runtime/objectMonitor.cpp \
../src/share/vm/runtime/orderAccess.cpp \
../src/share/vm/runtime/os.cpp \
../src/share/vm/runtime/osThread.cpp \
../src/share/vm/runtime/park.cpp \
../src/share/vm/runtime/perfData.cpp \
../src/share/vm/runtime/perfMemory.cpp \
../src/share/vm/runtime/reflection.cpp \
../src/share/vm/runtime/reflectionUtils.cpp \
../src/share/vm/runtime/relocator.cpp \
../src/share/vm/runtime/rframe.cpp \
../src/share/vm/runtime/safepoint.cpp \
../src/share/vm/runtime/serviceThread.cpp \
../src/share/vm/runtime/sharedRuntime.cpp \
../src/share/vm/runtime/sharedRuntimeTrans.cpp \
../src/share/vm/runtime/sharedRuntimeTrig.cpp \
../src/share/vm/runtime/signature.cpp \
../src/share/vm/runtime/simpleThresholdPolicy.cpp \
../src/share/vm/runtime/stackValue.cpp \
../src/share/vm/runtime/stackValueCollection.cpp \
../src/share/vm/runtime/statSampler.cpp \
../src/share/vm/runtime/stubCodeGenerator.cpp \
../src/share/vm/runtime/stubRoutines.cpp \
../src/share/vm/runtime/sweeper.cpp \
../src/share/vm/runtime/synchronizer.cpp \
../src/share/vm/runtime/task.cpp \
../src/share/vm/runtime/thread.cpp \
../src/share/vm/runtime/threadLocalStorage.cpp \
../src/share/vm/runtime/thread_ext.cpp \
../src/share/vm/runtime/timer.cpp \
../src/share/vm/runtime/unhandledOops.cpp \
../src/share/vm/runtime/vframe.cpp \
../src/share/vm/runtime/vframeArray.cpp \
../src/share/vm/runtime/vframe_hp.cpp \
../src/share/vm/runtime/virtualspace.cpp \
../src/share/vm/runtime/vmStructs.cpp \
../src/share/vm/runtime/vmThread.cpp \
../src/share/vm/runtime/vm_operations.cpp \
../src/share/vm/runtime/vm_version.cpp 

OBJS += \
./src/share/vm/runtime/advancedThresholdPolicy.o \
./src/share/vm/runtime/arguments.o \
./src/share/vm/runtime/atomic.o \
./src/share/vm/runtime/basicLock.o \
./src/share/vm/runtime/biasedLocking.o \
./src/share/vm/runtime/compilationPolicy.o \
./src/share/vm/runtime/deoptimization.o \
./src/share/vm/runtime/fieldDescriptor.o \
./src/share/vm/runtime/fieldType.o \
./src/share/vm/runtime/fprofiler.o \
./src/share/vm/runtime/frame.o \
./src/share/vm/runtime/globals.o \
./src/share/vm/runtime/handles.o \
./src/share/vm/runtime/icache.o \
./src/share/vm/runtime/init.o \
./src/share/vm/runtime/interfaceSupport.o \
./src/share/vm/runtime/java.o \
./src/share/vm/runtime/javaCalls.o \
./src/share/vm/runtime/jniHandles.o \
./src/share/vm/runtime/jniPeriodicChecker.o \
./src/share/vm/runtime/memprofiler.o \
./src/share/vm/runtime/monitorChunk.o \
./src/share/vm/runtime/mutex.o \
./src/share/vm/runtime/mutexLocker.o \
./src/share/vm/runtime/objectMonitor.o \
./src/share/vm/runtime/orderAccess.o \
./src/share/vm/runtime/os.o \
./src/share/vm/runtime/osThread.o \
./src/share/vm/runtime/park.o \
./src/share/vm/runtime/perfData.o \
./src/share/vm/runtime/perfMemory.o \
./src/share/vm/runtime/reflection.o \
./src/share/vm/runtime/reflectionUtils.o \
./src/share/vm/runtime/relocator.o \
./src/share/vm/runtime/rframe.o \
./src/share/vm/runtime/safepoint.o \
./src/share/vm/runtime/serviceThread.o \
./src/share/vm/runtime/sharedRuntime.o \
./src/share/vm/runtime/sharedRuntimeTrans.o \
./src/share/vm/runtime/sharedRuntimeTrig.o \
./src/share/vm/runtime/signature.o \
./src/share/vm/runtime/simpleThresholdPolicy.o \
./src/share/vm/runtime/stackValue.o \
./src/share/vm/runtime/stackValueCollection.o \
./src/share/vm/runtime/statSampler.o \
./src/share/vm/runtime/stubCodeGenerator.o \
./src/share/vm/runtime/stubRoutines.o \
./src/share/vm/runtime/sweeper.o \
./src/share/vm/runtime/synchronizer.o \
./src/share/vm/runtime/task.o \
./src/share/vm/runtime/thread.o \
./src/share/vm/runtime/threadLocalStorage.o \
./src/share/vm/runtime/thread_ext.o \
./src/share/vm/runtime/timer.o \
./src/share/vm/runtime/unhandledOops.o \
./src/share/vm/runtime/vframe.o \
./src/share/vm/runtime/vframeArray.o \
./src/share/vm/runtime/vframe_hp.o \
./src/share/vm/runtime/virtualspace.o \
./src/share/vm/runtime/vmStructs.o \
./src/share/vm/runtime/vmThread.o \
./src/share/vm/runtime/vm_operations.o \
./src/share/vm/runtime/vm_version.o 

CPP_DEPS += \
./src/share/vm/runtime/advancedThresholdPolicy.d \
./src/share/vm/runtime/arguments.d \
./src/share/vm/runtime/atomic.d \
./src/share/vm/runtime/basicLock.d \
./src/share/vm/runtime/biasedLocking.d \
./src/share/vm/runtime/compilationPolicy.d \
./src/share/vm/runtime/deoptimization.d \
./src/share/vm/runtime/fieldDescriptor.d \
./src/share/vm/runtime/fieldType.d \
./src/share/vm/runtime/fprofiler.d \
./src/share/vm/runtime/frame.d \
./src/share/vm/runtime/globals.d \
./src/share/vm/runtime/handles.d \
./src/share/vm/runtime/icache.d \
./src/share/vm/runtime/init.d \
./src/share/vm/runtime/interfaceSupport.d \
./src/share/vm/runtime/java.d \
./src/share/vm/runtime/javaCalls.d \
./src/share/vm/runtime/jniHandles.d \
./src/share/vm/runtime/jniPeriodicChecker.d \
./src/share/vm/runtime/memprofiler.d \
./src/share/vm/runtime/monitorChunk.d \
./src/share/vm/runtime/mutex.d \
./src/share/vm/runtime/mutexLocker.d \
./src/share/vm/runtime/objectMonitor.d \
./src/share/vm/runtime/orderAccess.d \
./src/share/vm/runtime/os.d \
./src/share/vm/runtime/osThread.d \
./src/share/vm/runtime/park.d \
./src/share/vm/runtime/perfData.d \
./src/share/vm/runtime/perfMemory.d \
./src/share/vm/runtime/reflection.d \
./src/share/vm/runtime/reflectionUtils.d \
./src/share/vm/runtime/relocator.d \
./src/share/vm/runtime/rframe.d \
./src/share/vm/runtime/safepoint.d \
./src/share/vm/runtime/serviceThread.d \
./src/share/vm/runtime/sharedRuntime.d \
./src/share/vm/runtime/sharedRuntimeTrans.d \
./src/share/vm/runtime/sharedRuntimeTrig.d \
./src/share/vm/runtime/signature.d \
./src/share/vm/runtime/simpleThresholdPolicy.d \
./src/share/vm/runtime/stackValue.d \
./src/share/vm/runtime/stackValueCollection.d \
./src/share/vm/runtime/statSampler.d \
./src/share/vm/runtime/stubCodeGenerator.d \
./src/share/vm/runtime/stubRoutines.d \
./src/share/vm/runtime/sweeper.d \
./src/share/vm/runtime/synchronizer.d \
./src/share/vm/runtime/task.d \
./src/share/vm/runtime/thread.d \
./src/share/vm/runtime/threadLocalStorage.d \
./src/share/vm/runtime/thread_ext.d \
./src/share/vm/runtime/timer.d \
./src/share/vm/runtime/unhandledOops.d \
./src/share/vm/runtime/vframe.d \
./src/share/vm/runtime/vframeArray.d \
./src/share/vm/runtime/vframe_hp.d \
./src/share/vm/runtime/virtualspace.d \
./src/share/vm/runtime/vmStructs.d \
./src/share/vm/runtime/vmThread.d \
./src/share/vm/runtime/vm_operations.d \
./src/share/vm/runtime/vm_version.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/runtime/%.o: ../src/share/vm/runtime/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


