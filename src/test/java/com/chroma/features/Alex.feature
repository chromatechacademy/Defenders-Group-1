Feature: Alexandra Scenario

@CTSMSProgression @Alex @DF-4
Scenario: Checking Module Links
Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
And an admin clicks on "Student Information" module
Then the following modules should displayed: "Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Categories", "Student House", "Disable Reason"





   