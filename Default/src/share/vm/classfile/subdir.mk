################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/classfile/altHashing.cpp \
../src/share/vm/classfile/bytecodeAssembler.cpp \
../src/share/vm/classfile/classFileError.cpp \
../src/share/vm/classfile/classFileParser.cpp \
../src/share/vm/classfile/classFileStream.cpp \
../src/share/vm/classfile/classLoader.cpp \
../src/share/vm/classfile/classLoaderData.cpp \
../src/share/vm/classfile/classLoaderStats.cpp \
../src/share/vm/classfile/compactHashtable.cpp \
../src/share/vm/classfile/defaultMethods.cpp \
../src/share/vm/classfile/dictionary.cpp \
../src/share/vm/classfile/imageFile.cpp \
../src/share/vm/classfile/javaAssertions.cpp \
../src/share/vm/classfile/javaClasses.cpp \
../src/share/vm/classfile/loaderConstraints.cpp \
../src/share/vm/classfile/metadataOnStackMark.cpp \
../src/share/vm/classfile/placeholders.cpp \
../src/share/vm/classfile/resolutionErrors.cpp \
../src/share/vm/classfile/sharedPathsMiscInfo.cpp \
../src/share/vm/classfile/stackMapFrame.cpp \
../src/share/vm/classfile/stackMapTable.cpp \
../src/share/vm/classfile/stringTable.cpp \
../src/share/vm/classfile/symbolTable.cpp \
../src/share/vm/classfile/systemDictionary.cpp \
../src/share/vm/classfile/verificationType.cpp \
../src/share/vm/classfile/verifier.cpp \
../src/share/vm/classfile/vmSymbols.cpp 

OBJS += \
./src/share/vm/classfile/altHashing.o \
./src/share/vm/classfile/bytecodeAssembler.o \
./src/share/vm/classfile/classFileError.o \
./src/share/vm/classfile/classFileParser.o \
./src/share/vm/classfile/classFileStream.o \
./src/share/vm/classfile/classLoader.o \
./src/share/vm/classfile/classLoaderData.o \
./src/share/vm/classfile/classLoaderStats.o \
./src/share/vm/classfile/compactHashtable.o \
./src/share/vm/classfile/defaultMethods.o \
./src/share/vm/classfile/dictionary.o \
./src/share/vm/classfile/imageFile.o \
./src/share/vm/classfile/javaAssertions.o \
./src/share/vm/classfile/javaClasses.o \
./src/share/vm/classfile/loaderConstraints.o \
./src/share/vm/classfile/metadataOnStackMark.o \
./src/share/vm/classfile/placeholders.o \
./src/share/vm/classfile/resolutionErrors.o \
./src/share/vm/classfile/sharedPathsMiscInfo.o \
./src/share/vm/classfile/stackMapFrame.o \
./src/share/vm/classfile/stackMapTable.o \
./src/share/vm/classfile/stringTable.o \
./src/share/vm/classfile/symbolTable.o \
./src/share/vm/classfile/systemDictionary.o \
./src/share/vm/classfile/verificationType.o \
./src/share/vm/classfile/verifier.o \
./src/share/vm/classfile/vmSymbols.o 

CPP_DEPS += \
./src/share/vm/classfile/altHashing.d \
./src/share/vm/classfile/bytecodeAssembler.d \
./src/share/vm/classfile/classFileError.d \
./src/share/vm/classfile/classFileParser.d \
./src/share/vm/classfile/classFileStream.d \
./src/share/vm/classfile/classLoader.d \
./src/share/vm/classfile/classLoaderData.d \
./src/share/vm/classfile/classLoaderStats.d \
./src/share/vm/classfile/compactHashtable.d \
./src/share/vm/classfile/defaultMethods.d \
./src/share/vm/classfile/dictionary.d \
./src/share/vm/classfile/imageFile.d \
./src/share/vm/classfile/javaAssertions.d \
./src/share/vm/classfile/javaClasses.d \
./src/share/vm/classfile/loaderConstraints.d \
./src/share/vm/classfile/metadataOnStackMark.d \
./src/share/vm/classfile/placeholders.d \
./src/share/vm/classfile/resolutionErrors.d \
./src/share/vm/classfile/sharedPathsMiscInfo.d \
./src/share/vm/classfile/stackMapFrame.d \
./src/share/vm/classfile/stackMapTable.d \
./src/share/vm/classfile/stringTable.d \
./src/share/vm/classfile/symbolTable.d \
./src/share/vm/classfile/systemDictionary.d \
./src/share/vm/classfile/verificationType.d \
./src/share/vm/classfile/verifier.d \
./src/share/vm/classfile/vmSymbols.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/classfile/%.o: ../src/share/vm/classfile/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


