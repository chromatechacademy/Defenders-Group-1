package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class BulkDeletePage {

    // Bulk Delete SubModule
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    // Class Name Drop down
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classNameDropdown;

    // Section Name Drop down
    @FindBy(xpath ="//select[@name='section_id']")
    public WebElement sectionNameDropdown;

    // Seach button
    @FindBy(xpath ="//button[normalize-space()='Search']")
    public WebElement searchButton;
    
    // Delete button
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    //Use this method to locate student record
    public static WebElement studentRecordLocator(String studentRecord){
        return WebDriverUtils.driver.findElement(By.xpath("//a[contains(text(),'" + studentRecord + "')]//parent::td//parent::tr/td/input"));
     }

     //GEORGE - STUDENT ADMITTED LOCATED BYY ADMISSION NUMBER
    public static WebElement studentDeleteRecordLocator(String studentNumberRecord){
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + studentNumberRecord + "']//parent::tr//child::input"));
     }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
