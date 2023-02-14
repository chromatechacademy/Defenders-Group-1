package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class StudentInformationStepImpl extends PageInitializer {

    /* CLICKING ON STUDENT INFORMATION MODULE */
    public static void studentInformation(String moduleText) {
        CommonUtils.nonMobileScreenshots();
        StudentDashboardPage.dynamicModuleLocator(moduleText).click();
        CommonUtils.sleep(2000);
    }

    /* ASSERTING STUDENT INFORMATION MODULES */
    public static void studentInfoAssertion(String expectedStudentDetailsModule,
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
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
