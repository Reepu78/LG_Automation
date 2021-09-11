Feature: Checkout Flow using PayPal Payment Method
  As a tester
  I want to ensure PayPal Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background:
    Given I am at LG Home Page

  @checkout @paypal @smoke @regression @TC_001 
  Scenario: As a brand new guest, ensure user able to checkout OMV Subscription product with promotion code and standard shipping using PayPal
    Given I Find "OMV Subscription" product using search function
    And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
 		And I Select Subscription as "Single Purchase"
 		When I Click on "Add to cart" link from PDP page
     Then  I Verify "1" item is added to the cart
    When  I will enter promo code
    Then  I should able to use promo code
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed

  @checkout @paypal @smoke @regression @TC_002 
  Scenario: As a brand new guest, ensure user able to checkout OMV Subscription product after removing promotion code once it was applied with overnight shipping
    Given I Find "OMV Subscription" product using search function
    And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
 		And I Select Subscription as "Single Purchase"
 		When I Click on "Add to cart" link from PDP page
    Then  I Verify "1" item is added to the cart
    When  I will enter promo code
    Then  I should able to use promo code
    When  I will remove promo code
    Then  I should able to remove promo code
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
	
  @checkout @paypal @smoke @regression @TC_003
   
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with overnight shipping
    Given I Find "OMV Non Subscription" product using search function
    And I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    Then I verify Price Breakdown Order Summary section on cart page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Overnight" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
		#Paypal payment incomplete
	
  
  @checkout @paypal @smoke @regression @TC_004 
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with Standard shipping
    Given I Find "OMV Non Subscription" product using search function
    Then  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page 
     When I Click on "Add to cart" link from PDP page
     And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    Then I verify Price Breakdown Order Summary section on cart page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
     When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
	#Paypal payment incomplete
	

  @checkout @paypal @smoke @regression @TC_005
  Scenario: As a guest user, checkout OMD HE Innovel product and Create an account from confirmation page
    Given I Find "OMD HE Innovel" product using search function
    Then  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page 
    When  I will enter ZipCode for checking the delivery availability for OMD HE Innovel Product
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
      Then I verify confirmation page is displayed
    
	@checkout @paypal @smoke @regression @TC_006  
  Scenario: As a guest user, checkout OMD HE Non Innovel product 
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And  I Click on "View cart" link 
    Then  I Verify "1" item is added to the cart
    Then I verify Price Breakdown Order Summary section on cart page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    Then I verify "Shipping" is displayed
    Then I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
     Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
		#Incomplete payment from 	paypal page onwards
		
 @checkout @paypal @smoke @regression @TC_007 
  Scenario: As a guest user, checkout OMD HA Innovel product 
    Given I Find "OMD HA Innovel" product using search function
    Then  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "OMD HA Innovel" product
    Then  I Verify "1" item is added to the cart
    Then I verify Price Breakdown Order Summary section on cart page
     When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    Then I verify "Shipping" is displayed
    Then I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
     Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
		#Incomplete payment from 	paypal page onwards
		
