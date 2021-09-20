Feature: Global Navigation Bar

  Background:
    Given I am at LG Home Page

  @gnb @smoke @regression @TC_001
  Scenario: As a user I should be able to click on MOBILE link from GNB
    When I click on MOBILE link from GNB
    Then I should navigate to MOBILE landing page

  @gnb @smoke @regression @TC_002
  Scenario: As a user I should be able to click on TV/AUDIO/VIDEO link from GNB
    When I click on TV/AUDIO/VIDEO link from GNB
    Then I should navigate to TV/AUDIO/VIDEO landing page

  @gnb @smoke @regression @TC_003
  Scenario: As a user I should be able to click on KITCHEN link from GNB
    When I click on KITCHEN link from GNB
    Then I should navigate to KITCHEN landing page

  @gnb @smoke @regression @TC_004
  Scenario: As a user I should be able to click on LAUNDRY link from GNB
    When I click on LAUNDRY link from GNB
    Then I should navigate to LAUNDRY landing page

  @gnb @smoke @regression @TC_005
  Scenario: As a user I should be able to click on OTHER APPLIANCES link from GNB
    When I click on OTHER APPLIANCES link from GNB
    Then I should navigate to OTHER APPLIANCES landing page

  @gnb @smoke @regression @TC_006
  Scenario: As a user I should be able to click on COMPUTERS link from GNB
    When I click on COMPUTERS link from GNB
    Then I should navigate to COMPUTERS landing page

  @gnb @smoke @regression @TC_007
  Scenario: As a user I should be able to click on SOLAR link from GNB
    When I click on SOLAR link from GNB
    Then I should navigate to SOLAR landing page

  @gnb @smoke @regression @TC_008
  Scenario: As a user I should be able to click on SMALL BUSINESS link from GNB
    When I click on SMALL BUSINESS link from GNB
    Then I should navigate to SMALL BUSINESS landing page

  @gnb @smoke @regression @TC_009
  Scenario: As a user I should be able to click on SUPPORT link from GNB
    When I click on SUPPORT link from GNB
    Then I should navigate to SUPPORT landing page