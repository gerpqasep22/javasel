Feature: User login to OrangeHRM

Scenario: User login to Orange application
Given Enter valid username <uname>
Given Enter valid password <pword>
When Click the Login buttons
Then OrangeHRM PIM page is displayed
When Click the 'Leave' link
Then Leave page is displayed
When Click the 'Time' link