################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/cpu/ppc/vm/assembler_ppc.cpp \
../src/cpu/ppc/vm/c2_init_ppc.cpp \
../src/cpu/ppc/vm/compiledIC_ppc.cpp \
../src/cpu/ppc/vm/cppInterpreter_ppc.cpp \
../src/cpu/ppc/vm/debug_ppc.cpp \
../src/cpu/ppc/vm/frame_ppc.cpp \
../src/cpu/ppc/vm/icBuffer_ppc.cpp \
../src/cpu/ppc/vm/icache_ppc.cpp \
../src/cpu/ppc/vm/interp_masm_ppc_64.cpp \
../src/cpu/ppc/vm/interpreterRT_ppc.cpp \
../src/cpu/ppc/vm/interpreter_ppc.cpp \
../src/cpu/ppc/vm/jniFastGetField_ppc.cpp \
../src/cpu/ppc/vm/macroAssembler_ppc.cpp \
../src/cpu/ppc/vm/metaspaceShared_ppc.cpp \
../src/cpu/ppc/vm/methodHandles_ppc.cpp \
../src/cpu/ppc/vm/nativeInst_ppc.cpp \
../src/cpu/ppc/vm/register_definitions_ppc.cpp \
../src/cpu/ppc/vm/register_ppc.cpp \
../src/cpu/ppc/vm/relocInfo_ppc.cpp \
../src/cpu/ppc/vm/runtime_ppc.cpp \
../src/cpu/ppc/vm/sharedRuntime_ppc.cpp \
../src/cpu/ppc/vm/stubGenerator_ppc.cpp \
../src/cpu/ppc/vm/stubRoutines_ppc_64.cpp \
../src/cpu/ppc/vm/templateInterpreter_ppc.cpp \
../src/cpu/ppc/vm/templateTable_ppc_64.cpp \
../src/cpu/ppc/vm/vm_version_ppc.cpp \
../src/cpu/ppc/vm/vmreg_ppc.cpp \
../src/cpu/ppc/vm/vtableStubs_ppc_64.cpp 

OBJS += \
./src/cpu/ppc/vm/assembler_ppc.o \
./src/cpu/ppc/vm/c2_init_ppc.o \
./src/cpu/ppc/vm/compiledIC_ppc.o \
./src/cpu/ppc/vm/cppInterpreter_ppc.o \
./src/cpu/ppc/vm/debug_ppc.o \
./src/cpu/ppc/vm/frame_ppc.o \
./src/cpu/ppc/vm/icBuffer_ppc.o \
./src/cpu/ppc/vm/icache_ppc.o \
./src/cpu/ppc/vm/interp_masm_ppc_64.o \
./src/cpu/ppc/vm/interpreterRT_ppc.o \
./src/cpu/ppc/vm/interpreter_ppc.o \
./src/cpu/ppc/vm/jniFastGetField_ppc.o \
./src/cpu/ppc/vm/macroAssembler_ppc.o \
./src/cpu/ppc/vm/metaspaceShared_ppc.o \
./src/cpu/ppc/vm/methodHandles_ppc.o \
./src/cpu/ppc/vm/nativeInst_ppc.o \
./src/cpu/ppc/vm/register_definitions_ppc.o \
./src/cpu/ppc/vm/register_ppc.o \
./src/cpu/ppc/vm/relocInfo_ppc.o \
./src/cpu/ppc/vm/runtime_ppc.o \
./src/cpu/ppc/vm/sharedRuntime_ppc.o \
./src/cpu/ppc/vm/stubGenerator_ppc.o \
./src/cpu/ppc/vm/stubRoutines_ppc_64.o \
./src/cpu/ppc/vm/templateInterpreter_ppc.o \
./src/cpu/ppc/vm/templateTable_ppc_64.o \
./src/cpu/ppc/vm/vm_version_ppc.o \
./src/cpu/ppc/vm/vmreg_ppc.o \
./src/cpu/ppc/vm/vtableStubs_ppc_64.o 

CPP_DEPS += \
./src/cpu/ppc/vm/assembler_ppc.d \
./src/cpu/ppc/vm/c2_init_ppc.d \
./src/cpu/ppc/vm/compiledIC_ppc.d \
./src/cpu/ppc/vm/cppInterpreter_ppc.d \
./src/cpu/ppc/vm/debug_ppc.d \
./src/cpu/ppc/vm/frame_ppc.d \
./src/cpu/ppc/vm/icBuffer_ppc.d \
./src/cpu/ppc/vm/icache_ppc.d \
./src/cpu/ppc/vm/interp_masm_ppc_64.d \
./src/cpu/ppc/vm/interpreterRT_ppc.d \
./src/cpu/ppc/vm/interpreter_ppc.d \
./src/cpu/ppc/vm/jniFastGetField_ppc.d \
./src/cpu/ppc/vm/macroAssembler_ppc.d \
./src/cpu/ppc/vm/metaspaceShared_ppc.d \
./src/cpu/ppc/vm/methodHandles_ppc.d \
./src/cpu/ppc/vm/nativeInst_ppc.d \
./src/cpu/ppc/vm/register_definitions_ppc.d \
./src/cpu/ppc/vm/register_ppc.d \
./src/cpu/ppc/vm/relocInfo_ppc.d \
./src/cpu/ppc/vm/runtime_ppc.d \
./src/cpu/ppc/vm/sharedRuntime_ppc.d \
./src/cpu/ppc/vm/stubGenerator_ppc.d \
./src/cpu/ppc/vm/stubRoutines_ppc_64.d \
./src/cpu/ppc/vm/templateInterpreter_ppc.d \
./src/cpu/ppc/vm/templateTable_ppc_64.d \
./src/cpu/ppc/vm/vm_version_ppc.d \
./src/cpu/ppc/vm/vmreg_ppc.d \
./src/cpu/ppc/vm/vtableStubs_ppc_64.d 


# Each subdirectory must supply rules for building sources it contributes
src/cpu/ppc/vm/%.o: ../src/cpu/ppc/vm/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


