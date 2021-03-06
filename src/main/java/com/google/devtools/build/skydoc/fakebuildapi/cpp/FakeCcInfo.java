// Copyright 2019 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.fakebuildapi.cpp;

import com.google.devtools.build.lib.events.Location;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcCompilationContextApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcInfoApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcLinkingContextApi;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.Printer;
import com.google.devtools.build.lib.syntax.StarlarkThread;

/** Fake implementation of {@link CcInfoApi}. */
public class FakeCcInfo implements CcInfoApi {

  @Override
  public CcCompilationContextApi getCcCompilationContext() {
    return null;
  }

  @Override
  public CcLinkingContextApi<?> getCcLinkingContext() {
    return null;
  }

  @Override
  public String toProto(Location loc) throws EvalException {
    return null;
  }

  @Override
  public String toJson(Location loc) throws EvalException {
    return null;
  }

  @Override
  public void repr(Printer printer) {}

  /** Fake implementation of {@link CcInfoApi.Provider}. */
  public static class Provider implements CcInfoApi.Provider {

    @Override
    public CcInfoApi createInfo(
        Object ccCompilationContext, Object ccLinkingInfo, Location location, StarlarkThread thread)
        throws EvalException {
      return new FakeCcInfo();
    }

    @Override
    public void repr(Printer printer) {}
  }
}
