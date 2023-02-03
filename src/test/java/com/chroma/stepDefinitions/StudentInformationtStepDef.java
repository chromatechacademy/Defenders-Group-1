package com.chroma.stepDefinitions;

import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;

public class StudentInformationtStepDef {

    StudentInformationPage studentInformationPage = new StudentInformationPage();

    @Then("an admin clicks on {string} module")
    public void an_admin_clicks_on_module(String moduleText) {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        StudentDashboardPage.dynamicModuleLocator(moduleText).click();
    }

    @Then("the following modules should displayed: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String studentDetailsModule, String studentAdmissionModule, String disabledStudentModule, String bulkDeleteModule, String studentCategoriesModule, String studentHouseModule, String disableReasonModule) {
    
    String actualStudentDetailsText = studentInformationPage.studentDetailsModule.getText();
    CommonUtils.assertEquals(actualStudentDetailsText, studentDetailsModule);

    String actualStudentAdmissionText = studentInformationPage.studentAdmissionModule.getText();
    CommonUtils.assertEquals(actualStudentAdmissionText, studentAdmissionModule);

    String actualDisabledStudentText = studentInformationPage.disabledStudentModule.getText();
    CommonUtils.assertEquals(actualStudentAdmissionText, actualDisabledStudentText);

   
        
}
    
}

     
    



