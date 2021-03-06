// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.example.integration_test_example;

import android.Manifest.permission;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import dev.flutter.plugins.integration_test.FlutterTestRunner;
import io.flutter.embedding.android.FlutterActivity;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * Demonstrates how an integration test on Android can be run with permissions already granted. This
 * is helpful if developers want to test native App behavior that depends on certain system service
 * results which are guarded with permissions.
 * 
 * すでに付与されている権限を使用してAndroidで統合テストを実行する方法を示します。
 * これは、開発者が、権限で保護されている特定のシステムサービスの結果に依存するネイティブアプリの動作をテストする場合に役立ちます。
 */
@RunWith(FlutterTestRunner.class)
public class FlutterActivityWithPermissionTest {

  @Rule
  public GrantPermissionRule permissionRule =
      GrantPermissionRule.grant(permission.ACCESS_COARSE_LOCATION);

  @Rule
  public ActivityTestRule<FlutterActivity> rule =
      new ActivityTestRule<>(FlutterActivity.class, true, false);
}
