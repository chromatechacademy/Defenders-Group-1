Feature: Defenders - Project

@CTSMSRegression @DF-10 @Lili
  Scenario: Homework module has "Add homework" option
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When an admin user clicks on Homework
    Then an admin user should see "Add Homework" link