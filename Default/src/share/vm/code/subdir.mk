################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/code/codeBlob.cpp \
../src/share/vm/code/codeCache.cpp \
../src/share/vm/code/compiledIC.cpp \
../src/share/vm/code/compressedStream.cpp \
../src/share/vm/code/debugInfo.cpp \
../src/share/vm/code/debugInfoRec.cpp \
../src/share/vm/code/dependencies.cpp \
../src/share/vm/code/exceptionHandlerTable.cpp \
../src/share/vm/code/icBuffer.cpp \
../src/share/vm/code/location.cpp \
../src/share/vm/code/nmethod.cpp \
../src/share/vm/code/oopRecorder.cpp \
../src/share/vm/code/pcDesc.cpp \
../src/share/vm/code/relocInfo.cpp \
../src/share/vm/code/scopeDesc.cpp \
../src/share/vm/code/stubs.cpp \
../src/share/vm/code/vmreg.cpp \
../src/share/vm/code/vtableStubs.cpp 

OBJS += \
./src/share/vm/code/codeBlob.o \
./src/share/vm/code/codeCache.o \
./src/share/vm/code/compiledIC.o \
./src/share/vm/code/compressedStream.o \
./src/share/vm/code/debugInfo.o \
./src/share/vm/code/debugInfoRec.o \
./src/share/vm/code/dependencies.o \
./src/share/vm/code/exceptionHandlerTable.o \
./src/share/vm/code/icBuffer.o \
./src/share/vm/code/location.o \
./src/share/vm/code/nmethod.o \
./src/share/vm/code/oopRecorder.o \
./src/share/vm/code/pcDesc.o \
./src/share/vm/code/relocInfo.o \
./src/share/vm/code/scopeDesc.o \
./src/share/vm/code/stubs.o \
./src/share/vm/code/vmreg.o \
./src/share/vm/code/vtableStubs.o 

CPP_DEPS += \
./src/share/vm/code/codeBlob.d \
./src/share/vm/code/codeCache.d \
./src/share/vm/code/compiledIC.d \
./src/share/vm/code/compressedStream.d \
./src/share/vm/code/debugInfo.d \
./src/share/vm/code/debugInfoRec.d \
./src/share/vm/code/dependencies.d \
./src/share/vm/code/exceptionHandlerTable.d \
./src/share/vm/code/icBuffer.d \
./src/share/vm/code/location.d \
./src/share/vm/code/nmethod.d \
./src/share/vm/code/oopRecorder.d \
./src/share/vm/code/pcDesc.d \
./src/share/vm/code/relocInfo.d \
./src/share/vm/code/scopeDesc.d \
./src/share/vm/code/stubs.d \
./src/share/vm/code/vmreg.d \
./src/share/vm/code/vtableStubs.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/code/%.o: ../src/share/vm/code/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


