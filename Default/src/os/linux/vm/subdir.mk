################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/os/linux/vm/attachListener_linux.cpp \
../src/os/linux/vm/decoder_linux.cpp \
../src/os/linux/vm/jvm_linux.cpp \
../src/os/linux/vm/mutex_linux.cpp \
../src/os/linux/vm/osThread_linux.cpp \
../src/os/linux/vm/os_linux.cpp \
../src/os/linux/vm/perfMemory_linux.cpp \
../src/os/linux/vm/stubRoutines_linux.cpp \
../src/os/linux/vm/threadCritical_linux.cpp \
../src/os/linux/vm/vmError_linux.cpp 

OBJS += \
./src/os/linux/vm/attachListener_linux.o \
./src/os/linux/vm/decoder_linux.o \
./src/os/linux/vm/jvm_linux.o \
./src/os/linux/vm/mutex_linux.o \
./src/os/linux/vm/osThread_linux.o \
./src/os/linux/vm/os_linux.o \
./src/os/linux/vm/perfMemory_linux.o \
./src/os/linux/vm/stubRoutines_linux.o \
./src/os/linux/vm/threadCritical_linux.o \
./src/os/linux/vm/vmError_linux.o 

CPP_DEPS += \
./src/os/linux/vm/attachListener_linux.d \
./src/os/linux/vm/decoder_linux.d \
./src/os/linux/vm/jvm_linux.d \
./src/os/linux/vm/mutex_linux.d \
./src/os/linux/vm/osThread_linux.d \
./src/os/linux/vm/os_linux.d \
./src/os/linux/vm/perfMemory_linux.d \
./src/os/linux/vm/stubRoutines_linux.d \
./src/os/linux/vm/threadCritical_linux.d \
./src/os/linux/vm/vmError_linux.d 


# Each subdirectory must supply rules for building sources it contributes
src/os/linux/vm/%.o: ../src/os/linux/vm/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


