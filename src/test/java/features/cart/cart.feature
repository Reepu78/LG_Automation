Feature: Cart Page

  Background:
    Given I am at LG Home Page

  @checkout @cart @smoke @regression @TC_001
  Scenario: As a guest user ensure you able to Edit billing period for OMV subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    And I will verify OMV Subscription product displays in search results page
    And I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    And I will select the subscription Frequency as "3months"
    And I will click on Proceed to Cart Button
    And I will verify product is added into Cart Page
    And I will update the Delivery Frequency date to sixMonths
    When I will accept the alert
    Then I should see the updated Delivery Frequency date is reflected

  @checkout @cart @smoke @regression @TC_002
  Scenario: As a guest user ensure you able to Increase Decrease quantity for OMV non subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMV Subscription product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    Then  I will verify product is added into Cart Page
    When  I will select the "5" as quantity
    Then  I should able to see the updated price as per quantity
    When  I will select the "3" as quantity
    Then  I should able to see the updated price as per quantity

  @checkout @cart @smoke @regression @TC_003
  Scenario: As a guest user ensure you able to verify Estimated Tax for Hawaii using OMV subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMV Subscription product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    Then  I will verify product is added into Cart Page
    When  I enter zipCode to check the delivery availability for "HAWAII"
    And   I should be able to see Estimated Price and Order Total
    And   I should be able to see Estimated Tax Price
    When  I enter zipCode to check the delivery availability for "NewYork"
    And   I should be able to see Estimated Price and Order Total
    And   I should be able to see Estimated Tax Price
    Then  I should able see Hawaii estimated tax less than New York estimated tax

  @checkout @cart @smoke @regression @TC_004 @notDONE
  Scenario: As a guest user ensure user able to remove item from cart after adding an OMD HE Product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    And  I click on search icon from GNB
    And  I will verify OMD HA Innovel product displays in search results page
    And  I will enter zipCode for checking the delivery availability for OMD HA Innovel Product

  @checkout @cart @smoke @regression @TC_005
  Scenario: As a guest user ensure user able to add two OMV Items and remove one of them
    Given I add OMV Subscription product into cart with frequency of "3months"
    And  I add OMV Non Subscription Product into cart
    And I will have "2" items in cart
    When I removed first item from the cart list
    Then I will have "1" items in cart

  @checkout @cart @smoke @regression @TC_009
  Scenario: As a guest user ensure system allow you to add Items from Recommended based on your cart after adding HA OMD product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HA Innovel product displays in search results page
    When  I will enter zipCode for checking the delivery availability for OMD HA Innovel Product
    Then  I click on Add to Cart Button under Recommendations

  @checkout @cart @smoke @regression @TC_022
  Scenario: As a guest user ensure that Add accessories button is displayed for the product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HA Innovel product displays in search results page
    And   I click on Add to Cart Button under Accessories

  @checkout @cart @smoke @regression @TC_024
  Scenario: As a guest user ensure that Add accessories button is displayed for the product
    Given I enter OMD HA Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HA Innovel product displays in search results page
    And   I click on Add to Cart Button under Accessories
    Then  I click on Remove Item Button

