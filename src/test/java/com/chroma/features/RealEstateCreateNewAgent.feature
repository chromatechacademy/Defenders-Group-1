Feature: Create new agent

 @George @DF-45
  Scenario: Adding a user with a unique name
    Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    Then the admin is landed on a home page with text "Hello, Admin"
    And the admin clicks on the Agent Button
    Then the admin will land on the Agents page with text "All Agents"
    And the admin clicks on the Add Now Button
    Then admin enters Agent info "George" "Admission" "george@test.com" "999-999-9999" "123456"
    And admin clicks Save
    Then admin goes to active members list
    Then admin checks if agent with email "george@test.com" was succesfully added
    # And admin logs out the admin site
    # Then admin should be logged out and "Welcome" message should be displayed
    # Given an admin is on the Agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    # When the admin logins with valid Agent credentials email "george@test.com" and password "123456"
    # Then the admin is landed on a Agent home page with text "George"
    # And admin logs out the Agent site and "Welcome" message should be displayed
    # Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    # When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
    # Then the admin is landed on a home page with text "Hello, Admin"
    # And the admin clicks on the Agent Button
    # Then the admin will land on the Agents page with text "All Agents"
    # Then admin checks if agent with email "george@test.com" was succesfully added
    And admin deletes the agent with emeil "george@test.com" from the Active Members List
    Then admin will navigate to Inactive Members List and check for agent with "george@prast.com"
