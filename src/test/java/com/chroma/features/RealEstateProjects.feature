Feature: Projects Page Dropdown Elements

    @RealEstateRegression @Sarwar @DF-48
    Scenario Outline: Verify Elements on Projects Page
        Given an admin is on the Admin login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
        When the admin logins with valid credentials email "admin@mexil.it" and password "123456"
        Then the admin is landed on a home page with text "Hello, Admin"
        And admin clicks the projects dropdown on dashboard page
        Then the following elements should be displayed "Add New Project", "Projects", "Active", "Archived"
        
        Examples:
            | URL                                                                                   | EMAIL                 | PASSWORD | DASHBOARD URL                                                                         |
            | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php | admin@mexil.it        | 123456   | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php |
            