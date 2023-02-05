package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentLoginPage {

   // User name text box*
   @FindBy(xpath = "//input[@placeholder='Username']")
   public WebElement userNameTextBox;

   // Password Text box*
   @FindBy(xpath = "//input[@placeholder='Password']")
   public WebElement passwordTextBox;

   // Log in Button*
   @FindBy(xpath = "//button[normalize-space()='Sign In']")
   public WebElement signInButton;

   /*GEORGE - INVALID USER OR PASSWORD MESSAGE */
   @FindBy(xpath = "//div[@class='alert alert-danger']")
   public WebElement invalidUserMessage;

   public StudentLoginPage() {
      PageFactory.initElements(WebDriverUtils.driver, this);
   }
}