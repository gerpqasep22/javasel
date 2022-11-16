Feature: Login to orangehrm application

Background: 
Given Open Chrome browser
And Load the application URL

Scenario Outline: Login to organhrm with valid credential
Given Enter the username as <uname>
And Enter the password as <pword>
When Click the Login button
Then Orangehrm home page displayed

Examples:
|uname|pword|
|"Admin"|"admin123"|
|"Admin"|"admin123"|


Scenario Outline: Login to organhrm with invalid credential
Given Enter the username as <uname>
And Enter the password as <pword>
When Click the Login button
But Error message displayed

Examples:
|uname|pword|
|"Admin"|"admin1234"|