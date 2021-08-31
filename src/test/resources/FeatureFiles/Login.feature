@Login
Feature: To validate login functionality of facebook app

Background: 
Given User have to enter facebook login page

@Smoke
Scenario Outline:
To validate login functionality with different values
When User have to enter username "<user>" and password "<pass>"
And User have to click a login button
Then User have to be in invalid credentials page

Examples:
	| user | pass |
	| Green | Green@12 |
	| Selenium | Se187 |


@Sanity @Regression
Scenario: To validate login functionality without entering login credentials
When User has to click the login button without entering credentials
Then User should be in invalid credential page