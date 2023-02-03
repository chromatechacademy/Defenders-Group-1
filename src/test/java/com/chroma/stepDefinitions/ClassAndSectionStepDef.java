package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassAndSectionStepDef extends PageInitializer {
    @When("an admin user navigates to the Class sub module {string}")
    public void an_admin_user_navigates_to_the_Class_sub_module(String url) {
        studentDashboardPage.academicsModule.click();
        studentDashboardPage.classSubModule.click();
        String studentDetailsUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentDetailsUrl);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(1000);

    }

    @Then("SDET is displayed {string} with the following sections {string} , {string} , {string} , {string} , {string} , {string}, {string} , {string} , {string} , {string}")
    public void sdet_is_displayed_with_the_following_sections(String SDET, String testingFundamentals,
            String sDLCMethodologies, String seleniumTestAutomation, String cucumberFundamentals, String aPITesting,
            String gitGithub, String java11ForCoolPeople, String mobileTestAutomation, String accessibilityTesting,
            String dataBaseTesting) {

        String actualSDETText = studentClassPage.sDETText.getText();
        CommonUtils.assertEquals(actualSDETText, SDET);
        String actualTestingFundamentalString = studentClassPage.testingFundamentalsText.getText();
        CommonUtils.assertEquals(actualTestingFundamentalString, testingFundamentals);
        String actualsDLCMethodText = studentClassPage.sDLCMethodologiesText.getText();
        CommonUtils.assertEquals(actualsDLCMethodText, sDLCMethodologies);
        String actualSelTestAuto = studentClassPage.seleniumTestAutomationTest.getText();
        CommonUtils.assertEquals(actualSelTestAuto, seleniumTestAutomation);
        String actualcucumberFund = studentClassPage.cucumberFundamentalsText.getText();
        CommonUtils.assertEquals(actualcucumberFund, cucumberFundamentals);
        String actualAPITest = studentClassPage.aPITestingText.getText();
        CommonUtils.assertEquals(actualAPITest, aPITesting);
        String actualGitGitHub = studentClassPage.git_GitHubText.getText();
        CommonUtils.assertEquals(actualGitGitHub, gitGithub);
        String actualJava11ForCoolPPL = studentClassPage.java11ForCoolPeopleText.getText();
        CommonUtils.assertEquals(actualJava11ForCoolPPL, java11ForCoolPeople);
        String actualMobileTestAuto = studentClassPage.mobileTestAutomationText.getText();
        CommonUtils.assertEquals(actualMobileTestAuto, mobileTestAutomation);
        String actualAccessTesting = studentClassPage.accessibilityTestingText.getText();
        CommonUtils.assertEquals(actualAccessTesting, accessibilityTesting);
        String actualDataBTest = studentClassPage.dataBaseTestingText.getText();
        CommonUtils.assertEquals(actualDataBTest, dataBaseTesting);

    }

   
    @Then("Cyber Security is displayed {string} with the following sections {string} , {string} , {string} , {string}")
public void cyber_Security_is_displayed_with_the_following_sections(String cyberSecurity, String networkingFundamentals,
String linuxFundamentals, String cIATriad, String penetrationTestingEtheicalHacking) {
        String actualCyberSecurityText = studentClassPage.cyberSecurityText.getText();
        CommonUtils.assertEquals(actualCyberSecurityText, cyberSecurity);
        String actualNetworkFund = studentClassPage.networkingFundamentalsText.getText();
        CommonUtils.assertEquals(actualNetworkFund, networkingFundamentals);
        String actualLinuxFund = studentClassPage.linuxFundamentalsText.getText();
        CommonUtils.assertEquals(actualLinuxFund, linuxFundamentals);
        String actualCIATriad = studentClassPage.cIATriadText.getText();
        CommonUtils.assertEquals(actualCIATriad, cIATriad);
        String ActualPeneTestEthicHacking = studentClassPage.penetrationTestingEthicalHackingText.getText();
        CommonUtils.assertEquals(ActualPeneTestEthicHacking, penetrationTestingEtheicalHacking);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
}

}
