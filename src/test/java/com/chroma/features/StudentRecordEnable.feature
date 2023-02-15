Feature: Enable and disable student recods

  @CTSMSRegression @George @DF-16
  Scenario Outline: Ability to enable student records after disabling
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
    And admin clicks on "Student Information" module
    When an admin user navigates to the student details page "https://mexil.it/chroma_tech_academy/dev/student/search"
    And selects section "Cyber Security" and Section "Networking Fundamentals"
    And clicks Search button
    Then the admin should be on "Select Criteria" page
    And clicks on the Student Name with "<ADMISSION NUMBER>" Admission Number
    Then the admin should se the student First Name and Last Name "<FIRST NAME>" "<LAST NAME>"
    And the admin disable student records for "" as reason
    And the admin enable student records
    Then an admin navigates to Bulk Delete Submodule
    Then an admin selects Class "<CLASS>" and Section "<SECTION>"
    And clicks on Search button
    Then admitted student with student admission number "<ADMISSION NUMBER>" is deleted

    Examples: 
      | ADMISSION NUMBER | CLASS          | SECTION                 | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | GUARDIAN PHONE NUMBER |
      |            78135 | Cyber Security | Networking Fundamentals | George     | Disable   | Female | 02/22/1991 | Jannet One   |            7026875816 |
