################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/ci/bcEscapeAnalyzer.cpp \
../src/share/vm/ci/ciArray.cpp \
../src/share/vm/ci/ciArrayKlass.cpp \
../src/share/vm/ci/ciBaseObject.cpp \
../src/share/vm/ci/ciCallSite.cpp \
../src/share/vm/ci/ciConstant.cpp \
../src/share/vm/ci/ciConstantPoolCache.cpp \
../src/share/vm/ci/ciEnv.cpp \
../src/share/vm/ci/ciExceptionHandler.cpp \
../src/share/vm/ci/ciField.cpp \
../src/share/vm/ci/ciFlags.cpp \
../src/share/vm/ci/ciInstance.cpp \
../src/share/vm/ci/ciInstanceKlass.cpp \
../src/share/vm/ci/ciKlass.cpp \
../src/share/vm/ci/ciMemberName.cpp \
../src/share/vm/ci/ciMetadata.cpp \
../src/share/vm/ci/ciMethod.cpp \
../src/share/vm/ci/ciMethodBlocks.cpp \
../src/share/vm/ci/ciMethodData.cpp \
../src/share/vm/ci/ciMethodHandle.cpp \
../src/share/vm/ci/ciNullObject.cpp \
../src/share/vm/ci/ciObjArray.cpp \
../src/share/vm/ci/ciObjArrayKlass.cpp \
../src/share/vm/ci/ciObject.cpp \
../src/share/vm/ci/ciObjectFactory.cpp \
../src/share/vm/ci/ciReplay.cpp \
../src/share/vm/ci/ciSignature.cpp \
../src/share/vm/ci/ciStreams.cpp \
../src/share/vm/ci/ciSymbol.cpp \
../src/share/vm/ci/ciType.cpp \
../src/share/vm/ci/ciTypeArray.cpp \
../src/share/vm/ci/ciTypeArrayKlass.cpp \
../src/share/vm/ci/ciTypeFlow.cpp \
../src/share/vm/ci/ciUtilities.cpp 

OBJS += \
./src/share/vm/ci/bcEscapeAnalyzer.o \
./src/share/vm/ci/ciArray.o \
./src/share/vm/ci/ciArrayKlass.o \
./src/share/vm/ci/ciBaseObject.o \
./src/share/vm/ci/ciCallSite.o \
./src/share/vm/ci/ciConstant.o \
./src/share/vm/ci/ciConstantPoolCache.o \
./src/share/vm/ci/ciEnv.o \
./src/share/vm/ci/ciExceptionHandler.o \
./src/share/vm/ci/ciField.o \
./src/share/vm/ci/ciFlags.o \
./src/share/vm/ci/ciInstance.o \
./src/share/vm/ci/ciInstanceKlass.o \
./src/share/vm/ci/ciKlass.o \
./src/share/vm/ci/ciMemberName.o \
./src/share/vm/ci/ciMetadata.o \
./src/share/vm/ci/ciMethod.o \
./src/share/vm/ci/ciMethodBlocks.o \
./src/share/vm/ci/ciMethodData.o \
./src/share/vm/ci/ciMethodHandle.o \
./src/share/vm/ci/ciNullObject.o \
./src/share/vm/ci/ciObjArray.o \
./src/share/vm/ci/ciObjArrayKlass.o \
./src/share/vm/ci/ciObject.o \
./src/share/vm/ci/ciObjectFactory.o \
./src/share/vm/ci/ciReplay.o \
./src/share/vm/ci/ciSignature.o \
./src/share/vm/ci/ciStreams.o \
./src/share/vm/ci/ciSymbol.o \
./src/share/vm/ci/ciType.o \
./src/share/vm/ci/ciTypeArray.o \
./src/share/vm/ci/ciTypeArrayKlass.o \
./src/share/vm/ci/ciTypeFlow.o \
./src/share/vm/ci/ciUtilities.o 

CPP_DEPS += \
./src/share/vm/ci/bcEscapeAnalyzer.d \
./src/share/vm/ci/ciArray.d \
./src/share/vm/ci/ciArrayKlass.d \
./src/share/vm/ci/ciBaseObject.d \
./src/share/vm/ci/ciCallSite.d \
./src/share/vm/ci/ciConstant.d \
./src/share/vm/ci/ciConstantPoolCache.d \
./src/share/vm/ci/ciEnv.d \
./src/share/vm/ci/ciExceptionHandler.d \
./src/share/vm/ci/ciField.d \
./src/share/vm/ci/ciFlags.d \
./src/share/vm/ci/ciInstance.d \
./src/share/vm/ci/ciInstanceKlass.d \
./src/share/vm/ci/ciKlass.d \
./src/share/vm/ci/ciMemberName.d \
./src/share/vm/ci/ciMetadata.d \
./src/share/vm/ci/ciMethod.d \
./src/share/vm/ci/ciMethodBlocks.d \
./src/share/vm/ci/ciMethodData.d \
./src/share/vm/ci/ciMethodHandle.d \
./src/share/vm/ci/ciNullObject.d \
./src/share/vm/ci/ciObjArray.d \
./src/share/vm/ci/ciObjArrayKlass.d \
./src/share/vm/ci/ciObject.d \
./src/share/vm/ci/ciObjectFactory.d \
./src/share/vm/ci/ciReplay.d \
./src/share/vm/ci/ciSignature.d \
./src/share/vm/ci/ciStreams.d \
./src/share/vm/ci/ciSymbol.d \
./src/share/vm/ci/ciType.d \
./src/share/vm/ci/ciTypeArray.d \
./src/share/vm/ci/ciTypeArrayKlass.d \
./src/share/vm/ci/ciTypeFlow.d \
./src/share/vm/ci/ciUtilities.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/ci/%.o: ../src/share/vm/ci/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


