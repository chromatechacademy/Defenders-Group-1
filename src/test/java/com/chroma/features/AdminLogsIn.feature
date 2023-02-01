Feature: Defenders - Project

  @Regression
  Scenario: Admin logins with valid credentials
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"

  @Regression
  Scenario: Homework module has "Add homework" option
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When an admin user clicks on Homework
    Then an admin user should see "Add Homework" link

  @Regression
  Scenario: Fees Collection contains modules
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When an admin user clicks on Fees Collection module
    Then all sublinks should be displayed such as "Collect Fees","Search Fees Payment","Search Due Fees","Fees Master","Fees Group","Fees Type","Fees Discount","Fees Carry Forward","Fees Reminder"
