package com.chroma.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminAgentsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateAddAgentStepDef extends PageInitializer {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

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
            String agentPhone, String agentPassword) throws InterruptedException {
        realEstateAdminAgentsPage.enterAgentFirstName.sendKeys(agentFirstName);
        realEstateAdminAgentsPage.enterAgentLasttName.sendKeys(agentLastName);
        realEstateAdminAgentsPage.enterAgentEmail.sendKeys(agentEmail);
        realEstateAdminAgentsPage.enterAgentPhone.sendKeys(agentPhone);
        Thread.sleep(500);
        realEstateAdminAgentsPage.enterAgentPassword.sendKeys(agentPassword);
        realEstateAdminAgentsPage.enterAgentCPassword.sendKeys(agentPassword);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * SAVE THE AGENT INFO
     */
    @Then("admin clicks Save")
    public void admin_clicks_Save() throws InterruptedException {
        realEstateAdminAgentsPage.saveInfoButton.click();
        Thread.sleep(500);
    }

    /*
     * ADMIN GOES TO ACTIVE MEMBER LIST
     */
    @Then("admin goes to active members list")
    public void admin_goes_to_active_members_list() {
        js.executeScript("arguments[0].click()", realEstateAdminAgentsPage.activeMemberButton);
    }

    /*
     * ASSERTING IF AGENT IS SUCCESFULLY ADDED
     */
    @Then("admin checks if agent with email {string} was succesfully added")
    public void admin_checks_if_agent_with_email_was_succesfully_added(String expectedAgentEmail)
            throws InterruptedException {
        String actualAgentEmail = RealEstateAdminAgentsPage.agentEmailLocator(expectedAgentEmail).getText();
        CommonUtils.assertEquals(expectedAgentEmail, actualAgentEmail);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                RealEstateAdminAgentsPage.agentEmailLocator(expectedAgentEmail));
        Thread.sleep(500);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * DELETING AGENT FROM ACTIVE MEMBER LIST
     */
    @Then("admin deletes the agent with emeil {string} from the Active Members List")
    public void admin_deletes_the_agent_with_emeil_from_the_Active_Members_List(String activeAgentEmail)
            throws InterruptedException {
        RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(activeAgentEmail).click();
        CommonUtils
                .waitForVisibility(RealEstateAdminActiveAgentsPage.activeAgentDeleteDropdownLocator(activeAgentEmail));
        RealEstateAdminActiveAgentsPage.activeAgentDeleteLocator(activeAgentEmail).click();
        Thread.sleep(10000);
    }

    /*
     * NAVIGATING TO INACTIVE MEMBER LIST
     */
    @Then("admin will navigate to Inactive Members List and check for agent with {string}")
    public void admin_will_navigate_to_Inactive_Members_List_and_check_for_agent_with(String string)
            throws InterruptedException {
        // CommonUtils.waitForVisibility(realEstateAdminInactiveAgentsPage.inactiveMemberButton);
        realEstateAdminInactiveAgentsPage.inactiveMemberButton.click();
        Thread.sleep(1000);
    }

}
