package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDef extends PageInitializer {

    // Going to login page
    @Given("an admin user is on the page {string}")
    public void an_admin_user_is_on_the_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    // Logging in with credentials
    @When("an admin user logs in with valid username {string} and password {string}")
    public void a_user_logs_in_with_correct_information_and_password(String username, String password) {
        studentLoginPage.userNameTextBox.sendKeys(username);
        studentLoginPage.passwordTextBox.sendKeys(password);
        studentLoginPage.signInButton.click();
    }

    // Asserting if module text is shown properly
    @Then("module {string} , {string}, {string} , {string} , {string} , {string} , {string} , {string} are displayed")
    public void modules_and_should_be_displayed(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports) {

        if (CommonUtils.isElementDisplayed(studentDashboardPage.studentInformationModule)) {
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
        } else {
            studentDashboardPage.sidemenuButton.click();
            CommonUtils.sleep(3000);
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
}