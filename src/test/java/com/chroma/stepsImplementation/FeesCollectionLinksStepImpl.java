package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class FeesCollectionLinksStepImpl extends PageInitializer {

    // Displaying sub links in Fees Collection
    public static void subLinksAssertion(String collectFees, String searchFeesPayment,
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
        CommonUtils.nonMobileScreenshots();
    }
}
