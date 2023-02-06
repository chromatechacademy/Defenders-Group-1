package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentClassPage {

    // SDET TEXT LOCATOR
    @FindBy(xpath = "//td[normalize-space()='SDET']")
    public WebElement sDETText;
    // TESTING FUNDAMENTALS LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Testing Fundamentals')])[2]")
    public WebElement testingFundamentalsText;
    // SDLC METHODOLOGIES LOCATOR
    @FindBy(xpath = "//div[contains(text(),'SDLC Methodologies')]")
    public WebElement sDLCMethodologiesText;
    // SELENIUM TEST AUTOMATION LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Selenium Test Automation')])[1]")
    public WebElement seleniumTestAutomationTest;
    // CUCUMBER FUNDAMENTALS LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Cucumber Fundamentals')])[1]")
    public WebElement cucumberFundamentalsText;
    // API TESTING LOCATOR
    @FindBy(xpath = "//div[contains(text(),'API Testing')]")
    public WebElement aPITestingText;
    // GIT/GITHUB LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Git/GitHub')])[1]")
    public WebElement git_GitHubText;
    // JAVA 11 FOR COOL PEOPLE LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Java 11 for Cool People')])[1]")
    public WebElement java11ForCoolPeopleText;
    // MOBILE TEST AUTOMATION LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Mobile Test Automation')])[1]")
    public WebElement mobileTestAutomationText;
    // ACCESSIBILITY TESTING LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Accessibility Testing')])[1]")
    public WebElement accessibilityTestingText;
    // DATABASE TESTING LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Database Testing')])[1]")
    public WebElement dataBaseTestingText;
    // CYBER SECURITY LOCATOR
    @FindBy(xpath = "//td[normalize-space() = 'Cyber Security']")
    public WebElement cyberSecurityText;
    // NETWORKING FUNDAMENTALS LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Networking Fundamentals')])[1]")
    public WebElement networkingFundamentalsText;
    // LINUX FUNDAMENTALS LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Linux Fundamentals')])[1]")
    public WebElement linuxFundamentalsText;
    //CIA TRIAD LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'CIA Triad')])[1]")
    public WebElement cIATriadText;
    //PENETRATION TESTING / ETHICAL HACKING LOCATOR
    @FindBy(xpath = "(//div[contains(text(),'Penetration Testing/Ethical Hacking')])[1]")
    public WebElement penetrationTestingEthicalHackingText;

    public StudentClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}