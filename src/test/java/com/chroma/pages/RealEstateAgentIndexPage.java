package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentIndexPage {

    /* GEORGE - HELLO CHROMATECH TEXT */
    @FindBy(xpath = "//h1[@class='mainUserText']")
    public WebElement helloChromaTechText;

    /* GEORGE - HELLO VARIABLE TO CONCATENATE THE EXPECTED HELLO AGENT TEXT */
    public static String agentHelloFirstName(String agentFirstName) {
        return "Hello, " + agentFirstName;
    }

    /* GEORGE - AGENT LOG OUT BUTTON */
    @FindBy(xpath = "//span[normalize-space()='account_box']")
    public WebElement agentLogOutBox;

    /* GEORGE - AGENT LOG OUT BUTTON */
    @FindBy(xpath = "//span[normalize-space()='account_box']//parent::button//parent::div//child::ul//child::li[3]//child::a")
    public WebElement agentLogOutButton;

    public RealEstateAgentIndexPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
