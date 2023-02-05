Feature: edit student records by searching student detail

  @InProgress @DF-4 @Gary
  Scenario: Edit a student details
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin user is on the home page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When an admin user navigates to the student details page "https://mexil.it/chroma_tech_academy/dev/student/search"
    And selects section "Cyber security" and Section "Networking
