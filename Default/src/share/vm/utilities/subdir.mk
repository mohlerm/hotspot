################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/utilities/accessFlags.cpp \
../src/share/vm/utilities/array.cpp \
../src/share/vm/utilities/bitMap.cpp \
../src/share/vm/utilities/chunkedList.cpp \
../src/share/vm/utilities/constantTag.cpp \
../src/share/vm/utilities/copy.cpp \
../src/share/vm/utilities/debug.cpp \
../src/share/vm/utilities/decoder.cpp \
../src/share/vm/utilities/decoder_elf.cpp \
../src/share/vm/utilities/elfFile.cpp \
../src/share/vm/utilities/elfFuncDescTable.cpp \
../src/share/vm/utilities/elfStringTable.cpp \
../src/share/vm/utilities/elfSymbolTable.cpp \
../src/share/vm/utilities/events.cpp \
../src/share/vm/utilities/exceptions.cpp \
../src/share/vm/utilities/globalDefinitions.cpp \
../src/share/vm/utilities/growableArray.cpp \
../src/share/vm/utilities/hashtable.cpp \
../src/share/vm/utilities/histogram.cpp \
../src/share/vm/utilities/intHisto.cpp \
../src/share/vm/utilities/linkedlist.cpp \
../src/share/vm/utilities/nativeCallStack.cpp \
../src/share/vm/utilities/numberSeq.cpp \
../src/share/vm/utilities/ostream.cpp \
../src/share/vm/utilities/preserveException.cpp \
../src/share/vm/utilities/quickSort.cpp \
../src/share/vm/utilities/sizes.cpp \
../src/share/vm/utilities/stringUtils.cpp \
../src/share/vm/utilities/taskqueue.cpp \
../src/share/vm/utilities/ticks.cpp \
../src/share/vm/utilities/utf8.cpp \
../src/share/vm/utilities/vmError.cpp \
../src/share/vm/utilities/workgroup.cpp \
../src/share/vm/utilities/xmlstream.cpp \
../src/share/vm/utilities/yieldingWorkgroup.cpp 

OBJS += \
./src/share/vm/utilities/accessFlags.o \
./src/share/vm/utilities/array.o \
./src/share/vm/utilities/bitMap.o \
./src/share/vm/utilities/chunkedList.o \
./src/share/vm/utilities/constantTag.o \
./src/share/vm/utilities/copy.o \
./src/share/vm/utilities/debug.o \
./src/share/vm/utilities/decoder.o \
./src/share/vm/utilities/decoder_elf.o \
./src/share/vm/utilities/elfFile.o \
./src/share/vm/utilities/elfFuncDescTable.o \
./src/share/vm/utilities/elfStringTable.o \
./src/share/vm/utilities/elfSymbolTable.o \
./src/share/vm/utilities/events.o \
./src/share/vm/utilities/exceptions.o \
./src/share/vm/utilities/globalDefinitions.o \
./src/share/vm/utilities/growableArray.o \
./src/share/vm/utilities/hashtable.o \
./src/share/vm/utilities/histogram.o \
./src/share/vm/utilities/intHisto.o \
./src/share/vm/utilities/linkedlist.o \
./src/share/vm/utilities/nativeCallStack.o \
./src/share/vm/utilities/numberSeq.o \
./src/share/vm/utilities/ostream.o \
./src/share/vm/utilities/preserveException.o \
./src/share/vm/utilities/quickSort.o \
./src/share/vm/utilities/sizes.o \
./src/share/vm/utilities/stringUtils.o \
./src/share/vm/utilities/taskqueue.o \
./src/share/vm/utilities/ticks.o \
./src/share/vm/utilities/utf8.o \
./src/share/vm/utilities/vmError.o \
./src/share/vm/utilities/workgroup.o \
./src/share/vm/utilities/xmlstream.o \
./src/share/vm/utilities/yieldingWorkgroup.o 

CPP_DEPS += \
./src/share/vm/utilities/accessFlags.d \
./src/share/vm/utilities/array.d \
./src/share/vm/utilities/bitMap.d \
./src/share/vm/utilities/chunkedList.d \
./src/share/vm/utilities/constantTag.d \
./src/share/vm/utilities/copy.d \
./src/share/vm/utilities/debug.d \
./src/share/vm/utilities/decoder.d \
./src/share/vm/utilities/decoder_elf.d \
./src/share/vm/utilities/elfFile.d \
./src/share/vm/utilities/elfFuncDescTable.d \
./src/share/vm/utilities/elfStringTable.d \
./src/share/vm/utilities/elfSymbolTable.d \
./src/share/vm/utilities/events.d \
./src/share/vm/utilities/exceptions.d \
./src/share/vm/utilities/globalDefinitions.d \
./src/share/vm/utilities/growableArray.d \
./src/share/vm/utilities/hashtable.d \
./src/share/vm/utilities/histogram.d \
./src/share/vm/utilities/intHisto.d \
./src/share/vm/utilities/linkedlist.d \
./src/share/vm/utilities/nativeCallStack.d \
./src/share/vm/utilities/numberSeq.d \
./src/share/vm/utilities/ostream.d \
./src/share/vm/utilities/preserveException.d \
./src/share/vm/utilities/quickSort.d \
./src/share/vm/utilities/sizes.d \
./src/share/vm/utilities/stringUtils.d \
./src/share/vm/utilities/taskqueue.d \
./src/share/vm/utilities/ticks.d \
./src/share/vm/utilities/utf8.d \
./src/share/vm/utilities/vmError.d \
./src/share/vm/utilities/workgroup.d \
./src/share/vm/utilities/xmlstream.d \
./src/share/vm/utilities/yieldingWorkgroup.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/utilities/%.o: ../src/share/vm/utilities/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


