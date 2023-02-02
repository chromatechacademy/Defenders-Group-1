package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DashboardStepDef extends PageInitializer{

    @Given("a CTSMS user\\/admin is on the login page {string}")
    public void a_CTSMS_user_admin_is_on_the_login_page(String string) {
        
    }

    /* @When("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();
    } */

    /* @When("user clicks on student information dropdown")
    public void user_clicks_on_student_information_dropdown() {
        
    } */





    
}

