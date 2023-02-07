package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateSoldByMePage {

    /* SOLD BY ME BUTTON */
    @FindBy(xpath = "//p[normalize-space()='Sold By Me']")
    public WebElement soldByMeButton;

    /* ID TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='ID']")
    public WebElement idText;

    /* PROJECT TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Project']")
    public WebElement projectText;

    /* PRICE TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Price']")
    public WebElement priceText;

    /* BEDS TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Beds']")
    public WebElement bedsText;

    /* BATHS TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Baths']")
    public WebElement bathsText;

    /* CARS TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Cars']")
    public WebElement carsText;

    /* CAR LOTS TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Car Lots']")
    public WebElement carLotsText;

    /* STORAGE LOTS TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Storage Lots']")
    public WebElement storageLotsText;

    /* LEVEL TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Level']")
    public WebElement levelText;

    /* ASPECT TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Aspect']")
    public WebElement aspectText;

    /* TOTAL AREA SOLD BY ME MODULE */
    @FindBy(xpath = "(//th[@scope='col'][normalize-space()='Total Area'])[8]")
    public WebElement totalAreaText;

    /* STATUS TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Status']")
    public WebElement statusText;

    /* SOLD BY TEXT SOLD BY ME MODULE */
    @FindBy(xpath = "(//th[@scope='col'][normalize-space()='Sold By'])[2]")
    public WebElement soldByText;

    /* SOLD BY ME CLOSE BUTTON */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//button[@type='button'][normalize-space()='Close']")
    public WebElement soldByMeCloseButton;

    /* RESERVED BY ME BUTTON */
    @FindBy(xpath = "//p[normalize-space()='Reserved By Me']")
    public WebElement reservedByMeButton;

    /* ID TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='ID']")
    public WebElement idTextTwo;

    /* PROJECT TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Project']")
    public WebElement projectTextTwo;

    /* PRICE TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Price']")
    public WebElement priceTextTwo;

    /* BEDS TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Beds']")
    public WebElement bedsTextTwo;

    /* BATHS TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Baths']")
    public WebElement bathsTextTwo;

    /* CARS TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Cars']")
    public WebElement carsTextTwo;

    /* CAR LOTS TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Car Lots']")
    public WebElement carLotsTextTwo;

    /* STORAGE LOTS TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Storage Lots']")
    public WebElement storageLotsTextTwo;

    /* LEVEL TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Level']")
    public WebElement levelTextTwo;

    /* ASPECT TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Aspect']")
    public WebElement aspectTextTwo;

    /* TOTAL AREA TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Total Area']")
    public WebElement totalAreaTextTwo;

    /* STATUS TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Status']")
    public WebElement statusTextTwo;

    /* RESERVED BY TEXT RESERVED BY ME MODULE */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Reserved By']")
    public WebElement reservedByText;

    public RealEstateSoldByMePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
