package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class StudentInvalidCredentialsLoginStepImpl extends PageInitializer {

    /* Admin user logs in with invalid credentials */
    public static void invalidCredentials(String invalidUserName,
            String invalidPassword) {
        studentLoginPage.userNameTextBox.sendKeys(invalidUserName);
        studentLoginPage.passwordTextBox.sendKeys(invalidPassword);
        studentLoginPage.signInButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Veryfing admin was not able to login with invalid credentials */
    public static void notAbleToLogin(String expectedErrorMessage) {
        String actualErrorMessage = studentLoginPage.invalidUserMessage.getText();
        CommonUtils.assertEquals(expectedErrorMessage, actualErrorMessage);
        CommonUtils.nonMobileScreenshots();
    }
}