@checkout @paypal @smoke @regression @TC_008 
  Scenario: As a guest user, checkout OMD HA Non Innovel product  
    Given I Find "OMD HA Non Innovel" product using search function
    Then  I will verify "OMD HA Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    Then I verify Price Breakdown Order Summary section on cart page 
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
     Then I verify "Shipping" is displayed
    Then I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
     Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
		#Incomplete payment from 	paypal page onwards

	@checkout @guest @paypal @smoke @regression @TC_009 
  Scenario: As a guest user, checkout combination with OMD and OMV product
 	Given I Find "OMD HE Innovel" product using search function
 	And  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page
	When I Click on "Add to cart" link from PDP page
 	And I enter ZipCode to check the delivery availability for "OMD HE Innovel" product
  Then  I Verify "1" item is added to the cart
	Then I verify Price Breakdown Order Summary section on cart page
	Given I Find "OMV Subscription" product using search function
  And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
	And I Select Subscription as "Single Purchase"
	When I Click on "Add to cart" link from PDP page
  Then  I Verify "2" item is added to the cart
  And   I click on Secure Checkout button	
  And   I click on Continue as Guest from Sign in page
  Then I verify "Shipping" is displayed
	Then  I verify "Order Summary" is displayed
	And   I click on Save and Continue button after fill out Shipping Info
	And   I verify the suggested address
	And I click "Overnight - 2 to 4 business days" button on checkout page
	When  I click on Continue to Payment button
	Then  I verify "Order Summary" is displayed
	Then  I will see Payment method option list in Billing Page
	When  I choose the "Paypal" radio button from Billing Page
	And   I click on Review and Place order button from Billing Page
	And   I click on Place Order button after agreeing Terms and Conditions from Review Page
	When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
	#Incomplete payment from 	paypal page onwards
			
			
			
	@checkout @cart @smoke @regression @TC_010 #Continue
  Scenario: As a guest user, checkout OMD product with an accessory
    Given I Find "OMV Non Subscription With Accessories" product using search function
    And  I will verify "OMV Non Subscription With Accessories" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    And I Click on "Add Accessories" button
    Then I verify "Recommended Accessories" is displayed
    When I Click on "Close Add Accessories" button
    Then I verify "Recommended Accessories" is not displayed
    And I Click on "Add Accessories" button
    Then I verify "Recommended Accessories" is displayed
    And I Click on "Add to cart" button for the first Accessory
    Then I verify "Your Cart" is displayed
    When I Click on "Add Accessories" button
    Then I verify "Recommended Accessories" is displayed
    And I verify the Accessory added to cart is still displayed
    
        
    @checkout @paypal @smoke @regression @TC_021 @Test
    Scenario: As a brand new guest, ensure user able to checkout OMD innovel  product with promotion code using PayPal
    Given I Find "OMD HE Innovel" product using search function
    And  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "OMD HE Innovel" product
    Then I verify Order summay section price break down is correct
    When I Enter valid PromoCode under Promo Edit box 
 		And I Click on "Apply" button
   Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
    When I click on Secure Checkout button
    And  I click on Continue as Guest from Sign in page
    And  I click on Save and Continue button after fill out Shipping Info
    And  I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When I click on Continue to Payment button
    Then I will see Payment method option list in Billing Page
    When I choose the "Paypal" radio button from Billing Page
    And  I click on Review and Place order button from Billing Page
    And  I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Incomplete payment from 	paypal page onwards

  @checkout @paypal @smoke @regression @TC_022 
  Scenario: As a brand new guest, ensure user able to checkout OMD non innovel product with promotion code using PayPal
    Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
		And   I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		 When I Enter valid PromoCode under Promo Edit box 
 		And I Click on "Apply" button
   Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
		And I click on Secure Checkout button	
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
    #Paypal payment incomplete


    
    
    @checkout @paypal @smoke @regression @TC_023 
    Scenario: As a brand new guest, ensure user able to checkout OMV one timer product with promotion code using PayPal
    Given I Find "OMV Subscription" product using search function
    And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
 		And I Select Subscription as "Single Purchase"
 		When I Click on "Add to cart" link from PDP page
    When I Enter valid PromoCode under Promo Edit box
    And I Click on "Apply" button
   Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
    When I click on Secure Checkout button
    And  I click on Continue as Guest from Sign in page
    And  I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
		
		
		@checkout @paypal @smoke @regression @TC_024
		Scenario: As a guest user, checkout OMD HE Innovel product and Create an account from confirmation page
    Given I Find "OMD HE Innovel" product using search function
		And  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page
  	When I Click on "Add to cart" link from PDP page
  	And I enter ZipCode to check the delivery availability for "OMD HE Innovel" product
  	Then  I Verify "1" item is added to the cart
     When I Enter valid PromoCode under Promo Edit box
    And I Click on "Apply" button
   Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    
    @checkout @paypal @smoke @regression @TC_025
  	Scenario: As a guest user, checkout OMD HE Non Innovel product 
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
	  When I Click on "Add to cart" link from PDP page
	   And   I Click on "View cart" link
     Then  I Verify "1" item is added to the cart
   When I Enter valid PromoCode under Promo Edit box
    And I Click on "Apply" button
   Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
    Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    
	@checkout @paypal @smoke @regression @TC_032 
  Scenario: As a guest user, checkout with OMD products and verify Edit cart link on checkout(shipping) page with PayPal checkout
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    And 	I click "Edit Cart" button on checkout page
		When  I will select the "2" as quantity
		When  I click on Secure Checkout button
		And   I click on Continue as Guest from Sign in page
		And 	I click "Save and continue" button on checkout page
		And   I verify the suggested address
		When  I click on Continue to Payment button
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    @checkout @paypal @smoke @regression @TC_033  
  	Scenario: As a guest user, checkout with OMD products and verify Change shipping address on checkout(shipping) page with PayPal checkout
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    And 	I click "edit" button on checkout page
    And 	I edit the address and click on Save and Continue
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
     When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Paypal payment incomplete

    @checkout @paypal @smoke @regression @TC_034 
  	Scenario: As a guest user, checkout with OMD products and verify Return to Shipping link on checkout(Payment & Billing) page with PayPal checkout
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    And 	I click "Return to Shipping" button on checkout page
    And 	I verify System should navigate the Shipping page
    And 	I click "Save and continue" button on checkout page
    And   I verify the suggested address
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
     When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    @checkout @paypal @smoke @regression @TC_035 
  	Scenario: As a guest user, checkout with OMD products and verify Edit cart link on checkout(Payment & Billing) page with PayPal checkout
   Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    And 	I click "Edit Cart" button on checkout page
		When  I will select the "2" as quantity
		When  I click on Secure Checkout button
		And   I click on Continue as Guest from Sign in page
		Then I verify item quantity is increased to "2"
		And 	I click "Save and continue" button on checkout page
		And   I verify the suggested address
		When  I click on Continue to Payment button
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    
    @checkout @paypal @smoke @regression @TC_036  
  	Scenario: Ensure that guests user are able to place order using paypal payment method for promotional products
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    Given I Find "OMV Subscription" product using search function
    And  I will verify OMV Subscription product displays in search results page
    Then I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    When I Enter valid PromoCode under Promo Edit box 
 		And I Click on "Apply" button
   Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
     When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
   # step missing.
    #Paypal payment incomplete
    
    
       
    @checkout @paypal @smoke @regression @TC_038  
  	Scenario: As a guest user, checkout with OMD products and verify Edit link on Shipping Address (Review & Place Order) page with PayPal payment
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And I click "Edit Shipping Address" button on Checkout Review Page 
		And I edit the address and click on Save and Continue
		And   I verify the suggested address
    Then I verify shipping address is updated
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
	Then  I will enter card Details on Paypal Page
  Then  I will enter contact Details on Paypal Page
  And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    @checkout @paypal @smoke @regression @TC_039 
  	Scenario: As a guest user, checkout with OMD products and verify Edit link on Contact Information block (Review & Place Order page) with PayPal payment
  Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And I click "Edit Contact Information" button on Checkout Review Page
		Then I verify "Checkout" is displayed
