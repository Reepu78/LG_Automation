Feature: Checkout Flow using Different Types of Credit Cards Payment Methods
  As a tester
  I want to ensure Credit Card Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background:
    Given I am at LG Home Page

  @checkout @cc @smoke @regression @TC_001
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with promotion code and standard shipping using credit card
    Given I Find "OMV Subscription" product using search function
    Then  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    When  I will enter zipCode to check the delivery availability
    Then  I will verify product is added into Cart Page
    When  I will enter promo code
    Then  I should able to use promo code
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page

  @checkout @cc @smoke @regression @TC_002
  Scenario: As a brand new guest, ensure user able to checkout OMV Subscription product after removing promotion code once it was applied with overnight shipping
    Given I Find "OMV Subscription" product using search function
    Then  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    When  I will enter zipCode to check the delivery availability
    Then  I will verify product is added into Cart Page
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
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
   #	And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    
      @checkout @cc @smoke @regression @TC_003
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with overnight shipping
    Given I Find "OMV Non Subscription" product using search function
    Then  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Non_Subscription"
    Then  I click on the view Cart button from Pop up modal
    When  I will enter zipCode to check the delivery availability
    #Then  I will verify product is added into Cart Page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Overnight" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    
          @checkout @cc @smoke @regression @TC_004
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with Standard shipping
    Given I Find "OMV Non Subscription" product using search function
    Then  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page
    Then  I will click on add to cart Button from Search Results Page for "OMV_Non_Subscription"
    Then  I click on the view Cart button from Pop up modal
    When  I will enter zipCode to check the delivery availability
    #Then  I will verify product is added into Cart Page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
   Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page


  @checkout @cc @smoke @regression @TC_005 @NOT_DONE
  Scenario: [Visa] As a guest user, checkout OMD HE Innovel product and Create an account from confirmation page
 		Given I Find "OMD HE Innovel" product using search function
 		Then  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page
    When  I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    # CREATE AN ACCOUNT AFTER PLACING ORDER - TODO

         @checkout @cc @smoke @regression @TC_006
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with Standard shipping
  	Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    Then  I will click on add to cart Button from Search Results Page for "OMD_HE_Non_Innovel"
    Then  I click on the view Cart button from Pop up modal
    When  I will enter zipCode to check the delivery availability
    #Then  I will verify product is added into Cart Page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Master Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    
    
    	 @checkout @cc @smoke @regression @TC_007
  Scenario: As a guest user, checkout OMD HA Innovel product 
			Given I Find "OMD HA Innovel" product using search function
			And  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page
    	When I Click on "Add to cart" link from PDP page
    	And I enter zipCode to check the delivery availability for "OMD HA Innovel" product
    	And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    	And   I click on Secure Checkout button
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
  		 And   I verify the suggested address
   #	 Then  I will select the "Overnight" shipment Method
    	When  I click on Continue to Payment button
    	Then  I will see Payment method option list in Billing Page
   	 When  I choose the "Credit Card" radio button from Billing Page
     Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    
  @checkout @cc @smoke @regression @TC_008
  Scenario: [MC] As a guest user, checkout OMD product with an accessory
    Given I Find "OMD HA Non Innovel" product using search function
    Then  I will verify "OMD HA Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    Then  I click on the view Cart button from Pop up modal
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Overnight" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Master Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    
    
  @checkout @cc @smoke @regression @TC_009
  Scenario: [Visa] As a guest user, checkout combination with OMD and OMV product
    Given I Find "OMD HE Innovel" product using search function
    Then  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page
    When  I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
    And I Find "OMV Subscription" product using search function
   	And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
		And I Select Subscription as "Single Purchase"
		When I Click on "Add to cart" link from PDP page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Overnight" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Master Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page
	    
  @checkout @cc @smoke @regression @TC_010
  Scenario: [MC] As a guest user, checkout OMD product with an accessory
    Given I Find "OMD HA Innovel" product using search function
    Then  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter zipCode to check the delivery availability for "OMD HA Innovel" product
   #When  I will enter zipCode for checking the delivery availability for OMD HA Innovel Product
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Master Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page

  @checkout @cc @smoke @regression @TC_011
  Scenario: [AMEX] As a guest user, checkout OMD HE Non Innovel product with different billing address
     Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When  I will enter zipCode for checking the delivery availability for OMD HE Non Innovel Product
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page
    #And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    
    
  @checkout @cc @smoke @regression @TC_012
  Scenario: [Visa] As a guest user, checkout OMD HE Non Innovel product with invalid expiration date
  	Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
	  When I Click on "Add to cart" link from PDP page
    Then  I click on the view Cart button from Pop up modal
    #Then  I will verify product is added into Cart Page
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    Then  I will select the "Standard" shipment Method
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    Then  I will enter Card Details with Invalid Visa Expiration date
    And   I click on Review and Place order button from Billing Page
    Then  I verify the error message for Visa Expiration date
   
  @checkout @cc @smoke @regression @TC_013 
  Scenario: [JCB] As a guest user, checkout OMD HE Non Innovel product with invalid Credit Card Type
   	Given I Find "OMD HE Non Innovel" product using search function
	  Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
	  When I Click on "Add to cart" link from PDP page
	  And  I click on the view Cart button from Pop up modal
	  #Then  I will verify product is added into Cart Page
	  When  I click on Secure Checkout button
	  And   I click on Continue as Guest from Sign in page
	  And   I click on Save and Continue button after fill out Shipping Info
	  And   I verify the suggested address
	  Then  I will select the "Standard" shipment Method
	  When  I click on Continue to Payment button
	  Then  I will see Payment method option list in Billing Page
	  When  I choose the "Credit Card" radio button from Billing Page
	  Then  I will enter JCB Card Details with valid Details
	  And   I click on Review and Place order button from Billing Page
	  Then  I verify the error message for Credit Card Type
	  #email not verified
	  
	  
  @checkout @cc @smoke @regression @TC_035 
  Scenario: [AMEX] As a guest user, checkout with OMD products and verify Edit cart link on checkout(shipping) page with Credit/Debit card checkout
   	Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
		And I click on "Edit Cart" link
		Then I verify "Your Cart" is displayed
		When I update product quantity to "2"
		And I click on Secure Checkout button	
		And   I click on Continue as Guest from Sign in page
    Then  I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
   	When  I choose the "Credit Card" radio button from Billing Page
		Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page
			
			
			
  @checkout @cc @smoke @regression @TC_036
  Scenario: [VISA] As a guest user, checkout with OMD products and verify Change shipping address on checkout(shipping) page with Credit/Debit card checkout
   	Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
		When I verify shipping Address on Checkout page
		And I Click on "edit" link 
		And I edit the address and click on Save and Continue
		And   I verify the suggested address
    Then I verify shipping address is updated
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
		Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
	
	@checkout @guest @cc @smoke @regression @TC_037
  Scenario: [MC] As a guest user, checkout with OMD products and verify Return to Shipping link on checkout(Payment & Billing) page with Credit/Debit card checkout
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    And I click "Return to Shipping" button on checkout page
    Then I verify System should navigate the Shipping page
    Then  I verify "Order Summary" is displayed
    When I click "Save and continue" button on checkout page
    And I verify the suggested address
    And  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
		Then  I will enter Master Credit Card Details
    And   I click on Review and Place order button from Billing Page
    
    
  @checkout @guest @cc @smoke @regression @TC_0038
  Scenario: [AMEX] As a guest user, checkout with OMD products and verify Edit cart link on checkout(Payment & Billing) page with Credit/Debit card checkout
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
		And I click on "Edit Cart" link on checkout page
		Then I verify "Your Cart" is displayed
		When I update product quantity to "2"
		And I click on Secure Checkout button	
		And   I click on Continue as Guest from Sign in page
    Then  I verify "Order Summary" is displayed
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page 
    
    
  @checkout @guest @cc @smoke @regression @TC_0039
  Scenario: [AMEX] As a guest user, checkout with OMD products and verify 'Where is my security code link' on checkout(Payment & Billing) page with Credit/Debit card checkout
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
    And I click Where is my Security Code? link from Billing Page
    Then I verify System should display CVV UI demo with VISA, MC, DISCOVER and AMEX card
   	Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page 
    
    
 	@checkout @guest @cc @smoke @regression @TC_041 
  Scenario: [VISA] Ensure that guests user are able to place order using credit/debit card payment method for promotional products
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
 		And I Find "OMV Subscription" product using search function
 		And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
 		And I Select Subscription as "Single Purchase"
 		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		When I Find "HE OMD KLARNA PROMO" product using search function
 		And  I will verify "HE OMD KLARNA PROMO" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
 		Then  I Verify "3" item is added to the cart
 		#I verify promo price is displayed for the promo product
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
  	When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Amex Credit Card Details
    And   I click on Review and Place order button from Billing Page 
    
    
  @checkout @guest @cc @smoke @regression @TC_043
  Scenario: [VISA] As a guest user, checkout with OMD products and verify Edit link on Shipping Address (Review & Place Order) page with Credit card payment
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
		When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page 
		And I click "Edit Shipping Address" button on Checkout Review Page 
		And I edit the address and click on Save and Continue
		And   I verify the suggested address
    Then I verify shipping address is updated
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
   	When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page 
    
    
  @checkout @guest @cc @smoke @regression @TC_044 @Test 
  Scenario: [VISA] As a guest user, checkout with OMD products and verify Edit link on Contact Information block (Review & Place Order page) with Credit card payment
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
		When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Card Details
		And   I click on Review and Place order button from Billing Page
		And I click "Edit Contact Information" button on Checkout Review Page
		Then I verify "Checkout" is displayed
		When I click Save and Continue after updating email and phone number on shipping page
		And   I verify the suggested address
    Then I verify Contact Information is updated
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Card Details
    And   I click on Review and Place order button from Billing Page
    
 	@checkout @guest @cc @smoke @regression @TC_045 
  Scenario: [VISA] As a guest user, checkout with OMD products and verify Edit link on Payment method block (Review & Place Order page) with Credit card payment
		Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
		Then I verify Price Breakdown Order Summary section on cart page
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
		When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
		When  I choose the "Credit Card" radio button from Billing Page
   	Then  I will enter Card Details
		And   I click on Review and Place order button from Billing Page
		And I click "Edit Payment Method" button on Checkout Review Page
		Then I verify "Checkout" is displayed
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue Button
    
	  