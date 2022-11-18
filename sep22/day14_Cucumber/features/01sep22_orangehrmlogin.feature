Feature: Login to orangehrm application

#Background: 
#Given Open Chrome browser
#And Load the application URL

@smoke
Scenario: Login to organhrm with valid credential
Given Enter the username as 'Admin'
And Enter the password as 'admin123'
When Click the Login button
Then Orangehrm home page displayed

@functional
Scenario Outline: Login to organhrm with invalid credential
Given Enter the username as <uname>
And Enter the password as <pword>
When Click the Login button
But Error message displayed

Examples:
|uname|pword|
|"Admin"|"admin1234"|
|"Admin123"|"admin1234"|