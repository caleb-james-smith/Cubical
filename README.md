# Cubical
Rubik's Cube Algorithm Android App built using Android Studio, Kotlin, and Jetpack Compose.

To test your app on an Android phone (for example, Google Pixel 7) by connecting to your computer (for example, Macbook),
follow these steps:
1. Enable Developer Options: Go to `Settings > About phone > Build number`. Click on Build number seven times.
2. Enable USB Debugging: Go to `Settings > System > Developer options`. Enable USB debugging.
3. Connect Android phone to computer using USB-C cable.
4. Verify connection using this terminal command: `adb devices`
5. Run your app in Android Studio

The app should load run on your Android phone.
After you disconnect your Android phone from the USB-C cable and your computer,
the app should still be installed and able to run. 

The Android Debug Bridge (adb) is a useful command-line tool that you can use to communicate with Android devices.

You can install `adb` on Mac with brew using this command:
```
brew install android-platform-tools
```
You can check that `adb` is installed using these commands:
```
which adb
adb version
```
You can use `adb` to list the attached devices using this command:
```
adb devices
```
