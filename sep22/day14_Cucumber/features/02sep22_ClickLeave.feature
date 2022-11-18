Feature: Login and click admin link

@functional
Scenario: Login to organhrm and click admin link
Given Enter the username as 'Admin'
And Enter the password as 'admin123'
When Click the Login button
Then Orangehrm home page displayed
When Click the Leave link
Then Leave page is displayed