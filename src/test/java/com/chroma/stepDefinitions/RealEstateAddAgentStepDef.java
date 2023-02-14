package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateAddAgentStepImpl;
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
        RealEstateAddAgentStepImpl.adminAgentsPageAssertion(expectedAllAgentsText);
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
        RealEstateAddAgentStepImpl.enteringAdminsInformation(agentFirstName, agentLastName, agentEmail, agentPhone,
                agentPassword);
    }

    /*
     * SAVE THE AGENT INFO
     */
    @Then("admin clicks Save")
    public void admin_clicks_Save() {
        RealEstateAddAgentStepImpl.savingAdminsInformation();
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
        RealEstateAddAgentStepImpl.adminAddedAssertion(expectedAgentEmail);
    }

    /*
     * DELETE AGENT FROM THE DATABASE
     */
    @Then("delete Agent with email {string} from database")
    public void delete_Agent_with_email_from_database(String deletinAgentEmail) {
        RealEstateAddAgentStepImpl.deletingAdminFromDatabase(deletinAgentEmail);
    }
}