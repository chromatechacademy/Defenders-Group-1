package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
<<<<<<< HEAD
import com.chroma.pages.StudentDashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
=======
import com.chroma.stepsImplementation.AdminLogsInStepImpl;
>>>>>>> 6d701a9ba3a43b9912bbab5dcc59daf302bbc1fa
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLogsInStepDef extends PageInitializer {

    // Admin user is on the log in page
    @Given("an admin user is on the login page {string}")
    public void an_admin_user_is_on_the_login_page(String url) {
        AdminLogsInStepImpl.adminOnTheLoginPage(url);
    }

    // Admin user logs in with valis credentials
    @When("an admin user logins with valid credentials username {string} and password {string}")
    public void an_admin_user_logins_with_valid_credentials_username_and_password(String userName, String password) {
        AdminLogsInStepImpl.adminLogsInWithValidCredentials(userName, password);
    }

    // Admin user is on the home page
    @Then("an admin is landed on a home page with URL {string}")
    public void an_admin_is_landed_on_a_home_page_with_URL(String url) {
<<<<<<< HEAD
        String actualHomePageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, actualHomePageUrl);
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
			StudentDashboardPage.dashboardHamburger().click();
		}
        CommonUtils.nonMobileScreenshots();
=======
        AdminLogsInStepImpl.adminDirectedToHomePage(url);
>>>>>>> 6d701a9ba3a43b9912bbab5dcc59daf302bbc1fa
    }
}