Feature: edit student records by searching student detail

  @CTSMSProgression @DF-14 @Gary
  Scenario: Edit a student details
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    When an admin user navigates to the student details page "https://mexil.it/chroma_tech_academy/dev/student/search"
    And selects section "Cyber Security" and Section "Networking Fundamentals"
    And clicks Search button
    And clicks the edit button of a student
    Then the user is on the page "https://mexil.it/chroma_tech_academy/dev/student/edit/719"
    When an admin edits information "Testing" of the user and clicks save
    Then the message Record Update "Record Update Successfully"
