package com.chroma.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentDashboardPage {

    // Fees Collection Link
    @FindBy(xpath = "//span[contains(text(),'Fees Collection')]")
    public WebElement feesCollectionLink;

    // Collect Fees sub link
    @FindBy(xpath = "//*[contains(text(),' Collect Fees')]")
    public WebElement subLinkCollectFees;

    // Search Fees Payment sub link
    @FindBy(xpath = "//a[normalize-space()='Search Fees Payment']")
    public WebElement subLinkSearchFeesPayment;

    // Search Due Fees sub link
    @FindBy(xpath = "//a[normalize-space()='Search Due Fees']")
    public WebElement subLinkSearchDueFees;

    // Fees Master sub link
    @FindBy(xpath = "//a[normalize-space()='Fees Master']")
    public WebElement subLinkFeesMaster;

    // Fees Group sub link
    @FindBy(xpath = "//a[normalize-space()='Fees Group']")
    public WebElement subLinkFeesGroup;

    // Fees Type sub link
    @FindBy(xpath = "//a[normalize-space()='Fees Type']")
    public WebElement subLinkFeesType;

    // Fees Discount sub link
    @FindBy(xpath = "//a[normalize-space()='Fees Discount']")
    public WebElement subLinkFeesDiscount;

    // Fees Carry Forward sub link
    @FindBy(xpath = "//a[normalize-space()='Fees Carry Forward']")
    public WebElement subLinkFeesCarryForward;

    // Fees Reminder sub link
    @FindBy(xpath = "//a[normalize-space()='Fees Reminder']")
    public WebElement subLinkFeesReminder;

    // Homework link
    @FindBy(xpath = "//span[contains(text(),'Homework')]")
    public WebElement homeworkLink;

    // Add Homework sub link
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement subLinkHomework;

    /* INSPECTING HAMBURGER MENU */
    @FindBy(xpath = "//a[@role='button']")
    public WebElement hamburgerMenu;

    // -Gary
    // STUDENT INFORMATION Module
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public WebElement studentInformationModule;

    // INCOME MODULE
    @FindBy(xpath = "//span[contains(text(),'Income')]")
    public WebElement incomeModule;

    // EXPENSE MODULE
    @FindBy(xpath = "//span[contains(text(),'Expenses')]")
    public WebElement expensesModule;

    // HUMAN RESOURCE MODULE
    @FindBy(xpath = "//span[contains(text(),'Human Resource')]")
    public WebElement humanResourceModule;

    // REPORTS MODULE
    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    public WebElement reportsModule;

    // STUDENT DETAILS MODULE
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsSubModule;

    // Class SUB MODULE
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubModule;
    // -Gary Add End

    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[2]/ul/li")
    public List<WebElement> subLinksOfFeesCollection;

    /*
     * GEORGE - ACADEMICS MODULE
     */
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    /* GEORGE - SECTION SUBMODULE */
    @FindBy(xpath = "//*[contains(text(),'ections')]")
    public WebElement academicsSections;

    /* GEORGE - ACADEMICS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubmodule;

    /*
     * GEORGE - DINAMIC LOCATOR FOR MODULES
     */
    public static WebElement dynamicModuleLocator(String moduleText) {
        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + moduleText + "')]"));
    }

    /* GEORGE - STUDENT ADMISSION SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubmodule;

    /* GEORGE - STUDENT CATEGORIES SUBMODULE */
    @FindBy(xpath = "//*[contains(text(),'Categories')]")
    public WebElement studentCategories;

    public StudentDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}