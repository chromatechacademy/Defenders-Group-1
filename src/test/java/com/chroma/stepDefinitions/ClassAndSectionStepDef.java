package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.StudentDetails;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
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
    Thread.sleep(2000);
    //StudentDetails.classDropdown.click();
    Select classDropdown = new Select(driver.findElement(By.xpath("//select[@id ='class_id'] ")));
    classDropdown.selectByVisibleText("SDET");
    Thread.sleep(3000);
}
@When("Section drop down is selected")
public void section_drop_down_is_selected() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
@Then("the following options are shown {string} , {string} , {string} , {string} , {string} , {string}, {string} , {string} , {string} , {string}")
public void the_following_options_are_shown(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("Cyber Security is selected")
public void cyber_Security_is_selected() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
@Then("the following options are shown {string} , {string} , {string} , {string}")
public void the_following_options_are_shown(String string, String string2, String string3, String string4) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
