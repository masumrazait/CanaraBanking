Feature: Login feature
  in order yyo perform successfull login
  as a User
  i have to enter correct username and password

  Scenario: Login to the Facebook Website as Valid User
    Given user navigates to the facebook website
    When user validate the homepage title
    Then user enter the "valid" userid
    And user enter the "valid" password
    And user click on login button

  Scenario: Login to the Facebook Website as Invalid User
    Given user navigates to the facebook website
    When user validate the homepage title
    Then user enter the "invalid" userid
    And user enter the "invalid" password
    And user click on login button
