Feature: Security mechanism to prevent login 

  @CTSMSRegression @George @DF-2
  Scenario: Admin logins with valid credentials
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with invalid credentials username "general@teache.com" and password "12345"
    Then the the admin will not be able to log in and the the "Invalid Username or Password" should be displayed