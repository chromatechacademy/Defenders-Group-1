package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class RealEstateDashboardTextAndTabsStepImpl extends PageInitializer {

    public static void adminLogsIn(String email, String password) {
        JavascriptUtils.scrollIntoView(realEstateAdminWelcomePage.logInButton);
        CommonUtils.sleep(3000);
        realEstateAdminWelcomePage.emailTextBox.sendKeys(email);
        realEstateAdminWelcomePage.passwordTextBox.sendKeys(password);
        realEstateAdminWelcomePage.logInButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    public static void dashboardTextAssertion(String dashboard, String helloAdmin,
            String overview, String agentsGraph, String propertiesOverview, String properties, String agentsTab,
            String dashboardTab,
            String projectsTab) {
        String actualDashboardElementText = realEstateAdminDashboardPage.dashboardElementText.getText();
        CommonUtils.assertTrue(actualDashboardElementText.contains(dashboard));
        String actualHelloAdminText = realEstateAdminDashboardPage.helloAdminText.getText();
        CommonUtils.assertTrue(actualHelloAdminText.contains(helloAdmin));
        String actualOverviewElementText = realEstateAdminDashboardPage.overviewText.getText();
        CommonUtils.assertTrue(actualOverviewElementText.contains(overview));
        String actualAgentsGraphText = realEstateAdminDashboardPage.agentsGraphText.getText();
        CommonUtils.assertTrue(actualAgentsGraphText.contains(agentsGraph));
        String actualPropertiesOverviewText = realEstateAdminDashboardPage.propertiesOverviewText.getText();
        CommonUtils.assertTrue(actualPropertiesOverviewText.contains(propertiesOverview));
        String actualPropertiesText = realEstateAdminDashboardPage.propertiesText.getText();
        CommonUtils.assertTrue(actualPropertiesText.contains(properties));
        String actualAgentsTabText = realEstateAdminDashboardPage.agentsTab.getText();
        CommonUtils.assertTrue(actualAgentsTabText.contains(agentsTab));
        String actualDashboardTabText = realEstateAdminDashboardPage.dashboardTab.getText();
        CommonUtils.assertTrue(actualDashboardTabText.contains(dashboardTab));
        String actualProjectsTabText = realEstateAdminDashboardPage.projectsTab.getText();
        CommonUtils.assertTrue(actualProjectsTabText.contains(projectsTab));
        CommonUtils.nonMobileScreenshots();
    }
}
