################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/share/vm/opto/addnode.cpp \
../src/share/vm/opto/arraycopynode.cpp \
../src/share/vm/opto/block.cpp \
../src/share/vm/opto/buildOopMap.cpp \
../src/share/vm/opto/bytecodeInfo.cpp \
../src/share/vm/opto/c2_globals.cpp \
../src/share/vm/opto/c2compiler.cpp \
../src/share/vm/opto/callGenerator.cpp \
../src/share/vm/opto/callnode.cpp \
../src/share/vm/opto/castnode.cpp \
../src/share/vm/opto/cfgnode.cpp \
../src/share/vm/opto/chaitin.cpp \
../src/share/vm/opto/classes.cpp \
../src/share/vm/opto/coalesce.cpp \
../src/share/vm/opto/compile.cpp \
../src/share/vm/opto/connode.cpp \
../src/share/vm/opto/convertnode.cpp \
../src/share/vm/opto/countbitsnode.cpp \
../src/share/vm/opto/divnode.cpp \
../src/share/vm/opto/doCall.cpp \
../src/share/vm/opto/domgraph.cpp \
../src/share/vm/opto/escape.cpp \
../src/share/vm/opto/gcm.cpp \
../src/share/vm/opto/generateOptoStub.cpp \
../src/share/vm/opto/graphKit.cpp \
../src/share/vm/opto/idealGraphPrinter.cpp \
../src/share/vm/opto/idealKit.cpp \
../src/share/vm/opto/ifg.cpp \
../src/share/vm/opto/ifnode.cpp \
../src/share/vm/opto/indexSet.cpp \
../src/share/vm/opto/intrinsicnode.cpp \
../src/share/vm/opto/lcm.cpp \
../src/share/vm/opto/library_call.cpp \
../src/share/vm/opto/live.cpp \
../src/share/vm/opto/locknode.cpp \
../src/share/vm/opto/loopPredicate.cpp \
../src/share/vm/opto/loopTransform.cpp \
../src/share/vm/opto/loopUnswitch.cpp \
../src/share/vm/opto/loopnode.cpp \
../src/share/vm/opto/loopopts.cpp \
../src/share/vm/opto/machnode.cpp \
../src/share/vm/opto/macro.cpp \
../src/share/vm/opto/macroArrayCopy.cpp \
../src/share/vm/opto/matcher.cpp \
../src/share/vm/opto/mathexactnode.cpp \
../src/share/vm/opto/memnode.cpp \
../src/share/vm/opto/movenode.cpp \
../src/share/vm/opto/mulnode.cpp \
../src/share/vm/opto/multnode.cpp \
../src/share/vm/opto/narrowptrnode.cpp \
../src/share/vm/opto/node.cpp \
../src/share/vm/opto/opaquenode.cpp \
../src/share/vm/opto/opcodes.cpp \
../src/share/vm/opto/output.cpp \
../src/share/vm/opto/parse1.cpp \
../src/share/vm/opto/parse2.cpp \
../src/share/vm/opto/parse3.cpp \
../src/share/vm/opto/parseHelper.cpp \
../src/share/vm/opto/phase.cpp \
../src/share/vm/opto/phaseX.cpp \
../src/share/vm/opto/postaloc.cpp \
../src/share/vm/opto/reg_split.cpp \
../src/share/vm/opto/regalloc.cpp \
../src/share/vm/opto/regmask.cpp \
../src/share/vm/opto/replacednodes.cpp \
../src/share/vm/opto/rootnode.cpp \
../src/share/vm/opto/runtime.cpp \
../src/share/vm/opto/split_if.cpp \
../src/share/vm/opto/stringopts.cpp \
../src/share/vm/opto/subnode.cpp \
../src/share/vm/opto/superword.cpp \
../src/share/vm/opto/type.cpp \
../src/share/vm/opto/vectornode.cpp 

