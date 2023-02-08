Feature: Deleting a Project

  @RealEstateProgression @Gary @DF-50
  Scenario Outline: Creating a new project and then deleting it
    # Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    # When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    # And an admin navigates to Project page
    # Then admin is on the Project page "All Projects"
    # When an admin clicks on Add New Project button
    # Then admin is on the new project page "New Project"
    # When an admin user fills out the Project Details information such as "<DEVELOPER>", "<TITLE>", "<LEVEL>", <"DATE"> "<ADDRESS>", "<CURRENCY>"
    # When an admin logs out of the admin site
    # Then admin should be logged out and "Welcome" message should be displayed
    Given an admin is on the Agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    When the admin logins with valid Agent credentials email "<EMAIL>" and password "<PASSWORD>"
    Then the admin is landed on a Agent home page with text "<FIRSTNAME>"
    When an admin navigates to the Agent project page
    Then the created project is shown on the agent project page "<TITLE>"
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    When an admin navigates to the Admin project page
    When the user archives the project "<TITLE>"
    #Then the project is no longer in the active section

    Examples: 
      | DEVELOPER | TITLE     | LEVEL | ADDRESS   | CURRENCY | DATE       | EMAIL            | PASSWORD |FIRSTNAME| 
    | PandaCity | Baltimore |     6 | PandaLand | AUD      | 02/06/2023 | george@test4.com |   123456 |George|
