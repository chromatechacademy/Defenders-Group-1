package com.chroma.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.StudentSelectionsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeorgeStepDef extends PageInitializer {

    /*
     * CLICKING ON THE ACADEMICS MODULE
     */
    @Then("admin clicks on {string} module")
    public void admin_clicks_on_module(String moduleText) {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        StudentDashboardPage.dynamicModuleLocator(moduleText).click();
    }

    /*
     * CLICKING ON THE SECTIONS FROM ACADEMICS MODULE
     */
    @Then("admin selects Sections")
    public void admin_selects_Sections() {
        studentDashboardPage.academicsSections.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON SECTIONS PAGE
     */
    @Then("admin is directed to Sections page with the text {string}")
    public void admin_is_directed_to_Sections_page_with_the_text(String expetedSelectionsPageText)
            throws InterruptedException {
        String actualSelectionsPageText = studentSelectionsPage.addSelectionText.getText();
        CommonUtils.assertEquals(expetedSelectionsPageText, actualSelectionsPageText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * ENTERING TEXT IN THESECTION NAME TEXTBOX
     */
    @When("admin enters Session {string}")
    public void admin_enters_Session(String sectionName) {
        studentSelectionsPage.sectionText.sendKeys(sectionName);
    }

    /*
     * SAVING SECTION
     */
    @When("admin clicks on the Save button")
    public void admin_clicks_on_the_Save_button() {
        studentSelectionsPage.sectionSaveButton.click();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON SECTIONS PAGE
     */
    @Then("Section is succesfully saved and confirmation message displays {string}")
    public void section_is_succesfully_saved_and_confirmation_message_displays(
            String expectedSessionSavesSuccessfulyText) {
        String actualSessionSavesSuccessfulyText = studentSelectionsPage.sectionSavedSuccesfullyText.getText();
        CommonUtils.assertEquals(expectedSessionSavesSuccessfulyText, actualSessionSavesSuccessfulyText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * CLICKING ON THE SECTION DELETE BUTTON
     */
    @Then("admin clicks on the Section {string} Delete button")
    public void admin_clicks_on_the_Section_Delete_button(String sectionName) {
        StudentSelectionsPage.sectionDeleteLocator(sectionName).click();
    }

    /*
     * ACCEPT SESSION DELETE CONFIRMATION ALERT
     */
    @Then("Section is deleted")
    public void section_is_deleted() throws InterruptedException {
        WebDriverUtils.driver.switchTo().alert().accept();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        Thread.sleep(1000);
    }

    /*
     * CLICKING ON THE STUDENT ADMISSION SUBMODULE
     */
    @When("navigates to Student Admission Submodule")
    public void navigates_to_Student_Admission_Submodule() {
        studentDashboardPage.studentAdmissionSubmodule.click();
    }

    /*
     * ASSERTING THAT THE USER IS ON THE STUDENT ADMISSION PAGE
     */
    @Then("user is directed to Student Admission Page with the text {string}")
    public void user_is_directed_to_Student_Admission_Page_with_the_text(String expectedHeaderText) {
        String actualHeaderText = studentAdmissionPage.studentAdmissionHeader.getText();
        CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);
    }

    /*
     * ENTERING ADMISSION NUMBER
     */
    @Then("enters Student unique Admission Number {string}")
    public void enters_Student_unique_Admission_Number(String admissionNumber) throws InterruptedException {
        studentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
        Thread.sleep(1000);
    }

    /*
     * SELECTS CLASS NAME AND SECTION NAME FROM DROPDOWNS
     */
    @Then("selects Class {string} and Section {string}")
    public void selects_Class_and_Section(String className, String sectionName) {
        System.out.println("Class name: " + className);
        System.out.println("Section: " + sectionName);
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    /*
     * ENTERING STUDENT FIRST NAME AND LAST NAME
     */
    @Then("enters Students first {string} and last name {string}")
    public void enters_Students_first_and_last_name(String firstName, String lastName) {
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    /*
     * SELECTS GENDER FROM DROPDOWN
     */
    @Then("selects gender {string}")
    public void selects_gender(String gender) {
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropDown);
    }

    /*
     * ENTERING DAYE OF BIRTH
     */
    @Then("enters Date of Birth {string}")
    public void enters_Date_of_Birth(String dob) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.driver;
        js.executeScript("arguments[0].setAttribute('value','" + dob + "');", studentAdmissionPage.dobCalendar);
    }

    /*
     * ENTERING MOTHER'S NAME
     */
    @Then("enters Parent Guardian Details enters mothers name {string}")
    public void enters_Parent_Guardian_Details_enters_mothers_name(String mothersName) {
        studentAdmissionPage.mothersNameTextBox.sendKeys(mothersName);
    }

    /*
     * CLICK ON THE IF GURADIAN IS RADIO BUTTON
     */
    @Then("for If Gurdian Is clicks on Mother radio button")
    public void for_If_Gurdian_Is_clicks_on_Mother_radio_button() {
        studentAdmissionPage.motherRadioButton.click();
    }

    /*
     * ENTERING GUARDIAN PHONE NUMBER
     */
    @Then("enters Guardian Phone Number {string}")
    public void enters_Guardian_Phone_Number(String phoneNumber) {
        studentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(phoneNumber);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * PRESSING SAVE BUTTON
     */
    @Then("clicks on the Save button")
    public void clicks_on_the_Save_button() throws InterruptedException {
        studentAdmissionPage.saveButton.click();
        Thread.sleep(1000);
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON STUDENT ADMISSION PAGE
     */
    @Then("student is succesfuly saved and confirmation message is displayed {string}")
    public void student_is_succesfuly_saved_and_confirmation_message_is_displayed(String expectedSuccessMessage)
            throws InterruptedException {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        String actualSuccessMessage = studentAdmissionPage.succesfulySavedMessage.getText();
        CommonUtils.assertEquals(expectedSuccessMessage, actualSuccessMessage);
        Thread.sleep(1000);
    }

    /*
     * ASSERTING THE ADMISSION NO FIELD MUST CONTAIN A UNIQUE VALUE IS DISPLAYED
     */
    @Then("the Student is not admitted and {string} is displayed")
    public void the_Student_is_not_admitted_and_is_displayed(String expectedAdmissionNumberMustBeUniqueMessage)
            throws InterruptedException {
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        String actualAdmissionNumberMustBeUniqueMessage = studentAdmissionPage.admissionNumberMustBeUniqueMessage
                .getText();
        CommonUtils.assertEquals(expectedAdmissionNumberMustBeUniqueMessage, actualAdmissionNumberMustBeUniqueMessage);
        Thread.sleep(1000);
    }

    /*
     * CLICKING ON THE STUDENT CATEGORIES FROM STUDENT INFORMATION MODULE
     */
    @Then("admin selects Student Categories")
    public void admin_selects_Student_Categories() {
        studentDashboardPage.studentCategories.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON CATEGORY PAGE
     */
    @Then("admin is directed to CATEGORY page with the text {string}")
    public void admin_is_directed_to_CATEGORY_page_with_the_text(String expetedCategoryPageText)
            throws InterruptedException {
        String actualCategoryPageText = studentCategoriesPage.createCategoryText.getText();
        CommonUtils.assertEquals(expetedCategoryPageText, actualCategoryPageText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /*
     * ENTERING TEXT IN CREATE CATEGORY TEXTBOX
     */
    @When("admin enters Category {string}")
    public void admin_enters_Category(String categoryName) {
        studentCategoriesPage.categoryText.sendKeys(categoryName);
    }

    /*
     * SAVING CATEGORY
     */
    @When("admin clicks on the Category Save button")
    public void admin_clicks_on_the_Category_Save_button() {
        studentCategoriesPage.categorySaveButton.click();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON CATEGORY PAGE
     */
    @Then("Category is succesfully saved and confirmation message displays {string}")
    public void category_is_succesfully_saved_and_confirmation_message_displays(
            String expectedCategorySavesSuccessfulyText) throws InterruptedException {
        String actualCategorySavesSuccessfulyText = studentCategoriesPage.categorySaveButton.getText();
        CommonUtils.assertEquals(expectedCategorySavesSuccessfulyText, actualCategorySavesSuccessfulyText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        Thread.sleep(1000);
    }

    /*
     * CLICKING ON THE CATEGORY DELETE BUTTON
     */
    @Then("admin clicks on the Category {string} Delete button")
    public void admin_clicks_on_the_Category_Delete_button(String categoryName) {
        StudentCategoriesPage.categoryDeleteLocator(categoryName).click();
    }

    /*
     * ACCEPT CATEGORY DELETE CONFIRMATION ALERT
     */
    @Then("Category is deleted")
    public void category_is_deleted() throws InterruptedException {
        WebDriverUtils.driver.switchTo().alert().accept();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        Thread.sleep(1000);
    }
}