package com.chroma.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;
import org.openqa.selenium.WebElement;

public class RealEstateNewProjectPage {
    // Projects button
    @FindBy(xpath = "(//*[@class='navbar-label'])[3]")
    public WebElement projectsButton;

    // + Add New Project Button
    @FindBy(xpath = "//a[@href='new-project.php']")
    public WebElement addNewProjestButton;

    // Developer text
    @FindBy (xpath = "//input[@name='Developer']")
    public WebElement developerTextBox;

    // Tite text
    @FindBy (xpath = "//input[@name='Title']")
    public WebElement titleTextBox;

    // Level text
    @FindBy(xpath = "//input[@name='Levels']")
    public WebElement levelTextBox;

    // Street Address
    @FindBy(xpath = "//input[@name='Street_Number']")
    public WebElement streetAddressTextBox; 

    // Next Button
    @FindBy(xpath = "//button[normalize-space()='Next']")
    public WebElement nextButton;

    // Completion Date
    @FindBy(xpath = "//input[@name='Completion_Date']")
    public WebElement dateTextBox;

    // Currency drop dowm
    @FindBy(xpath = "//select[@name='Currency']")
    public WebElement currencyDropdown;

    // Save button
    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement saveButton;

    // London project
    @FindBy(xpath = "//*[contains(text(),'London')]")
    public WebElement projectLondon;

    // OK button
    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement okButton;

    // Back button
    @FindBy(xpath = "//a[@href='./projects.php']")
    public WebElement backButton;

    public RealEstateNewProjectPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}