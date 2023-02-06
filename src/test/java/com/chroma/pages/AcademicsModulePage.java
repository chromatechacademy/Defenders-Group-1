package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AcademicsModulePage {

    /* Locator for Academics Module Button */
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[5]")
    public static WebElement academicsModuleButton;

    /* Class Timetable */
    @FindBy(xpath = "(//*[contains(text(),'Class Timetable')])[2]")
    public static WebElement classTimetableModule;

    /* Teachers Timetable */
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public static WebElement teachersTimetableModule;

    /* Assign Class Teacher */
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public static WebElement assignClassTeacherModule;

    /* Promote Students */
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public static WebElement promoteStudentsModule;

    /* Subject Group */
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public static WebElement subjectsGroupModule;

    /* Subjects */
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public static WebElement subjectsModule;

    /* Class */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public static WebElement classModule;

    /* Sections */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public static WebElement sectionModule;

    public AcademicsModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
