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
        
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("the admin should see the following elements {string}, {string}, {string}, {string}, {string}, {string} and the following tabs {string}, {string}, {string}")
    public void the_admin_should_see_the_following_elements_and_the_following_tabs(String dashboard, String helloAdmin,
            String overview, String agentsGraph, String propertiesOverview, String properties, String agentsTab, String dashboardTab,
            String projectsTab) {
        
        String actualDashboardElementText = realEstateAdminDashboardPage.dashboardElementText.getText();
        CommonUtils.assertEquals(dashboard, actualDashboardElementText);
        
        String actualHelloAdminText = realEstateAdminDashboardPage.helloAdminText.getText();
        CommonUtils.assertEquals(helloAdmin, actualHelloAdminText);
        
        String actualOverviewElementText = realEstateAdminDashboardPage.overviewText.getText();
        CommonUtils.assertEquals(overview, actualOverviewElementText);
        
        String actualAgentsGraphText = realEstateAdminDashboardPage.agentsGraphText.getText();
        CommonUtils.assertEquals(agentsGraph, actualAgentsGraphText);
        
        String actualPropertiesOverviewText = realEstateAdminDashboardPage.propertiesOverviewText.getText();
        CommonUtils.assertEquals(propertiesOverview, actualPropertiesOverviewText);
        
        String actualPropertiesText = realEstateAdminDashboardPage.propertiesText.getText();
        CommonUtils.assertEquals(properties, actualPropertiesText);
        
        String actualAgentsTabText = realEstateAdminDashboardPage.agentsTab.getText();
        CommonUtils.assertEquals(agentsTab, actualAgentsTabText);
        
        String actualDashboardTabText = realEstateAdminDashboardPage.dashboardTab.getText();
        CommonUtils.assertEquals(dashboardTab, actualDashboardTabText);
        
        String actualProjectsTabText = realEstateAdminDashboardPage.projectsTab.getText();
        CommonUtils.assertEquals(projectsTab, actualProjectsTabText);
        
        CucumberLogUtils.logExtentScreenshot();
     }
}
