Feature: George's Scenarios

@Student @George @RealEstate @DF1
Scenario: Inspecting Dashboard Module Links
Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
When user logs in with valid credentials username "general@teacher.com" and password "123456" 
Then thefollowing modules should be displeyed "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resources", "Homework", "Reports"
 

