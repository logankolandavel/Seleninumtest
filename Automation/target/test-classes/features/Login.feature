Feature: Application Login

	@mytest1
  Scenario Outline: Positive test validating login
    Given I am on login page with login
    When I Enter <username> and <password> and click with correct credentials
    Then I am able to login to the website

    Examples: 
      | username             | password |
      | klogu@hotmail.com    | Bcsme1   |
      | lkalpana@hotmail.com |     2343 |
