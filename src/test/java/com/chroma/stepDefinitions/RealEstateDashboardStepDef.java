package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateDashboardStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateDashboardStepDef extends PageInitializer {

    // NAVIGATES TO AGENTS GRAPH
    @When("the admin clicks {string}")
    public void the_admin_clicks(String string) {
        realEstateDashboardPage.agentsGraphLink.click();
    }

    // DETERMINES IF HEADER IS DISPLAYED WITH GRAPH
    @Then("the graph {string} is displayed")
    public void the_graph_is_displayed(String reservedByAgent) {
        RealEstateDashboardStepImpl.graphIsDisplayed(reservedByAgent);
    }

    // NAVIGATES TO THE OVERVIEW GRAPH
    @When("the admin navigates to {string} page")
    public void the_admin_navigates_to_page(String string) {
        realEstateDashboardPage.overviewLink.click();
    }

    // DETERMINES IF HEADER IS DISPLAYED WITH GRAPH
    @Then("the graph {string} is shown")
    public void the_graph_is_shown(String propertiesOverview) {
        RealEstateDashboardStepImpl.headerAssertion(propertiesOverview);
    }
}