package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class HumanResourceModulePage {

    /* Locator for HR Module Button */
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[6]")
    public static WebElement hrModuleButton;

    /* Staff Directory */
    @FindBy(xpath = "(//a[normalize-space()='Staff Directory'])[2]")
    public static WebElement staffDirectoryModule;

    /* Staff Attendance */
    @FindBy(xpath = "(//a[normalize-space()='Staff Attendance'])[2]")
    public static WebElement staffAttendanceModule;

    /* Payroll */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public static WebElement payrollModule;

    /* Approve Leave Request */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public static WebElement approveLeaveRequestModule;

    /* Apply Leave */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public static WebElement applyLeaveModule;

    /* Leave Type */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public static WebElement leaveTypeModule;

    /* Teachers Rating */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public static WebElement teachersRatingModule;

    /* Department */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public static WebElement departmentModule;

    /* Designation */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public static WebElement designationModule;

    public HumanResourceModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
