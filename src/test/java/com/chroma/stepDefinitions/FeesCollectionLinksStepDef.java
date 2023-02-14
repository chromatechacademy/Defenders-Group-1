package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.FeesCollectionLinksStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeesCollectionLinksStepDef extends PageInitializer {

    // Admin user click on Fees Collection link
    @When("an admin user clicks on Fees Collection module")
    public void an_admin_user_clicks_on_Fees_Collection_module() {
        studentDashboardPage.feesCollectionLink.click();
    }

    // All sub links should be displayed
    @Then("all sublinks should be displayed such as {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void all_sublinks_should_be_displayed_such_as(String collectFees, String searchFeesPayment,
            String searchDueFees, String feesMaster, String feesGroup, String feesType, String feesDiscount,
            String feesCarryForward, String feesReminder) {
        FeesCollectionLinksStepImpl.subLinksAssertion(collectFees, searchFeesPayment, searchDueFees, feesMaster,
                feesGroup, feesType, feesDiscount, feesCarryForward, feesReminder);
    }
}