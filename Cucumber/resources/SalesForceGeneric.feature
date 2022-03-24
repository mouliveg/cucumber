Feature: SFDC Login

Scenario: Login into saleforce with valid username and Invalid password
Given User is on "LoginPage"
When User enter into text box "Username" "mohini@tek.com"
When User enter into text box "Password" "mouli143!!"
When User Clicks on the CheckBox "RememberMe"
Then User Clicks on Button "Login"



Scenario: Login into saleforce with valid username and Valid password
Given User is on "LoginPage"
When User enter into text box "Username" "mohini@tek.com"
When User enter into text box "Password" " mouli143!"
Then User Clicks on Button "Login"


Scenario: Login Error Message 1
Given User is on "LoginErrorMessagepage1"
When User enter into text box "Username" "mohini@tek.com"
When User enter into text box "Password" 
Then User Clicks on Button "Login"
