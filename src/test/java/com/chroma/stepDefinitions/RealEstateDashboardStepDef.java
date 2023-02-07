package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
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
        CommonUtils.waitForVisibility(realEstateDashboardPage.reservedByAgentsText);
        String actualreservedByAgentText = realEstateDashboardPage.reservedByAgentsText.getText();
        CommonUtils.assertEquals(reservedByAgent, actualreservedByAgentText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    // NAVIGATES TO THE OVERVIEW GRAPH
    @When("the admin navigates to {string} page")
    public void the_admin_navigates_to_page(String string) {
        realEstateDashboardPage.overviewLink.click();
    }

    // DETERMINES IF HEADER IS DISPLAYED WITH GRAPH
    @Then("the graph {string} is shown")
    public void the_graph_is_shown(String propertiesOverview) {
        CommonUtils.waitForVisibility(realEstateDashboardPage.overviewLink);
        String actualpropertiesOverviewText = realEstateDashboardPage.propertiesOverviewText.getText();
        CommonUtils.assertEquals(propertiesOverview, actualpropertiesOverviewText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
