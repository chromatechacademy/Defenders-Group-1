Feature: Student Admission

  @CTSMSRegression @George @DF-13 
  Scenario Outline: Verify if a student with the same admision number can't be added
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on "Student Information" module
    And navigates to Student Admission Submodule
    Then user is directed to Student Admission Page with the text "Student Admission"
    And enters Student unique Admission Number "<ADMISSION NUMBER>"
    And selects Class "<CLASS>" and Section "<SECTION>"
    And enters Students first "<FIRST NAME>" and last name "<LAST NAME>"
    And selects gender "<GENDER>"
    And enters Date of Birth "<DOB>"
    And enters Parent Guardian Details enters mothers name "<MOTHERS NAME>"
    And for If Gurdian Is clicks on Mother radio button
    And enters Guardian Phone Number "<PHONE NUMBER>"
    And clicks on the Save button
    Then student is succesfuly saved and confirmation message is displayed "Record Saved Successfully"
    And navigates to Student Admission Submodule
    And enters Student unique Admission Number "<ADMISSION NUMBER>"
    And selects Class "<CLASS>" and Section "<SECTION>"
    And enters Students first "<FIRST NAME>" and last name "<LAST NAME>"
    And selects gender "<GENDER>"
    And enters Date of Birth "<DOB>"
    And enters Parent Guardian Details enters mothers name "<MOTHERS NAME>"
    And for If Gurdian Is clicks on Mother radio button
    And enters Guardian Phone Number "<PHONE NUMBER>"
    And clicks on the Save button
    Then the Student is not admitted and "The Admission No field must contain a unique value." is displayed
    Then an admin navigates to Bulk Delete Submodule
    Then an admin selects Class "<CLASS>" and Section "<SECTION>"
    And clicks on Search button
    Then admitted student with student admission number "<ADMISSION NUMBER>" is deleted

    Examples: 
      | ADMISSION NUMBER | CLASS          | SECTION                 | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | GUARDIAN PHONE NUMBER |
      |        734757778 | Cyber Security | Networking Fundamentals | George     | One       | Female | 02/22/1991 | Jannet One   |            7026875816 |
