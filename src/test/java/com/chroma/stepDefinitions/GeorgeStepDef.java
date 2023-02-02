package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeorgeStepDef extends PageInitializer {

    /*
     * CLICKING ON THE ACADEMICS DROPDOWN
     */
    @Then("admin clicks on Academics dropdown")
    public void admin_clicks_on_Academics_dropdown() {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        studentDashboardPage.academicsDropdown.click();
    }

    /*
     * CLICKING ON THE SECTIONS FROM ACADEMICS DROPDOWN
     */
    @Then("admin selects Sections")
    public void admin_selects_Sections() {
        studentDashboardPage.academicsSections.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON SECTIONS PAGE
     */
    @Then("admin is directed to Sections page with the text {string}")
    public void admin_is_directed_to_Sections_page_with_the_text(String expetedSelectionsPageText)
            throws InterruptedException {
        String actualSelectionsPageText = studentSeletionsPage.addSelectionText.getText();
        CommonUtils.assertEquals(expetedSelectionsPageText, actualSelectionsPageText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * ENTERING TEXT IN THESECTION NAME TEXTBOX
     */
    @When("admin enters a {string}")
    public void admin_enters_a(String sectionName) {
        studentSeletionsPage.sectionText.sendKeys(sectionName);
    }

    /*
     * SAVING SECTION
     */
    @When("admin clicks on the Save button")
    public void admin_clicks_on_the_Save_button() {
        studentSeletionsPage.sectionSaveButton.click();
    }

     /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON SECTIONS PAGE
     */
    @Then("Section is succesfully saved and confirmation message displays {string}")
    public void section_is_succesfully_saved_and_confirmation_message_displays(
            String expectedSessionSavesSuccessfulyText) throws InterruptedException {
        String actualSessionSavesSuccessfulyText = studentSeletionsPage.sectionSavedSuccesfullyText.getText();
        CommonUtils.assertEquals(expectedSessionSavesSuccessfulyText, actualSessionSavesSuccessfulyText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        Thread.sleep(3000);
    }

}
