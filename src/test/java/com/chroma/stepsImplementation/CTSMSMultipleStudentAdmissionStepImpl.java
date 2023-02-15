package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.web.CommonUtils;

public class CTSMSMultipleStudentAdmissionStepImpl extends PageInitializer {

    /* Admin selects class and section name */
    public static void classAndSectionSelection(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, bulkDeletePage.classNameDropdown);
        CommonUtils.selectDropDownValue(sectionName, bulkDeletePage.sectionNameDropdown);
        CommonUtils.sleep(5000);
        CommonUtils.nonMobileScreenshots();
    }

    /* Delelting admitted student */
    public static void deletingAdmittedStudent(String firstName, String lastName) {
        BulkDeletePage.studentRecordLocator(firstName + " " + lastName).click();
        CommonUtils.sleep(500);
        bulkDeletePage.deleteButton.click();
        CommonUtils.nonMobileAutoAcceptAlert();
        CommonUtils.sleep(5000);
    }

    /* Verifying that Admitted student was deleted */
    public static void deletedStudentAssertion(String admissionNumberDeleted) {
        BulkDeletePage.studentDeleteRecordLocator(admissionNumberDeleted).click();
        CommonUtils.sleep(500);
        bulkDeletePage.deleteButton.click();
        CommonUtils.nonMobileAutoAcceptAlert();
        CommonUtils.sleep(5000);
    }
}
