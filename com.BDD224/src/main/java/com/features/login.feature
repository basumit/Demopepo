@jbk
Feature: JBK offline application
@jbk1
Scenario Outline: login test

Given user on login page 
When  user enters "<username>" and "<password>"
Then  user verify "<title>" 

Examples:
|username       |password| title   |
|kiran@gmail.com|123456  | Dashboard|
|sumit@gmail.com|456789  | Log in  |

@jbk2
Scenario: logo test
Given user on login page 
Then user should be see JBK logo

