package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentInformationPage {

    /*Student Details dropdown*/
    @FindBy(xpath = "//ul[@class='treeview-menu']//a[normalize-space()='Student Details']")
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



    
}
