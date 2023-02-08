package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateProjectsPage {

    /* Projects Page Element */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public static WebElement projectsTabPageElement;

    /* Add New Project Page Element */
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg sidebar-cta']")
    public static WebElement addNewProjectElement;

    /* Projects Page Element */
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public static WebElement projectsPageElement;

    /* Active Radial Button */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public static WebElement activeRadialButton;
    
    /* Archived Radial Button */
    @FindBy(xpath = "//a[normalize-space()='Archived']")
    public static WebElement archivedRadialButton;

    public RealEstateProjectsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
