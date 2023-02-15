package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentAdmissionStepImpl;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDef extends PageInitializer {

    /*
     * CLICKING ON THE STUDENT ADMISSION SUBMODULE
     */
    @When("navigates to Student Admission Submodule")
    public void navigates_to_Student_Admission_Submodule() {
        studentDashboardPage.studentAdmissionSubmodule.click();
    }

    /*
     * ASSERTING THAT THE USER IS ON THE STUDENT ADMISSION PAGE
     */
    @Then("user is directed to Student Admission Page with the text {string}")
    public void user_is_directed_to_Student_Admission_Page_with_the_text(String expectedHeaderText) {
        StudentAdmissionStepImpl.studentAdmission(expectedHeaderText);
    }

    /*
     * ENTERING ADMISSION NUMBER
     */
    @Then("enters Student unique Admission Number {string}")
    public void enters_Student_unique_Admission_Number(String admissionNumber) {
        StudentAdmissionStepImpl.uniqueAdmissionNumber(admissionNumber);
    }

    /*
     * SELECTS CLASS NAME AND SECTION NAME FROM DROPDOWNS
     */
    @Then("selects Class {string} and Section {string}")
    public void selects_Class_and_Section(String className, String sectionName) {
        StudentAdmissionStepImpl.classAndSectionSelection(className, sectionName);
    }

    /*
     * ENTERING STUDENT FIRST NAME AND LAST NAME
     */
    @Then("enters Students first {string} and last name {string}")
    public void enters_Students_first_and_last_name(String firstName, String lastName) {
        StudentAdmissionStepImpl.studentFirstandLastName(firstName, lastName);
    }

    /*
     * SELECTS GENDER FROM DROPDOWN
     */
    @Then("selects gender {string}")
    public void selects_gender(String gender) {
        StudentAdmissionStepImpl.gender(gender);
    }

    /*
     * ENTERING DAYE OF BIRTH
     */
    @Then("enters Date of Birth {string}")
    public void enters_Date_of_Birth(String dob) {
        JavascriptUtils.selectDateByJS(studentAdmissionPage.dobCalendar, dob);
    }

    /*
     * ENTERING MOTHER'S NAME
     */
    @Then("enters Parent Guardian Details enters mothers name {string}")
    public void enters_Parent_Guardian_Details_enters_mothers_name(String mothersName) {
        StudentAdmissionStepImpl.mothersName(mothersName);
    }

    /*
     * CLICK ON THE IF GURADIAN IS RADIO BUTTON
     */
    @Then("for If Gurdian Is clicks on Mother radio button")
    public void for_If_Gurdian_Is_clicks_on_Mother_radio_button() {
        StudentAdmissionStepImpl.guardianRadioButton();
    }

    /*
     * ENTERING GUARDIAN PHONE NUMBER
     */
    @Then("enters Guardian Phone Number {string}")
    public void enters_Guardian_Phone_Number(String phoneNumber) {
        StudentAdmissionStepImpl.guardianPhoneNumber(phoneNumber);
    }

    /*
     * PRESSING SAVE BUTTON
     */
    @Then("clicks on the Save button")
    public void clicks_on_the_Save_button() {
        StudentAdmissionStepImpl.saveButton();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON STUDENT ADMISSION PAGE
     */
    @Then("student is succesfuly saved and confirmation message is displayed {string}")
    public void student_is_succesfuly_saved_and_confirmation_message_is_displayed(String expectedSuccessMessage) {
        StudentAdmissionStepImpl.recordSaved(expectedSuccessMessage);
    }

    /*
     * ASSERTING THE ADMISSION NO FIELD MUST CONTAIN A UNIQUE VALUE IS DISPLAYED
     */
    @Then("the Student is not admitted and {string} is displayed")
    public void the_Student_is_not_admitted_and_is_displayed(String expectedAdmissionNumberMustBeUniqueMessage) {
        StudentAdmissionStepImpl.uniqueNumberAssertion(expectedAdmissionNumberMustBeUniqueMessage);
    }
}