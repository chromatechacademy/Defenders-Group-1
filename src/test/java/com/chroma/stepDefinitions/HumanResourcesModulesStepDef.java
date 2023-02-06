package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.HumanResourceModulePage;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HumanResourcesModulesStepDef extends PageInitializer {
    
    @When("user clicks on HR Module")
    public void user_clicks_on_HR_Module() {
        HumanResourceModulePage.hrModuleButton.click();
    }

    @Then("the following modules should display: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} {string}")
    public void the_following_modules_should_display(String staffDirectory, String staffAttendance,
            String payroll, String approveLeaveRequest, String applyLeave, String leaveType, String teachersRating,
            String department, String designation) {

        CommonUtils.sleep(2000);
        String expectedSD = HumanResourceModulePage.staffDirectoryModule.getText();
        CommonUtils.assertEquals(staffDirectory, expectedSD);

        String expectedSA = HumanResourceModulePage.staffAttendanceModule.getText();
        CommonUtils.assertEquals(staffAttendance, expectedSA);

        String expectedPayroll = HumanResourceModulePage.payrollModule.getText();
        CommonUtils.assertEquals(payroll, expectedPayroll);

        String expectedLR = HumanResourceModulePage.approveLeaveRequestModule.getText();
        CommonUtils.assertEquals(approveLeaveRequest, expectedLR);

        String expectedAL = HumanResourceModulePage.applyLeaveModule.getText();
        CommonUtils.assertEquals(applyLeave, expectedAL);

        String expectedLT = HumanResourceModulePage.leaveTypeModule.getText();
        CommonUtils.assertEquals(leaveType, expectedLT);

        String expectedTR = HumanResourceModulePage.teachersRatingModule.getText();
        CommonUtils.assertEquals(teachersRating, expectedTR);

        String expectedDepartment = HumanResourceModulePage.departmentModule.getText();
        CommonUtils.assertEquals(department, expectedDepartment);

        String expectedDesignation = HumanResourceModulePage.designationModule.getText();
        CommonUtils.assertEquals(designation, expectedDesignation);



    }


}
