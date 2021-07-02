Feature: Cart Page

  Background:
    Given I am at LG Home Page
    
 @checkout @cart @smoke @regression
  Scenario: As a guest user, ensure you able to Increase Decrease quantity for OMV non subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMV Subscription product displays in search results page
    #Given I will add OMV non subscription product from Search Results Page
      # i will click on add to cart page for OMV_Subscription from Search Results Page
    Then  I will click on Add To Cart Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    Then  I will verify product is added into Cart Page
    When  I will select the "5" as quantity
    Then  I should able to see the updated price as per quantity
    When  I will select the "2" as quantity
    Then  I should able to see the updated price as per quantity

#   @test
#   Given I will add OMV non subscription product from Product Display Page
#
#
# @test
#   Given I will add OMV non subscription product from Product Listing Page

  @checkout @cart @smoke @regression
  Scenario: As a guest user, ensure you able to verify Estimated Tax for Hawaii using OMV non subscription product
    Given I enter OMV subscription product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMV Subscription product displays in search results page
    Then  I will click on Add To Cart Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    Then  I will verify product is added into Cart Page
    When  I will enter zipCode to check the delivery availability
    And   I should be able to see Estimated Price and Order Total
	
  @checkout @cart @smoke @regression
  Scenario: As a guest user, ensure system allow you to add Items from Recommended based on your cart after adding HA OMD product
   Given I enter OMD HA Innovel product Code into search edit box from GNB
   When  I click on search icon from GNB
   Then  I will verify OMD HA Innovel product displays in search results page
   When  I will enter zipCode for checking the delivery availability for OMD HA Innovel Product
   Then  I click on Add to Cart Button under Recommendations
     
 @checkout @cart @smoke @regression
 Scenario: As a guest user , ensure that Add accessories button is displayed for the product 
   Given I enter OMD HA Innovel product Code into search edit box from GNB
   When  I click on search icon from GNB
   Then  I will verify OMD HA Innovel product displays in search results page
   And   I click on Add to Cart Button under Accessories
   
 @checkout @cart @smoke @regression
 Scenario: As a guest user , ensure that Add accessories button is displayed for the product 
   Given I enter OMD HA Innovel product Code into search edit box from GNB
   When  I click on search icon from GNB
   Then  I will verify OMD HA Innovel product displays in search results page
   And   I click on Add to Cart Button under Accessories
   Then  I click on Remove Item Button
   