################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/oops/annotations.cpp \
../src/share/vm/oops/arrayKlass.cpp \
../src/share/vm/oops/arrayOop.cpp \
../src/share/vm/oops/compiledICHolder.cpp \
../src/share/vm/oops/constMethod.cpp \
../src/share/vm/oops/constantPool.cpp \
../src/share/vm/oops/cpCache.cpp \
../src/share/vm/oops/generateOopMap.cpp \
../src/share/vm/oops/instanceClassLoaderKlass.cpp \
../src/share/vm/oops/instanceKlass.cpp \
../src/share/vm/oops/instanceMirrorKlass.cpp \
../src/share/vm/oops/instanceOop.cpp \
../src/share/vm/oops/instanceRefKlass.cpp \
../src/share/vm/oops/klass.cpp \
../src/share/vm/oops/klassVtable.cpp \
../src/share/vm/oops/markOop.cpp \
../src/share/vm/oops/metadata.cpp \
../src/share/vm/oops/method.cpp \
../src/share/vm/oops/methodCounters.cpp \
../src/share/vm/oops/methodData.cpp \
../src/share/vm/oops/objArrayKlass.cpp \
../src/share/vm/oops/objArrayOop.cpp \
../src/share/vm/oops/oop.cpp \
../src/share/vm/oops/oopsHierarchy.cpp \
../src/share/vm/oops/symbol.cpp \
../src/share/vm/oops/typeArrayKlass.cpp \
../src/share/vm/oops/typeArrayOop.cpp 

OBJS += \
./src/share/vm/oops/annotations.o \
./src/share/vm/oops/arrayKlass.o \
./src/share/vm/oops/arrayOop.o \
./src/share/vm/oops/compiledICHolder.o \
./src/share/vm/oops/constMethod.o \
./src/share/vm/oops/constantPool.o \
./src/share/vm/oops/cpCache.o \
./src/share/vm/oops/generateOopMap.o \
./src/share/vm/oops/instanceClassLoaderKlass.o \
./src/share/vm/oops/instanceKlass.o \
./src/share/vm/oops/instanceMirrorKlass.o \
./src/share/vm/oops/instanceOop.o \
./src/share/vm/oops/instanceRefKlass.o \
./src/share/vm/oops/klass.o \
./src/share/vm/oops/klassVtable.o \
./src/share/vm/oops/markOop.o \
./src/share/vm/oops/metadata.o \
./src/share/vm/oops/method.o \
./src/share/vm/oops/methodCounters.o \
./src/share/vm/oops/methodData.o \
./src/share/vm/oops/objArrayKlass.o \
./src/share/vm/oops/objArrayOop.o \
./src/share/vm/oops/oop.o \
./src/share/vm/oops/oopsHierarchy.o \
./src/share/vm/oops/symbol.o \
./src/share/vm/oops/typeArrayKlass.o \
./src/share/vm/oops/typeArrayOop.o 

CPP_DEPS += \
./src/share/vm/oops/annotations.d \
./src/share/vm/oops/arrayKlass.d \
./src/share/vm/oops/arrayOop.d \
./src/share/vm/oops/compiledICHolder.d \
./src/share/vm/oops/constMethod.d \
./src/share/vm/oops/constantPool.d \
./src/share/vm/oops/cpCache.d \
./src/share/vm/oops/generateOopMap.d \
./src/share/vm/oops/instanceClassLoaderKlass.d \
./src/share/vm/oops/instanceKlass.d \
./src/share/vm/oops/instanceMirrorKlass.d \
./src/share/vm/oops/instanceOop.d \
./src/share/vm/oops/instanceRefKlass.d \
./src/share/vm/oops/klass.d \
./src/share/vm/oops/klassVtable.d \
./src/share/vm/oops/markOop.d \
./src/share/vm/oops/metadata.d \
./src/share/vm/oops/method.d \
./src/share/vm/oops/methodCounters.d \
./src/share/vm/oops/methodData.d \
./src/share/vm/oops/objArrayKlass.d \
./src/share/vm/oops/objArrayOop.d \
./src/share/vm/oops/oop.d \
./src/share/vm/oops/oopsHierarchy.d \
./src/share/vm/oops/symbol.d \
./src/share/vm/oops/typeArrayKlass.d \
./src/share/vm/oops/typeArrayOop.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/oops/%.o: ../src/share/vm/oops/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


