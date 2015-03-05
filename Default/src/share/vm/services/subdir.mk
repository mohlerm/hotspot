################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/services/attachListener.cpp \
../src/share/vm/services/classLoadingService.cpp \
../src/share/vm/services/diagnosticArgument.cpp \
../src/share/vm/services/diagnosticCommand.cpp \
../src/share/vm/services/diagnosticFramework.cpp \
../src/share/vm/services/dtraceAttacher.cpp \
../src/share/vm/services/g1MemoryPool.cpp \
../src/share/vm/services/gcNotifier.cpp \
../src/share/vm/services/heapDumper.cpp \
../src/share/vm/services/lowMemoryDetector.cpp \
../src/share/vm/services/mallocSiteTable.cpp \
../src/share/vm/services/mallocTracker.cpp \
../src/share/vm/services/management.cpp \
../src/share/vm/services/memBaseline.cpp \
../src/share/vm/services/memReporter.cpp \
../src/share/vm/services/memTracker.cpp \
../src/share/vm/services/memoryManager.cpp \
../src/share/vm/services/memoryPool.cpp \
../src/share/vm/services/memoryService.cpp \
../src/share/vm/services/nmtCommon.cpp \
../src/share/vm/services/nmtDCmd.cpp \
../src/share/vm/services/psMemoryPool.cpp \
../src/share/vm/services/runtimeService.cpp \
../src/share/vm/services/threadService.cpp \
../src/share/vm/services/virtualMemoryTracker.cpp \
../src/share/vm/services/writeableFlags.cpp 

OBJS += \
./src/share/vm/services/attachListener.o \
./src/share/vm/services/classLoadingService.o \
./src/share/vm/services/diagnosticArgument.o \
./src/share/vm/services/diagnosticCommand.o \
./src/share/vm/services/diagnosticFramework.o \
./src/share/vm/services/dtraceAttacher.o \
./src/share/vm/services/g1MemoryPool.o \
./src/share/vm/services/gcNotifier.o \
./src/share/vm/services/heapDumper.o \
./src/share/vm/services/lowMemoryDetector.o \
./src/share/vm/services/mallocSiteTable.o \
./src/share/vm/services/mallocTracker.o \
./src/share/vm/services/management.o \
./src/share/vm/services/memBaseline.o \
./src/share/vm/services/memReporter.o \
./src/share/vm/services/memTracker.o \
./src/share/vm/services/memoryManager.o \
./src/share/vm/services/memoryPool.o \
./src/share/vm/services/memoryService.o \
./src/share/vm/services/nmtCommon.o \
./src/share/vm/services/nmtDCmd.o \
./src/share/vm/services/psMemoryPool.o \
./src/share/vm/services/runtimeService.o \
./src/share/vm/services/threadService.o \
./src/share/vm/services/virtualMemoryTracker.o \
./src/share/vm/services/writeableFlags.o 

CPP_DEPS += \
./src/share/vm/services/attachListener.d \
./src/share/vm/services/classLoadingService.d \
./src/share/vm/services/diagnosticArgument.d \
./src/share/vm/services/diagnosticCommand.d \
./src/share/vm/services/diagnosticFramework.d \
./src/share/vm/services/dtraceAttacher.d \
./src/share/vm/services/g1MemoryPool.d \
./src/share/vm/services/gcNotifier.d \
./src/share/vm/services/heapDumper.d \
./src/share/vm/services/lowMemoryDetector.d \
./src/share/vm/services/mallocSiteTable.d \
./src/share/vm/services/mallocTracker.d \
./src/share/vm/services/management.d \
./src/share/vm/services/memBaseline.d \
./src/share/vm/services/memReporter.d \
./src/share/vm/services/memTracker.d \
./src/share/vm/services/memoryManager.d \
./src/share/vm/services/memoryPool.d \
./src/share/vm/services/memoryService.d \
./src/share/vm/services/nmtCommon.d \
./src/share/vm/services/nmtDCmd.d \
./src/share/vm/services/psMemoryPool.d \
./src/share/vm/services/runtimeService.d \
./src/share/vm/services/threadService.d \
./src/share/vm/services/virtualMemoryTracker.d \
./src/share/vm/services/writeableFlags.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/services/%.o: ../src/share/vm/services/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


