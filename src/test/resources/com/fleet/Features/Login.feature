@NegativeTest
Feature: Login

  @Login
  Scenario: User is unable to login with wrong credentials
    Given User goes to login page
    When I enter username as "Gabriel200"
    And I enter password as "AnyText"
    And I click 'Sign In'
    Then Login should fail