Feature: Checkout Flow using Klarna Payment Method
  As a tester
  I want to ensure Klarna Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background:
    Given I am at LG Home Page

  @checkout @klarna @smoke @regression
  Scenario: As a brand new guest user, ensure user able to checkout HE OMD Innoval Product with monthly installment

  Given I am at LG TV,Audio,Video Page
  When  I click on TV Section Link
  Then  I should navigate to OLED TV Page
  And   I should see only OLED TVs in current page
  Then  I will click on Add to Cart Button for Available OLED in Highest Price range
  And   I should navigate to Zip Code Entry Page
  And   I should see only OLED which is selected in zip Code Entry Page
  Then  I will check for availibility in area using zipcode
  And   I will click on proceed Button
  Then  I will navigate to Cart Page
  And   I should able to see the price, product code which is selected
  And   I should able to see the Need help section at the bottom
  When  I click on secure checkout Button
  Then  I should navigate to Sign In Page
  When  I click on continue as guest
  Then  I should navigate to Contact Information Page
  And   I will enter contact Information details
  When  I click on Save and Continue Button
  And   I click on Use This Address Button
  Then  I should navigate to shipping page
  And   I click on continue payment Button
  Then  I should navigate to payment page
  And   I click on Klarna as payment method
  When  I click on Review and Place Order
  And   I click on Terms and conditions checkBox
  Then  I click on Place Order Button
  
 
  
  
  
  

