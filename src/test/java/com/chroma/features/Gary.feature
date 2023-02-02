Feature:Test Scenarios

@Regression
Scenario: Displaying Dashboard modules on portal
Given an admin user is on the page "https://mexil.it/chroma_tech_academy/dev/site/login"
When an admin user logs in with valid username "general@teacher.com" and password "123456"
Then module "Student Information" , "Fees Collection", "Income" , "Expenses" , "Academics" , "Human Resource" , "Homework" , "Reports" are displayed 

@Test
Scenario: Dropdown menus in the student details sub module display
Given an admin user is on the page "https://mexil.it/chroma_tech_academy/dev/site/login"
When an admin user logs in with valid username "general@teacher.com" and password "123456"
And an admin user navigates to the student details sub module "https://mexil.it/chroma_tech_academy/dev/student/search"
When SDET is selected
And Section drop down is selected 
Then the following options are shown "Testing Fundamentals" , "SDLC Methodologies" , "Selenium Test Automation" , "Cucumber Fundamentals" , "API Testing" , "Git/GitHub", "Java 11 for Cool People" , "Mobile Test Automation" , "Accessibility Testing" , "Database Testing"
When Cyber Security is selected
And Section drop down is selected 
Then the following options are shown "Networking Fundamentals" , "Linux Fundamentals" , "CIA Triad" , "Penetration Testing/Ethical Hacking"

