package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentDashboardPage {

    /* Please store Common xpath for all module links below */

    // Fees Collection Link
    @FindBy(xpath = "//span[contains(text(),'Fees Collection')]")
    public WebElement feesCollectionLink;

    // Collect Fees sub link
    @FindBy(xpath = "//ul[2]//li[2]//ul[1]//li[1]//a[1]")
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

    public static WebElement dynamicModuleLocator(String moduleText) {

        return WebDriverUtils.driver.findElement(By.xpath("//span[contains(text(),'" + moduleText + "')]"));
    }

    public StudentDashboardPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}