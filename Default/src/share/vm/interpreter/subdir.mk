################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/interpreter/bytecode.cpp \
../src/share/vm/interpreter/bytecodeHistogram.cpp \
../src/share/vm/interpreter/bytecodeInterpreter.cpp \
../src/share/vm/interpreter/bytecodeStream.cpp \
../src/share/vm/interpreter/bytecodeTracer.cpp \
../src/share/vm/interpreter/bytecodes.cpp \
../src/share/vm/interpreter/cppInterpreter.cpp \
../src/share/vm/interpreter/interpreter.cpp \
../src/share/vm/interpreter/interpreterRuntime.cpp \
../src/share/vm/interpreter/invocationCounter.cpp \
../src/share/vm/interpreter/linkResolver.cpp \
../src/share/vm/interpreter/oopMapCache.cpp \
../src/share/vm/interpreter/rewriter.cpp \
../src/share/vm/interpreter/templateInterpreter.cpp \
../src/share/vm/interpreter/templateTable.cpp 

OBJS += \
./src/share/vm/interpreter/bytecode.o \
./src/share/vm/interpreter/bytecodeHistogram.o \
./src/share/vm/interpreter/bytecodeInterpreter.o \
./src/share/vm/interpreter/bytecodeStream.o \
./src/share/vm/interpreter/bytecodeTracer.o \
./src/share/vm/interpreter/bytecodes.o \
./src/share/vm/interpreter/cppInterpreter.o \
./src/share/vm/interpreter/interpreter.o \
./src/share/vm/interpreter/interpreterRuntime.o \
./src/share/vm/interpreter/invocationCounter.o \
./src/share/vm/interpreter/linkResolver.o \
./src/share/vm/interpreter/oopMapCache.o \
./src/share/vm/interpreter/rewriter.o \
./src/share/vm/interpreter/templateInterpreter.o \
./src/share/vm/interpreter/templateTable.o 

CPP_DEPS += \
./src/share/vm/interpreter/bytecode.d \
./src/share/vm/interpreter/bytecodeHistogram.d \
./src/share/vm/interpreter/bytecodeInterpreter.d \
./src/share/vm/interpreter/bytecodeStream.d \
./src/share/vm/interpreter/bytecodeTracer.d \
./src/share/vm/interpreter/bytecodes.d \
./src/share/vm/interpreter/cppInterpreter.d \
./src/share/vm/interpreter/interpreter.d \
./src/share/vm/interpreter/interpreterRuntime.d \
./src/share/vm/interpreter/invocationCounter.d \
./src/share/vm/interpreter/linkResolver.d \
./src/share/vm/interpreter/oopMapCache.d \
./src/share/vm/interpreter/rewriter.d \
./src/share/vm/interpreter/templateInterpreter.d \
./src/share/vm/interpreter/templateTable.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/interpreter/%.o: ../src/share/vm/interpreter/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


