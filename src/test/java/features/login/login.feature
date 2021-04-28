Feature: Login

  @test
  Scenario: Login with valid email and password
    Given I am at LG Home Page
    Then I login as registered user
