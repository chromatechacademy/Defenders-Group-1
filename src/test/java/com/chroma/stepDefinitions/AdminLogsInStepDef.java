package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLogsInStepDef extends PageInitializer {

    // Admin user is on the log in page
    @Given("an admin user is on the login page {string}")
    public void an_admin_user_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    // Admin user logs in with valis credentials
    @When("an admin user logins with valid credentials username {string} and password {string}")
    public void an_admin_user_logins_with_valid_credentials_username_and_password(String userName, String password) {
        studentLoginPage.userNameTextBox.sendKeys(userName);
        studentLoginPage.passwordTextBox.sendKeys(password);
        studentLoginPage.signInButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    // Admin user is on the home page
    @Then("an admin is landed on a home page with URL {string}")
    public void an_admin_is_landed_on_a_home_page_with_URL(String url) {
        String actualHomePageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, actualHomePageUrl);
        CommonUtils.nonMobileScreenshots();
    }

}