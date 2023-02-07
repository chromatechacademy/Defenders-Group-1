Feature: Real Estate 

@RealEstateProgression @Lili @DF-44
Scenario: Agents page text 
Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
And the admin clicks on the Agent Button
Then the following text is visiable "Members List", "Active", "Inactive", "All Agents", "Add Now", "NAME", "MAIL", "CONTACT NUMBER", "ACTIONS"