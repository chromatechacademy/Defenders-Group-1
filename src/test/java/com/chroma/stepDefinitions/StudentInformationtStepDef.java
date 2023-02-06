package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class StudentInformationtStepDef extends PageInitializer{

     /* CLICKING ON STUDENT INFORMATION MODULE */
    @Then("an admin clicks on {string} module")
    public void an_admin_clicks_on_module(String moduleText) {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        StudentDashboardPage.dynamicModuleLocator(moduleText).click();
        CommonUtils.sleep(2000);
  
    }

    /* ASSERTING STUDENT INFORMATION MODULES*/
    @Then("the following modules should displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String expectedStudentDetailsModule,
            String expextedStudentAdmissionModule, String expectedDisabledStudentModule,
            String expectedBulkDeleteModule, String expectedStudentCategoriesModule, String expectedStudentHouseModule,
            String expectedDisableReasonModule) {
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
    }
}