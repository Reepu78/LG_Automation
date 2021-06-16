Feature: Checkout Flow using Klarna Payment Method
  As a tester
  I want to ensure Klarna Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background:
    Given I am at LG Home Page

  @checkout @guest @klarna @smoke @regression
  Scenario: As a brand new guest user, ensure user able to checkout the HE OMD Innoval Product with Klarna monthly installment
    Given I am able to add an HE OMD Innoval product from PLP
    When I enter zipCode to check the delivery availability
    Then I will verify product is added into Cart Page
    When I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    # start Klarna flow TODO
    # confirmation page TODO
    