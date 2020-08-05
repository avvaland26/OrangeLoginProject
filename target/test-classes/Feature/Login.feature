Feature: Login feature

  @Test
  Scenario: User should be able to login successfully
    Given user is on loginPage
    When  user type valid username
    And   user type valid password
    And   user click on login button
    Then  user should be able to login successfully


  Scenario Outline: user should not be able to login successfully
    Given user is on loginPage
    When  user type "<invalid username>" and "<invalid password>"
    And   user click on login button
    Then  user should not be login successfully and see this "<message>"
    Examples:
      | invalid username | invalid password| message |
    |Admin             |                  | Password cannot be empty |
    |Admin             | kavya123         | Invalid credentials      |
    |                  | admin123         | Username cannot be empty |
    |                  |                  |Username cannot be empty  |
