package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateAgentsPageStepDef extends PageInitializer {

    // ASSERING TEXT ON AGENTS PAGE
    @Then("the following text is visiable {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_text_is_visiable(String memberList, String active, String inactive, String allAgents,
            String addNow, String name, String mail, String contactNumber, String actions) {
        String memberListIsDisplayed = realEstateAdminAgentsPage.memberListButton.getText();
        CommonUtils.assertTrue(memberListIsDisplayed.contains(memberList));
        String activeTextIsDisplayed = realEstateAdminAgentsPage.activeButton.getText();
        CommonUtils.assertEquals(active, activeTextIsDisplayed);
        String inactiveTextIsDisplayed = realEstateAdminAgentsPage.inactiveButton.getText();
        CommonUtils.assertEquals(inactive, inactiveTextIsDisplayed);
        String allAgentsTextIsDisplayed = realEstateAdminAgentsPage.allAgentsButton.getText();
        CommonUtils.assertEquals(allAgents, allAgentsTextIsDisplayed);
        String addNowTextIsDisplayed = realEstateAdminAgentsPage.addNowButton.getText();
        CommonUtils.assertEquals(addNow, addNowTextIsDisplayed);
        String nameTextIsDisplayed = realEstateAdminAgentsPage.nameText.getText();
        CommonUtils.assertEquals(name, nameTextIsDisplayed);
        String mailTextIsDisplayed = realEstateAdminAgentsPage.mailText.getText();
        CommonUtils.assertEquals(mail, mailTextIsDisplayed);
        String contactNumberTextIsDisplayed = realEstateAdminAgentsPage.contactNumberText.getText();
        CommonUtils.assertEquals(contactNumber, contactNumberTextIsDisplayed);
        String actionsTextIsDisplayed = realEstateAdminAgentsPage.actionsText.getText();
        CommonUtils.assertEquals(actions, actionsTextIsDisplayed);
        CommonUtils.nonMobileScreenshots();
    }
}
