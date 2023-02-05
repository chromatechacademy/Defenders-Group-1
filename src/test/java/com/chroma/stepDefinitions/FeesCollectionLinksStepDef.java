package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
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
        String collectFeesIsDisplayed = studentDashboardPage.subLinkCollectFees.getText();
        CommonUtils.assertEquals(collectFees, collectFeesIsDisplayed);
        CommonUtils.sleep(1000);
        String searchFeesPaymentIsDisplayed = studentDashboardPage.subLinkSearchFeesPayment.getText();
        CommonUtils.assertEquals(searchFeesPayment, searchFeesPaymentIsDisplayed);
        String searchDueFeesIsDisplayed = studentDashboardPage.subLinkSearchDueFees.getText();
        CommonUtils.assertEquals(searchDueFees, searchDueFeesIsDisplayed);
        String feesMasterIsDisplayed = studentDashboardPage.subLinkFeesMaster.getText();
        CommonUtils.assertEquals(feesMaster, feesMasterIsDisplayed);
        String feesGroupIsDisplayed = studentDashboardPage.subLinkFeesGroup.getText();
        CommonUtils.assertEquals(feesGroup, feesGroupIsDisplayed);
        String feesTypeIsDisplayed = studentDashboardPage.subLinkFeesType.getText();
        CommonUtils.assertEquals(feesType, feesTypeIsDisplayed);
        String feesDiscountIsDisplayed = studentDashboardPage.subLinkFeesDiscount.getText();
        CommonUtils.assertEquals(feesDiscount, feesDiscountIsDisplayed);
        String feesCarryForwardIsDisplayed = studentDashboardPage.subLinkFeesCarryForward.getText();
        CommonUtils.assertEquals(feesCarryForward, feesCarryForwardIsDisplayed);
        String feesReminderIsDisplayed = studentDashboardPage.subLinkFeesReminder.getText();
        CommonUtils.assertEquals(feesReminder, feesReminderIsDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}