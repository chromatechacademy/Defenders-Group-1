package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage {

    // CLASS DROP DOWN
    @FindBy(xpath = "//select[@id ='class_id']")
    public WebElement classDropdown;

    // SECTION DROP DOWN
    @FindBy(xpath = "//select[@id = 'section_id']")
    public WebElement sectionDropDown;

    // SEARCH BUTTON LOCATOR
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

    // EDIT BUTTON LOCATOR
    @FindBy(xpath = "//tr[@class='odd']//i[@class='fa fa-pencil']")
    public WebElement editButton;

    // Last Name Textbox
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    // Save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    // RECORD UPDATE SUCCESS MESSAGE LOCATOR
    @FindBy(xpath = "//div[@student='alert alert-success text-left']")
    public WebElement recordUpdateSuccessMessage;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
