################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/os_cpu/linux_x86/vm/assembler_linux_x86.cpp \
../src/os_cpu/linux_x86/vm/os_linux_x86.cpp \
../src/os_cpu/linux_x86/vm/threadLS_linux_x86.cpp \
../src/os_cpu/linux_x86/vm/thread_linux_x86.cpp \
../src/os_cpu/linux_x86/vm/vm_version_linux_x86.cpp 

OBJS += \
./src/os_cpu/linux_x86/vm/assembler_linux_x86.o \
./src/os_cpu/linux_x86/vm/os_linux_x86.o \
./src/os_cpu/linux_x86/vm/threadLS_linux_x86.o \
./src/os_cpu/linux_x86/vm/thread_linux_x86.o \
./src/os_cpu/linux_x86/vm/vm_version_linux_x86.o 

CPP_DEPS += \
./src/os_cpu/linux_x86/vm/assembler_linux_x86.d \
./src/os_cpu/linux_x86/vm/os_linux_x86.d \
./src/os_cpu/linux_x86/vm/threadLS_linux_x86.d \
./src/os_cpu/linux_x86/vm/thread_linux_x86.d \
./src/os_cpu/linux_x86/vm/vm_version_linux_x86.d 


# Each subdirectory must supply rules for building sources it contributes
src/os_cpu/linux_x86/vm/%.o: ../src/os_cpu/linux_x86/vm/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


