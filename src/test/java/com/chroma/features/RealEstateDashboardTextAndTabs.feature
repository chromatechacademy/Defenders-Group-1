Feature: Real Estate Validate Dashboard Texts and Tabs Test Scenario

  @RealEstateRegression @Sarwar @DF-42 @RealEstateSmoke
  Scenario: Real Estate Dashboard Texts and Tabs
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then the admin is landed on a home page with text "Hello, Admin"
    Then the admin should see the following elements "Dashboard", "Hello, Admin", "Overview", "Agents Graph", "Properties Overview", "Properties" and the following tabs "Agents", "Dashboard", "Projects"
