package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
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
        CommonUtils.nonMobileScreenshots();
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
        CommonUtils.nonMobileScreenshots();
        String actualTestingFundamentalString = studentClassPage.testingFundamentalsText.getText();
        CommonUtils.assertEquals(actualTestingFundamentalString, testingFundamentals);
        CommonUtils.nonMobileScreenshots();
        String actualsDLCMethodText = studentClassPage.sDLCMethodologiesText.getText();
        CommonUtils.assertEquals(actualsDLCMethodText, sDLCMethodologies);
        CommonUtils.nonMobileScreenshots();
        String actualSelTestAuto = studentClassPage.seleniumTestAutomationTest.getText();
        CommonUtils.assertEquals(actualSelTestAuto, seleniumTestAutomation);
        CommonUtils.nonMobileScreenshots();
        String actualcucumberFund = studentClassPage.cucumberFundamentalsText.getText();
        CommonUtils.assertEquals(actualcucumberFund, cucumberFundamentals);
        CommonUtils.nonMobileScreenshots();
        String actualAPITest = studentClassPage.aPITestingText.getText();
        CommonUtils.assertEquals(actualAPITest, aPITesting);
        CommonUtils.nonMobileScreenshots();
        String actualGitGitHub = studentClassPage.git_GitHubText.getText();
        CommonUtils.assertEquals(actualGitGitHub, gitGithub);
        CommonUtils.nonMobileScreenshots();
        String actualJava11ForCoolPPL = studentClassPage.java11ForCoolPeopleText.getText();
        CommonUtils.assertEquals(actualJava11ForCoolPPL, java11ForCoolPeople);
        CommonUtils.nonMobileScreenshots();
        String actualMobileTestAuto = studentClassPage.mobileTestAutomationText.getText();
        CommonUtils.assertEquals(actualMobileTestAuto, mobileTestAutomation);
        CommonUtils.nonMobileScreenshots();
        String actualAccessTesting = studentClassPage.accessibilityTestingText.getText();
        CommonUtils.assertEquals(actualAccessTesting, accessibilityTesting);
        CommonUtils.nonMobileScreenshots();
        String actualDataBTest = studentClassPage.dataBaseTestingText.getText();
        CommonUtils.assertEquals(actualDataBTest, dataBaseTesting);
        CommonUtils.nonMobileScreenshots();
    }

    // Asserting that classes and sections are displayed
    @Then("Cyber Security is displayed {string} with the following sections {string} , {string} , {string} , {string}")
    public void cyber_Security_is_displayed_with_the_following_sections(String cyberSecurity,
            String networkingFundamentals,
            String linuxFundamentals, String cIATriad, String penetrationTestingEtheicalHacking) {
        String actualCyberSecurityText = studentClassPage.cyberSecurityText.getText();
        CommonUtils.assertEquals(actualCyberSecurityText, cyberSecurity);
        CommonUtils.nonMobileScreenshots();
        String actualNetworkFund = studentClassPage.networkingFundamentalsText.getText();
        CommonUtils.assertEquals(actualNetworkFund, networkingFundamentals);
        CommonUtils.nonMobileScreenshots();
        String actualLinuxFund = studentClassPage.linuxFundamentalsText.getText();
        CommonUtils.assertEquals(actualLinuxFund, linuxFundamentals);
        CommonUtils.nonMobileScreenshots();
        String actualCIATriad = studentClassPage.cIATriadText.getText();
        CommonUtils.assertEquals(actualCIATriad, cIATriad);
        CommonUtils.nonMobileScreenshots();
        String ActualPeneTestEthicHacking = studentClassPage.penetrationTestingEthicalHackingText.getText();
        CommonUtils.assertEquals(ActualPeneTestEthicHacking, penetrationTestingEtheicalHacking);
        CommonUtils.nonMobileScreenshots();
    }
}