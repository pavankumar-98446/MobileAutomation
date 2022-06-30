$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/OperativeAutomation/PavanKumarWorkspace/CumcumberMobileAutomation/Feature/AndroidTest_1.feature");
formatter.feature({
  "line": 1,
  "name": "Test Android emulator functionality",
  "description": "Description: his feature will test a emulator functionality",
  "id": "test-android-emulator-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "successful Lunch APK file in android emulator",
  "description": "",
  "id": "test-android-emulator-functionality;successful-lunch-apk-file-in-android-emulator",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "lunch emulator and install apk file",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User entered UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should login to the Application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User should very Page title",
  "keyword": "And "
});
formatter.match({
  "location": "AndroidTest_1.lunch_emulator_and_install_apk_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Test.user_navigate_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Test.user_entered_UserName_and_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Test.user_should_login_to_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Test.user_should_very_Page_title()"
});
formatter.result({
  "status": "skipped"
});
});