package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminInactiveAgentsPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class RealEstateAddDeletAgentStepImpl extends PageInitializer {

    /*
     * DELETING AGENT FROM ACTIVE MEMBER LIST
     */
    public static void deletingAdminFromActiveList(String activeAgentEmail) {
        RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(activeAgentEmail).click();
        CommonUtils
                .waitForVisibility(RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(activeAgentEmail));
        RealEstateAdminActiveAgentsPage.activeAgentDeleteLocator(activeAgentEmail).click();
    }

    /*
     * NAVIGATING TO INACTIVE MEMBER LIST END FIND INACTIVE AGENT
     */
    public static void findingInactiveAgent(String activeDeletedAgentEmail) {
        JavascriptUtils.clickByJS(realEstateAdminIndexPage.agentsButton);
        JavascriptUtils.clickByJS(realEstateAdminAgentsPage.inactiveMemberButton);
        JavascriptUtils
                .scrollIntoView(RealEstateAdminInactiveAgentsPage.inactiveAgentEmailLocator(activeDeletedAgentEmail));
        CommonUtils.sleep(500);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * DELETE INACTIVE AGENT
     */
    public static void inactiveAgentDeleted(String inactiveDeletedAgentEmail) {
        RealEstateAdminInactiveAgentsPage.inactiveAgentDeleteDropdownLocator(inactiveDeletedAgentEmail).click();
        CommonUtils
                .waitForVisibility(
                        RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(inactiveDeletedAgentEmail));
        RealEstateAdminInactiveAgentsPage.inactiveAgentDeleteLocator(inactiveDeletedAgentEmail).click();
        CommonUtils.nonMobileScreenshots();
    }
}
