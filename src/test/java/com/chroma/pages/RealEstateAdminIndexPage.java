package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminIndexPage {

    /* GEORGE - HELLO ADMIN TEXT */
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public WebElement helloAdminText;

    /* GEORGE - AGENTS BUTTON */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsButton;

    /* GEORGE - AGENTS BUTTON */
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement dashboardButton;

    /* GEORGE - ALL AGENTS TEXT*/
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public WebElement allAgentsText;

    public RealEstateAdminIndexPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
