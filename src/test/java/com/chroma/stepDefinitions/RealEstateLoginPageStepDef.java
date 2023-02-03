package com.chroma.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminAgentsPage;
import com.chroma.pages.RealEstateAgentIndexPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateLoginPageStepDef extends PageInitializer {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

    /*
     * NAVIGATING TO REAL ESTATE ADMIN URL
     */
    @Given("an admin is on the Admin login page {string}")
    public void an_admin_is_on_the_Admin_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    /*
     * SENDING ADMIN'S EMAIL AND PASSWORD TO TEXTBOXES
     */
    @When("the admin logins with valid credentials email {string} and password {string}")
    public void the_admin_logins_with_valid_credentials_email_and_password(String email, String password) {
        realEstateAdminWelcomePage.emailTextBox.sendKeys(email);
        realEstateAdminWelcomePage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        realEstateAdminWelcomePage.logInButton.click();
    }

    /*
     * ASSERTING THAT WE ARE ON THE ADMIN INDEX PAGE
     */
    @Then("the admin is landed on a home page with text {string}")
    public void the_admin_is_landed_on_a_home_page_with_text(String expectedAgentsText) {
        String actualAgetntsText = realEstateAdminIndexPage.helloAdminText.getText();
        CommonUtils.assertEquals(expectedAgentsText, actualAgetntsText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

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
     * LOGGING OUT OF ADMIN PORTAL
     */
    @Then("admin logs out the admin site")
    public void admin_logs_out_the_admin_site() {
        realEstateAdminAgentsPage.adminLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAdminAgentsPage.adminLogOutButton);
        realEstateAdminAgentsPage.adminLogOutButton.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS LOGGED OUT
     */
    @Then("admin should be logged out and {string} message should be displayed")
    public void admin_should_be_logged_out_and_message_should_be_displayed(String expectedAdminWelcomeText) {
        String actualAdminWelcomeText = realEstateAdminWelcomePage.adminWelcomeText.getText();
        CommonUtils.assertEquals(expectedAdminWelcomeText, actualAdminWelcomeText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * NAVIGATES TO AGENT LOG IN PAGE
     */
    @Given("an admin is on the Agent login page {string}")
    public void an_admin_is_on_the_Agent_login_page(String agentURL) {
        WebDriverUtils.driver.get(agentURL);
    }

    /*
     * ENTERING AGENT CREDENTIALS
     */
    @When("the admin logins with valid Agent credentials email {string} and password {string}")
    public void the_admin_logins_with_valid_Agent_credentials_email_and_password(String agentEmail,
            String agentPassword) {
        realEstateAdminWelcomePage.emailTextBox.sendKeys(agentEmail);
        realEstateAdminWelcomePage.passwordTextBox.sendKeys(agentPassword);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        realEstateAdminWelcomePage.logInButton.click();
    }

    /*
     * ASSERTING THAT ADMIN IS ON THE AGENT INDEX PAGE
     */
    @Then("the admin is landed on a Agent home page with text {string}")
    public void the_admin_is_landed_on_a_Agent_home_page_with_text(String expectedHelloChromaText) {
        String actualHelloChromaText = realEstateAgentIndexPage.helloChromaTechText.getText();
        CommonUtils.assertEquals(RealEstateAgentIndexPage.agentHelloFirstName(expectedHelloChromaText),
                actualHelloChromaText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * LOGGING OUT ASSERTING THAT THE ADMIN IS ON THE AGENT WELCOME PAGE
     */
    @Then("admin logs out the Agent site and {string} message should be displayed")
    public void admin_logs_out_the_Agent_site_and_message_should_be_displayed(String expectedAgentWelcomeText) {
        realEstateAgentIndexPage.agentLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAdminAgentsPage.adminLogOutButton);
        realEstateAgentIndexPage.agentLogOutButton.click();
        String actualAgentWelcomeText = realEstateAgentWelcomePage.agentWelcomeText.getText();
        CommonUtils.assertEquals(expectedAgentWelcomeText, actualAgentWelcomeText);
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
        Thread.sleep(5000);
    }

    @Then("admin will navigate to Inactive Members List and check for agent with {string}")
    public void admin_will_navigate_to_Inactive_Members_List_and_check_for_agent_with(String string)
            throws InterruptedException {
        CommonUtils.waitForVisibility(realEstateAdminInactiveAgentsPage.inactiveMemberButton);
        realEstateAdminInactiveAgentsPage.inactiveMemberButton.click();
        Thread.sleep(1000);
    }

}
