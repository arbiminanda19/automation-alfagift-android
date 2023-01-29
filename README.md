# automation-alfagift-android

Tools Used: Selenium, Appium, Cucumber, Junit, Maven Surefire Plugin

This project will run test by using apk file that has been attached

# Setting up and running tests

* Open project as Maven Project in Eclipse, Intellij, or other IDE. Ensure all dependencies are installed properly
* To avoid unwanted popups, ensure there is no Google account that is or has ever logged in to Android Emulator/Device used. Emulator/device settings can be reset first.
* In this file, set the desired capabilities of the Android device/emulator.
```
{projectDirectory}/src/test/java/stepDef/hooks.java
```
* In this file, fill phone, member number, and password of Alfagift account that has been registered.
```
{projectDirectory}/src/test/java/config/env.java
```
* Install Maven on PC/Laptop used
* Make sure Appium Server is setup properly to connect with Android emulator/device, then run it
* Open terminal/cmd, go to the project directory
* Run this command:
```
mvn clean test
``` 
* Screenshots when any successful and failed test will be generated in this directory:
```
{projectDirectory}/src/test/resources/screenshots
```
* HTML Report will be generated in this directory:
```
{projectDirectory}/src/test/resources/reports
```
* Tags in the runner file can be replaced with **@Positive** if you want to run only positive test cases, or **@Negative** for negative test cases. Runner can be accessed in this directory:
```
{projectDirectory}/src/test/java/runner
```