OBJS += \
./src/share/vm/opto/addnode.o \
./src/share/vm/opto/arraycopynode.o \
./src/share/vm/opto/block.o \
./src/share/vm/opto/buildOopMap.o \
./src/share/vm/opto/bytecodeInfo.o \
./src/share/vm/opto/c2_globals.o \
./src/share/vm/opto/c2compiler.o \
./src/share/vm/opto/callGenerator.o \
./src/share/vm/opto/callnode.o \
./src/share/vm/opto/castnode.o \
./src/share/vm/opto/cfgnode.o \
./src/share/vm/opto/chaitin.o \
./src/share/vm/opto/classes.o \
./src/share/vm/opto/coalesce.o \
./src/share/vm/opto/compile.o \
./src/share/vm/opto/connode.o \
./src/share/vm/opto/convertnode.o \
./src/share/vm/opto/countbitsnode.o \
./src/share/vm/opto/divnode.o \
./src/share/vm/opto/doCall.o \
./src/share/vm/opto/domgraph.o \
./src/share/vm/opto/escape.o \
./src/share/vm/opto/gcm.o \
./src/share/vm/opto/generateOptoStub.o \
./src/share/vm/opto/graphKit.o \
./src/share/vm/opto/idealGraphPrinter.o \
./src/share/vm/opto/idealKit.o \
./src/share/vm/opto/ifg.o \
./src/share/vm/opto/ifnode.o \
./src/share/vm/opto/indexSet.o \
./src/share/vm/opto/intrinsicnode.o \
./src/share/vm/opto/lcm.o \
./src/share/vm/opto/library_call.o \
./src/share/vm/opto/live.o \
./src/share/vm/opto/locknode.o \
./src/share/vm/opto/loopPredicate.o \
./src/share/vm/opto/loopTransform.o \
./src/share/vm/opto/loopUnswitch.o \
./src/share/vm/opto/loopnode.o \
./src/share/vm/opto/loopopts.o \
./src/share/vm/opto/machnode.o \
./src/share/vm/opto/macro.o \
./src/share/vm/opto/macroArrayCopy.o \
./src/share/vm/opto/matcher.o \
./src/share/vm/opto/mathexactnode.o \
./src/share/vm/opto/memnode.o \
./src/share/vm/opto/movenode.o \
./src/share/vm/opto/mulnode.o \
./src/share/vm/opto/multnode.o \
./src/share/vm/opto/narrowptrnode.o \
./src/share/vm/opto/node.o \
./src/share/vm/opto/opaquenode.o \
./src/share/vm/opto/opcodes.o \
./src/share/vm/opto/output.o \
./src/share/vm/opto/parse1.o \
./src/share/vm/opto/parse2.o \
./src/share/vm/opto/parse3.o \
./src/share/vm/opto/parseHelper.o \
./src/share/vm/opto/phase.o \
./src/share/vm/opto/phaseX.o \
./src/share/vm/opto/postaloc.o \
./src/share/vm/opto/reg_split.o \
./src/share/vm/opto/regalloc.o \
./src/share/vm/opto/regmask.o \
./src/share/vm/opto/replacednodes.o \
./src/share/vm/opto/rootnode.o \
./src/share/vm/opto/runtime.o \
./src/share/vm/opto/split_if.o \
./src/share/vm/opto/stringopts.o \
./src/share/vm/opto/subnode.o \
./src/share/vm/opto/superword.o \
./src/share/vm/opto/type.o \
./src/share/vm/opto/vectornode.o 

