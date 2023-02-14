package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class RealEstateNewProjectStepImpl extends PageInitializer {

    // CLICKING ON ADD NEW BUTTON
    public static void newButton() {
        realEstateNewProjectPage.addNewProjestButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    // FILLING OUT PROJECT DETAILS INFORMATION
    public static void fillingOutNewProjectForm(String developerTextBox, String titleTextBox,
            String levelTextBox, String date, String streetTextBox, String currencyTextBox) {
        CommonUtils.sendKeys(realEstateNewProjectPage.developerTextBox, developerTextBox);
        CommonUtils.sendKeys(realEstateNewProjectPage.titleTextBox, titleTextBox);
        CommonUtils.sendKeys(realEstateNewProjectPage.levelTextBox, levelTextBox);
        JavascriptUtils.selectDateByJS(realEstateNewProjectPage.dateTextBox, date);
        CommonUtils.sleep(3000);
        CommonUtils.scrollIntoView(realEstateNewProjectPage.streetAddressTextBox);
        CommonUtils.sendKeys(realEstateNewProjectPage.streetAddressTextBox, streetTextBox);
        CommonUtils.scrollIntoView(realEstateNewProjectPage.nextButton);
        CommonUtils.click(realEstateNewProjectPage.nextButton);
        CommonUtils.selectDropDownValue(realEstateNewProjectPage.currencyDropdown, currencyTextBox);
        CommonUtils.click(realEstateNewProjectPage.saveButton);
        CommonUtils.click(realEstateNewProjectPage.okButton);
        CommonUtils.click(realEstateNewProjectPage.backButton);
        CommonUtils.sleep(2000);
    }

    // VERIFYING NEW PROJECT HAS BEEN ADDE
    public static void addNewProject(String project) {
        CommonUtils.scrollIntoView(realEstateNewProjectPage.projectLondon);
        String actualProjectText = realEstateNewProjectPage.projectLondon.getText();
        CommonUtils.assertEquals(actualProjectText, project);
        CommonUtils.nonMobileScreenshots();
    }
}
