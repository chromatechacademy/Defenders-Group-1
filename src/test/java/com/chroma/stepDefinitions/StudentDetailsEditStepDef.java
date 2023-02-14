package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentDetailsEditStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentDetailsEditStepDef extends PageInitializer {

    // Navigating to the student details page
    @When("an admin user navigates to the student details page {string}")
    public void an_admin_user_navigates_to_the_student_details_page(String url) {
        StudentDetailsEditStepImpl.studentPage(url);
    }

    // Selecting options in dropdown menus
    @When("selects section {string} and Section {string}")
    public void selects_section_and_Section(String cyberSecurity, String networkingFundamentals) {
        StudentDetailsEditStepImpl.selectDropDownMenus(cyberSecurity, networkingFundamentals);
    }

    // Clicking search button
    @When("clicks Search button")
    public void clicks_Search_button() {
        studentDetailsPage.searchButton.click();
    }

    // Clicking the edit button
    @When("clicks the edit button of a student")
    public void clicks_the_edit_button_of_a_student() {
        studentDetailsPage.editButton.click();
    }

    // Determining if user is on the correct page
    @Then("the user is on the page {string}")
    public void the_user_is_on_the_page(String url) {
        StudentDetailsEditStepImpl.userOnCorrectPage(url);
    }

    // Editing information and saving the changes
    @When("an admin edits information {string} of the user and clicks save")
    public void an_admin_edits_information_of_the_user_and_clicks_save(String testing) {
        StudentDetailsEditStepImpl.editAndSaveInfo(testing);
    }

    // Displaying success message
    @Then("the message Record Update {string}")
    public void the_message_Record_Update(String recordUpdateSuccessMessage) {
        StudentDetailsEditStepImpl.successMessage(recordUpdateSuccessMessage);
    }
}