#		When I will update email and phone number on shipping page
#		And 	I click "Save and continue" button on checkout page
		When I click Save and Continue after updating email and phone number on shipping page
		And   I verify the suggested address
    Then I verify Contact Information is updated
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page 
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
   Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    @checkout @paypal @smoke @regression @TC_040  
    Scenario: As a guest user, checkout with OMD products and verify Edit link on Payment method block (Review & Place Order page) with PayPal payment
     Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    When  I click "Edit Payment Method" button on Checkout Review Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
   Then I verify confirmation page is displayed
    #Paypal payment incomplete
    
    
     @checkout @paypal @smoke @regression @TC_044   
    Scenario: Verify Need Help? Call text and call number navigation of the header section in checkout page
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I verify header section is displayed on shipping page
    When  I click on Call Number
    Then  I verify System is showing Make a call from popup
    
    @checkout @paypal @smoke @regression @TC_045 
    Scenario: Verify Delivery Notification on checkout page
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    #Footer not found on website
    
    @checkout @paypal @smoke @regression @TC_046  
    Scenario: Verify Need Help? block on the footer section in checkout page
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
 		And  I verify footer section is displayed on shipping page
 		And  I Click on "Frequently Asked Questions" link
 		Then I verify the FAQ tab
 		When I click on footer Call Number
 		#Then  I verify System is showing Make a call from popup
 		
 		
 		@checkout @paypal @smoke @regression @TC_048 
  	Scenario: As a guest user, checkout with OMD products and verify Cart icon on checkout page with PayPal payment
     Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When I Click on "Add to cart" link from PDP page
    And   I Click on "View cart" link
    Then  I Verify "1" item is added to the cart
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Cart icon
    Then I verify "Your Cart" is displayed
    When  I will select the "2" as quantity
		When  I click on Secure Checkout button
		And   I click on Continue as Guest from Sign in page
		 Then  I verify "Order Summary" is displayed
		And 	I click "Save and continue" button on checkout page
		And   I verify the suggested address
		When  I click on Continue to Payment button
		Then  I verify "Order Summary" is displayed
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page  
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue button
   Then I verify confirmation page is displayed  
    #Paypal payment incomplete
    
    
