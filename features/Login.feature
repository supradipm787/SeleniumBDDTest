#A feature file contains one feature
#A feature file contains Gherkin language which is business language
Feature: Test the login functionality of Scrum.org site

#A feature may have given different specific scenarios
Scenario: The user should be able to login to Scrum.org with correct username and password
Given user is on the login page
When user enters the correct username and password
Then user gets the confirmation message

@wait  

Scenario Outline: The user should be able to login to Scrum.org site
Given user is on the login page
When user enters the correct email <username> 
And user enters password <password>
Then user gets the confirmation message


Examples:
| username | password |
| supradipm@hotmail.com | Sreeju@787 |
| notsupradipm8@gmail.com.com | AllCheck |