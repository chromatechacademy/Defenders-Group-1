package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class AcademicsSectionStepImpl extends PageInitializer {

    /*
     * CLICKING ON THE ACADEMICS MODULE
     */
    public static void clickingOnAcademicsModule(String moduleText) {
        CommonUtils.nonMobileScreenshots();
        StudentDashboardPage.dynamicModuleLocator(moduleText).click();
        CommonUtils.sleep(500);
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON SECTIONS PAGE
     */
    public static void adminOnSectionPageAssertion(String expetedSelectionsPageText) {
        String actualSelectionsPageText = studentSelectionsPage.addSelectionText.getText();
        CommonUtils.assertEquals(expetedSelectionsPageText, actualSelectionsPageText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON SECTIONS PAGE
     */
    public static void recordSavedAssertion(
            String expectedSessionSavesSuccessfulyText) {
        String actualSessionSavesSuccessfulyText = studentSelectionsPage.sectionSavedSuccesfullyText.getText();
        CommonUtils.assertEquals(expectedSessionSavesSuccessfulyText, actualSessionSavesSuccessfulyText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ACCEPT SESSION DELETE CONFIRMATION ALERT
     */
    public static void deleteConfirmationAlert() {
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }
}
