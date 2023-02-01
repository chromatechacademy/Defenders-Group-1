package com.chroma.stepDefinitions;

import java.io.IOException;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLogsInStepDef extends PageInitializer {

    @Given("an admin user is on the login page {string}")
    public void an_admin_user_is_on_the_login_page(String url) throws IOException, InterruptedException {
        WebDriverUtils.driver.get(url);
    }

    @When("an admin user logins with valid credentials username {string} and password {string}")
    public void an_admin_user_logins_with_valid_credentials_username_and_password(String userName, String password)
    {
       studentLoginPage.userNameTextBox.sendKeys(userName);
       studentLoginPage.passwordTextBox.sendKeys(password);
       studentLoginPage.signInButton.click();
    }

    @Then("an admin is landed on a home page with URL {string}")
    public void an_admin_is_landed_on_a_home_page_with_URL(String url) {
        String actualHomePageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, actualHomePageUrl);
    }

    @When("an admin user clicks on Homework")
    public void an_admin_user_clicks_on_Homework() {
        studentDashboardPage.homeworkLink.click();
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
    public void all_sublinks_should_be_displayed_such_as(String collectFees,String searchFeesPayment,
            String searchDueFees,String feesMaster,String feesGroup,String feesType,String feesDiscount,
            String feesCarryForward,String feesReminder) throws InterruptedException {
        String collectFeesIsDisplayed = studentDashboardPage.subLinkCollectFees.getText();
        System.out.println("TEXT1 " + collectFeesIsDisplayed);
        CommonUtils.assertEquals(collectFees, collectFeesIsDisplayed);

        
        String searchFeesPaymentISDisplayed = studentDashboardPage.subLinkSearchFeesPayment.getText();
        System.out.println("TEXT2 " + searchFeesPaymentISDisplayed );
        CommonUtils.assertEquals(searchFeesPayment,searchFeesPaymentISDisplayed);

        
        String searchDueFeesIsDisplayed = studentDashboardPage.subLinkSearchDueFees.getText();
        System.out.println("TEXT3 " + searchDueFeesIsDisplayed);
        CommonUtils.assertEquals(searchDueFees, searchDueFeesIsDisplayed);
        
    }
}
    

