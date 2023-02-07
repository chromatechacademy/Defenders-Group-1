Feature: Create new agent

  @RealEstateRegression @George @DF-47
  Scenario Outline: Adding a user with a unique name
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then the admin is landed on a home page with text "Hello, Admin"
    And the admin clicks on the Agent Button
    Then the admin will land on the Agents page with text "All Agents"
    And the admin clicks on the Add Now Button
    Then admin enters Agent info "<FIRSTNAME>" "<LASTNAME>" "<EMAIL>" "<CONTACTNUMBER>" "<PASSWORD>"
    And admin clicks Save
    Then admin goes to active members list
    Then admin checks if agent with email "<EMAIL>" was succesfully added
    And admin deletes the agent with emeil "<EMAIL>" from the Active Members List
    Then admin will navigate to Inactive Members List and check for agent with "<EMAIL>"
    And admin deletes the agent with email "<EMAIL>" from the Inctive Members List

    Examples: 
      | FIRSTNAME | LASTNAME | EMAIL              | CONTACTNUMBER | PASSWORD |
      | George    | Test2    | george@test100.com | 000-000-00000 |   123456 |
      | Mike      | Test3    | george@test101.com | 000-000-00000 |   123456 |
      | Anna      | Test4    | george@test102.com | 000-000-00000 |   123456 |
