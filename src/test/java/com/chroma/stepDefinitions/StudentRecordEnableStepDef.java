package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentSelectCriteriaPage;
import com.chroma.stepsImplementation.StudentRecordsEnableStepImpl;
import cucumber.api.java.en.Then;

public class StudentRecordEnableStepDef extends PageInitializer {

    /*
     * ASSERTING THAT RGE ADMIN IS ON THE STUDENT CRITERIA PAGE
     */
    @Then("the admin should be on {string} page")
    public void the_admin_should_be_on_page(String expectedSelectCriteriaText) {
        StudentRecordsEnableStepImpl.adminOnPage(expectedSelectCriteriaText);
    }

    /*
     * CLICKING ON THE STUDENT
     */
    @Then("clicks on the Student Name with {string} Admission Number")
    public void clicks_on_the_Student_Name_with_Admission_Number(String admissionNumberRecord) {
        StudentSelectCriteriaPage.studentDisableRecordLocator(admissionNumberRecord).click();
    }

    /*
     * ASSERTING THAT WE ARE ON THE STUDENT RECORD PAGE
     */
    @Then("the admin should se the student First Name and Last Name {string} {string}")
    public void the_admin_should_se_the_student_First_Name_and_Last_Name(String recordFirstName,
            String recordLastName) {
        StudentRecordsEnableStepImpl.studentRecordPage(recordFirstName, recordLastName);
    }

    /*
     * DISABELING STUDENT RECORDS
     */
    @Then("the admin disable student records for {string} as reason")
    public void the_admin_disable_student_records_for_as_reason(String disableReason) {
        StudentRecordsEnableStepImpl.disableStudent(disableReason);
    }

    /*
     * ENABELING STUDENT RECORDS
     */
    @Then("the admin enable student records")
    public void the_admin_enable_student_records() {
        StudentRecordsEnableStepImpl.enableStudentRecord();
    }
}
