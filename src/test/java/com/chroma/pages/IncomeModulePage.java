package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class IncomeModulePage {

    /* Income Module Header */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    /* Add Income Submodule Text */
    @FindBy(xpath = "//a[contains(text(),'Add Income')]")
    public WebElement addIncomeSubModule;

    /* Search Income Submodule Text */
    @FindBy(xpath = "//a[contains(text(),'Search Income')]")
    public WebElement searchIncomeSubModule;

    /* Income Head Submodule Text */
    @FindBy(xpath = "//a[contains(text(),'Income Head')]")
    public WebElement incomeHeadSubModule;

    public IncomeModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
