package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.ClassAndSectionStepIpml;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassAndSectionStepDef extends PageInitializer {

    // Going to the Class sub module site
    @When("an admin user navigates to the Class sub module {string}")
    public void an_admin_user_navigates_to_the_Class_sub_module(String url) {
        ClassAndSectionStepIpml.navigatingToSubModuleClass(url);
    }

    // Asserting that classes and sections are displayed
    @Then("SDET is displayed {string} with the following sections {string} , {string} , {string} , {string} , {string} , {string}, {string} , {string} , {string} , {string}")
    public void sdet_is_displayed_with_the_following_sections(String SDET, String testingFundamentals,
            String sDLCMethodologies, String seleniumTestAutomation, String cucumberFundamentals, String aPITesting,
            String gitGithub, String java11ForCoolPeople, String mobileTestAutomation, String accessibilityTesting,
            String dataBaseTesting) {
        ClassAndSectionStepIpml.classAndSectionAssertion(SDET, testingFundamentals, sDLCMethodologies,
                seleniumTestAutomation, cucumberFundamentals, aPITesting, gitGithub, java11ForCoolPeople,
                mobileTestAutomation, accessibilityTesting, dataBaseTesting);
    }

    // Asserting that classes and sections are displayed
    @Then("Cyber Security is displayed {string} with the following sections {string} , {string} , {string} , {string}")
    public void cyber_Security_is_displayed_with_the_following_sections(String cyberSecurity,
            String networkingFundamentals,
            String linuxFundamentals, String cIATriad, String penetrationTestingEtheicalHacking) {
        ClassAndSectionStepIpml.subModuleAssertion(cyberSecurity, networkingFundamentals, linuxFundamentals, cIATriad,
                penetrationTestingEtheicalHacking);
    }
}