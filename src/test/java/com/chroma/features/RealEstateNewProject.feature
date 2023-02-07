Feature: Real Estate

  @RealEstateProgression @Lili @DF-49
  Scenario Outline: Real Estate - New Project
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then an admin user navigates to Project page
    When an admin user clicks on Add New Project button
    Then an admin user fills out the Project Details information such as "<DEVELOPER>", "<TITLE>", "<LEVEL>", <"DATE"> "<ADRESS>", "<CURRENCY>"
    Then the new project has been added

    Examples: 
      | DEVELOPER  | TITLE | LEVEL | ADRESS      | CURRENCY | DATE       |
      | Anna Smith | Spain |     3 | Sunshine St | AUD      | 02/06/2023 |
