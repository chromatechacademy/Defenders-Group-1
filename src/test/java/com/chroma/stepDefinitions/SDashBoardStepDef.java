package com.chroma.stepDefinitions;


import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.SDashBoardPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDashBoardStepDef extends PageInitializer {

    SDashBoardPage dashBoardPage = new SDashBoardPage();

    @Given("a user is on the website page {string}")
    public void a_user_is_on_the_website_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("a user logs in with correct information {string} and password {string}")
    public void a_user_logs_in_with_correct_information_and_password(String username, String password) throws InterruptedException {
        Thread.sleep(12000, 0);
    }

    @Then("modules {string} , {string} , {string} , {string} , {string} , {string} , {string} , and {string} should be displayed")
    public void modules_and_should_be_displayed(String studentInformation, String feesCollection, String income,
            String expenses, String academics, String humanResource, String homework, String reports) {

                String studentInformationAText = dashBoardPage.studentInformationModule.getText();
                CommonUtils.assertEquals(studentInformationAText, studentInformation);

                String feesCollectionAText = dashBoardPage.feesCollectionModule.getText();
                CommonUtils.assertEquals(feesCollectionAText, feesCollection);

                String incomeAText = dashBoardPage.incomeModule.getText();
                CommonUtils.assertEquals(incomeAText, income);

                String expensesAText = dashBoardPage.expensesModule.getText();
                CommonUtils.assertEquals(expensesAText, expenses);

                String academicsAText = dashBoardPage.academicsModule.getText();
                CommonUtils.assertEquals(academicsAText, academics);

                String humanResourceAText = dashBoardPage.humanResourceModule.getText();
                CommonUtils.assertEquals(humanResourceAText,humanResource);

                String homeworkAText = dashBoardPage.homeworkModule.getText();
                CommonUtils.assertEquals(homeworkAText, homework);

                String reportsAText = dashBoardPage.reportsModule.getText();
                CommonUtils.assertEquals(reportsAText, reports);


    
    }

}
