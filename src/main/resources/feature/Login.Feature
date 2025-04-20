Feature: User login to automation web
  @smo
  Scenario: VALID LOGIN
    Given user navigate to automation web
    When user click on Signup or Login button
    And user Enter email address "<salma@gmail.com>"
    And user Enter password "<55555>"
    And user click on login button
    Then web will show error message

  Scenario Outline: INVALID LOGIN
    Given user navigate to automation web
    When user click on Signup or Login button
    And user Enter email address "<user>"
    And user Enter password "<password>"
    And user click on login button
    Then web will show error message



    Examples:
      | user             | password |
      | salma@gmail.com  | 55555    |
      | ALI@gmail.com    | 5FDF85   |
      | BO@gmail.com     | 45FDF5   |
      |                  |          |
