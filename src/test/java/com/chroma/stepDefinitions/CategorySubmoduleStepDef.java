package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategorySubmoduleStepDef extends PageInitializer {

    /*
     * CLICKING ON THE STUDENT CATEGORIES FROM STUDENT INFORMATION MODULE
     */
    @Then("admin selects Student Categories")
    public void admin_selects_Student_Categories() {
        studentDashboardPage.studentCategories.click();
    }

    /*
     * ASSERTING THAT THE ADMIN IS ON CATEGORY PAGE
     */
    @Then("admin is directed to CATEGORY page with the text {string}")
    public void admin_is_directed_to_CATEGORY_page_with_the_text(String expetedCategoryPageText) {
        String actualCategoryPageText = studentCategoriesPage.createCategoryText.getText();
        CommonUtils.assertEquals(expetedCategoryPageText, actualCategoryPageText);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * ENTERING TEXT IN CREATE CATEGORY TEXTBOX
     */
    @When("admin enters Category {string}")
    public void admin_enters_Category(String categoryName) {
        studentCategoriesPage.categoryText.sendKeys(categoryName);
    }

    /*
     * SAVING CATEGORY
     */
    @When("admin clicks on the Category Save button")
    public void admin_clicks_on_the_Category_Save_button() {
        studentCategoriesPage.categorySaveButton.click();
    }

    /*
     * ASSERTING RECORD SAVED SUCCESFULLY IS DISPLEIED ON CATEGORY PAGE
     */
    @Then("Category is succesfully saved and confirmation message displays {string}")
    public void category_is_succesfully_saved_and_confirmation_message_displays(
            String expectedCategorySavesSuccessfulyText) {
        String actualCategorySavesSuccessfulyText = studentCategoriesPage.categorySaveButton.getText();
        CommonUtils.assertEquals(expectedCategorySavesSuccessfulyText, actualCategorySavesSuccessfulyText);
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }

    /*
     * CLICKING ON THE CATEGORY DELETE BUTTON
     */
    @Then("admin clicks on the Category {string} Delete button")
    public void admin_clicks_on_the_Category_Delete_button(String categoryName) {
        StudentCategoriesPage.categoryDeleteLocator(categoryName).click();
    }

    /*
     * ACCEPT CATEGORY DELETE CONFIRMATION ALERT
     */
    @Then("Category is deleted")
    public void category_is_deleted() {
        WebDriverUtils.driver.switchTo().alert().accept();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(1000);
    }

    /* GEORGE - CREATE CATEGORY TEXT */
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement createCategoryText;

    /* GEORGE - CATEGORY TEXT BOX */
    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryText;

    /* GEORGE - SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement categorySaveButton;

    /* GEORGE - CATEGORY - RECORD SAVED SUCCESFULLY TEXT */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement categorySavedSuccesfullyText;

    /* GEORGE - CCATEGORY - DYNAMIC LOCATOR FOR CATEGORY DELETE BUTTON */
    public static WebElement categoryDeleteLocator(String categoryNameText) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + categoryNameText
                + "']//parent::td/parent::tr//child::td[3]//child::a[2]/i"));
    }

    public CategorySubmoduleStepDef() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}