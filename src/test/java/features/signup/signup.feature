Feature: Login

  @signup
  Scenario: Signup and verify the account
    Given I am at LG Home Page
    And User navigates to Email Site and generates random mail
    And User navigates to LG Registration SignUp Page and enters all of required details
    And Selects the Terms and conditions for Account Creation
    When Clicks on Signup Button
    Then LG Account should be created with provided email ID
    Then I should be able to activate the account from Mailbox



