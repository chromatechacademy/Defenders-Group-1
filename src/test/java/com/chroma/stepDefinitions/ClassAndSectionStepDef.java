package com.chroma.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassAndSectionStepDef extends PageInitializer {

    @When("an admin user navigates to the student details sub module {string}")
    public void an_admin_user_navigates_to_the_student_details_sub_module(String url) {
        studentDashboardPage.studentInformationModule.click();
        studentDashboardPage.studentDetailsSubModule.click();
        String studentDetailsUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, studentDetailsUrl);
    }

    @When("SDET is selected")
    public void sdet_is_selected() throws InterruptedException {
        CommonUtils.selectDropDownValue(studentDetailsPage.classDropdown, 0);
        CommonUtils.sleep(1000);;

    }

    @Then("section is selected the following options are shown {string} , {string} , {string} , {string} , {string} , {string}, {string} , {string} , {string} , {string}")
    public void section_is_selected_the_following_options_are_shown(String testingFundamentals,
            String sDLCMethodologies, String seleniumTestAutomation, String cucumberFundamentals, String aPITesting,
            String gitGithub, String java11ForCoolPeople, String mobileTestAutomation, String accessibilityTesting,
            String dataBaseTesting) {

    }

    @When("Cyber Security is selected")
    public void cyber_Security_is_selected()  {

        CommonUtils.selectDropDownValue("Cyber Security", studentDetailsPage.classDropdown);
        CommonUtils.sleep(1000);;
    }

    @Then("section is selected the following options are shown {string} , {string} , {string} , {string}")
    public void section_is_selected_the_following_options_are_shown(String networkingFundamentals,
            String linuxFundamentals, String cIATriad, String penetrationTestingEtheicalHacking)
             {
        Select select = new Select(studentDetailsPage.selectDropDown);
        List<WebElement> elements = select.getOptions();
        List<String> cyberOptionTexts = new ArrayList<>();

        for (WebElement element : elements) {
            cyberOptionTexts.add(element.getText());
        }

        CommonUtils.selectDropDownValue(studentDetailsPage.selectDropDown, 1);
        CommonUtils.assertEquals(cyberOptionTexts.get(1), networkingFundamentals);
        CommonUtils.sleep(1000);

        CommonUtils.selectDropDownValue(studentDetailsPage.selectDropDown, 2);
        CommonUtils.assertEquals(cyberOptionTexts.get(2), linuxFundamentals);
        CommonUtils.sleep(1000);
        CommonUtils.selectDropDownValue(studentDetailsPage.selectDropDown, 3);
        CommonUtils.assertEquals(cyberOptionTexts.get(3), cIATriad);
        CommonUtils.sleep(1000);
    
        CommonUtils.selectDropDownValue(studentDetailsPage.selectDropDown, 4);
        CommonUtils.assertEquals(cyberOptionTexts.get(4), penetrationTestingEtheicalHacking);
        CommonUtils.sleep(1000);
    }
   
}
