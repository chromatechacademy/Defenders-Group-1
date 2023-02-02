package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentSelectionsPage {

    /* GEORGE - ADD SECTION TEXT */
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement addSelectionText;

     /* GEORGE - SECTION NAME TEXT BOX */
     @FindBy(xpath = "//input[@id='section']")
     public WebElement sectionText;

     /* GEORGE - SAVE BUTTON */
     @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
     public WebElement sectionSaveButton;

     /* GEORGE - SECTION - RECORD SAVED SUCCESFULLY TEXT */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement sectionSavedSuccesfullyText;

  
     /* GEORGE - SECTION - DYNAMIC LOCATOR FOR SESSION DELETE BUTTON */
    public static WebElement sectionDeleteLocator(String sectionNameText) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + sectionNameText + "']//parent::td//parent::tr//child::td[2]//child::a[2]/i"));
    }

    public StudentSelectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

}
