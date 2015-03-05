################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/c1/c1_CFGPrinter.cpp \
../src/share/vm/c1/c1_Canonicalizer.cpp \
../src/share/vm/c1/c1_Compilation.cpp \
../src/share/vm/c1/c1_Compiler.cpp \
../src/share/vm/c1/c1_Defs.cpp \
../src/share/vm/c1/c1_FrameMap.cpp \
../src/share/vm/c1/c1_GraphBuilder.cpp \
../src/share/vm/c1/c1_IR.cpp \
../src/share/vm/c1/c1_Instruction.cpp \
../src/share/vm/c1/c1_InstructionPrinter.cpp \
../src/share/vm/c1/c1_LIR.cpp \
../src/share/vm/c1/c1_LIRAssembler.cpp \
../src/share/vm/c1/c1_LIRGenerator.cpp \
../src/share/vm/c1/c1_LinearScan.cpp \
../src/share/vm/c1/c1_Optimizer.cpp \
../src/share/vm/c1/c1_RangeCheckElimination.cpp \
../src/share/vm/c1/c1_Runtime1.cpp \
../src/share/vm/c1/c1_ValueMap.cpp \
../src/share/vm/c1/c1_ValueSet.cpp \
../src/share/vm/c1/c1_ValueStack.cpp \
../src/share/vm/c1/c1_ValueType.cpp \
../src/share/vm/c1/c1_globals.cpp 

OBJS += \
./src/share/vm/c1/c1_CFGPrinter.o \
./src/share/vm/c1/c1_Canonicalizer.o \
./src/share/vm/c1/c1_Compilation.o \
./src/share/vm/c1/c1_Compiler.o \
./src/share/vm/c1/c1_Defs.o \
./src/share/vm/c1/c1_FrameMap.o \
./src/share/vm/c1/c1_GraphBuilder.o \
./src/share/vm/c1/c1_IR.o \
./src/share/vm/c1/c1_Instruction.o \
./src/share/vm/c1/c1_InstructionPrinter.o \
./src/share/vm/c1/c1_LIR.o \
./src/share/vm/c1/c1_LIRAssembler.o \
./src/share/vm/c1/c1_LIRGenerator.o \
./src/share/vm/c1/c1_LinearScan.o \
./src/share/vm/c1/c1_Optimizer.o \
./src/share/vm/c1/c1_RangeCheckElimination.o \
./src/share/vm/c1/c1_Runtime1.o \
./src/share/vm/c1/c1_ValueMap.o \
./src/share/vm/c1/c1_ValueSet.o \
./src/share/vm/c1/c1_ValueStack.o \
./src/share/vm/c1/c1_ValueType.o \
./src/share/vm/c1/c1_globals.o 

CPP_DEPS += \
./src/share/vm/c1/c1_CFGPrinter.d \
./src/share/vm/c1/c1_Canonicalizer.d \
./src/share/vm/c1/c1_Compilation.d \
./src/share/vm/c1/c1_Compiler.d \
./src/share/vm/c1/c1_Defs.d \
./src/share/vm/c1/c1_FrameMap.d \
./src/share/vm/c1/c1_GraphBuilder.d \
./src/share/vm/c1/c1_IR.d \
./src/share/vm/c1/c1_Instruction.d \
./src/share/vm/c1/c1_InstructionPrinter.d \
./src/share/vm/c1/c1_LIR.d \
./src/share/vm/c1/c1_LIRAssembler.d \
./src/share/vm/c1/c1_LIRGenerator.d \
./src/share/vm/c1/c1_LinearScan.d \
./src/share/vm/c1/c1_Optimizer.d \
./src/share/vm/c1/c1_RangeCheckElimination.d \
./src/share/vm/c1/c1_Runtime1.d \
./src/share/vm/c1/c1_ValueMap.d \
./src/share/vm/c1/c1_ValueSet.d \
./src/share/vm/c1/c1_ValueStack.d \
./src/share/vm/c1/c1_ValueType.d \
./src/share/vm/c1/c1_globals.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/c1/%.o: ../src/share/vm/c1/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


