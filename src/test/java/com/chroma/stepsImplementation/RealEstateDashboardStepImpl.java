package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateDashboardStepImpl extends PageInitializer {

    // DETERMINES IF HEADER IS DISPLAYED WITH GRAPH
    public static void graphIsDisplayed(String reservedByAgent) {
        CommonUtils.waitForVisibility(realEstateDashboardPage.reservedByAgentsText);
        String actualreservedByAgentText = realEstateDashboardPage.reservedByAgentsText.getText();
        CommonUtils.assertEquals(reservedByAgent, actualreservedByAgentText);
        CommonUtils.nonMobileScreenshots();
    }

    // DETERMINES IF HEADER IS DISPLAYED WITH GRAPH
    public static void headerAssertion(String propertiesOverview) {
        CommonUtils.waitForVisibility(realEstateDashboardPage.overviewLink);
        String actualpropertiesOverviewText = realEstateDashboardPage.propertiesOverviewText.getText();
        CommonUtils.assertEquals(propertiesOverview, actualpropertiesOverviewText);
        CommonUtils.nonMobileScreenshots();
    }
}
