package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminDashboardPage {
    
    /* Dashboard Element Text */
    @FindBy(xpath = "//a[@type='button']")
    public WebElement dashboardElementText;
    
    /* Hello, Admin Text */
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public WebElement helloAdminText;
    
    /* Overview Element Text */
    @FindBy(xpath = "//a[normalize-space()='Overview']")
    public WebElement overviewText;
    
    /* Agents Graph Element Text */
    @FindBy(xpath = "//a[normalize-space()='Agents Graph']")
    public WebElement agentsGraphText;
    
    /* Properties Overview Text */
    @FindBy(xpath = "//h5[@class='fs-28 my-4']")
    public WebElement propertiesOverviewText;
    
    /* Properties Text */
    @FindBy(xpath = "//h6[@class='fs-18 fw-semibold']")
    public WebElement propertiesText;
    
    /* Agents Tab */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsTab;
    
    /* Dashboard Tab */
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement dashboardTab;
    
    /* Projects Tab */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectsTab;
    
    /* Frame */
    @FindBy(xpath = "//body/main/div[1]")
    public WebElement subFrame;
    
    /* Main Frame */
    @FindBy(xpath = "//body//main")
    public WebElement mainFrame;

    public RealEstateAdminDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}