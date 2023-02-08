package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentRecordsPage {

    /* GEORGE - RECORD NAME */
    @FindBy(xpath = "//h3[@class='profile-username text-center']")
    public WebElement studentRecordName;

    /* GEORGE - RECORD DISABLE BUTTON */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement studentRecordDisableButton;

    /* GEORGE - RECORD ENABLE BUTTON */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement studentRecordEnableButton;

    /* GEORGE - CHOSE REASON DROPDOWN */
    @FindBy(xpath = "//*[@id='disable_form']/div[1]/div/div/div/div[1]/div/select/option[3]")
    public WebElement reasonDropdown;

    /* GEORGE - SAVE REASON DROPDOWN */
    @FindBy(xpath = "//*[@id='disable_form']/div[2]/div/button")
    public WebElement saveReasonButton;

    public StudentRecordsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
