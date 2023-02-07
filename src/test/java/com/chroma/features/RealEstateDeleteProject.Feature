Feature: Deleting a Project

  @RealEstateProgression @Gary @DF-50
  Scenario Outline: Creating a new project and then deleting it
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    And an admin navigates to Project page
    Then admin is on the Project page
    When an admin clicks on Add New Project button
    Then admin is on the new project page
    When an admin user fills out the Project Details information such as "<DEVELOPER>", "<TITLE>", "<LEVEL>", <"DATE"> "<ADDRESS>", "<CURRENCY>"
    Then the new project has been added
    When an admin logs out of the admin site
    Then admin should be logged out and "Welcome" message should be displayed
    Given an admin is on the Agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    When the admin logins with valid Agent credentials email "<EMAIL>" and password "<PASSWORD>"
    Then the admin is landed on a Agent home page with text "<FIRSTNAME>"
    When an admin navigates to the project page
    Then admin is on the agent project page
    Then the created project is shown on the agent project page
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    When an admin navigates to the project page
    Then the created project is shown on the project page
    When the user archives the project

    Examples: 
      | DEVELOPER | TITLE    | LEVEL | ADDRESS   | CURRENCY | DATE       | EMAIL            | PASSWORD |
      | PandaCity | GaryTest |     6 | PandaLand | AUD      | 02/06/2023 | george@test4.com |   123456 |
