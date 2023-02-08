 Feature: Chategory Submodule

  @CTSMSRegression @George @DF-20
  Scenario Outline: Add and delete Category via the Student Category Submodule
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on "Student Information" module
    And admin selects Student Categories
    Then admin is directed to CATEGORY page with the text "Create Category"
    When admin enters Category "<CATEGORY>"
    And admin clicks on the Category Save button
    Then Category is succesfully saved and confirmation message displays "Save"
    And admin clicks on the Category "<CATEGORY>" Delete button
    And Category is deleted

    Examples: 
      | CATEGORY |
      | CAT A    |
