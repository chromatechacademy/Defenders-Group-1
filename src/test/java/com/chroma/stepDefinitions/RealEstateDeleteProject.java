package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
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
    @Then("admin is on the Project page")
    public void admin_is_on_the_Project_page(String allProject) {
        String actualAllProjectText = realEstateNewProjectPage.allProjectText.getText();
        CommonUtils.assertEquals(allProject, actualAllProjectText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Navigating to New Projects page
    @When("an admin clicks on Add New Project button")
    public void an_admin_clicks_on_Add_New_Project_button() {
        realEstateNewProjectPage.addNewProjestButton.click();
    }

    // Determines if user is on the new project page
    @Then("admin is on the new project page")
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

    // Navigates to the Agents project page
    @When("an admin navigates to the project page")
    public void an_admin_navigates_to_the_project_page() {
        realEstateAgentIndexPage.agentProjectLink.click();
    }

    // Determines if user is on the agents project page
    @Then("admin is on the agent project page")
    public void admin_is_on_the_agent_project_page(String headerProject) {
        String actualHeaderProjectText = realEstateNewProjectPage.headerProjectText.getText();
        CommonUtils.assertEquals(headerProject, actualHeaderProjectText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Displays the created project
    @Then("the created project is shown on the agent project page")
    public void the_created_project_is_shown_on_the_agent_project_page(String garyTest) {
        CommonUtils.scrollIntoView(realEstateNewProjectPage.garyTestproject);
        String actualGaryTestText = realEstateNewProjectPage.garyTestproject.getText();
        CommonUtils.assertEquals(garyTest, actualGaryTestText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // Displays the project on the Admin project page
    @Then("the created project is shown on the project page")
    public void the_created_project_is_shown_on_the_project_page(String garyTest) {
        CommonUtils.scrollIntoView(realEstateNewProjectPage.garyTestproject);
        String actualGaryTestText = realEstateNewProjectPage.garyTestproject.getText();
        CommonUtils.waitForVisibility(realEstateNewProjectPage.garyTestproject);
        CommonUtils.assertEquals(garyTest, actualGaryTestText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("the user archives the project")
    public void the_user_archives_the_project() {
        
    }
}
