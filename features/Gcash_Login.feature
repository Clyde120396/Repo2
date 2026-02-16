Feature: to test login functionality

Scenario1: Login is successful with valid credentials
  Given user is on the login page
  When user input valid number
  And user input valid MPIN
  Then user will redirect to homepage

Scenario2: Login is unsuccessful with invalid number
  Given user is on login page
  When user input invalid number
  Then user will not able to login

Scenario3: Login is unsuccessful with invalid MPIN
  Given user is on login page
  And user input valid number
  When user input invalid MPIN
  Then user will not able to login

Scenario4: Login is unsuccessful with invalid OTP
  Given user is on login page
  And user input valid number
  And user input valid MPIN
  When user input invalid otp
  Then user will not able to login
