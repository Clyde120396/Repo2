Feature: to test send money features of gcash

Scenario1: Send Money Successfully
  Given user is on home page
  When user click send button
  And user click express send
  And user input valid gcash number
  And user input any amount
  And user click next
  And user click the check box
  And user click send button
  Then user successfully send money
  And user validate reference no.
  And user validate the amount sent

Scenario2: Send Money Using invalid number
  Given user is on home page
  And user click send button
  And user click express send
  When user input invalid gcash number
  Then user will not able to send money

Scenario3: Send Money larger than your balance
  Given user is on home page
  And user click send button
  And user click express send
  And user input valid gcash number
  When user input larger amount than your balance
  Then user will not able to send money

Scenario4: Send Money without clicking the check box
  Given user is on home page
  And user click send button
  And user click express send
  And user input valid gcash number
  And user input any amount
  And user click next
  When user not click the check box
  Then user will not able to send money
