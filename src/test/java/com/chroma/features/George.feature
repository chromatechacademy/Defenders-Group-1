Feature: George's Scenarios

  @CTSMSProgression @George @DF-17
  Scenario: Add and delete sections via the Academics module
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on Academics dropdown
    And admin selects Sections
    Then admin is directed to Sections page with the text "Add Section"
    When admin enters a "NEW"
    And admin clicks on the Save button
    Then Section is succesfully saved and confirmation message displays "Record Saved Successfully"
