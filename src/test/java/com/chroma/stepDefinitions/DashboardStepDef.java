package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.DashboardStepImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDef extends PageInitializer {

    // Going to login page
    @Given("an admin user is on the page {string}")
    public void an_admin_user_is_on_the_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    // Logging in with credentials
    @When("an admin user logs in with valid username {string} and password {string}")
    public void a_user_logs_in_with_correct_information_and_password(String username, String password) {
        DashboardStepImpl.adminLogsIn(username, password);
    }

    // Asserting if module text is shown properly
    @Then("module {string} , {string}, {string} , {string} , {string} , {string} , {string} , {string} are displayed")
    public void modules_and_should_be_displayed(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports) {
        DashboardStepImpl.studentDashboardAssertion(studentInformation, feesCollection, income, expenses, academics,
                humanResource, homework, reports);
    }
}