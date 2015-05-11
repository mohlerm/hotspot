################################################################################
# Automatically-generated file. Do not edit!
################################################################################

-include ../makefile.init

RM := rm

# All of the sources participating in the build are defined here
-include sources.mk
-include src/share/vm/utilities/subdir.mk
-include src/share/vm/services/subdir.mk
-include src/share/vm/runtime/subdir.mk
-include src/share/vm/prims/wbtestmethods/subdir.mk
-include src/share/vm/prims/subdir.mk
-include src/share/vm/opto/subdir.mk
-include src/share/vm/oops/subdir.mk
-include src/share/vm/memory/subdir.mk
-include src/share/vm/libadt/subdir.mk
-include src/share/vm/interpreter/subdir.mk
-include src/share/vm/gc_interface/subdir.mk
-include src/share/vm/gc_implementation/shared/subdir.mk
-include src/share/vm/gc_implementation/parallelScavenge/subdir.mk
-include src/share/vm/gc_implementation/parNew/subdir.mk
-include src/share/vm/gc_implementation/g1/subdir.mk
-include src/share/vm/gc_implementation/concurrentMarkSweep/subdir.mk
-include src/share/vm/compiler/subdir.mk
-include src/share/vm/code/subdir.mk
-include src/share/vm/classfile/subdir.mk
-include src/share/vm/ci/subdir.mk
-include src/share/vm/c1/subdir.mk
-include src/share/vm/asm/subdir.mk
-include src/os_cpu/linux_x86/vm/subdir.mk
-include src/os_cpu/linux_ppc/vm/subdir.mk
-include src/os_cpu/aix_ppc/vm/subdir.mk
-include src/os/posix/vm/subdir.mk
-include src/os/linux/vm/subdir.mk
-include src/os/aix/vm/subdir.mk
-include src/cpu/x86/vm/subdir.mk
-include src/cpu/ppc/vm/subdir.mk
-include subdir.mk
-include objects.mk

ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(CC_DEPS)),)
-include $(CC_DEPS)
endif
ifneq ($(strip $(C++_DEPS)),)
-include $(C++_DEPS)
endif
ifneq ($(strip $(C_UPPER_DEPS)),)
-include $(C_UPPER_DEPS)
endif
ifneq ($(strip $(CXX_DEPS)),)
-include $(CXX_DEPS)
endif
ifneq ($(strip $(CPP_DEPS)),)
-include $(CPP_DEPS)
endif
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
endif

-include ../makefile.defs

# Add inputs and outputs from these tool invocations to the build variables 

# All Target
all: libjvm.so

# Tool invocations
libjvm.so: $(OBJS) $(USER_OBJS)
	@echo 'Building target: $@'
	@echo 'Invoking: GCC C++ Linker'
	g++ -shared -o "libjvm.so" $(OBJS) $(USER_OBJS) $(LIBS)
	@echo 'Finished building target: $@'
	@echo ' '

# Other Targets
clean:
	-$(RM) $(LIBRARIES)$(CC_DEPS)$(C++_DEPS)$(C_UPPER_DEPS)$(CXX_DEPS)$(OBJS)$(CPP_DEPS)$(C_DEPS) libjvm.so
	-@echo ' '

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets
