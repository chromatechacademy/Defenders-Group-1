package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDefinitions extends PageInitializer{
    
    @When("clicks on Income Module")
    public void clicks_on_Income_Module() {
        incomeModulePage.incomeModule.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("Sub Modules {string}, {string}, and {string} display")
    public void sub_Modules_and_display(String expectedAddIncomeText, String expectedSearchIncomeText, String expectedIncomeHeadText){

        String actualAddIncomeText = incomeModulePage.addIncomeSubModule.getText();
        CommonUtils.assertEquals(expectedAddIncomeText, actualAddIncomeText);
        String actualSearchIncomeText = incomeModulePage.searchIncomeSubModule.getText();
        CommonUtils.assertEquals(expectedSearchIncomeText, actualSearchIncomeText);
        String actualIncomeHeadText = incomeModulePage.incomeHeadSubModule.getText();
        CommonUtils.assertEquals(expectedIncomeHeadText, actualIncomeHeadText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}