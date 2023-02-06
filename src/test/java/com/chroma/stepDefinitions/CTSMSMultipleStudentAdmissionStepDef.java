package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;

public class CTSMSMultipleStudentAdmissionStepDef extends PageInitializer {

    @Then("an admin navigates to Bulk Delete Submodule")
    public void an_admin_navigates_to_Bulk_Delete_Submodule() {
        bulkDeletePage.bulkDelete.click();
    }

    @Then("an admin selects Class {string} and Section {string}")
    public void an_admin_selects_Class_and_Section(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, bulkDeletePage.classNameDropdown);
        CommonUtils.selectDropDownValue(sectionName, bulkDeletePage.sectionNameDropdown);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("clicks on Search button")
    public void clicks_on_Search_button() {
        bulkDeletePage.searchButton.click();
    }

    @Then("admitted student with first name {string} and last name {string} is deleted")
    public void admitted_student_with_first_name_and_last_name_is_deleted(String firstName, String lastName) {
        BulkDeletePage.studentRecordLocator(firstName + " " + lastName).click();
        CommonUtils.sleep(1000);
        bulkDeletePage.deleteButton.click();
        CommonUtils.sleep(2000);
        WebDriverUtils.driver.switchTo().alert().accept();
    }
}