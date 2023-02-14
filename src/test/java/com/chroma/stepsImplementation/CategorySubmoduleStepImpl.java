package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class CategorySubmoduleStepImpl extends PageInitializer {

    /*
     * ASSERTING THAT THE ADMIN IS ON CATEGORY PAGE
     */
    public static void adminOnCategoryPageAssertion(String expetedCategoryPageText) {
        String actualCategoryPageText = studentCategoriesPage.createCategoryText.getText();
        CommonUtils.assertEquals(expetedCategoryPageText, actualCategoryPageText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON CATEGORY PAGE
     */
    public static void recordSavedAssertion(
            String expectedCategorySavesSuccessfulyText) {
        String actualCategorySavesSuccessfulyText = studentCategoriesPage.categorySaveButton.getText();
        CommonUtils.assertEquals(expectedCategorySavesSuccessfulyText, actualCategorySavesSuccessfulyText);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }

    /*
     * ACCEPT CATEGORY DELETE CONFIRMATION ALERT
     */
    public static void acceptDeletingCategory() {
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }
}
