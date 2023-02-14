package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateLoginPageStepImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateLoginPageStepDef extends PageInitializer {

    /*
     * NAVIGATING TO REAL ESTATE ADMIN URL
     */
    @Given("an admin is on the Admin login page {string}")
    public void an_admin_is_on_the_Admin_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    /*
     * SENDING ADMIN'S EMAIL AND PASSWORD TO TEXTBOXES
     */
    @When("the admin logins with valid credentials email {string} and password {string}")
    public void the_admin_logins_with_valid_credentials_email_and_password(String email, String password) {
        RealEstateLoginPageStepImpl.adminLogsIn(email, password);
    }

    /*
     * ASSERTING THAT WE ARE ON THE ADMIN INDEX PAGE
     */
    @Then("the admin is landed on a home page with text {string}")
    public void the_admin_is_landed_on_a_home_page_with_text(String expectedAgentsText) {
        RealEstateLoginPageStepImpl.homePageAssertion(expectedAgentsText);
    }

    /*
     * LOGGING OUT OF ADMIN PORTAL
     */
    @Then("admin logs out the admin site")
    public void admin_logs_out_the_admin_site() {
        RealEstateLoginPageStepImpl.logingOutOfAdminPortal();
    }

    /*
     * ASSERTING THAT THE ADMIN IS LOGGED OUT
     */
    @Then("admin should be logged out and {string} message should be displayed")
    public void admin_should_be_logged_out_and_message_should_be_displayed(String expectedAdminWelcomeText) {
        RealEstateLoginPageStepImpl.loggedOutAssertion(expectedAdminWelcomeText);
    }

    /*
     * NAVIGATES TO AGENT LOG IN PAGE
     */
    @Given("an admin is on the Agent login page {string}")
    public void an_admin_is_on_the_Agent_login_page(String agentURL) {
        WebDriverUtils.driver.get(agentURL);
    }

    /*
     * ENTERING AGENT CREDENTIALS
     */
    @When("the admin logins with valid Agent credentials email {string} and password {string}")
    public void the_admin_logins_with_valid_Agent_credentials_email_and_password(String agentEmail,
            String agentPassword) {
        RealEstateLoginPageStepImpl.agentCredentials(agentEmail, agentPassword);
    }

    /*
     * ASSERTING THAT ADMIN IS ON THE AGENT INDEX PAGE
     */
    @Then("the admin is landed on a Agent home page with text {string}")
    public void the_admin_is_landed_on_a_Agent_home_page_with_text(String expectedHelloChromaText) {
        RealEstateLoginPageStepImpl.agentHomePageAssertion(expectedHelloChromaText);
    }

    /*
     * LOGGING OUT ASSERTING THAT THE ADMIN IS ON THE AGENT WELCOME PAGE
     */
    @Then("admin logs out the Agent site and {string} message should be displayed")
    public void admin_logs_out_the_Agent_site_and_message_should_be_displayed(String expectedAgentWelcomeText) {
        RealEstateLoginPageStepImpl.welcomePageAssertion(expectedAgentWelcomeText);
    }
}