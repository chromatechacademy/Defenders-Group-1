Feature: Expense Module Feature

    @CTSMSRegression @Fharhan @DF-8
    Scenario: Checking Module Links
        Given an admin user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When an admin user logins with valid credentials username "general@teacher.com" and password "123456"
        Then an admin is landed on a home page with URL "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        When user clicks on Expense Module
        Then the following modules should display: "Add Expense", "Search Expense", "Expense Head"