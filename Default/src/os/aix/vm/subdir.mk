################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/os/aix/vm/attachListener_aix.cpp \
../src/os/aix/vm/jvm_aix.cpp \
../src/os/aix/vm/libperfstat_aix.cpp \
../src/os/aix/vm/loadlib_aix.cpp \
../src/os/aix/vm/osThread_aix.cpp \
../src/os/aix/vm/os_aix.cpp \
../src/os/aix/vm/perfMemory_aix.cpp \
../src/os/aix/vm/porting_aix.cpp \
../src/os/aix/vm/threadCritical_aix.cpp \
../src/os/aix/vm/vmError_aix.cpp 

C_SRCS += \
../src/os/aix/vm/jsig.c 

OBJS += \
./src/os/aix/vm/attachListener_aix.o \
./src/os/aix/vm/jsig.o \
./src/os/aix/vm/jvm_aix.o \
./src/os/aix/vm/libperfstat_aix.o \
./src/os/aix/vm/loadlib_aix.o \
./src/os/aix/vm/osThread_aix.o \
./src/os/aix/vm/os_aix.o \
./src/os/aix/vm/perfMemory_aix.o \
./src/os/aix/vm/porting_aix.o \
./src/os/aix/vm/threadCritical_aix.o \
./src/os/aix/vm/vmError_aix.o 

CPP_DEPS += \
./src/os/aix/vm/attachListener_aix.d \
./src/os/aix/vm/jvm_aix.d \
./src/os/aix/vm/libperfstat_aix.d \
./src/os/aix/vm/loadlib_aix.d \
./src/os/aix/vm/osThread_aix.d \
./src/os/aix/vm/os_aix.d \
./src/os/aix/vm/perfMemory_aix.d \
./src/os/aix/vm/porting_aix.d \
./src/os/aix/vm/threadCritical_aix.d \
./src/os/aix/vm/vmError_aix.d 

C_DEPS += \
./src/os/aix/vm/jsig.d 


# Each subdirectory must supply rules for building sources it contributes
src/os/aix/vm/%.o: ../src/os/aix/vm/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

src/os/aix/vm/%.o: ../src/os/aix/vm/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


