package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentInformationStepImpl;
import cucumber.api.java.en.Then;

public class StudentInformationtStepDef extends PageInitializer{

     /* CLICKING ON STUDENT INFORMATION MODULE */
    @Then("an admin clicks on {string} module")
    public void an_admin_clicks_on_module(String moduleText) {
        StudentInformationStepImpl.studentInformation(moduleText);
    }

    /* ASSERTING STUDENT INFORMATION MODULES*/
    @Then("the following modules should displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String expectedStudentDetailsModule,
            String expextedStudentAdmissionModule, String expectedDisabledStudentModule,
            String expectedBulkDeleteModule, String expectedStudentCategoriesModule, String expectedStudentHouseModule,
            String expectedDisableReasonModule) {
       StudentInformationStepImpl.studentInfoAssertion(expectedStudentDetailsModule, expextedStudentAdmissionModule, expectedDisabledStudentModule, expectedBulkDeleteModule, expectedStudentCategoriesModule, expectedStudentHouseModule, expectedDisableReasonModule);
    }
}