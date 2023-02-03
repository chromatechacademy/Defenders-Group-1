Feature: Display classes and sections

@CTSMSRegression @DF-11
Scenario: Dispaying sections and classes under the Class sub module
Given an admin user is on the page "https://mexil.it/chroma_tech_academy/dev/site/login"
When an admin user logs in with valid username "general@teacher.com" and password "123456"
And an admin user navigates to the Class sub module "https://mexil.it/chroma_tech_academy/dev/classes"
Then SDET is displayed "SDET" with the following sections "Testing Fundamentals" , "SDLC Methodologies" , "Selenium Test Automation" , "Cucumber Fundamentals" , "API Testing" , "Git/GitHub", "Java 11 for Cool People" , "Mobile Test Automation" , "Accessibility Testing" , "Database Testing" 
Then Cyber Security is displayed "Cyber Security" with the following sections "Networking Fundamentals" , "Linux Fundamentals" , "CIA Triad" , "Penetration Testing/Ethical Hacking"