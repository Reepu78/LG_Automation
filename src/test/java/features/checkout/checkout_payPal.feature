Feature: Checkout Flow using PayPal Payment Method
  As a tester
  I want to ensure PayPal Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background:
    Given I am at LG Home Page

  @checkout @paypal @smoke @regression @TC_001
  Scenario: As a brand new guest, ensure user able to checkout OMV Subscription product with promotion code and standard shipping using PayPal
    Given I enter OMV subscription product Code into search edit box from GNB
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
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue Button

  @checkout @paypal @smoke @regression @TC_002
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
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue Button
    
  @checkout @paypal @smoke @regression @TC_003
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with overnight shipping
    Given I Find "OMV Non Subscription" product using search function
    Then  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page 
    Then  I will click on add to cart Button from Search Results Page for "OMV_Non_Subscription"
    And   I Click on "View cart" link
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
		#Paypal payment incomplete
	
  
  @checkout @paypal @smoke @regression @TC_004 @TestRun1
  Scenario: As a brand new guest, ensure user able to checkout OMV Non Subscription product with overnight shipping
    Given I Find "OMV Non Subscription" product using search function
    Then  I will verify "OMV Non Subscription" product displays in search results page and navigate to PDP page 
    Then  I will click on add to cart Button from Search Results Page for "OMV_Non_Subscription"
    And   I Click on "View cart" link
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
	#Paypal payment incomplete


  @checkout @paypal @smoke @regression @TC_005
  Scenario: As a guest user, checkout OMD HE Innovel product and Create an account from confirmation page
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
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    When  I will click on Paypal Pay with Debit or Credit Card Button
    Then  I will enter card Details on Paypal Page
    Then  I will enter contact Details on Paypal Page
    And   I will click on Continue Button
    
    
   @checkout @paypal @smoke @regression @TC_006
  Scenario: As a guest user, checkout OMD HE Non Innovel product 
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page 
    When  I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
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
		#Incomplete payment from 	paypal page onwards
		
   @checkout @paypal @smoke @regression @TC_007
  Scenario: As a guest user, checkout OMD HA Innovel product 
    Given I Find "OMD HA Innovel" product using search function
    Then  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page 
    When  I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
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
		#Incomplete payment from 	paypal page onwards
		
   @checkout @paypal @smoke @regression @TC_008
  Scenario: As a guest user, checkout OMD HA Non Innovel product  
    Given I Find "OMD HA Non Innovel" product using search function
    Then  I will verify "OMD HA Non Innovel" product displays in search results page and navigate to PDP page 
    When  I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
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
		#Incomplete payment from 	paypal page onwards

	@checkout @guest @klarna @smoke @regression @TC_009 @TestRun
  Scenario: As a guest user, checkout combination with OMD and OMV product
			Given I Find "OMV Subscription" product using search function
   		And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
			And I Select Subscription as "Single Purchase"
			When I Click on "Add to cart" link from PDP page
			And I Find "OMD HA Innovel" product using search function
   		And  I will verify "OMD HA Innovel" product displays in search results page and navigate to PDP page
			When I Click on "Add to cart" link
   		And I Click on "View cart" link
   		Then  I Verify "2" item is added to the cart
    	And I Input zipcode "CA" on price breakdown section and veirfy estimated tax is calculated
   		And   I click on Secure Checkout button	
    	And   I click on Continue as Guest from Sign in page
	    Then  I verify "Order Summary" is displayed
	    And   I click on Save and Continue button after fill out Shipping Info
	    And   I verify the suggested address
	    And I click "Overnight Shipping - 2 to 4 business days" button on checkout page
	    When  I click on Continue to Payment button
	    Then  I verify "Order Summary" is displayed
	    Then  I will see Payment method option list in Billing Page
	    When  I choose the "Paypal" radio button from Billing Page
	    And   I click on Review and Place order button from Billing Page
	    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
	    When  I will click on Paypal Pay with Debit or Credit Card Button
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
    And I verify the Accesory added to cart is still displayed
    
        
    @checkout @cart @smoke @regression @TC_021
    Scenario: As a brand new guest, ensure user able to checkout OMD innovel  product with promotion code using PayPal
    Given I Find "OMD HE Innovel" product using search function
    And  I will verify "OMD HE Innovel" product displays in search results page and navigate to PDP page
    When I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
    And I Input zipcode on price breakdown section and veirfy estimated tax is calculated
    Then I verify Order summay section price break down is correct
    When I will enter promo code
    #Then I should able to use promo code
    When I click on Secure Checkout button
    And  I click on Continue as Guest from Sign in page
    And  I click on Save and Continue button after fill out Shipping Info
    And  I verify the suggested address
    When I click on Continue to Payment button
    Then I will see Payment method option list in Billing Page
    When I choose the "Paypal" radio button from Billing Page
    And  I click on Review and Place order button from Billing Page
    And  I click on Place Order button after agreeing Terms and Conditions from Review Page
    #Incomplete payment from 	paypal page onwards

  @checkout @paypal @smoke @regression @TC_022
  Scenario: As a brand new guest, ensure user able to checkout OMD non innovel product with promotion code using PayPal
    Given I enter OMD HE Non Innovel product Code into search edit box from GNB
    When  I click on search icon from GNB
    Then  I will verify OMD HE Non Innovel product displays in search results page and navigate to PDP page
    When  I will enter zipCode for checking the delivery availability for OMD HE Non Innovel Product
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
    And   I will click on Continue Button
    #Paypal payment incomplete


    
    
    @checkout @paypal @smoke @regression @TC_023
    Scenario: As a brand new guest, ensure user able to checkout OMV one timer product with promotion code using PayPal
    Given I Find "OMV Subscription" product using search function
    And  I will verify OMV Subscription product displays in search results page
    Then I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    When I will enter promo code
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
		
		
		@checkout @paypal @smoke @regression @TC_024
		Scenario: As a guest user, checkout OMD HE Innovel product and Create an account from confirmation page
    Given I Find "OMD HE Innovel" product using search function
    Then  I will verify OMD HE Innovel product displays in search results page 
    When  I will enter zipCode for checking the delivery availability for OMD HE Innovel Product
    When 	I will enter promo code
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
    #Paypal payment incomplete
    
    
    @checkout @paypal @smoke @regression @TC_025
  	Scenario: As a guest user, checkout OMD HE Non Innovel product 
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify OMD HE Non Innovel product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMD_HE_Non_Innovel"
    And   I Click on "View cart" link
    When 	I will enter promo code
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
    #Paypal payment incomplete
    
    
    @checkout @paypal @smoke @regression @TC_033 @anees
  	Scenario: As a guest user, checkout with OMD products and verify Change shipping address on checkout(shipping) page with PayPal checkout
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify OMD HE Non Innovel product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMD_HE_Non_Innovel"
    And   I Click on "View cart" link
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
    #Paypal payment incomplete

    @checkout @paypal @smoke @regression @TC_034
  	Scenario: As a guest user, checkout with OMD products and verify Return to Shipping link on checkout(Payment & Billing) page with PayPal checkout
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify OMD HE Non Innovel product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMD_HE_Non_Innovel"
    And   I Click on "View cart" link
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
    #Paypal payment incomplete
    
    @checkout @paypal @smoke @regression @TC_035 
  	Scenario: As a guest user, checkout with OMD products and verify Edit cart link on checkout(Payment & Billing) page with PayPal checkout
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify OMD HE Non Innovel product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMD_HE_Non_Innovel"
    And   I Click on "View cart" link
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
    #Paypal payment incomplete
    
    
    @checkout @paypal @smoke @regression @TC_036 
  	Scenario: Ensure that guests user are able to place order using paypal payment method for promotional products
    Given I Find "OMD HE Non Innovel" product using search function
    Then  I will verify OMD HE Non Innovel product displays in search results page
    Then  I will click on add to cart Button from Search Results Page for "OMD_HE_Non_Innovel"
    And   I Click on "View cart" link
    Given I Find "OMV Subscription" product using search function
    And  I will verify OMV Subscription product displays in search results page
    Then I will click on add to cart Button from Search Results Page for "OMV_Subscription"
    Then  I will select the subscription Frequency as "0months"
    When  I will click on Proceed to Cart Button
    When  I click on Secure Checkout button
    And   I click on Continue as Guest from Sign in page
    And   I click on Save and Continue button after fill out Shipping Info
    And   I verify the suggested address
    When  I click on Continue to Payment button
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Paypal" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    #Paypal payment incomplete
    
    
