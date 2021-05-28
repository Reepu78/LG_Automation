Feature: Search functionality
  As a tester
  I want to ensure functionality feature working as expected
  So that our end user can browse around in LG.com without any issues

  Background:
    Given I am at LG Home Page

  @search @smoke @regression
  Scenario: Verify user should be able to search OMD HA Innovel product
    Given I search for OMD HA Innovel product from GNB




  @search @smoke @regression
  Scenario: Verify user should be able to search OMD HA Non-Innovel product
    Given I search for OMD HA Non Innovel product from GNB


  @search @smoke @regression
  Scenario: Verify user should be able to search OMD HE Innovel product




  @search @smoke @regression
  Scenario: Verify user should be able to search OMD HE Non-Innovel product


  @search @omv @smoke @regression
  Scenario: Verify user should be able to search OMV Subscription product
    Given I enter for OMV subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMV Subscription product displays in search results page

  @search @omv @smoke @regression
  Scenario: Verify user should be able to search OMV Non Subscription product
    Given I enter for OMV Non subscription product Code into search edit box from GNB
    When I click on search icon from GNB
    Then I will verify OMV Non Subscription product displays in search results page