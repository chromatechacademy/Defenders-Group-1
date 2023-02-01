package com.chroma.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class SDashBoardPage {
    // STUDENT INFORMATION LOCATOR
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public WebElement studentInformationModule;
    // FEES COLLECTION LOCATOR
    @FindBy(xpath = "//span[contains(text(),'Fees Collection')]")
    public WebElement feesCollectionModule;
    
    @FindBy(xpath = "//span[contains(text(),'Income')]")
    public WebElement incomeModule;

    @FindBy(xpath = "//span[contains(text(),'Expenses')]")
    public WebElement expensesModule;

    @FindBy(xpath = "//span[contains(text(),'Academics')]")
    public WebElement academicsModule;

    @FindBy(xpath = "//span[contains(text(),'Human Resource')]")
    public WebElement humanResourceModule;

    @FindBy(xpath = "//span[contains(text(),'Homework')]")
    public WebElement homeworkModule;

    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    public WebElement reportsModule;

   

    public SDashBoardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

}
