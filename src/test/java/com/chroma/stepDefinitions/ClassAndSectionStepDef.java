package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassAndSectionStepDef extends PageInitializer {
    
    // Going to the Class sub module site
    @When("an admin user navigates to the Class sub module {string}")
    public void an_admin_user_navigates_to_the_Class_sub_module(String url) {
        studentDashboardPage.academicsModule.click();
        studentDashboardPage.classSubModule.click();
        String studentClassUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentClassUrl);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(1000);
    }

    // Asserting that classes and sections are displayed
    @Then("SDET is displayed {string} with the following sections {string} , {string} , {string} , {string} , {string} , {string}, {string} , {string} , {string} , {string}")
    public void sdet_is_displayed_with_the_following_sections(String SDET, String testingFundamentals,
            String sDLCMethodologies, String seleniumTestAutomation, String cucumberFundamentals, String aPITesting,
            String gitGithub, String java11ForCoolPeople, String mobileTestAutomation, String accessibilityTesting,
            String dataBaseTesting) {
        String actualSDETText = studentClassPage.sDETText.getText();
        CommonUtils.assertEquals(actualSDETText, SDET);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualTestingFundamentalString = studentClassPage.testingFundamentalsText.getText();
        CommonUtils.assertEquals(actualTestingFundamentalString, testingFundamentals);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualsDLCMethodText = studentClassPage.sDLCMethodologiesText.getText();
        CommonUtils.assertEquals(actualsDLCMethodText, sDLCMethodologies);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualSelTestAuto = studentClassPage.seleniumTestAutomationTest.getText();
        CommonUtils.assertEquals(actualSelTestAuto, seleniumTestAutomation);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualcucumberFund = studentClassPage.cucumberFundamentalsText.getText();
        CommonUtils.assertEquals(actualcucumberFund, cucumberFundamentals);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualAPITest = studentClassPage.aPITestingText.getText();
        CommonUtils.assertEquals(actualAPITest, aPITesting);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualGitGitHub = studentClassPage.git_GitHubText.getText();
        CommonUtils.assertEquals(actualGitGitHub, gitGithub);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualJava11ForCoolPPL = studentClassPage.java11ForCoolPeopleText.getText();
        CommonUtils.assertEquals(actualJava11ForCoolPPL, java11ForCoolPeople);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualMobileTestAuto = studentClassPage.mobileTestAutomationText.getText();
        CommonUtils.assertEquals(actualMobileTestAuto, mobileTestAutomation);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualAccessTesting = studentClassPage.accessibilityTestingText.getText();
        CommonUtils.assertEquals(actualAccessTesting, accessibilityTesting);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualDataBTest = studentClassPage.dataBaseTestingText.getText();
        CommonUtils.assertEquals(actualDataBTest, dataBaseTesting);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    // Asserting that classes and sections are displayed
    @Then("Cyber Security is displayed {string} with the following sections {string} , {string} , {string} , {string}")
    public void cyber_Security_is_displayed_with_the_following_sections(String cyberSecurity,
            String networkingFundamentals,
            String linuxFundamentals, String cIATriad, String penetrationTestingEtheicalHacking) {
        String actualCyberSecurityText = studentClassPage.cyberSecurityText.getText();
        CommonUtils.assertEquals(actualCyberSecurityText, cyberSecurity);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualNetworkFund = studentClassPage.networkingFundamentalsText.getText();
        CommonUtils.assertEquals(actualNetworkFund, networkingFundamentals);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualLinuxFund = studentClassPage.linuxFundamentalsText.getText();
        CommonUtils.assertEquals(actualLinuxFund, linuxFundamentals);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String actualCIATriad = studentClassPage.cIATriadText.getText();
        CommonUtils.assertEquals(actualCIATriad, cIATriad);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        String ActualPeneTestEthicHacking = studentClassPage.penetrationTestingEthicalHackingText.getText();
        CommonUtils.assertEquals(ActualPeneTestEthicHacking, penetrationTestingEtheicalHacking);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}