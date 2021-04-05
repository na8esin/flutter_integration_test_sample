// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

import 'dart:io' show Platform;
import 'package:flutter/material.dart';
import 'package:flutter_hooks/flutter_hooks.dart';
import 'package:hooks_riverpod/hooks_riverpod.dart';

// ignore_for_file: public_member_api_docs

void startApp() => runApp(ProviderScope(
      child: MyApp(),
    ));

class MyApp extends HookWidget {
  @override
  Widget build(BuildContext context) {
    final count = useState(0);
    return MaterialApp(
      home: Scaffold(
        floatingActionButton: FloatingActionButton(
          tooltip: 'Increment',
          onPressed: () {
            count.value++;
          },
        ),
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child:
              Text('Platform: ${Platform.operatingSystem}\n ${count.value++}'),
        ),
      ),
    );
  }
}
