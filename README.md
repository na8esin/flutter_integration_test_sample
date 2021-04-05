# integration_test_example

https://github.com/flutter/plugins/tree/master/packages/integration_test/example

Demonstrates how to use the `package:integration_test`.

To run `integration_test/example_test.dart`,

Android / iOS:

```sh
flutter drive \
  --driver=test_driver/integration_test.dart \
  --target=integration_test/example_test.dart
```

Web:

```sh
flutter drive \
  --driver=test_driver/integration_test.dart \
  --target=integration_test/example_test.dart \
  -d web-server
```


```
pushd android
flutter build apk
./gradlew app:assembleAndroidTest
./gradlew app:assembleDebug -Ptarget=integration_test/extended_test.dart
popd
```

```
gcloud auth activate-service-account --key-file="$HOME/Downloads/practice-da34f-firebase-adminsdk-ueykj-053ff9bed4.json"
gcloud --quiet config set project practice-da34f
gcloud firebase test android run --type instrumentation \
  --app build/app/outputs/apk/debug/app-debug.apk \
  --test build/app/outputs/apk/androidTest/debug/app-debug-androidTest.apk\
  --timeout 2m \
```

```
# optional
  --results-bucket=<RESULTS_BUCKET> \
  --results-dir=<RESULTS_DIRECTORY>
```