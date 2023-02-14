package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateAgentsPageStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateAgentsPageStepDef extends PageInitializer {

    // ASSERING TEXT ON AGENTS PAGE
    @Then("the following text is visiable {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_text_is_visiable(String memberList, String active, String inactive, String allAgents,
            String addNow, String name, String mail, String contactNumber, String actions) {
        RealEstateAgentsPageStepImpl.agentPageAssertion(memberList, active, inactive, allAgents, addNow, name, mail,
                contactNumber, actions);
    }
}
