Feature: George's Scenarios

@CTSMSProgression @George @DF-17
Scenario: Add and delete sections via the Academics module
Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
When user logs in with valid credentials username "general@teacher.com" and password "123456" 
Then thefollowing modules should be displeyed "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resources", "Homework", "Reports"
 

