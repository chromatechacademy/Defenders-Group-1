package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class StudentAdmissionStepImpl extends PageInitializer {

    /*
     * ASSERTING THAT THE USER IS ON THE STUDENT ADMISSION PAGE
     */
    public static void studentAdmission(String expectedHeaderText) {
        String actualHeaderText = studentAdmissionPage.studentAdmissionHeader.getText();
        CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);
    }

    /*
     * ENTERING ADMISSION NUMBER
     */
    public static void uniqueAdmissionNumber(String admissionNumber) {
        studentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
        CommonUtils.sleep(1000);
    }

    /*
     * SELECTS CLASS NAME AND SECTION NAME FROM DROPDOWNS
     */
    public static void classAndSectionSelection(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    /*
     * ENTERING STUDENT FIRST NAME AND LAST NAME
     */
    public static void studentFirstandLastName(String firstName, String lastName) {
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    /*
     * SELECTS GENDER FROM DROPDOWN
     */
    public static void gender(String gender) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            JavascriptUtils.scrollIntoView(studentAdmissionPage.dobCalendar);
        }
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropDown);
    }

    /*
     * ENTERING MOTHER'S NAME
     */
    public static void mothersName(String mothersName) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            JavascriptUtils.scrollIntoView(studentAdmissionPage.mothersNameTextBox);
        }
        studentAdmissionPage.mothersNameTextBox.sendKeys(mothersName);
    }

    /*
     * CLICK ON THE If GURADIAN IS RADIO BUTTON
     */
    public static void guardianRadioButton() {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            JavascriptUtils.scrollIntoView(studentAdmissionPage.guardianPhoneNumberTextBox);
        }
        studentAdmissionPage.motherRadioButton.click();
    }

    /*
     * ENTERING GUARDIAN PHONE NUMBER
     */
    public static void guardianPhoneNumber(String phoneNumber) {
        studentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(phoneNumber);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * PRESSING SAVE BUTTON
     */
    public static void saveButton() {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            JavascriptUtils.scrollIntoView(studentAdmissionPage.saveButton);
        }
        studentAdmissionPage.saveButton.click();
        CommonUtils.sleep(1000);
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON STUDENT ADMISSION PAGE
     */
    public static void recordSaved(String expectedSuccessMessage) {
        CommonUtils.nonMobileScreenshots();
        String actualSuccessMessage = studentAdmissionPage.succesfulySavedMessage.getText();
        CommonUtils.assertEquals(expectedSuccessMessage, actualSuccessMessage);
        CommonUtils.sleep(1000);
    }

    /*
     * ASSERTING THE ADMISSION NO FIELD MUST CONTAIN A UNIQUE VALUE IS DISPLAYED
     */
    public static void uniqueNumberAssertion(String expectedAdmissionNumberMustBeUniqueMessage) {
        CommonUtils.nonMobileScreenshots();
        String actualAdmissionNumberMustBeUniqueMessage = studentAdmissionPage.admissionNumberMustBeUniqueMessage
                .getText();
        CommonUtils.assertEquals(expectedAdmissionNumberMustBeUniqueMessage, actualAdmissionNumberMustBeUniqueMessage);
        CommonUtils.sleep(1000);
    }
}
