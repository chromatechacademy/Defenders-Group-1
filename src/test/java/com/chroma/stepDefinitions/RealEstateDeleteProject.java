package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateNewProjectPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateDeleteProject extends PageInitializer {

    // Navigating to projects page
    @When("an admin navigates to Project page")
    public void an_admin_navigates_to_Project_page() {
        realEstateAdminDashboardPage.projectsTab.click();
    }

    // Determines if admin is on the project page
    @Then("admin is on the Project page {string}")
    public void admin_is_on_the_Project_page(String allProjects) {
        String actualAllProjectText = realEstateNewProjectPage.allProjectText.getText();
        CommonUtils.assertEquals(allProjects, actualAllProjectText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Navigating to New Projects page
    @When("an admin clicks on Add New Project button")
    public void an_admin_clicks_on_Add_New_Project_button() {
        realEstateNewProjectPage.addNewProjestButton.click();
    }

    // Determines if user is on the new project page
    @Then("admin is on the new project page {string}")
    public void admin_is_on_the_new_project_page(String newProject) {
        String actualNewProjectText = realEstateNewProjectPage.newProjectText.getText();
        CommonUtils.assertEquals(newProject, actualNewProjectText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Logging out of admin site
    @When("an admin logs out of the admin site")
    public void an_admin_logs_out_of_the_admin_site() {
        realEstateAdminAgentsPage.adminLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAdminAgentsPage.adminLogOutButton);
        realEstateAdminAgentsPage.adminLogOutButton.click();
    }

    // Lines 13-17 from feature file
    // Navigates to the Agent project page
    @When("an admin navigates to the Agent project page")
    public void an_admin_navigates_to_the_Agent_project_page() {
        CommonUtils.sleep(2000);
        realEstateAgentIndexPage.agentProjectLink.click();
        CommonUtils.sleep(2000);
    }

    //
    @Then("the created project is shown on the agent project page {string}")
    public void the_created_project_is_shown_on_the_agent_project_page(String garyTest) {
        CommonUtils.scrollIntoView(RealEstateNewProjectPage.garyTestProjectMethod(garyTest));
        String actualGaryTestText = RealEstateNewProjectPage.garyTestProjectMethod(garyTest).getText();
        CommonUtils.assertEquals(garyTest, actualGaryTestText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("an admin navigates to the Admin project page")
    public void an_admin_navigates_to_the_Admin_project_page() {
        CommonUtils.sleep(1000);
        realEstateAgentIndexPage.adminProjectLink.click();
        CommonUtils.sleep(1000);
        
    }

    //
    @When("the user archives the project {string}")
    public void the_user_archives_the_project(String settingPropertyButton) {
        CommonUtils.scrollIntoView(RealEstateNewProjectPage.settingsButtonProperty(settingPropertyButton));
        RealEstateNewProjectPage.settingsButtonProperty(settingPropertyButton).click();
        CommonUtils.sleep(3000);
    }

    //
    // @Then("the project is no longer in the active section")
    // public void the_project_is_no_longer_in_the_active_section() {
    // realEstateNewProjectPage.activeProject.click();
    // JavascriptExecutor js = (JavascriptExecutor) driver;
    // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    // CommonUtils.sleep(2000);
    // CucumberLogUtils.logExtentScreenshot();
    // CucumberLogUtils.logScreenShot();
    // }
}
