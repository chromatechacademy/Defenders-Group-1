package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentSelectionsPage;
import com.chroma.stepsImplementation.AcademicsSectionStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsSectionStepDef extends PageInitializer {

    /*
     * CLICKING ON THE ACADEMICS MODULE
     */
    @Then("admin clicks on {string} module")
    public void admin_clicks_on_module(String moduleText) {
        AcademicsSectionStepImpl.clickingOnAcademicsModule(moduleText);
    }

    /*
     * CLICKING ON THE SECTIONS FROM ACADEMICS MODULE
     */
    @Then("admin selects Sections")
    public void admin_selects_Sections() {
        studentDashboardPage.academicsSections.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON SECTIONS PAGE
     */
    @Then("admin is directed to Sections page with the text {string}")
    public void admin_is_directed_to_Sections_page_with_the_text(String expetedSelectionsPageText) {
        AcademicsSectionStepImpl.adminOnSectionPageAssertion(expetedSelectionsPageText);
    }

    /*
     * ENTERING TEXT IN THESECTION NAME TEXTBOX
     */
    @When("admin enters Session {string}")
    public void admin_enters_Session(String sectionName) {
        studentSelectionsPage.sectionText.sendKeys(sectionName);
    }

    /*
     * SAVING SECTION
     */
    @When("admin clicks on the Save button")
    public void admin_clicks_on_the_Save_button() {
        studentSelectionsPage.sectionSaveButton.click();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON SECTIONS PAGE
     */
    @Then("Section is succesfully saved and confirmation message displays {string}")
    public void section_is_succesfully_saved_and_confirmation_message_displays(
            String expectedSessionSavesSuccessfulyText) {
        AcademicsSectionStepImpl.recordSavedAssertion(expectedSessionSavesSuccessfulyText);
    }

    /*
     * CLICKING ON THE SECTION DELETE BUTTON
     */
    @Then("admin clicks on the Section {string} Delete button")
    public void admin_clicks_on_the_Section_Delete_button(String sectionName) {
        StudentSelectionsPage.sectionDeleteLocator(sectionName).click();
    }

    /*
     * ACCEPT SESSION DELETE CONFIRMATION ALERT
     */
    @Then("Section is deleted")
    public void section_is_deleted() {
        AcademicsSectionStepImpl.deleteConfirmationAlert();
    }
}