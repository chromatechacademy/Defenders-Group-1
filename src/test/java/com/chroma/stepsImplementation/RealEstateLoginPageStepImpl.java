package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateAgentIndexPage;
import com.chroma.web.CommonUtils;

public class RealEstateLoginPageStepImpl extends PageInitializer {

    /*
     * SENDING ADMIN'S EMAIL AND PASSWORD TO TEXTBOXES
     */
    public static void adminLogsIn(String email, String password) {
        realEstateAdminWelcomePage.emailTextBox.sendKeys(email);
        realEstateAdminWelcomePage.passwordTextBox.sendKeys(password);
        CommonUtils.nonMobileScreenshots();
        realEstateAdminWelcomePage.logInButton.click();
    }

    /*
     * ASSERTING THAT WE ARE ON THE ADMIN INDEX PAGE
     */
    public static void homePageAssertion(String expectedAgentsText) {
        String actualAgetntsText = realEstateAdminIndexPage.helloAdminText.getText();
        CommonUtils.assertEquals(expectedAgentsText, actualAgetntsText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * LOGGING OUT OF ADMIN PORTAL
     */
    public static void logingOutOfAdminPortal() {
        realEstateAdminAgentsPage.adminLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAdminAgentsPage.adminLogOutButton);
        realEstateAdminAgentsPage.adminLogOutButton.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS LOGGED OUT
     */
    public static void loggedOutAssertion(String expectedAdminWelcomeText) {
        String actualAdminWelcomeText = realEstateAdminWelcomePage.adminWelcomeText.getText();
        CommonUtils.assertEquals(expectedAdminWelcomeText, actualAdminWelcomeText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ENTERING AGENT CREDENTIALS
     */
    public static void agentCredentials(String agentEmail,
            String agentPassword) {
        realEstateAdminWelcomePage.emailTextBox.sendKeys(agentEmail);
        realEstateAdminWelcomePage.passwordTextBox.sendKeys(agentPassword);
        CommonUtils.nonMobileScreenshots();
        realEstateAdminWelcomePage.logInButton.click();
    }

    /*
     * ASSERTING THAT ADMIN IS ON THE AGENT INDEX PAGE
     */
    public static void agentHomePageAssertion(String expectedHelloChromaText) {
        String actualHelloChromaText = realEstateAgentIndexPage.helloChromaTechText.getText();
        CommonUtils.assertEquals(RealEstateAgentIndexPage.agentHelloFirstName(expectedHelloChromaText),
                actualHelloChromaText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * LOGGING OUT ASSERTING THAT THE ADMIN IS ON THE AGENT WELCOME PAGE
     */
    public static void welcomePageAssertion(String expectedAgentWelcomeText) {
        realEstateAgentIndexPage.agentLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAdminAgentsPage.adminLogOutButton);
        realEstateAgentIndexPage.agentLogOutButton.click();
        String actualAgentWelcomeText = realEstateAgentWelcomePage.agentWelcomeText.getText();
        CommonUtils.assertEquals(expectedAgentWelcomeText, actualAgentWelcomeText);
        CommonUtils.nonMobileScreenshots();
    }
}
