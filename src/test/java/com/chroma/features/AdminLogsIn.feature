Feature: Defenders - Project

  @CTSMSRegression @Lili @DF-1 @CTSMSSmoke 
  Scenario: Admin logins with valid credentials
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
