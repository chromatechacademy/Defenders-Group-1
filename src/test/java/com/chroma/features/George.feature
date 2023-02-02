Feature: George's Scenarios

  @CTSMSRegression @George @DF-17
  Scenario Outline: Add and delete sections via the Academics Submodule
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on "Academics" module
    And admin selects Sections
    Then admin is directed to Sections page with the text "Add Section"
    When admin enters Session "<SESSIONNAME>"
    And admin clicks on the Save button
    Then Section is succesfully saved and confirmation message displays "Record Saved Successfully"
    And admin clicks on the Section "<SESSIONNAME>" Delete button
    And Section is deleted

    Examples: 
      | SESSIONNAME |
      | Math        |
      | English     |
      | Chemistry   |
      | Geography   |
      | Arts        |


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
    Then the Student is not admitted and "The Admission No field must contain a unique value" is displayed

    Examples: 
      | ADMISSION NUMBER | CLASS | SECTION              | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | GUARDIAN PHONE NUMBER |
      |         17777773 | SDET  | Testing Fundamentals | George     | One       | Female | 02/22/1991 | Jannet One   |            7026875816 |
      |         17777774 | SDET  | Testing Fundamentals | John       | Two       | Male   | 11/11/1992 | Jenny Two    |            5427658765 |
      |         17777775 | SDET  | Testing Fundamentals | Mary       | Three     | Female | 08/10/1993 | Carmen Three |            7031111111 |
      |         17777776 | SDET  | Testing Fundamentals | Mike       | Four      | Male   | 01/08/1994 | Withney Four |            5467895436 |
      |         17777777 | SDET  | Testing Fundamentals | Anna       | Five      | Female | 04/23/1995 | Tina Five    |            8796543451 |


  @CTSMSRegression @George @DF-20
  Scenario Outline: Add and delete Category via the Student Category Submodule
    Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
    Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And admin clicks on "Student Information" module
    And admin selects Student Categories
    Then admin is directed to CATEGORY page with the text "Create Category"
    When admin enters Category "<CATEGORY>"
    And admin clicks on the Category Save button
    Then Category is succesfully saved and confirmation message displays "Record Saved Successfully"
    And admin clicks on the Category "<CATEGORY>" Delete button
    And Category is deleted

    Examples: 
      | CATEGORY |
      | CAT A    |
      | CAT B    |
      | CAT C    |
      | CAT D    |
      | CAT E    |
