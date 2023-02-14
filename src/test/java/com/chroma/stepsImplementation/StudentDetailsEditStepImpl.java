package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsEditStepImpl extends PageInitializer {

    // Navigating to the student details page
    public static void studentPage(String url) {
        studentDashboardPage.studentInformationModule.click();
        studentDashboardPage.studentDetailsSubModule.click();
        String studentDetailsUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentDetailsUrl);
        CommonUtils.sleep(1000);
    }

    // Selecting options in dropdown menus
    public static void selectDropDownMenus(String cyberSecurity, String networkingFundamentals) {
        CommonUtils.selectDropDownValue("Cyber Security", studentDetailsPage.classDropdown);
        CommonUtils.selectDropDownValue("Networking Fundamentals", studentDetailsPage.sectionDropDown);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }

    // Determining if user is on the correct page
    public static void userOnCorrectPage(String url) {
        String studentDetailsUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentDetailsUrl);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }

    // Editing information and saving the changes
    public static void editAndSaveInfo(String testing) {
        studentDetailsPage.lastNameTextBox.sendKeys(testing);
        studentDetailsPage.saveButton.click();
        CommonUtils.sleep(1000);
    }

    // Displaying success message
    public static void successMessage(String recordUpdateSuccessMessage) {
        String actualsuccessText = studentDetailsPage.recordUpdateSuccessMessage.getText();
        CommonUtils.assertEquals(recordUpdateSuccessMessage, actualsuccessText);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }
}
