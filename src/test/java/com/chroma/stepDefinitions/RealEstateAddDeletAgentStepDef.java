package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateAddDeletAgentStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateAddDeletAgentStepDef extends PageInitializer {

    /*
     * DELETING AGENT FROM ACTIVE MEMBER LIST
     */
    @Then("admin deletes the agent with emeil {string} from the Active Members List")
    public void admin_deletes_the_agent_with_emeil_from_the_Active_Members_List(String activeAgentEmail) {
        RealEstateAddDeletAgentStepImpl.deletingAdminFromActiveList(activeAgentEmail);
    }

    /*
     * NAVIGATING TO INACTIVE MEMBER LIST END FIND INACTIVE AGENT
     */
    @Then("admin will navigate to Inactive Members List and check for agent with {string}")
    public void admin_will_navigate_to_Inactive_Members_List_and_check_for_agent_with(String activeDeletedAgentEmail) {
        RealEstateAddDeletAgentStepImpl.findingInactiveAgent(activeDeletedAgentEmail);
    }

    /*
     * DELETE INACTIVE AGENT
     */
    @Then("admin deletes the agent with email {string} from the Inctive Members List")
    public void admin_deletes_the_agent_with_email_from_the_Inctive_Members_List(String inactiveDeletedAgentEmail) {
        RealEstateAddDeletAgentStepImpl.inactiveAgentDeleted(inactiveDeletedAgentEmail);
    }
}
