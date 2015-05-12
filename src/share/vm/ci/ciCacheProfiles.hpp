/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 *
 */

#ifndef SHARE_VM_CI_CICACHEPROFILES_HPP
#define SHARE_VM_CI_CICACHEPROFILES_HPP

#include "ci/ciMethod.hpp"

// ciCacheProfiles

//
// Replay compilation of a java method by using an information in replay file.
// Replay inlining decisions during compilation by using an information in inline file.
//
// NOTE: these replay functions only exist in debug version of VM.
//
// Replay compilation.
// -------------------
//
// Replay data file replay.txt can be created by Serviceability Agent
// from a core file, see agent/doc/cireplay.html
//
// $ java -cp <jdk>/lib/sa-jdi.jar sun.jvm.hotspot.CLHSDB
// hsdb> attach <jdk>/bin/java ./core
// hsdb> threads
// t@10 Service Thread
// t@9 C2 CompilerThread0
// t@8 Signal Dispatcher
// t@7 Finalizer
// t@6 Reference Handler
// t@2 main
// hsdb> dumpreplaydata t@9 > replay.txt
// hsdb> quit
//
// (Note: SA could be also used to extract app.jar and boot.jar files
//  from core file to replay compilation if only core file is available)
//
// Replay data file replay_pid%p.log is also created when VM crashes
// in Compiler thread during compilation. It is controlled by
// DumpReplayDataOnError flag which is ON by default.
//
// Replay file replay_pid%p_compid%d.log can be created
// for the specified java method during normal execution using
// CompileCommand option DumpProfile:
//
// -XX:CompileCommand=option,Benchmark::test,DumpProfile
//
// In this case the file name has additional compilation id "_compid%d"
// because the method could be compiled several times.
//
// To replay compilation the replay file should be specified:
//
// -XX:+ReplayCompiles -XX:ReplayDataFile=replay_pid2133.log
//
// VM thread reads data from the file immediately after VM initialization
// and puts the compilation task on compile queue. After that it goes into
// wait state (BackgroundCompilation flag is set to false) since there is no
// a program to execute. VM exits when the compilation is finished.
//
//
// Replay inlining.
// ----------------
//
// Replay inlining file inline_pid%p_compid%d.log is created for
// a specific java method during normal execution of a java program
// using CompileCommand option DumpInline:
//
// -XX:CompileCommand=option,Benchmark::test,DumpInline
//
// To replay inlining the replay file and the method should be specified:
//
// -XX:CompileCommand=option,Benchmark::test,ReplayInline -XX:InlineDataFile=inline_pid3244_compid6.log
//
// The difference from replay compilation is that replay inlining
// is performed during normal java program execution.
//
// class to represent the cached compilations
class MethodRecord;
class MethodDataRecord;
class InlineRecord;
class CompileRecord;

class ciCacheProfiles : AllStatic {
  CI_PACKAGE_ACCESS

//#ifndef PRODUCT
 private:
  static FILE*   _stream;
  static Thread* _thread;
  static Handle  _protection_domain;
  static Handle  _loader;

  static const char* _error_message;

  static char* _bufptr;
  static char* _buffer;
  static int   _buffer_length;
  static int   _buffer_pos;

  // "compile" data
  static ciKlass* _iklass;
  static Method*  _imethod;

  static int replay_impl(TRAPS, Method* method, int osr_bci);

  static CompileRecord**    _compile_records;
  static MethodRecord** _method_records;
  static MethodDataRecord** _method_data_records;

  static int _method_records_pos;
  static int _method_data_records_pos;
  static int _compile_records_pos;
  static int _method_records_length;
  static int _method_data_records_length;
  static int _compile_records_length;

  static bool _initialized;

