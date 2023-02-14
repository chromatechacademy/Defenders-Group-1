package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentAcademicsClassPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class StudentAddDeleteClassStepImpl extends PageInitializer {

    /*
     * ASSERTING THAT THE ADMIN IS ON SECTIONS PAGE
     */
    public static void sectionPageAssertion(String expetedSelectionsPageText) {
        String actualSelectionsPageText = studentSelectionsPage.addSelectionText.getText();
        CommonUtils.assertEquals(expetedSelectionsPageText, actualSelectionsPageText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * CLICKING ON THE SECTION CHECKBOX
     */
    public static void sectionCheckbox(String setionCBox) {
        StudentAcademicsClassPage.dynamicCheckboxModuleLocator(setionCBox).click();
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ASSERING RECORD SAVED SUCCESFULLY MESSAGE
     */
    public static void recordSavedAssertion(String expectedSuccessMessage) {
        String actualSuccessMessage = studentAcademicsClassPage.classSavedSuccesfullyText.getText();
        CommonUtils.assertEquals(expectedSuccessMessage, actualSuccessMessage);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * CONFIRM DELETE AND ASSERTING
     */
    public static void deleteClass() {
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.nonMobileScreenshots();
    }
}
