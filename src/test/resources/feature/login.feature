Feature: CRM Login

#Scenario: Login Test Scenario
#Given User is already on login page
#When User enter "sahapuja8@gmail.com" and "Amazon@0205"
#Then User is on Home Page
#Then Close browser


#Scenario Outline: Login Test Scenario
#Given User is already on login page
#When User enter "<username>" and "<password>"
#Then User is on Home Page
#Then Close browser

#Examples:
#|username|password|
#|corpdevops@gmail.com|CrmPro123|
#|testuser1|welcom1|

Scenario: Login Test Scenario
Given User is already on login page
When User enter login credentials
	|username|password|
	|corpdevops@gmail.com|CrmPro123|
Then User is on Home Page
Then Close browser