  static bool had_error();
  static bool can_replay();
  static void report_error(const char* msg);
  static int parse_int(const char* label);
  static intptr_t parse_intptr_t(const char* label);
  static void skip_ws();
  static char* scan_and_terminate(char delim);
  static char* parse_string();
  static char* parse_quoted_string();
  static const char* parse_escaped_string();
  // Look for the tag 'tag' followed by an
  static bool parse_tag_and_count(const char* tag, int& length) ;
  // Parse a sequence of raw data encoded as bytes and return the
  // resulting data.
  static char* parse_data(const char* tag, int& length);
  // Parse a standard chunk of data emitted as:
  //   'tag' <length> # # ...
  // Where each # is an intptr_t item
  static intptr_t* parse_intptr_data(const char* tag, int& length);
  // Parse a possibly quoted version of a symbol into a symbolOop
  static Symbol* parse_symbol(TRAPS);
  // Parse a valid klass name and look it up
  static Klass* parse_klass(TRAPS);
  // Lookup a klass
  static Klass* resolve_klass(const char* klass, TRAPS);
  // Parse the standard tuple of <klass> <name> <signature>
  static Method* parse_method(TRAPS);
  static int get_line(int c);
  // validation of comp_level
  static bool is_valid_comp_level(int comp_level);
  static void unescape_string(char* value);

  static const char* error_message();

  static void process(TRAPS);
  static void process_command(TRAPS);

  static void replay_method(TRAPS, Method* method, int osr_bci);
  static void process_compile(TRAPS);
  static void process_ciMethod(TRAPS);
  static void process_ciMethodData(TRAPS);
  static void process_JvmtiExport(TRAPS);

  // Create and initialize a record for a ciMethod
  static MethodRecord* new_methodRecord(char* klass_name, char* method_name, char* signature);
  // Lookup data for a ciMethod
  static MethodRecord* find_methodRecord(Method* method);

  // Create and initialize a record for a ciMethodData
  static MethodDataRecord* new_methodDataRecord(char* klass_name, char* method_name, char* signature);
  // Lookup data for a ciMethodData
  static MethodDataRecord* find_methodDataRecord(Method* method);

  // Create and initialize a record for a ciCompile
  static CompileRecord* new_compileRecord(char* klass_name, char* method_name, char* signature);

  // Lookup data for a ciMethod
  static CompileRecord* find_compileRecord(Method* method);
  // Lookup data for a methodHandle
  static CompileRecord* find_compileRecord(methodHandle method);
  // Lookup data for a set of strings
  static CompileRecord* find_compileRecord(char* klass_name, char* method_name, char* signature);

//  // Create and initialize a record for a ciInlineRecord
//  static InlineRecord* new_inlineRecord(Method* method, int bci, int depth);
//
//  // Lookup inlining data for a ciMethod
//  static InlineRecord* find_inlineRecord(Method* method, int bci, int depth);
//
//  static InlineRecord* find_inlineRecord(GrowableArray<InlineRecord*>* records,
//  Method* method, int bci, int depth);


 public:
  // parse cached profiles to set flag in methods
  static void initialize(TRAPS);
  //static bool _initialized = false;
  // Replay specified compilation and exit VM.
  static void replay(TRAPS, Method* method, int osr_bci);
  // Load inlining decisions from file and use them
  // during compilation of specified method.
//  static void* load_inline_data(ciMethod* method, int entry_bci, int comp_level);

  // These are used by the CI to fill in the cached data from the
  // replay file when replaying compiles.
  static void initialize(ciMethodData* method);
  static void initialize(ciMethod* method);

  static bool is_loaded(Method* method);
  static bool is_loaded(Klass* klass);

//  static bool should_not_inline(ciMethod* method);
//  static bool should_inline(void* data, ciMethod* method, int bci, int inline_depth);
//  static bool should_not_inline(void* data, ciMethod* method, int bci, int inline_depth);

//  class  CacheReplay;
//  static CacheReplay* cache_state;
  static int is_cached(Method* method);
  static int is_cached(methodHandle method);

  static bool is_initialized();
  static void is_initialized(bool flag);

  //static void reset();

//#endif
};

#endif // SHARE_VM_CI_CICACHEPROFILES_HPP
