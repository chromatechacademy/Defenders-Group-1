package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentDetails {

    // CLASS DROP DOWN
    @FindBy(xpath = "//select[@id ='class_id']")
    public WebElement classDropdown;

    // SECTION DROP DOWN
    @FindBy(xpath = "//select[@id = 'section_id']")
    public WebElement selectDropDown;

    //SEARCH BUTTON LOCATOR
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

    // Edit button locator
    @FindBy(xpath = "//tbody/tr[5]/td[11]/a[2]/i[1]")
    public WebElement editButton;

    public StudentDetails() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
