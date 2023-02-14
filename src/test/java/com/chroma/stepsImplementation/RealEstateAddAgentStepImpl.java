package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminAgentsPage;
import com.chroma.pages.RealEstateAdminInactiveAgentsPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class RealEstateAddAgentStepImpl extends PageInitializer {

    /*
     * ASSERTING THAT WE ARE ON THE ADMIN AGENTS PAGE
     */
    public static void adminAgentsPageAssertion(String expectedAllAgentsText) {
        String actualAllAgentsText = realEstateAdminIndexPage.allAgentsText.getText();
        CommonUtils.assertEquals(expectedAllAgentsText, actualAllAgentsText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ENTERING AGENT INFO
     */
    public static void enteringAdminsInformation(String agentFirstName, String agentLastName, String agentEmail,
            String agentPhone, String agentPassword) {
        realEstateAdminAgentsPage.enterAgentFirstName.sendKeys(agentFirstName);
        realEstateAdminAgentsPage.enterAgentLasttName.sendKeys(agentLastName);
        realEstateAdminAgentsPage.enterAgentEmail.sendKeys(agentEmail);
        realEstateAdminAgentsPage.enterAgentPhone.sendKeys(agentPhone);
        CommonUtils.sleep(500);
        realEstateAdminAgentsPage.enterAgentPassword.sendKeys(agentPassword);
        realEstateAdminAgentsPage.enterAgentCPassword.sendKeys(agentPassword);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * SAVE THE AGENT INFO
     */
    public static void savingAdminsInformation() {
        realEstateAdminAgentsPage.saveInfoButton.click();
        CommonUtils.sleep(500);
    }

    /*
     * ASSERTING IF AGENT IS SUCCESFULLY ADDED
     */
    public static void adminAddedAssertion(String expectedAgentEmail) {
        JavascriptUtils.scrollIntoView(RealEstateAdminAgentsPage.agentEmailLocator(expectedAgentEmail));
        String actualAgentEmail = RealEstateAdminAgentsPage.agentEmailLocator(expectedAgentEmail).getText();
        CommonUtils.assertEquals(expectedAgentEmail, actualAgentEmail);
        CommonUtils.sleep(500);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * DELETE AGENT FROM THE DATABASE
     */
    public static void deletingAdminFromDatabase(String deletinAgentEmail) {
        JavascriptUtils.clickByJS(realEstateAdminAgentsPage.activeMemberButton);
        JavascriptUtils.scrollIntoView(RealEstateAdminAgentsPage.agentEmailLocator(deletinAgentEmail));
        RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(deletinAgentEmail).click();
        CommonUtils
                .waitForVisibility(RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(deletinAgentEmail));
        RealEstateAdminActiveAgentsPage.activeAgentDeleteLocator(deletinAgentEmail).click();
        JavascriptUtils.clickByJS(realEstateAdminIndexPage.agentsButton);
        JavascriptUtils.clickByJS(realEstateAdminAgentsPage.inactiveMemberButton);
        JavascriptUtils
                .scrollIntoView(RealEstateAdminInactiveAgentsPage.inactiveAgentEmailLocator(deletinAgentEmail));
        CommonUtils.sleep(500);
        RealEstateAdminInactiveAgentsPage.inactiveAgentDeleteDropdownLocator(deletinAgentEmail).click();
        CommonUtils
                .waitForVisibility(
                        RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(deletinAgentEmail));
        RealEstateAdminInactiveAgentsPage.inactiveAgentDeleteLocator(deletinAgentEmail).click();
        CommonUtils.nonMobileScreenshots();
    }
}
