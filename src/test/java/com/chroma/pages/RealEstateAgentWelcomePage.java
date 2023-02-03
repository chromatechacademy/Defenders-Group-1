package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentWelcomePage {
    
     /*GEORGE - AGENT WELCOME TEXT */
   @FindBy(xpath = "//h1[normalize-space()='Welcome']")
   public WebElement agentWelcomeText;

   public RealEstateAgentWelcomePage() {
    PageFactory.initElements(WebDriverUtils.driver, this);
 }
}
