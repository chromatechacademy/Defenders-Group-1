Feature: Student Admission

  @CTSMSRegression @Lili @DF-19 @CTSMSSmoke
  Scenario Outline: Admitting muiliple Students
    Given an admin user is on the login page "<URL>"
    When an admin user logins with valid credentials username "<USERNAME>" and password "<PASSWORD>"
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
    Then an admin navigates to Bulk Delete Submodule
    Then an admin selects Class "<CLASS>" and Section "<SECTION>"
    And clicks on Search button
    Then admitted student with student admission number "<ADMISSION NUMBER>" is deleted

    Examples: 
      | URL                                                 | USERNAME            | PASSWORD | ADMISSION NUMBER | CLASS          | SECTION                 | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | PHONE NUMBER |
      | https://mexil.it/chroma_tech_academy/dev/site/login | general@teacher.com |   123456 |         11211993 | Cyber Security | Networking Fundamentals | Liliya     | Thurman   | Female | 11/21/1993 | Sue          |   3019191183 |
      | https://mexil.it/chroma_tech_academy/dev/site/login | general@teacher.com |   123456 |         11211994 | Cyber Security | Networking Fundamentals | Mike       | Thurman   | Male   | 11/21/1994 | Sue          |   3019191183 |
      | https://mexil.it/chroma_tech_academy/dev/site/login | general@teacher.com |   123456 |         11211995 | Cyber Security | Networking Fundamentals | Kate       | Thurman   | Male   | 11/21/1996 | Sue          |   3019191183 |
