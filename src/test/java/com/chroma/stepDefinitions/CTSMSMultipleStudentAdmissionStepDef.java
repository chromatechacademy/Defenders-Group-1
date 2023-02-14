package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
<<<<<<< HEAD
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

=======
import com.chroma.stepsImplementation.CTSMSMultipleStudentAdmissionStepImpl;
>>>>>>> 6d701a9ba3a43b9912bbab5dcc59daf302bbc1fa
import cucumber.api.java.en.Then;

public class CTSMSMultipleStudentAdmissionStepDef extends PageInitializer {

    @Then("an admin navigates to Bulk Delete Submodule")
    public void an_admin_navigates_to_Bulk_Delete_Submodule() {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
			StudentDashboardPage.dashboardHamburger().click();
		}
        bulkDeletePage.bulkDelete.click();
    }

    @Then("an admin selects Class {string} and Section {string}")
    public void an_admin_selects_Class_and_Section(String className, String sectionName) {
        CTSMSMultipleStudentAdmissionStepImpl.classAndSectionSelection(className, sectionName);
    }

    @Then("clicks on Search button")
    public void clicks_on_Search_button() {
        bulkDeletePage.searchButton.click();
    }

    @Then("admitted student with first name {string} and last name {string} is deleted")
    public void admitted_student_with_first_name_and_last_name_is_deleted(String firstName, String lastName) {
<<<<<<< HEAD
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
			JavascriptUtils.scrollIntoView(BulkDeletePage.studentRecordLocator(firstName + " " + lastName));
		}
        BulkDeletePage.studentRecordLocator(firstName + " " + lastName).click();
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
			JavascriptUtils.scrollIntoView(bulkDeletePage.deleteButton);
		}
        CommonUtils.sleep(500);
        bulkDeletePage.deleteButton.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(500);
=======
        CTSMSMultipleStudentAdmissionStepImpl.deletingAdmittedStudent(firstName, lastName);
>>>>>>> 6d701a9ba3a43b9912bbab5dcc59daf302bbc1fa
    }

    @Then("admitted student with student admission number {string} is deleted")
    public void admitted_student_with_student_admission_number_is_deleted(String admissionNumberDeleted) {
<<<<<<< HEAD
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
			JavascriptUtils.scrollIntoView(BulkDeletePage.studentDeleteRecordLocator(admissionNumberDeleted));
		}
        BulkDeletePage.studentDeleteRecordLocator(admissionNumberDeleted).click();
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
			JavascriptUtils.scrollIntoView(bulkDeletePage.deleteButton);
		}
        CommonUtils.sleep(500);
        bulkDeletePage.deleteButton.click();
        CommonUtils.nonMobileAutoAcceptAlert();
        CommonUtils.sleep(500);
=======
        CTSMSMultipleStudentAdmissionStepImpl.deletedStudentAssertion(admissionNumberDeleted);
>>>>>>> 6d701a9ba3a43b9912bbab5dcc59daf302bbc1fa
    }
}
