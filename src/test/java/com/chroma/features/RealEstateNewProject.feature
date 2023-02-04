Feature: Real Estate

@CTSMSRegression @Lili
Scenario: Real Estate - New Project
Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
Then an admin user navigates to Project page
When an admin user clicks on Add New Project button
Then an admin user fills out the Project Details information
Then the new project has been added 



