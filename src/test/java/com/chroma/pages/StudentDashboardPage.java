package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentDashboardPage {

    @FindBy(xpath = "//span[contains(text(),'Homework')]")
    public WebElement homeworkLink;

    @FindBy (xpath = "//a[normalize-space()='Add Homework']")
    public WebElement subLinkHomework;

    

    public static WebElement dynamicModuleLocator(String moduleText) {

        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + moduleText + "')]"));
    }

    public StudentDashboardPage(){

    PageFactory.initElements(WebDriverUtils.driver, this);
}

}