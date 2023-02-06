package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class ExpensesModulePage {

    /* Locator for Expense Module Button */
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[4]")
    public static WebElement expensesModuleButton;

    /* Add Expense */
    @FindBy(xpath = "(//a[normalize-space()='Add Expense'])[2]")
    public static WebElement addExpenseModule;

    /* Search Expense */
    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public static WebElement searchExpenseModule;

    /* Expense Head */
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public static WebElement expenseHeadModule;

    public ExpensesModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
