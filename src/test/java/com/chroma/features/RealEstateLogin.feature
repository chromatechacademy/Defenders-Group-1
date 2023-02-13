Feature: Real Estate Login

  @RealEstateRegression @George @DF-41 @RealEstateSmoke
  Scenario: Users should be able to login with valid credentials
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then the admin is landed on a home page with text "Hello, Admin"
    And admin logs out the admin site
    Then admin should be logged out and "Welcome" message should be displayed
    Given an admin is on the Agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    When the admin logins with valid Agent credentials email "george@test.com" and password "123456"
    When the admin logins with valid Agent credentials email "george@test9.com" and password "123456"
    Then the admin is landed on a Agent home page with text "George"
    And admin logs out the Agent site and "Welcome" message should be displayed
