package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AcademicsModulePage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsModuleStepDef extends PageInitializer {

    @When("user clicks on Academics Module")
    public void user_clicks_on_Academics_Module() {
        AcademicsModulePage.academicsModuleButton.click();
    }

    @Then("the following modules should display: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_display(String classTimeTable, String teachersTimetable,
            String assignClassteacher, String promoteStudents, String subjectGroup, String subjects, String classButton,
            String sections) {

        CommonUtils.sleep(2000);
        String expectedClassTimetable = AcademicsModulePage.classTimetableModule.getText();
        CommonUtils.assertEquals(classTimeTable, expectedClassTimetable);

        String expectedTeachersTimetable = AcademicsModulePage.teachersTimetableModule.getText();
        CommonUtils.assertEquals(teachersTimetable, expectedTeachersTimetable);

        String expectedAssignClassteacher = AcademicsModulePage.assignClassTeacherModule.getText();
        CommonUtils.assertEquals(assignClassteacher, expectedAssignClassteacher);

        String expectedPromoteStudents = AcademicsModulePage.promoteStudentsModule.getText();
        CommonUtils.assertEquals(promoteStudents, expectedPromoteStudents);

        String expectedSubjectGroup = AcademicsModulePage.subjectsGroupModule.getText();
        CommonUtils.assertEquals(subjectGroup, expectedSubjectGroup);

        String expectedSubjects = AcademicsModulePage.subjectsModule.getText();
        CommonUtils.assertEquals(subjects, expectedSubjects);

        String expectedClassButton = AcademicsModulePage.classModule.getText();
        CommonUtils.assertEquals(classButton, expectedClassButton);

        String expectedSections = AcademicsModulePage.sectionModule.getText();
        CommonUtils.assertEquals(sections, expectedSections);

    }

}
