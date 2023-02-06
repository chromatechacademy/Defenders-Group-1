package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateNewProjectSteps;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateNewProjectStepDef extends PageInitializer {

    @Given("an admin user navigates to Project page")
    public void an_admin_user_navigates_to_Project_page() {
        realEstateNewProjectPage.projectsButton.click();
    }

    @When("an admin user clicks on Add New Project button")
    public void an_admin_user_clicks_on_Add_New_Project_button() {
        realEstateNewProjectPage.addNewProjestButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("an admin user fills out the Project Details information such as {string}, {string}, {string}, <{string}> {string}, {string}")
    public void an_admin_user_fills_out_the_Project_Details_information_such_as(String developer, String title,
            String level, String date, String street, String currency) {
        RealEstateNewProjectSteps.fillingOutNewProjectForm(developer, title, level, date, street, currency);
    }

    @Then("the new project has been added")
    public void the_new_project_has_been_added() {
        CommonUtils.scrollIntoView(realEstateNewProjectPage.projectLondon);
        String actualLondonText = realEstateNewProjectPage.projectLondon.getText();
        CommonUtils.assertEquals(actualLondonText, "London");
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}