package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentCategoriesPage {

    /* GEORGE - CREATE CATEGORY TEXT */
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement createCategoryText;

    /* GEORGE - CATEGORY TEXT BOX */
    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryText;

    /* GEORGE - SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement categorySaveButton;

    /* GEORGE - CATEGORY - RECORD SAVED SUCCESFULLY TEXT */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement categorySavedSuccesfullyText;

    /* GEORGE - CCATEGORY - DYNAMIC LOCATOR FOR CATEGORY DELETE BUTTON */
    public static WebElement categoryDeleteLocator(String categoryNameText) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + categoryNameText
                + "']//parent::td/parent::tr//child::td[3]//child::a[2]/i"));
    }

    public StudentCategoriesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
