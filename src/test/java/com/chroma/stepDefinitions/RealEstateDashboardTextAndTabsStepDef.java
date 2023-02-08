package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateDashboardTextAndTabsStepDef extends PageInitializer {

    @Given("a real estate admin is on the login page {string}")
    public void a_real_estate_admin_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @Given("admin logs in with valid credentials email {string} and password {string}")
    public void admin_logs_in_with_valid_credentials_email_and_password(String email, String password){
        JavascriptUtils.scrollIntoView(realEstateAdminWelcomePage.logInButton);
        CommonUtils.sleep(3000);
        realEstateAdminWelcomePage.emailTextBox.sendKeys(email);
        realEstateAdminWelcomePage.passwordTextBox.sendKeys(password);
        realEstateAdminWelcomePage.logInButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("the admin should see the following elements {string}, {string}, {string}, {string}, {string}, {string} and the following tabs {string}, {string}, {string}")
    public void the_admin_should_see_the_following_elements_and_the_following_tabs(String dashboard, String helloAdmin,
            String overview, String agentsGraph, String propertiesOverview, String properties, String agentsTab, String dashboardTab,
            String projectsTab) {
        String actualDashboardElementText = realEstateAdminDashboardPage.dashboardElementText.getText();
        CommonUtils.assertTrue(actualDashboardElementText.contains(dashboard));
        String actualHelloAdminText = realEstateAdminDashboardPage.helloAdminText.getText();
        CommonUtils.assertTrue(actualHelloAdminText.contains(helloAdmin));
        String actualOverviewElementText = realEstateAdminDashboardPage.overviewText.getText();
        CommonUtils.assertTrue(actualOverviewElementText.contains(overview));
        String actualAgentsGraphText = realEstateAdminDashboardPage.agentsGraphText.getText();
        CommonUtils.assertTrue(actualAgentsGraphText.contains(agentsGraph));
        String actualPropertiesOverviewText = realEstateAdminDashboardPage.propertiesOverviewText.getText();
        CommonUtils.assertTrue(actualPropertiesOverviewText.contains(propertiesOverview));
        String actualPropertiesText = realEstateAdminDashboardPage.propertiesText.getText();
        CommonUtils.assertTrue(actualPropertiesText.contains(properties));
        String actualAgentsTabText = realEstateAdminDashboardPage.agentsTab.getText();
        CommonUtils.assertTrue(actualAgentsTabText.contains(agentsTab));
        String actualDashboardTabText = realEstateAdminDashboardPage.dashboardTab.getText();
        CommonUtils.assertTrue(actualDashboardTabText.contains(dashboardTab));
        String actualProjectsTabText = realEstateAdminDashboardPage.projectsTab.getText();
        CommonUtils.assertTrue(actualProjectsTabText.contains(projectsTab));
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
     }
}
