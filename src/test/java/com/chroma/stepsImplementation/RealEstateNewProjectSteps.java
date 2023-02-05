package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateNewProjectSteps extends PageInitializer {

    /**
     * Use this method to create a new Real Estate Project 
     * 
     */
    public static void newProjectStepsImplementation() {
        CommonUtils.sendKeys(realEstateNewProjectPage.developerTextBox, "Andrew Smith");
        CommonUtils.sendKeys(realEstateNewProjectPage.titleTextBox, "London");
        CommonUtils.sendKeys(realEstateNewProjectPage.levelTextBox, "1");
        CommonUtils.scrollIntoView(realEstateNewProjectPage.streetAddressTextBox);
        CommonUtils.sendKeys(realEstateNewProjectPage.streetAddressTextBox, "Sunshine St");
        CommonUtils.scrollIntoView(realEstateNewProjectPage.nextButton);
        CommonUtils.click(realEstateNewProjectPage.nextButton);
        CommonUtils.selectDropDownValue(realEstateNewProjectPage.currencyDropdown, "AUD");
        CommonUtils.click(realEstateNewProjectPage.saveButton);
        CommonUtils.click(realEstateNewProjectPage.okButton);
        CommonUtils.click(realEstateNewProjectPage.backButton);
        CommonUtils.sleep(2000);   
    }
}
