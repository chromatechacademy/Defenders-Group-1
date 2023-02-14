Feature: Real Estate Dashboard

@RealEstateRegression @Gary @DF-43
  Scenario: Displaying two graphs
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then the admin is landed on a home page with text "Hello, Admin"
    When the admin clicks "Agents Graph"
    Then the graph "Reserved by Agents" is displayed
    When the admin navigates to "Overview" page
    Then the graph "Properties Overview" is shown
