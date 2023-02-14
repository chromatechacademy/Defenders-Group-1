package com.chroma.stepDefinitions;

import com.chroma.stepsImplementation.RealEstateProjectsStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateProjectsStepDef {

    /* Admin click on the projects dropdown on dashboard page */
    @Then("admin clicks the projects dropdown on dashboard page")
    public void admin_clicks_the_projects_dropdown_on_dashboard_page() {
        RealEstateProjectsStepImpl.dashboardDropDown();
    }

    /* Elements to be displayed */
    @Then("the following elements should be displayed {string}, {string}, {string}, {string}")
    public void the_following_elements_should_be_displayed(String addNewProject, String projects, String active,
            String archived) {
        RealEstateProjectsStepImpl.elementsDisplayed(addNewProject, projects, active, archived);
    }
}
