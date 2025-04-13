# Cubical

Rubik's Cube Algorithm Android app built using Android Studio, Kotlin, and Jetpack Compose.

## Credits

I owe a lot to those who have developed, organized, shared, and maintained Rubik's cube algorithms!
I am very grateful for the many excellent resources that are available online. :relaxed:

Algorithm credits:
- Dylan Wang (J Perm): [here](https://jperm.net/)
- Feliks Zemdegs and Andy Klise (CubeSkills): [here](https://www.cubeskills.com/)

Image credits:
- Black and white OLL images: post [here](https://www.reddit.com/r/Cubers/comments/fasyjp/a_customizable_and_printable_oll_cheat_sheet/) and shared folder [here](https://drive.google.com/drive/folders/1h1-GcQoMm-jq69Iz5cCoAJIHs-_CqNmD)
- App icon v1: [here](https://www.etsy.com/listing/478040894/rubiks-cube-screen-print-black-and-white)
- App icon v2: [here](https://tex.stackexchange.com/questions/459254/easy-way-to-generate-rubiks-cube-diagrams)

## Test app on an Android phone

To test your app on an Android phone (for example, Google Pixel 7) by connecting to your computer (for example, Macbook),
follow these steps:
1. Enable Developer Options: Go to `Settings > About phone > Build number`. Click on Build number seven times.
2. Enable USB Debugging: Go to `Settings > System > Developer options`. Enable USB debugging.
3. Connect Android phone to computer using USB-C cable.
4. Verify connection using this terminal command: `adb devices`.
5. Run your app in Android Studio.

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
