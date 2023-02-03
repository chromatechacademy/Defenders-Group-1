package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentInformationPage {

    /*Student Details dropdown*/
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsModule;

    /*Student Admission dropdown */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionModule;
    
    /*Disabled students dropdown */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentModule;

    /*Bulk Delete dropdown */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteModule;

    /*Student categories dropdown */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategoriesModule;

    /*Student House dropdown */
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouseModule;

    /*Disable Reason dropdown  */
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReasonModule;

    public StudentInformationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
  
}
