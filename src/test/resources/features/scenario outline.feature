Feature: Login Functionality

  @login
  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters <Credentials Name> username and password
    And clicks the login button
    Then the user should be redirected to the homepage
    Examples:
      | Credentials Name |
      | valid            |
      | invalid          |

