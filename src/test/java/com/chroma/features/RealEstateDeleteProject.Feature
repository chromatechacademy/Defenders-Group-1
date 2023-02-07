Feature: Deleting a Project

    @RealEstateInProgress @Gary @DF50
  Scenario: Creating a new project and then deleting it
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then an admin user navigates to Project page
    When an admin user clicks on Add New Project button
    Then an admin user fills out the Project Details information such as "<DEVELOPER>", "<TITLE>", "<LEVEL>", <"DATE"> "<ADRESS>", "<CURRENCY>"
    Then the new project has been added
    When an admin logs out of the admin site
    Then admin should be logged out and "Welcome" message should be displayed
    Given an admin is on the Agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"

