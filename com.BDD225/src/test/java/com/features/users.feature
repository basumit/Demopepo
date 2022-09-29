@dash
Feature: JBK offline application
@dash1
Scenario: users page test

Given  user on login page
When  user enters valid credentials
Then   user should be on home page
And user click on users tab
And user verify list box