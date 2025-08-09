// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.getui.getuiflut;

import android.content.Context;
import android.util.Log;

public class GeTuiContextHolder {
  private static Context applicationContext;

  public static boolean isValid() {
    return applicationContext != null;
  }
  public static Context getApplicationContext() {
    return applicationContext;
  }

  public static void setApplicationContext(Context applicationContext) {
    Log.i("GeTuiContextHolder", "received application context.");
    GeTuiContextHolder.applicationContext = applicationContext;
  }
}
