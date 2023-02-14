package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateDashboardTextAndTabsStepImpl;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateDashboardTextAndTabsStepDef extends PageInitializer {

    @Given("a real estate admin is on the login page {string}")
    public void a_real_estate_admin_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @Given("admin logs in with valid credentials email {string} and password {string}")
    public void admin_logs_in_with_valid_credentials_email_and_password(String email, String password) {
        RealEstateDashboardTextAndTabsStepImpl.adminLogsIn(email, password);
    }

    @Then("the admin should see the following elements {string}, {string}, {string}, {string}, {string}, {string} and the following tabs {string}, {string}, {string}")
    public void the_admin_should_see_the_following_elements_and_the_following_tabs(String dashboard, String helloAdmin,
            String overview, String agentsGraph, String propertiesOverview, String properties, String agentsTab,
            String dashboardTab,
            String projectsTab) {
        RealEstateDashboardTextAndTabsStepImpl.dashboardTextAssertion(dashboard, helloAdmin, overview, agentsGraph,
                propertiesOverview, properties, agentsTab, dashboardTab, projectsTab);

    }
}
