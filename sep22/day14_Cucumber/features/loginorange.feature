Feature: User login to OrangeHRM application successfully

#Background: 
#Given User opens the browser
#And Access the valid url

Scenario Outline: User login to OrangeHRM application with positive data
Given Enter valid username <uname>
Given Enter valid password <pword>
When Click the Login buttons
Then OrangeHRM PIM page is displayed
When Click the 'Leave' link
Then Leave page is displayed
When Click the 'Time' link
Then Time / Timesheets page is displayed
#When Click the Recruitment link
#Then Recruitment page is displayed

Examples:
|uname|pword|
|'Admin'|'admin123'|
|'Admin'|'admin123'|

Scenario Outline: Error on login to OrangeHRM with negative data
Given Enter valid username <uname>
Given Enter invalid password <pword>
When Click the Login buttons
But Error Invalid Credential displayed

Examples:
|uname|pword|
|'Admin'|'admin'|
