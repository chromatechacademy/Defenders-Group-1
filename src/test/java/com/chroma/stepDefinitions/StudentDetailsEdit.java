package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentDetailsEdit extends PageInitializer {
    // Navigating to the student details page
    @When("an admin user navigates to the student details page {string}")
    public void an_admin_user_navigates_to_the_student_details_page(String url) {
        studentDashboardPage.studentInformationModule.click();
        studentDashboardPage.studentDetailsSubModule.click();
        String studentDetailsUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentDetailsUrl);
        CommonUtils.sleep(1000);
    }

    // Selecting options in dropdown menus
    @When("selects section {string} and Section {string}")
    public void selects_section_and_Section(String cyberSecurity, String networkingFundamentals) {
        CommonUtils.selectDropDownValue("Cyber Security",studentDetailsPage.classDropdown);
        CommonUtils.selectDropDownValue("Networking Fundamentals", studentDetailsPage.sectionDropDown);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(1000);
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
        String studentDetailsUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentDetailsUrl);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(1000);
    }

    // Editing information and saving the changes
    @When("an admin edits information {string} of the user and clicks save")
    public void an_admin_edits_information_of_the_user_and_clicks_save(String testing) {
        studentDetailsPage.lastNameTextBox.sendKeys(testing);
        studentDetailsPage.saveButton.click();
        CommonUtils.sleep(1000);
    }

    // Displaying success message
    @Then("the message Record Update {string}")
    public void the_message_Record_Update(String recordUpdateSuccessMessage) {
        String actualsuccessText = studentDetailsPage.recordUpdateSuccessMessage.getText();
        CommonUtils.assertEquals(recordUpdateSuccessMessage, actualsuccessText);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(1000);
    }
}
