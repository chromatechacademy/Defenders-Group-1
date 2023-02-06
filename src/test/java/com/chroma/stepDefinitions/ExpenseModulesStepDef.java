package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.ExpensesModulePage;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpenseModulesStepDef extends PageInitializer {

    @When("user clicks on Expense Module")
    public void user_clicks_on_Expense_Module() {
        ExpensesModulePage.expensesModuleButton.click();
    }

    @Then("the following modules should display: {string}, {string}, {string}")
    public void the_following_modules_should_display(String addExpense, String searchExpense,
            String expenseHead) {

        CommonUtils.sleep(2000);
        String expectedAddExpense = ExpensesModulePage.addExpenseModule.getText();
        CommonUtils.assertEquals(addExpense, expectedAddExpense);

        String expectedSearchExpense = ExpensesModulePage.searchExpenseModule.getText();
        CommonUtils.assertEquals(searchExpense, expectedSearchExpense);

        String expectedExpenseHead = ExpensesModulePage.expenseHeadModule.getText();
        CommonUtils.assertEquals(expenseHead, expectedExpenseHead);

    }
}
