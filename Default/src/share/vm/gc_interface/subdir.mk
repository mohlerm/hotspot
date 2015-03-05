################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/gc_interface/allocTracer.cpp \
../src/share/vm/gc_interface/collectedHeap.cpp \
../src/share/vm/gc_interface/gcCause.cpp 

OBJS += \
./src/share/vm/gc_interface/allocTracer.o \
./src/share/vm/gc_interface/collectedHeap.o \
./src/share/vm/gc_interface/gcCause.o 

CPP_DEPS += \
./src/share/vm/gc_interface/allocTracer.d \
./src/share/vm/gc_interface/collectedHeap.d \
./src/share/vm/gc_interface/gcCause.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/gc_interface/%.o: ../src/share/vm/gc_interface/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


