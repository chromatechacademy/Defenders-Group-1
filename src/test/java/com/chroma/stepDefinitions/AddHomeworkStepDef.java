package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AddHomeworkStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddHomeworkStepDef extends PageInitializer {

    // Admin user clicks on Homework link
    @When("an admin user clicks on Homework")
    public void an_admin_user_clicks_on_Homework() {
        AddHomeworkStepImpl.clickingOnHomeworkLink();
    }

    // Admin user sees "Add homework" sub link
    @Then("an admin user should see {string} link")
    public void an_admin_user_should_see_link(String subModuleLink) {
        AddHomeworkStepImpl.AddHomeworkAssertion(subModuleLink);
    }
}
