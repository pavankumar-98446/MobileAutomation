Feature: Test Android emulator functionality 
	Description: This feature will test a emulator functionality

Scenario: successful Lunch APK file in android emulator 
	Given lunch emulator and install apk file 
	When we selected selected preferences tab Set wifi Password 
	Then close the driver 
