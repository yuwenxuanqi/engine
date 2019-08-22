// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.flutter.embedding.android.FlutterActivityAndFragmentDelegateTest;
import io.flutter.embedding.android.FlutterActivityTest;
import io.flutter.embedding.android.FlutterFragmentTest;
import io.flutter.embedding.engine.FlutterEngineCacheTest;
import io.flutter.embedding.engine.systemchannels.TextInputChannelTest;
import io.flutter.util.PreconditionsTest;

@RunWith(Suite.class)
@SuiteClasses({
    PreconditionsTest.class,
    SmokeTest.class,
    FlutterActivityTest.class,
    FlutterFragmentTest.class,
    // FlutterActivityAndFragmentDelegateTest.class, TODO(mklim): Fix and re-enable this
    FlutterEngineCacheTest.class,
    TextInputChannelTest.class
})
/** Runs all of the unit tests listed in the {@code @SuiteClasses} annotation. */
public class FlutterTestSuite {}
