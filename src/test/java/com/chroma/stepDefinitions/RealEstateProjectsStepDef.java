package com.chroma.stepDefinitions;

import com.chroma.pages.RealEstateProjectsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateProjectsStepDef {

    @Then("admin clicks the projects dropdown on dashboard page")
    public void admin_clicks_the_projects_dropdown_on_dashboard_page() {
        RealEstateProjectsPage.projectsTabPageElement.click();
        CommonUtils.sleep(2000);
    }

    @Then("the following elements should be displayed {string}, {string}, {string}, {string}")
    public void the_following_elements_should_be_displayed(String addNewProject, String projects, String active,
            String archived) {
        String actualAddNewProjectText = RealEstateProjectsPage.addNewProjectElement.getText();
        CommonUtils.assertTrue(actualAddNewProjectText.contains(addNewProject));
        String actualProjectsText = RealEstateProjectsPage.projectsPageElement.getText();
        CommonUtils.assertTrue(actualProjectsText.contains(projects));
        String actualActiveText = RealEstateProjectsPage.activeRadialButton.getText();
        CommonUtils.assertTrue(actualActiveText.contains(active));
        String actualArchivedText = RealEstateProjectsPage.archivedRadialButton.getText();
        CommonUtils.assertTrue(actualArchivedText.contains(archived));
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
