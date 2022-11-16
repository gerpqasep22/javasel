Feature: Validating the Main Menu links

#Background: 
#Given User opens the browser
#And Access the valid url

Scenario Outline: Validating the Main Menu links after login
Given Enter valid username <uname>
And Enter valid password <pword>
When Click the Login buttons
Then OrangeHRM PIM page is displayed
When Click the Add Employee link
Then Add Employee page should be displayed

Examples:
|uname|pword|
|'Admin'|'admin123'|