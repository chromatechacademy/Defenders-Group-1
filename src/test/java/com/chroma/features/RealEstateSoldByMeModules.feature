Feature: Real Estate Validate Sold By and Reserved By Modules

@RealEstateRegression @Alex @DF-51
Scenario: Validate Sold By and Reserved By Modules
    Given an admin is on the Agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    When the admin logins with valid Agent credentials email "george@test4.com" and password "123456"
    Then the admin is landed on a Agent home page with text "Hello, George"
    And the agent is scroll down to Sold By Me and clicks on it
    Then a pop-up displays with the text: "ID", "PROJECT", "PRICE", "BEDS", "BATHS", "CARS", "CAR LOTS", "STORAGE LOTS", "LEVEL", "ASPECT", "TOTAL AREA", "STATUS", "SOLD BY"
    And the agent clicks on Close Button
    Then the agent clicks on Reserved By Me
    Then a pop-up window displays with the text: "ID", "PROJECT", "PRICE", "BEDS", "BATHS", "CARS", "CAR LOTS", "STORAGE LOTS", "LEVEL", "ASPECT", "TOTAL AREA", "STATUS", "RESERVED BY"