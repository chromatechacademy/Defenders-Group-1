package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {

    /* GEORGE - STUDENT ADMISSION HEADER */
    @FindBy(xpath = "//h4[normalize-space()='Student Admission']")
    public WebElement studentAdmissionHeader;

    /* GEORGE - STUDENT ADMISSION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNumberTextBox;

    /* GEORGE - CLASS DROPDOWN */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    /* GEORGE - SECTION DROPDOWN */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    /* GEORGE - FIRST NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /* GEORGE - LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    /* GEORGE - GENDER DROPDOWN */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /* GEORGE - DOB TEXT BOX */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dobCalendar;

    /* GEORGE - SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;
    
    /* GEORGE - MOTHER'S NAME */
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement mothersNameTextBox;

    /* GEORGE - MOTHER RADIO BUTTIN */
    @FindBy(xpath = "//label[normalize-space()='Mother']")
    public WebElement motherRadioButton;

    /* GEORGE - GUARDIAN PHONE NUMBER */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumberTextBox;

    /* GEORGE - RECORD SAVED SUCCESFULY MESSAGE */
    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public WebElement succesfulySavedMessage;

    /* GEORGE - THE ADMISSION NO FIELD MUST CONTAIN A UNIQUE VALUE MESSAGE */
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement admissionNumberMustBeUniqueMessage;
    
    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}