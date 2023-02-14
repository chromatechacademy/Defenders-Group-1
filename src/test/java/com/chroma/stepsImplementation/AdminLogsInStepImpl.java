package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class AdminLogsInStepImpl extends PageInitializer {

    // Admin user is on the log in page
    public static void adminOnTheLoginPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    // Admin user logs in with valis credentials
    public static void adminLogsInWithValidCredentials(String userName, String password) {
        studentLoginPage.userNameTextBox.sendKeys(userName);
        studentLoginPage.passwordTextBox.sendKeys(password);
        studentLoginPage.signInButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    // Admin user is on the home page
    public static void adminDirectedToHomePage(String url) {
        String actualHomePageUrl = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, actualHomePageUrl);
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            StudentDashboardPage.dashboardHamburger().click();
            CommonUtils.nonMobileScreenshots();
        }
    }
}
