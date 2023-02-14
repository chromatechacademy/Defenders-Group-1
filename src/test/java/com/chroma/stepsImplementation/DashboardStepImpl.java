package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;

public class DashboardStepImpl extends PageInitializer {

    // Logging in with credentials
    public static void adminLogsIn(String username, String password) {
        studentLoginPage.userNameTextBox.sendKeys(username);
        studentLoginPage.passwordTextBox.sendKeys(password);
        studentLoginPage.signInButton.click();
    }

    // Asserting if module text is shown properly
    public static void studentDashboardAssertion(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            StudentDashboardPage.dashboardHamburger().click();
        }
        CommonUtils.sleep(1000);
        String studentInformationAText = studentDashboardPage.studentInformationModule.getText();
        CommonUtils.assertEquals(studentInformationAText, studentInformation);
        String feesCollectionAText = studentDashboardPage.feesCollectionLink.getText();
        CommonUtils.assertEquals(feesCollectionAText, feesCollection);
        String incomeAText = studentDashboardPage.incomeModule.getText();
        CommonUtils.assertEquals(incomeAText, income);
        String expensesAText = studentDashboardPage.expensesModule.getText();
        CommonUtils.assertEquals(expensesAText, expenses);
        String academicsAText = studentDashboardPage.academicsModule.getText();
        CommonUtils.assertEquals(academicsAText, academics);
        String humanResourceAText = studentDashboardPage.humanResourceModule.getText();
        CommonUtils.assertEquals(humanResourceAText, humanResource);
        String homeworkAText = studentDashboardPage.homeworkLink.getText();
        CommonUtils.assertEquals(homeworkAText, homework);
        String reportsAText = studentDashboardPage.reportsModule.getText();
        CommonUtils.assertEquals(reportsAText, reports);
        CommonUtils.nonMobileScreenshots();
    }
}
