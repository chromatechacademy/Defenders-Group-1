package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class ClassAndSectionStepIpml extends PageInitializer {

     // Going to the Class sub module site
     public static void navigatingToSubModuleClass(String url) {
         studentDashboardPage.academicsModule.click();
         studentDashboardPage.classSubModule.click();
         String studentClassUrl = WebDriverUtils.driver.getCurrentUrl();
         CommonUtils.assertEquals(url, studentClassUrl);
         CommonUtils.nonMobileScreenshots();
         CommonUtils.sleep(1000);
     }
 
     // Asserting that classes and sections are displayed
     public static void classAndSectionAssertion(String SDET, String testingFundamentals,
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
     public static void subModuleAssertion(String cyberSecurity,
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
