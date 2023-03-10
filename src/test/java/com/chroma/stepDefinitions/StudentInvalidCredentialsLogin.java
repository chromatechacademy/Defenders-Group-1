package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentInvalidCredentialsLoginStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInvalidCredentialsLogin extends PageInitializer {

    @When("an admin user logins with invalid credentials username {string} and password {string}")
    public void an_admin_user_logins_with_invalid_credentials_username_and_password(String invalidUserName,
            String invalidPassword) {
        StudentInvalidCredentialsLoginStepImpl.invalidCredentials(invalidUserName, invalidPassword);
    }

    @Then("the the admin will not be able to log in and the the {string} should be displayed")
    public void the_the_admin_will_not_be_able_to_log_in_and_the_the_should_be_displayed(String expectedErrorMessage) {
       StudentInvalidCredentialsLoginStepImpl.notAbleToLogin(expectedErrorMessage);
    }
}
