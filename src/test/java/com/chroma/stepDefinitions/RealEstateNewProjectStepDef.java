package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateNewProjectStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateNewProjectStepDef extends PageInitializer {

    // NAVIGATING TO PROJECT PAGE
    @Given("an admin user navigates to Project page")
    public void an_admin_user_navigates_to_Project_page() {
        realEstateNewProjectPage.projectsButton.click();
    }

    // CLICKING ON ADD NEW BUTTON
    @When("an admin user clicks on Add New Project button")
    public void an_admin_user_clicks_on_Add_New_Project_button() {
        RealEstateNewProjectStepImpl.newButton();
    }

    // FILLING OUT PROJECT DETAILS INFORMATION
    @Then("an admin user fills out the Project Details information such as {string}, {string}, {string}, <{string}> {string}, {string}")
    public void an_admin_user_fills_out_the_Project_Details_information_such_as(String developer, String title,
            String level, String date, String street, String currency) {
        RealEstateNewProjectStepImpl.fillingOutNewProjectForm(developer, title, level, date, street, currency);
    }

    // VERIFYING NEW PROJECT HAS BEEN ADDED
    @Then("the new project {string} has been added")
    public void the_new_project_has_been_added(String project) {
        RealEstateNewProjectStepImpl.addNewProject(project);
    }
}
