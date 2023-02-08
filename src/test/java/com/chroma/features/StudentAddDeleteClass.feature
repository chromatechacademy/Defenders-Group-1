Feature: Academics Class

  @CTSMSRegression @George @DF-18
  Scenario Outline: Add and delete sections via the Academics Submodule
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on "Academics" module
    And admin selects Class
    Then admin is directed to Classes page with the text "Add Class"
    When admin enters Class "<CLASS>"
    And selects a Section "<SECTION>"
    And admin clicks on the Save button
    Then Class is succesfully saved and confirmation message displays "Record Saved Successfully"
    And admin clicks on the Class "<CLASS>" Delete button
    And Class is deleted

    Examples: 
      | CLASS | SECTION     |
      | Math  | API Testing |
