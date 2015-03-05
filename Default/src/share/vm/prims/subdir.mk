################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/prims/evmCompat.cpp \
../src/share/vm/prims/forte.cpp \
../src/share/vm/prims/jni.cpp \
../src/share/vm/prims/jniCheck.cpp \
../src/share/vm/prims/jniFastGetField.cpp \
../src/share/vm/prims/jvm.cpp \
../src/share/vm/prims/jvmtiClassFileReconstituter.cpp \
../src/share/vm/prims/jvmtiCodeBlobEvents.cpp \
../src/share/vm/prims/jvmtiEnv.cpp \
../src/share/vm/prims/jvmtiEnvBase.cpp \
../src/share/vm/prims/jvmtiEnvThreadState.cpp \
../src/share/vm/prims/jvmtiEventController.cpp \
../src/share/vm/prims/jvmtiExport.cpp \
../src/share/vm/prims/jvmtiExtensions.cpp \
../src/share/vm/prims/jvmtiGetLoadedClasses.cpp \
../src/share/vm/prims/jvmtiImpl.cpp \
../src/share/vm/prims/jvmtiManageCapabilities.cpp \
../src/share/vm/prims/jvmtiRawMonitor.cpp \
../src/share/vm/prims/jvmtiRedefineClasses.cpp \
../src/share/vm/prims/jvmtiTagMap.cpp \
../src/share/vm/prims/jvmtiThreadState.cpp \
../src/share/vm/prims/jvmtiTrace.cpp \
../src/share/vm/prims/jvmtiUtil.cpp \
../src/share/vm/prims/methodComparator.cpp \
../src/share/vm/prims/methodHandles.cpp \
../src/share/vm/prims/nativeLookup.cpp \
../src/share/vm/prims/perf.cpp \
../src/share/vm/prims/privilegedStack.cpp \
../src/share/vm/prims/unsafe.cpp \
../src/share/vm/prims/whitebox.cpp \
../src/share/vm/prims/whitebox_ext.cpp 

OBJS += \
./src/share/vm/prims/evmCompat.o \
./src/share/vm/prims/forte.o \
./src/share/vm/prims/jni.o \
./src/share/vm/prims/jniCheck.o \
./src/share/vm/prims/jniFastGetField.o \
./src/share/vm/prims/jvm.o \
./src/share/vm/prims/jvmtiClassFileReconstituter.o \
./src/share/vm/prims/jvmtiCodeBlobEvents.o \
./src/share/vm/prims/jvmtiEnv.o \
./src/share/vm/prims/jvmtiEnvBase.o \
./src/share/vm/prims/jvmtiEnvThreadState.o \
./src/share/vm/prims/jvmtiEventController.o \
./src/share/vm/prims/jvmtiExport.o \
./src/share/vm/prims/jvmtiExtensions.o \
./src/share/vm/prims/jvmtiGetLoadedClasses.o \
./src/share/vm/prims/jvmtiImpl.o \
./src/share/vm/prims/jvmtiManageCapabilities.o \
./src/share/vm/prims/jvmtiRawMonitor.o \
./src/share/vm/prims/jvmtiRedefineClasses.o \
./src/share/vm/prims/jvmtiTagMap.o \
./src/share/vm/prims/jvmtiThreadState.o \
./src/share/vm/prims/jvmtiTrace.o \
./src/share/vm/prims/jvmtiUtil.o \
./src/share/vm/prims/methodComparator.o \
./src/share/vm/prims/methodHandles.o \
./src/share/vm/prims/nativeLookup.o \
./src/share/vm/prims/perf.o \
./src/share/vm/prims/privilegedStack.o \
./src/share/vm/prims/unsafe.o \
./src/share/vm/prims/whitebox.o \
./src/share/vm/prims/whitebox_ext.o 

CPP_DEPS += \
./src/share/vm/prims/evmCompat.d \
./src/share/vm/prims/forte.d \
./src/share/vm/prims/jni.d \
./src/share/vm/prims/jniCheck.d \
./src/share/vm/prims/jniFastGetField.d \
./src/share/vm/prims/jvm.d \
./src/share/vm/prims/jvmtiClassFileReconstituter.d \
./src/share/vm/prims/jvmtiCodeBlobEvents.d \
./src/share/vm/prims/jvmtiEnv.d \
./src/share/vm/prims/jvmtiEnvBase.d \
./src/share/vm/prims/jvmtiEnvThreadState.d \
./src/share/vm/prims/jvmtiEventController.d \
./src/share/vm/prims/jvmtiExport.d \
./src/share/vm/prims/jvmtiExtensions.d \
./src/share/vm/prims/jvmtiGetLoadedClasses.d \
./src/share/vm/prims/jvmtiImpl.d \
./src/share/vm/prims/jvmtiManageCapabilities.d \
./src/share/vm/prims/jvmtiRawMonitor.d \
./src/share/vm/prims/jvmtiRedefineClasses.d \
./src/share/vm/prims/jvmtiTagMap.d \
./src/share/vm/prims/jvmtiThreadState.d \
./src/share/vm/prims/jvmtiTrace.d \
./src/share/vm/prims/jvmtiUtil.d \
./src/share/vm/prims/methodComparator.d \
./src/share/vm/prims/methodHandles.d \
./src/share/vm/prims/nativeLookup.d \
./src/share/vm/prims/perf.d \
./src/share/vm/prims/privilegedStack.d \
./src/share/vm/prims/unsafe.d \
./src/share/vm/prims/whitebox.d \
./src/share/vm/prims/whitebox_ext.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/prims/%.o: ../src/share/vm/prims/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


