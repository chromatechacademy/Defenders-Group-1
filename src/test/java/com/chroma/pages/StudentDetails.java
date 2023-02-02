package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentDetails {

    // CLASS DROP DOWN
    @FindBy(xpath = "//select[@id ='class_id']")
    public static WebElement classDropdown;
    // SECTION DROP DOWN
    @FindBy(xpath = "//select[@id = 'section_id']")
    public WebElement selectDropDown;

    public StudentDetails() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
