package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentAcademicsClassPage {

    /* GEORGE - ADD CLASS TEXT */
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement addClassText;

    /* GEORGE - CLASS TEXT BOX */
    @FindBy(xpath = "//*[@id='class']")
    public WebElement classTextBox;

    /* GEORGE - SECTION CHECKBOX */
    public static WebElement dynamicCheckboxModuleLocator(String sectionCheckbox) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//label[normalize-space()='" + sectionCheckbox + "']//child::input"));
    }

    /* GEORGE - CLASS RECORD SAVED SUCCESFULLY TEXT */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement classSavedSuccesfullyText;

    /* GEORGE - CCATEGORY - DYNAMIC LOCATOR FOR CATEGORY DELETE BUTTON */
    public static WebElement classDeleteLocator(String classNameText) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + classNameText
                + "']//parent::td/parent::tr//child::td[3]//child::a[2]/i"));
    }

    public StudentAcademicsClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
