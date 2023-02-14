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
<<<<<<< HEAD
        String actualStudentDetailsText = studentInformationPage.studentDetailsModule.getText();
        CommonUtils.assertEquals(actualStudentDetailsText, expectedStudentDetailsModule);
        String actualStudentAdmissionText = studentInformationPage.studentAdmissionModule.getText();
        CommonUtils.assertEquals(actualStudentAdmissionText, expextedStudentAdmissionModule);
        String actualDisabledStudentText = studentInformationPage.disabledStudentModule.getText();
        CommonUtils.assertEquals(actualDisabledStudentText, expectedDisabledStudentModule);
        String actualBulkDeleteText = studentInformationPage.bulkDeleteModule.getText();
        CommonUtils.assertEquals(actualBulkDeleteText, expectedBulkDeleteModule);
        String actualStudentCategoriesText = studentInformationPage.studentCategoriesModule.getText();
        CommonUtils.assertEquals(actualStudentCategoriesText, expectedStudentCategoriesModule);
        String actualStudentHouseText = studentInformationPage.studentHouseModule.getText();
        CommonUtils.assertEquals(actualStudentHouseText, expectedStudentHouseModule);
        String actualDisableReasonText = studentInformationPage.disableReasonModule.getText();
        CommonUtils.assertEquals(actualDisableReasonText, expectedDisableReasonModule);
        CommonUtils.nonMobileScreenshots();
=======
       StudentInformationStepImpl.studentInfoAssertion(expectedStudentDetailsModule, expextedStudentAdmissionModule, expectedDisabledStudentModule, expectedBulkDeleteModule, expectedStudentCategoriesModule, expectedStudentHouseModule, expectedDisableReasonModule);
>>>>>>> 6d701a9ba3a43b9912bbab5dcc59daf302bbc1fa
    }
}