CPP_DEPS += \
./src/share/vm/opto/addnode.d \
./src/share/vm/opto/arraycopynode.d \
./src/share/vm/opto/block.d \
./src/share/vm/opto/buildOopMap.d \
./src/share/vm/opto/bytecodeInfo.d \
./src/share/vm/opto/c2_globals.d \
./src/share/vm/opto/c2compiler.d \
./src/share/vm/opto/callGenerator.d \
./src/share/vm/opto/callnode.d \
./src/share/vm/opto/castnode.d \
./src/share/vm/opto/cfgnode.d \
./src/share/vm/opto/chaitin.d \
./src/share/vm/opto/classes.d \
./src/share/vm/opto/coalesce.d \
./src/share/vm/opto/compile.d \
./src/share/vm/opto/connode.d \
./src/share/vm/opto/convertnode.d \
./src/share/vm/opto/countbitsnode.d \
./src/share/vm/opto/divnode.d \
./src/share/vm/opto/doCall.d \
./src/share/vm/opto/domgraph.d \
./src/share/vm/opto/escape.d \
./src/share/vm/opto/gcm.d \
./src/share/vm/opto/generateOptoStub.d \
./src/share/vm/opto/graphKit.d \
./src/share/vm/opto/idealGraphPrinter.d \
./src/share/vm/opto/idealKit.d \
./src/share/vm/opto/ifg.d \
./src/share/vm/opto/ifnode.d \
./src/share/vm/opto/indexSet.d \
./src/share/vm/opto/intrinsicnode.d \
./src/share/vm/opto/lcm.d \
./src/share/vm/opto/library_call.d \
./src/share/vm/opto/live.d \
./src/share/vm/opto/locknode.d \
./src/share/vm/opto/loopPredicate.d \
./src/share/vm/opto/loopTransform.d \
./src/share/vm/opto/loopUnswitch.d \
./src/share/vm/opto/loopnode.d \
./src/share/vm/opto/loopopts.d \
./src/share/vm/opto/machnode.d \
./src/share/vm/opto/macro.d \
./src/share/vm/opto/macroArrayCopy.d \
./src/share/vm/opto/matcher.d \
./src/share/vm/opto/mathexactnode.d \
./src/share/vm/opto/memnode.d \
./src/share/vm/opto/movenode.d \
./src/share/vm/opto/mulnode.d \
./src/share/vm/opto/multnode.d \
./src/share/vm/opto/narrowptrnode.d \
./src/share/vm/opto/node.d \
./src/share/vm/opto/opaquenode.d \
./src/share/vm/opto/opcodes.d \
./src/share/vm/opto/output.d \
./src/share/vm/opto/parse1.d \
./src/share/vm/opto/parse2.d \
./src/share/vm/opto/parse3.d \
./src/share/vm/opto/parseHelper.d \
./src/share/vm/opto/phase.d \
./src/share/vm/opto/phaseX.d \
./src/share/vm/opto/postaloc.d \
./src/share/vm/opto/reg_split.d \
./src/share/vm/opto/regalloc.d \
./src/share/vm/opto/regmask.d \
./src/share/vm/opto/replacednodes.d \
./src/share/vm/opto/rootnode.d \
./src/share/vm/opto/runtime.d \
./src/share/vm/opto/split_if.d \
./src/share/vm/opto/stringopts.d \
./src/share/vm/opto/subnode.d \
./src/share/vm/opto/superword.d \
./src/share/vm/opto/type.d \
./src/share/vm/opto/vectornode.d 


# Each subdirectory must supply rules for building sources it contributes
src/share/vm/opto/%.o: ../src/share/vm/opto/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -DCOMPILER1 -DCOMPILER2 -DASSERT -DDEBUG -DTARGET_ARCH_x86 -DTARGET_ARCH_MODEL_x86_64 -DAMD64 -DTARGET_COMPILER_gcc -DTARGET_OS_FAMILY_linux -DTARGET_OS_ARCH_linux_x86 -DLINUX -D_GNU_SOURCE -D_REENTRANT -DTARGET_OS_ARCH_MODEL_linux_x86_64 -DINCLUDE_TRACE -DVM_LITTLE_ENDIAN -D_LP64=1 -DHOTSPOT_VM_DISTRO='"HotSpot"' -DHOTSPOT_RELEASE_VERSION='"25.0-b29-internal"' -DHOTSPOT_BUILD_TARGET='"jvmg"' -DHOTSPOT_BUILD_USER='"mikael"' -DHOTSPOT_LIB_ARCH='"amd64"' -DJRE_RELEASE_VERSION='"1.8.0"' -O0 -g -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


