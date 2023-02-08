package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentSelectCriteriaPage {

    /* GEORGE - SELECT CRITERIA TEXT */
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement selectCriteriaText;

    /* GEORGE - DYNAMIC LOCATOR FOR STUDENT RECORDS EDIT BUTTON */
    public static WebElement studentDisableRecordLocator(String sectionNameText) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + sectionNameText
                + "']//parent::tr//child::td[2]//child::a"));
    }

    public StudentSelectCriteriaPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
