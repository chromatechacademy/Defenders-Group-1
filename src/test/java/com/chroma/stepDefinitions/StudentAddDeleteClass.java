package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentAcademicsClassPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAddDeleteClass extends PageInitializer {

    /*
     * SELECTING GLASS MODULE
     */
    @Then("admin selects Class")
    public void admin_selects_Class() {
        studentDashboardPage.classSubmodule.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON SECTIONS PAGE
     */
    @Then("admin is directed to Classes page with the text {string}")
    public void admin_is_directed_to_Classes_page_with_the_text(String expetedSelectionsPageText) {
        String actualSelectionsPageText = studentSelectionsPage.addSelectionText.getText();
        CommonUtils.assertEquals(expetedSelectionsPageText, actualSelectionsPageText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * WRITING THE CLASS NAME IN THE TEXT BOX
     */
    @When("admin enters Class {string}")
    public void admin_enters_Class(String className) {
        studentAcademicsClassPage.classTextBox.sendKeys(className);
    }

    /*
     * CLICKING ON THE SECTION CHECKBOX
     */
    @When("selects a Section {string}")
    public void selects_a_Section(String setionCBox) {
        StudentAcademicsClassPage.dynamicCheckboxModuleLocator(setionCBox).click();
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ASSERING RECORD SAVED SUCCESFULLY MESSAGE
     */
    @Then("Class is succesfully saved and confirmation message displays {string}")
    public void class_is_succesfully_saved_and_confirmation_message_displays(String expectedSuccessMessage) {
        String actualSuccessMessage = studentAcademicsClassPage.classSavedSuccesfullyText.getText();
        CommonUtils.assertEquals(expectedSuccessMessage, actualSuccessMessage);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * CLICKING ON THE DELETE BUTTON
     */
    @Then("admin clicks on the Class {string} Delete button")
    public void admin_clicks_on_the_Class_Delete_button(String classDeleteSelect) {
        StudentAcademicsClassPage.classDeleteLocator(classDeleteSelect).click();
    }

    /*
     * CONFIRM DELETE AND ASSERTING
     */
    @Then("Class is deleted")
    public void class_is_deleted() {
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.nonMobileScreenshots();
    }
}