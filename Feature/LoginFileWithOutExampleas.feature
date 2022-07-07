Feature: Login functionality without examples 
	Description: Verify the lagin creadetial with out example options

Scenario: uccessful Login with Valid Credentials and Logout 
	Given User is on homePage 
	When User navigate to login page 
	And User entered "<PavanKumar>" and "<Venigalla>" 
	Then User should login to the Application 
	And User should very Page title 
	
	
