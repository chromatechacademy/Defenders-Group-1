package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateProjectsPage {

    /* PROJECTS PAGE ELEMENT */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public static WebElement projectsTabPageElement;

    /* ADD NEW PROJECT PAGE ELEMENT */
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg sidebar-cta']")
    public static WebElement addNewProjectElement;

    /* PROJECTS PAGE ELEMENT */
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public static WebElement projectsPageElement;

    /* ACTIVE RADIAL BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public static WebElement activeRadialButton;
    
    /* ARCHIVED RADIAL BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Archived']")
    public static WebElement archivedRadialButton;

    public RealEstateProjectsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
