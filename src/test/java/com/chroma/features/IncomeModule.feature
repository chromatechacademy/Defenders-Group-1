Feature: Income Module dropdown verification

  @CTSMSRegression @Sarwar @DF-6
  Scenario: Verify that the Income Module includes sections named Add Income, Search Income & Income Head
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And clicks on Income Module
    Then Sub Modules "Add Income", "Search Income", and "Income Head" display
