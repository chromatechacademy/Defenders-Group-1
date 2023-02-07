package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminAgentsPage;
import com.chroma.pages.RealEstateAdminInactiveAgentsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;

public class RealEstateAddAgentStepDef extends PageInitializer {

    /*
     * CLICKING ON THE AGENTS BUTTON
     */
    @Then("the admin clicks on the Agent Button")
    public void the_admin_clicks_on_the_Agent_Button() {
        realEstateAdminIndexPage.agentsButton.click();
    }

    /*
     * ASSERTING THAT WE ARE ON THE ADMIN AGENTS PAGE
     */
    @Then("the admin will land on the Agents page with text {string}")
    public void the_admin_will_land_on_the_Agents_page_with_text(String expectedAllAgentsText) {
        String actualAllAgentsText = realEstateAdminIndexPage.allAgentsText.getText();
        CommonUtils.assertEquals(expectedAllAgentsText, actualAllAgentsText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * CLICKING ON THE ADD NOW BUTTON
     */
    @Then("the admin clicks on the Add Now Button")
    public void the_admin_clicks_on_the_Add_Now_Button() {
        realEstateAdminAgentsPage.addNowButton.click();
    }

    /*
     * ENTERING AGENT INFO
     */
    @Then("admin enters Agent info {string} {string} {string} {string} {string}")
    public void admin_enters_Agent_info(String agentFirstName, String agentLastName, String agentEmail,
            String agentPhone, String agentPassword) {
        realEstateAdminAgentsPage.enterAgentFirstName.sendKeys(agentFirstName);
        realEstateAdminAgentsPage.enterAgentLasttName.sendKeys(agentLastName);
        realEstateAdminAgentsPage.enterAgentEmail.sendKeys(agentEmail);
        realEstateAdminAgentsPage.enterAgentPhone.sendKeys(agentPhone);
        CommonUtils.sleep(500);
        realEstateAdminAgentsPage.enterAgentPassword.sendKeys(agentPassword);
        realEstateAdminAgentsPage.enterAgentCPassword.sendKeys(agentPassword);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * SAVE THE AGENT INFO
     */
    @Then("admin clicks Save")
    public void admin_clicks_Save() {
        realEstateAdminAgentsPage.saveInfoButton.click();
        CommonUtils.sleep(500);
    }

    /*
     * ADMIN GOES TO ACTIVE MEMBER LIST
     */
    @Then("admin goes to active members list")
    public void admin_goes_to_active_members_list() {
        JavascriptUtils.clickByJS(realEstateAdminAgentsPage.activeMemberButton);
    }

    /*
     * ASSERTING IF AGENT IS SUCCESFULLY ADDED
     */
    @Then("admin checks if agent with email {string} was succesfully added")
    public void admin_checks_if_agent_with_email_was_succesfully_added(String expectedAgentEmail) {
        JavascriptUtils.scrollIntoView(RealEstateAdminAgentsPage.agentEmailLocator(expectedAgentEmail));
        String actualAgentEmail = RealEstateAdminAgentsPage.agentEmailLocator(expectedAgentEmail).getText();
        CommonUtils.assertEquals(expectedAgentEmail, actualAgentEmail);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * DELETE AGENT FROM THE DATABASE
     */
    @Then("delete Agent with email {string} from database")
    public void delete_Agent_with_email_from_database(String deletinAgentEmail) {
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
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}