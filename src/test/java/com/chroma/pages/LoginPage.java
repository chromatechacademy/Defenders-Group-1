package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class LoginPage {
    
}

/*username textbox */
@FindBy(xpath = "//input[@placeholder='Username']")
public WebElement userNameTextBox;

/*password textbox */
@FindBy(xpath = "//input[@placeholder='Password']")
public WebElement passwordTextBox;

@FindBy(xpath = "//button[@type='submit']")
public WebElement signInButton;

@FindBy(xpath = "//span[normalize-space()='Student Information']")
public WebElement studentInformationModule;

public LoginPage(){
    PageFactory.initElements(WebDriverUtils.driver, this);
}

