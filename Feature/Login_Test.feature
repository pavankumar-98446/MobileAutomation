Feature: Login Action functionality
  Description: This feature will test a LogIn and LogOut functionality

Background: Verify the background functionality
    Given when we open the application through url
    Then application should through chrome browser

Scenario: unsuccessful Login with Valid Credentials and Logout
    Given User is on homePage
    When User navigate to login page
    And User entered UserName and Password
    Then User should login to the Application
    And User should very Page title

Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully

    
Scenario: Login into the application with invalid credentials 
    Given User is on homePage
    When User navigate to login page
    And User entered UserName and Password
    But User not able to login to application due to invalid credentials
    Then Invalid credentials should show