package com.chroma.stepDefinitions;

import java.io.IOException;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLogsInStepDef extends PageInitializer {

    @Given("an admin user is on the login page {string}")
    public void an_admin_user_is_on_the_login_page(String url) throws IOException, InterruptedException {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("an admin user logins with valid credentials username {string} and password {string}")
    public void an_admin_user_logins_with_valid_credentials_username_and_password(String userName, String password) {
        studentLoginPage.userNameTextBox.sendKeys(userName);
        studentLoginPage.passwordTextBox.sendKeys(password);
        studentLoginPage.signInButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("an admin is landed on a home page with URL {string}")
    public void an_admin_is_landed_on_a_home_page_with_URL(String url) {
        String actualHomePageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, actualHomePageUrl);
    }

    @When("an admin user clicks on Homework")
    public void an_admin_user_clicks_on_Homework() {
        studentDashboardPage.homeworkLink.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("an admin user should see {string} link")
    public void an_admin_user_should_see_link(String subModuleLink) {
        String actualSubLinkText = studentDashboardPage.subLinkHomework.getText();
        CommonUtils.assertEquals(subModuleLink, actualSubLinkText);

    }

    @When("an admin user clicks on Fees Collection module")
    public void an_admin_user_clicks_on_Fees_Collection_module() {
        studentDashboardPage.feesCollectionLink.click();
    }

    @Then("all sublinks should be displayed such as {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void all_sublinks_should_be_displayed_such_as(String collectFees, String searchFeesPayment,
            String searchDueFees, String feesMaster, String feesGroup, String feesType, String feesDiscount,
            String feesCarryForward, String feesReminder) {
        String collectFeesIsDisplayed = studentDashboardPage.subLinkCollectFees.getText();
        CommonUtils.assertEquals(collectFees, collectFeesIsDisplayed);
        CommonUtils.sleep(1000);

        String searchFeesPaymentIsDisplayed = studentDashboardPage.subLinkSearchFeesPayment.getText();
        CommonUtils.assertEquals(searchFeesPayment, searchFeesPaymentIsDisplayed);

        String searchDueFeesIsDisplayed = studentDashboardPage.subLinkSearchDueFees.getText();
        CommonUtils.assertEquals(searchDueFees, searchDueFeesIsDisplayed);

        String feesMasterIsDisplayed = studentDashboardPage.subLinkFeesMaster.getText();
        CommonUtils.assertEquals(feesMaster, feesMasterIsDisplayed);

        String feesGroupIsDisplayed = studentDashboardPage.subLinkFeesGroup.getText();
        CommonUtils.assertEquals(feesGroup, feesGroupIsDisplayed);

        String feesTypeIsDisplayed = studentDashboardPage.subLinkFeesType.getText();
        CommonUtils.assertEquals(feesType, feesTypeIsDisplayed);

        String feesDiscountIsDisplayed = studentDashboardPage.subLinkFeesDiscount.getText();
        CommonUtils.assertEquals(feesDiscount, feesDiscountIsDisplayed);

        String feesCarryForwardIsDisplayed = studentDashboardPage.subLinkFeesCarryForward.getText();
        CommonUtils.assertEquals(feesCarryForward, feesCarryForwardIsDisplayed);

        String feesReminderIsDisplayed = studentDashboardPage.subLinkFeesReminder.getText();
        CommonUtils.assertEquals(feesReminder, feesReminderIsDisplayed);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
}
