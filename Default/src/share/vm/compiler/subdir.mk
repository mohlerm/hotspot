################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/compiler/abstractCompiler.cpp \
../src/share/vm/compiler/compileBroker.cpp \
../src/share/vm/compiler/compileLog.cpp \
../src/share/vm/compiler/compilerOracle.cpp \
../src/share/vm/compiler/disassembler.cpp \
../src/share/vm/compiler/methodLiveness.cpp \
../src/share/vm/compiler/oopMap.cpp 

OBJS += \
./src/share/vm/compiler/abstractCompiler.o \
./src/share/vm/compiler/compileBroker.o \
./src/share/vm/compiler/compileLog.o \
./src/share/vm/compiler/compilerOracle.o \
./src/share/vm/compiler/disassembler.o \
./src/share/vm/compiler/methodLiveness.o \
./src/share/vm/compiler/oopMap.o 

CPP_DEPS += \
./src/share/vm/compiler/abstractCompiler.d \
./src/share/vm/compiler/compileBroker.d \
./src/share/vm/compiler/compileLog.d \
./src/share/vm/compiler/compilerOracle.d \
./src/share/vm/compiler/disassembler.d \
./src/share/vm/compiler/methodLiveness.d \
./src/share/vm/compiler/oopMap.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/compiler/%.o: ../src/share/vm/compiler/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


