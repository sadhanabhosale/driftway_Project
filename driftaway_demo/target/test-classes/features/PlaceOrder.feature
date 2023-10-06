@PlaceOrder
Feature: Place order feature

  @PlaceOrderSC_01
  Scenario: Place order with valid Credentials
    Given I open application url
    And Navigate to homepage
    And I change country
    When I select coffee type
    And I choose future deliveries
    And I select how often
    And I select how long
    And I click on next button
#    When I click add button of aeropress coffee maker
#    And I click on next button of gear page
    Then I redirect on delivery page
    When I select delivery option
    And Fill delivery details
    And Click on next button of delivery page
    Then I select timing
    And click on next button of timing page
    Then I click on next button of review page
    And I enter valid password in password field of account page
    And I click on sign up button
    And I change country flag
    When I click on newsletter checkbox
    And I click on billing check box
    And I fill all payment details
    And Click on place order button



