package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class StudentRecordsEnableStepImpl extends PageInitializer {

    /*
     * ASSERTING THAT RGE ADMIN IS ON THE STUDENT CRITERIA PAGE
     */
    public static void adminOnPage(String expectedSelectCriteriaText) {
        String actualSelectCriteriaText = studentSelectCriteriaPage.selectCriteriaText.getText();
        CommonUtils.assertEquals(expectedSelectCriteriaText, actualSelectCriteriaText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ASSERTING THAT WE ARE ON THE STUDENT RECORD PAGE
     */
    public static void studentRecordPage(String recordFirstName,
            String recordLastName) {
        String actualRecirdStudentName = studentRecordsPage.studentRecordName.getText();
        CommonUtils.assertEquals((recordFirstName + " " + recordLastName), actualRecirdStudentName);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * DISABELING STUDENT RECORDS
     */
    public static void disableStudent(String disableReason) {
        studentRecordsPage.studentRecordDisableButton.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(500);
        studentRecordsPage.reasonDropdown.click();
        CommonUtils.nonMobileScreenshots();
        studentRecordsPage.saveReasonButton.click();
    }

    /*
     * ENABELING STUDENT RECORDS
     */
    public static void enableStudentRecord() {
        studentRecordsPage.studentRecordEnableButton.click();
        CommonUtils.acceptAlert();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(2000);
    }
}
