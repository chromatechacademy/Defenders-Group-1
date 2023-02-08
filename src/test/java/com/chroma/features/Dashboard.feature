Feature: Display dashboard module

  @CTSMSRegression @DF-3 @Gary @CTSMSSmoke
  Scenario: Displaying Dashboard modules on portal
    Given an admin user is on the page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logs in with valid username "general@teacher.com" and password "123456"
    Then module "Student Information" , "Fees Collection", "Income" , "Expenses" , "Academics" , "Human Resource" , "Homework" , "Reports" are displayed
