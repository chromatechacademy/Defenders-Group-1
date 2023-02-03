package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminInactiveAgentsPage {
    
    /* GEORGE - INACTIVE MEMBER RADIO BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveMemberButton;
    
    public RealEstateAdminInactiveAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
     }
}
