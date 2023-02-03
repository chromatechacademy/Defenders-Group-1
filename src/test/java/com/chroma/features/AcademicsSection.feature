Feature: Academics Section

  @CTSMSRegression @George @DF-17
  Scenario Outline: Add and delete sections via the Academics Submodule
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on "Academics" module
    And admin selects Sections
    Then admin is directed to Sections page with the text "Add Section"
    When admin enters Session "<SESSIONNAME>"
    And admin clicks on the Save button
    Then Section is succesfully saved and confirmation message displays "Record Saved Successfully"
    And admin clicks on the Section "<SESSIONNAME>" Delete button
    And Section is deleted

    Examples: 
      | SESSIONNAME |
      | Math        |
      | English     |
      | Chemistry   |
      | Geography   |
      | Arts        |