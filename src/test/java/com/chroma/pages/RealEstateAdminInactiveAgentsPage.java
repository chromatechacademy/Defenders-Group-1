package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminInactiveAgentsPage {

    // /* GEORGE - INACTIVE MEMBER RADIO BUTTON */
    // @FindBy(xpath = "//a[normalize-space()='Active']")
    // public WebElement inactiveMemberButton;

    /* GEORGE - DYNAMIC LOCATOR FOR INACTIVE EMAIL ADDRESS */
    public static WebElement inactiveAgentEmailLocator(String agentEmail) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + agentEmail + "']"));
    }

    /* GEORGE - DYNAMIC LOCATOR FOR DELETE BUTTON */
    public static WebElement inactiveAgentDeleteLocator(String inactiveAgentDeleteButton) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + inactiveAgentDeleteButton
                + "']//parent::td//parent::tr//child::td[4]//child::div//child::ul//child::li[3]//child::button"));
    }

    /* GEORGE - DYNAMIC LOCATOR FOR INACTIVE DELETE DROPDOWN */
    public static WebElement inactiveAgentDeleteDropdownLocator(String inactiveAgentDdeleteDropdown) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + inactiveAgentDdeleteDropdown
                + "']//parent::td//parent::tr//child::td[4]//child::div//child::button//child::span"));
    }

    // /* GEORGE - DELETE CONFIRMATION BUTTON */
    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement deleteConfirmationButton;
    
    public RealEstateAdminInactiveAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}