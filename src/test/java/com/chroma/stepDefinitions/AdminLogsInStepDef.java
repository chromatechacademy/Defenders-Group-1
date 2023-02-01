package com.chroma.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentLoginPage;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLogsInStepDef extends PageInitializer {

    StudentLoginPage loginPage = new StudentLoginPage();

    @Given("an admin user is on the login page {string}")
    public void an_admin_user_is_on_the_login_page(String url) throws IOException, InterruptedException {
        WebDriverUtils.driver.get(url);

    }

    @When("an admin user logins with valid credentials username {string} and password {string}")
    public void an_admin_user_logins_with_valid_credentials_username_and_password(String userName, String password)
            throws IOException {

        PageInitializer.studentLoginPage.userNameTextBox.sendKeys(userName);
        PageInitializer.studentLoginPage.passwordTextBox.sendKeys(password);
        PageInitializer.studentLoginPage.singInButton.click();

    }

    @Then("an admin is landed on a home page with URL {string}")
    public void an_admin_is_landed_on_a_home_page_with_URL(String url) {
        String actualHomePageUrl = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(url, actualHomePageUrl);

    }

    @When("an admin user clicks on Homework")
    public void an_admin_user_clicks_on_Homework() throws InterruptedException {
       PageInitializer.studentDashboardPage.homeworkLink.click();
       

    }

    @Then("an admin user should see {string} link")
    public void an_admin_user_should_see_link(String subModuleLink) {
        String actualSubLinkText = studentDashboardPage.subLinkHomework.getText();
        System.out.println("TEXT OF LINK " + actualSubLinkText);
        Assert.assertEquals(actualSubLinkText, subModuleLink);

    }
}
