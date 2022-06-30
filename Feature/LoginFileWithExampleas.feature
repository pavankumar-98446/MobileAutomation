Feature: Login functionality without examples 
	Description: Verify the lagin creadetial with out example options

Scenario Outline: uccessful Login with Valid Credentials and Logout 
	Given User is on homePage 
	When User navigate to login page 
	And User entered "<UserName>" and "<Password>" 
	Then User should login to the Application 
	And User should very Page title 
	
	Examples: 
		|UserName|Password|
		|A|B|
		|C|C|
		|D|D|
		
		
Scenario: Login with Valid Credentials and Logout Using Data table 
	Given User is on homePage 
	When User navigate to login page 
	And User entered UserName and Password using Tables 
		|Venigalla|PavanLuamr| 
		|Manasa|Guntupalli| 
	Then User should login to the Application 
	And User should very Page title 
	
	
Scenario: Login with Valid Credentials and Logout Using Data Map 
	Given User is on homePage 
	When User navigate to login page 
	And User entered UserName and Password using Maps 
		|UserName|Password|
		|Venigalla|PavanLuamr| 
		|Manasa|Guntupalli| 
	Then User should login to the Application 
	And User should very Page title 
	
	
	
	
	
	