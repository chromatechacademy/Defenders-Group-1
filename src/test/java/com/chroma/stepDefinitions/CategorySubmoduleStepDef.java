package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.stepsImplementation.CategorySubmoduleStepImpl;
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
        CategorySubmoduleStepImpl.adminOnCategoryPageAssertion(expetedCategoryPageText);
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
        CategorySubmoduleStepImpl.recordSavedAssertion(expectedCategorySavesSuccessfulyText);
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
        CategorySubmoduleStepImpl.acceptDeletingCategory();
    }
}
