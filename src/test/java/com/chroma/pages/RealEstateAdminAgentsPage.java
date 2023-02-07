package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminAgentsPage {

    /* GEORGE - ADD NOW BUTTON */
    @FindBy(xpath = "//button[@class='btn btn-primary d-block w-100']")
    public WebElement addNowButton;

    /* GEORGE - AGENT FIRST NAME */
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement enterAgentFirstName;

    /* GEORGE - AGENT LAST NAME */
    @FindBy(xpath = "//input[@name='lname']")
    public WebElement enterAgentLasttName;

    /* GEORGE - AGENT EMAIL */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement enterAgentEmail;

    /* GEORGE - AGENT PHONE */
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement enterAgentPhone;

    /* GEORGE - AGENT PASWWORD */
    @FindBy(xpath = "//input[@name='pass']")
    public WebElement enterAgentPassword;

    /* GEORGE - AGENT REENTER PASSWORD */
    @FindBy(xpath = "//input[@name='cpass']")
    public WebElement enterAgentCPassword;

    /* GEORGE - SAVE INFO BUTTON */
    @FindBy(xpath = "//button[@id='addagentbutton']")
    public WebElement saveInfoButton;

    /* GEORGE - CLOSE WINDOW BUTTON */
    @FindBy(xpath = "//button[@aria-label='Close']")
    public WebElement closePopopButton;

    /* GEORGE - ACTIVE MEMBER RADIO BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeMemberButton;

    /*LILI - MEMBER LIST */
    @FindBy(xpath = "//button[@class='sidebar-item']") 
    public WebElement memberListButton;

    /*LILI - ACTIVE BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Active']") 
    public WebElement activeButton;

    /*LILI - INACTIVE BUTTON */
    @FindBy(xpath = "//a[normalize-space()='Inactive']") 
    public WebElement inactiveButton;

    /*LILI - ALL AGENTS BUTTON */
    @FindBy(xpath = "//a[normalize-space()='All Agents']") 
    public WebElement allAgentsButton;

    /*LILI - NAME TEXT */
    @FindBy(xpath = "//th[normalize-space()='Name']") 
    public WebElement nameText;

    /* LILI - MAIL TEXT */
    @FindBy(xpath = "//th[normalize-space()='Mail']") 
    public WebElement mailText;

    /*LILI - CONTACT NUMBER TEXT */
    @FindBy(xpath = "//th[normalize-space()='Contact Number']") 
    public WebElement contactNumberText;

    /*LILI - ACTIONS TEXT */
    @FindBy(xpath = "//th[normalize-space()='Actions']") 
    public WebElement actionsText;

    /* GEORGE - DYNAMIC LOCATOR FOR EMAIL ADDRESS */
    public static WebElement agentEmailLocator(String agentEmail) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + agentEmail + "']"));
    }

    /* GEORGE - ADMIN LOG OUT BUTTON */
    @FindBy(xpath = "//span[normalize-space()='account_box']")
    public WebElement adminLogOutBox;

    /* GEORGE - ADMIN LOG OUT BUTTON */
    @FindBy(xpath = "//span[normalize-space()='account_box']//parent::button//parent::div//child::ul//child::li//child::a")
    public WebElement adminLogOutButton;

    public RealEstateAdminAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}