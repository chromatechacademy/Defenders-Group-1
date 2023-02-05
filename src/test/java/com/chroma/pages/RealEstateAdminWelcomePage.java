package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminWelcomePage {
    
    /*GEORGE - REAL ESTATE ADMIN USER NAME TEXT BOX */
   @FindBy(xpath = "//input[@placeholder='Email']")
   public WebElement emailTextBox;

   /*GEORGE - REAL ESTATE ADMIN USER NAME TEXT BOX */
   @FindBy(xpath = "//input[@placeholder='Password']")
   public WebElement passwordTextBox;

   /*GEORGE - REAL ESTATE ADMIN USER NAME TEXT BOX */
   @FindBy(xpath = "//button[normalize-space()='Login']")
   public WebElement logInButton;

   /*GEORGE - WELCOME TEXT */
   @FindBy(xpath = "//h1[normalize-space()='Welcome']")
   public WebElement adminWelcomeText;
  
   public RealEstateAdminWelcomePage() {
    PageFactory.initElements(WebDriverUtils.driver, this);
 }   
}