Feature: Checkout Flow using Klarna Payment Method
  As a tester
  I want to ensure Klarna Checkout feature working as expected
  So that our end user can Shop from LG.com without any issues

  Background: 
    Given I am at LG Home Page

  @checkout @guest @klarna @smoke @regression @TC_001
  Scenario: As a brand new guest user, ensure user able to checkout the HE OMD Innoval Product with Klarna monthly installment
    Given I Find "HE OMD Klarna" product using search function
    And I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HE OMD Klarna" product
    When I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    Then I will select the "Standard" shipment Method
    When I click on Continue to Payment button
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    Then I verify Your tailored plan is displayed
    And I click on confirm button
    Then I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
    And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_002
  Scenario: As a brand new guest user, ensure user able to checkout HA OMD Innoval Product with monthly installment
    Given I Find "HA OMD Klarna" product using search function
    And I will verify "HA OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HA OMD Klarna" product
    And I Input ZipCode on price breakdown section and verify estimated tax is calculated
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    Then I verify Your tailored plan is displayed
    And I click on confirm button
    Then I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
    And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_003
  Scenario: As a brand new guest user, ensure user able to checkout HE OMD Innoval Product with financing
    Given I Find "HE OMD Klarna" product using search function
    And I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HE OMD Klarna" product
    When I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    Then I will select the "Standard" shipment Method
    When I click on Continue to Payment button
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    Then I verify Your tailored plan is displayed
    And I click on confirm button
    Then I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
    And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_004
  Scenario: As a brand new guest user, ensure user able to checkout HA OMD Innoval Product with financing
    Given I Find "HA OMD Klarna" product using search function
    And I will verify "HA OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HA OMD Klarna" product
    And I Input ZipCode on price breakdown section and verify estimated tax is calculated
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    Then I verify Your tailored plan is displayed
    And I click on confirm button
    Then I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
    And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_009
  Scenario: Ensure Guest user able to apply coupon code during Klarna checkout flow using OMD product
    Given I Find "HE OMD Klarna" product using search function
    And I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HE OMD Klarna" product
    When I Enter valid PromoCode under Promo Edit box
    And I Click on "Apply" button
    Then I Should see a validation message saying You used promotion code and Discount and Total price should reflect
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    And I verify Estimated Tax in Order Summary on checkout page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    Then I verify Your tailored plan is displayed
    And I click on confirm button
    Then I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
    And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_011
  Scenario: Change payment method from Klarna to Credit Card
    Given I Find "HE OMD Klarna" product using search function
    And I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HE OMD Klarna" product
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    When I choose the "Credit Card" radio button from Billing Page
    And I verify credit or debit card radio button selected
    Then I will enter Card Details
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_012 
  Scenario: Ensure Guest user should be able to change Billing address during checkout when payment method is Klarna
    Given I Find "HE OMD Klarna" product using search function
    And I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HE OMD Klarna" product
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click "Use a different billing address" button on checkout page
    Then I enter diff Address in Use a different billing address page
    And I click on Review and Place order button from Billing Page
    Then I verify user is on Review and Place order page and all the details are displayed correctly
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I Enter Klarna SSN Details
    Then I verify Your tailored plan is displayed
    And I click on confirm button
    Then I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
    And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_014
  Scenario: Ensure OMV product doesnt have Klarna payment option for Guest User
    Given I Find "OMV Subscription" product using search function
    And I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
    And I Select Subscription as "Single Purchase"
    When I Click on "Add to cart" link from PDP page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Buy Now. Pay Later" is not displayed

  @checkout @guest @klarna @smoke @regression @TC_015
  Scenario: As a guest user, checkout combination with OMD and OMV product
    Given I Find "HE OMD Klarna" product using search function
    And I will verify "HE OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HE OMD Klarna" product
    Given I Find "OMV Subscription" product using search function
    And I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
    And I Select Subscription as "Single Purchase"
    When I Click on "Add to cart" link from PDP page
    Then I Verify "2" item is added to the cart
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    Then I will select the "Overnight" shipment Method
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I verify "Buy Now. Pay Later" is not displayed

  @checkout @guest @klarna @smoke @regression @TC_024
  Scenario: As a guest user, checkout with OMD products and verify Edit cart link on checkout(shipping) page with Klarna checkout
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    And I Click on "Edit Cart" link
    Then I verify "Your Cart" is displayed
    When I update product quantity to "2"
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_025
  Scenario: As a guest user, checkout with OMD products and verify Change shipping address on checkout(shipping) page with Klarna checkout
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I verify shipping Address on Checkout page
    And I Click on "edit" link
    And I edit the address and click on Save and Continue
    And I verify the suggested address
    Then I verify shipping address is updated
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_026
  Scenario: As a guest user, checkout with OMD products and verify Return to Shipping link on checkout(Payment & Billing) page with Klarna checkout
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    And I click "Return to Shipping" button on checkout page
    Then I verify System should navigate the Shipping page
    Then I verify "Order Summary" is displayed
    And I click on save and continue button
    And I verify the suggested address
    And I click on Continue to Payment button
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_027
  Scenario: As a guest user, checkout with OMD products and verify Edit cart link on checkout(Payment & Billing) page with Klarna checkout
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    And I click on "Edit Cart" link on checkout page
    Then I verify "Your Cart" is displayed
    When I update product quantity to "2"
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_028
  Scenario: Ensure that guests user are able to place order using klarna payment method for promotional products
    Given I Find "OMD HE Non Innovel" product using search function
 		And  I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
 		Then  I Verify "1" item is added to the cart
		Then I verify Price Breakdown Order Summary section on cart page
 		And I Find "OMV Subscription" product using search function
 		And  I will verify "OMV Subscription" product displays in search results page and navigate to PDP page
 		And I Select Subscription as "Single Purchase"
 		When I Click on "Add to cart" link from PDP page
 		Then  I Verify "2" item is added to the cart
		When I Find "HE OMD KLARNA PROMO" product using search function
 		And  I will verify "HE OMD KLARNA PROMO" product displays in search results page and navigate to PDP page
		When I Click on "Add to cart" link from PDP page
 		And I Click on "View cart" link
 		Then  I Verify "3" item is added to the cart
 	  And I verify promo price is displayed for the promo product
		And I click on Secure Checkout button	
  	And I click on Continue as Guest from Sign in page
  	Then I verify "Shipping" is displayed
		Then  I verify "Order Summary" is displayed
    And  I click on Save and Continue button after fill out Shipping Info
		And I verify the suggested address
    When  I click on Continue to Payment button
    Then  I verify "Order Summary" is displayed
    Then  I will see Payment method option list in Billing Page
    When  I choose the "Klarna" radio button from Billing Page
    And   I click on Review and Place order button from Billing Page
    And   I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then  I Enter Klarna SSN Details
    Then  I verify Your tailored plan is displayed
    And I click on confirm button
    Then  I verify Review terms and apply is displayed
    And I click on checkBox in review terms and apply page
     And I click on agree and Submit button in review terms and apply page
    Then I verify confirmation page is displayed
    #pending

  @checkout @guest @klarna @smoke @regression @TC_030
  Scenario: As a guest user, checkout with OMD products and verify Edit link on Shipping Address (Review & Place Order) page with Klarna payment
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click "Edit Shipping Address" button on Checkout Review Page
    And I edit the address and click on Save and Continue
    And I verify the suggested address
    Then I verify shipping address is updated
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_031
  Scenario: As a guest user, checkout with OMD products and verify Edit link on Contact Information block (Review & Place Order page) with Klarna payment
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click "Edit Contact Information" button on Checkout Review Page
    Then I verify "Checkout" is displayed
    When I update email and phone number on shipping page
    And I click on save and continue button
    And I verify the suggested address
    Then I verify Contact Information is updated
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_032
  Scenario: As a guest user, checkout with OMD products and verify Edit link on Payment method block (Review & Place Order page) with Klarna payment
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click "Edit Payment Method" button on Checkout Review Page
    Then I verify "Checkout" is displayed
    When I choose the "Credit Card" radio button from Billing Page
    Then I will enter Card Details
    And I click on Review and Place order button from Billing Page
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_033
  Scenario: As a guest user, checkout with OMD products and verify Edit link on Billing Address block (Review & Place Order page) with Klarna payment
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click "Edit Billing Address" button on Checkout Review Page
    When I choose the "Klarna" radio button from Billing Page
    And I click "Use a different billing address" button on checkout page
    And I enter different Address in Use a different billing address section
    And I click on Review and Place order button from Billing Page
    Then I verify user is on Review and Place order page and all the details are displayed correctly
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed

  @checkout @guest @klarna @smoke @regression @TC_038
  Scenario: Verify Need Help? Call text and call number navigation of the header section in checkout page
    Given I Find "HA OMD Klarna" product using search function
    And I will verify "HA OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HA OMD Klarna" product
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I verify header section is displayed on shipping page
    When I click on Call Number
  	#Then I verify System is showing Make a call from popup
  
  @checkout @guest @klarna @smoke @regression @TC_039
  Scenario: Verify Delivery Notification on checkout page
    Given I Find "HA OMD Klarna" product using search function
    And I will verify "HA OMD Klarna" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I enter ZipCode to check the delivery availability for "HA OMD Klarna" product
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I verify footer displayed on shipping page

  @checkout @guest @klarna @smoke @regression @TC_040
  Scenario: Verify 'Need Help?' block on the footer section in checkout page
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify "Order Summary" is displayed
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    And I verify footer section is displayed on shipping page
    And I Click on "Frequently Asked Questions" link
    Then I verify the FAQ tab
    When I click on footer Call Number
    Then I click on footer Email us

  @checkout @guest @klarna @smoke @regression @TC_042
  Scenario: As a guest user, checkout with OMD products and verify Cart icon on checkout page with Klarna payment
    Given I Find "OMD HE Non Innovel" product using search function
    And I will verify "OMD HE Non Innovel" product displays in search results page and navigate to PDP page
    When I Click on "Add to cart" link from PDP page
    And I Click on "View cart" link
    Then I verify "Order Summary" is displayed
    Then I verify Price Breakdown Order Summary section on cart page
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    Then I verify "Order Summary" is displayed
    And I click on Cart icon
    Then I verify "Your Cart" is displayed
    When I update product quantity to "2"
    Then I Verify "2" item is added to the cart
    And I click on Secure Checkout button
    And I click on Continue as Guest from Sign in page
    Then I verify "Order Summary" is displayed
    And I click on Save and Continue button after fill out Shipping Info
    And I verify the suggested address
    When I click on Continue to Payment button
    Then I verify "Order Summary" is displayed
    Then I will see Payment method option list in Billing Page
    When I choose the "Klarna" radio button from Billing Page
    And I click on Review and Place order button from Billing Page
    And I click "Edit Billing Address" button on Checkout Review Page
    When I choose the "Klarna" radio button from Billing Page
    And I click "Use a different billing address" button on checkout page
    And I enter different Address in Use a different billing address section
    And I click on Review and Place order button from Billing Page
    Then I verify user is on Review and Place order page and all the details are displayed correctly
    And I click on Place Order button after agreeing Terms and Conditions from Review Page
    And I verify your Detail page and Input phone  number
    Then I enter the code
    And I click on confirm and continue button
    Then I verify confirmation page is displayed
