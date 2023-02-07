package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;

public class RealEstateSoldByMeStepDef extends PageInitializer {

    @Then("the agent is scroll down to Sold By Me and clicks on it")
    public void the_agent_is_scroll_down_to_Sold_By_Me_and_clicks_on_it() {
        JavascriptUtils.scrollIntoView(realEstateSoldByMePage.soldByMeButton);
        realEstateSoldByMePage.soldByMeButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("a pop-up displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_displays_with_the_text(String expectedId, String expectedProject, String expectedPrice,
            String expectedBeds, String expectedBaths, String expectedCars, String expectedCarLots,
            String expectedStorageLots, String expectedLevel, String expectedAspect, String expectedTotalArea,
            String expectedStatus, String expectedSoldBy) {
        String actualIdText = realEstateSoldByMePage.idText.getText();
        CommonUtils.assertEquals(actualIdText, expectedId);
        String actualProjectText = realEstateSoldByMePage.projectText.getText();
        CommonUtils.assertEquals(actualProjectText, expectedProject);
        String actualPriceText = realEstateSoldByMePage.priceText.getText();
        CommonUtils.assertEquals(actualPriceText, expectedPrice);
        String actualBedsText = realEstateSoldByMePage.bedsText.getText();
        CommonUtils.assertEquals(actualBedsText, expectedBeds);
        String actualBathsText = realEstateSoldByMePage.bathsText.getText();
        CommonUtils.assertEquals(actualBathsText, expectedBaths);
        String actualCarsText = realEstateSoldByMePage.carsText.getText();
        CommonUtils.assertEquals(actualCarsText, expectedCars);
        String actualCarLotsText = realEstateSoldByMePage.carLotsText.getText();
        CommonUtils.assertEquals(actualCarLotsText, expectedCarLots);
        String actualStorageLotsText = realEstateSoldByMePage.storageLotsText.getText();
        CommonUtils.assertEquals(actualStorageLotsText, expectedStorageLots);
        String actualLevelText = realEstateSoldByMePage.levelText.getText();
        CommonUtils.assertEquals(actualLevelText, expectedLevel);
        String actualAspectText = realEstateSoldByMePage.aspectText.getText();
        CommonUtils.assertEquals(actualAspectText, expectedAspect);
        String actualTotalAreaText = realEstateSoldByMePage.totalAreaText.getText();
        CommonUtils.assertEquals(actualTotalAreaText, expectedTotalArea);
        String actualStatusText = realEstateSoldByMePage.statusText.getText();
        CommonUtils.assertEquals(actualStatusText, expectedStatus);
        String actualSoldByText = realEstateSoldByMePage.soldByText.getText();
        CommonUtils.assertEquals(actualSoldByText, expectedSoldBy);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();   
    }

    @Then("the agent clicks on Close Button")
    public void the_agent_clicks_on_Close_Button() {
        realEstateSoldByMePage.soldByMeCloseButton.click();
    }

    @Then("the agent clicks on Reserved By Me")
    public void the_agent_clicks_on_Reserved_By_Me() {
        realEstateSoldByMePage.reservedByMeButton.click();
    }

    @Then("a pop-up window displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_window_displays_with_the_text(String expectedIdTwo, String expectedProjectTwo,
            String expectedPriceTwo, String expectedBedsTwo, String expectedBathsTwo, String expectedCarsTwo, String expectedCarLotsTwo, String expectedStorageLotsTwo,
            String expectedLevelTwo, String expectedAspectTwo, String expectedTotalAreaTwo, String expectedStatusTwo, String expectedReservedBy) {
        String actualIdText = realEstateSoldByMePage.idTextTwo.getText();
        CommonUtils.assertEquals(actualIdText, expectedIdTwo);
        String actualProjectText = realEstateSoldByMePage.projectTextTwo.getText();
        CommonUtils.assertEquals(actualProjectText, expectedProjectTwo);
        String actualPriceText = realEstateSoldByMePage.priceTextTwo.getText();
        CommonUtils.assertEquals(actualPriceText, expectedPriceTwo);
        String actualBedsText = realEstateSoldByMePage.bedsTextTwo.getText();
        CommonUtils.assertEquals(actualBedsText, expectedBedsTwo);
        String actualBathsText = realEstateSoldByMePage.bathsTextTwo.getText();
        CommonUtils.assertEquals(actualBathsText, expectedBathsTwo);
        String actualCarsText = realEstateSoldByMePage.carsTextTwo.getText();
        CommonUtils.assertEquals(actualCarsText, expectedCarsTwo);        
        String actualCarLotsText = realEstateSoldByMePage.carLotsTextTwo.getText();
        CommonUtils.assertEquals(actualCarLotsText, expectedCarLotsTwo); 
        String actualStorageLotsText = realEstateSoldByMePage.storageLotsTextTwo.getText();
        CommonUtils.assertEquals(actualStorageLotsText, expectedStorageLotsTwo);
        String actualLevelText = realEstateSoldByMePage.levelTextTwo.getText();
        CommonUtils.assertEquals(actualLevelText, expectedLevelTwo);
        String actualAspectText = realEstateSoldByMePage.aspectTextTwo.getText();
        CommonUtils.assertEquals(actualAspectText, expectedAspectTwo);
        String actualTotalAreaText = realEstateSoldByMePage.totalAreaTextTwo.getText();
        CommonUtils.assertEquals(actualTotalAreaText, expectedTotalAreaTwo);        
        String actualStatusText = realEstateSoldByMePage.statusTextTwo.getText();
        CommonUtils.assertEquals(actualStatusText, expectedStatusTwo);
        String actualSoldByText = realEstateSoldByMePage.reservedByText.getText();
        CommonUtils.assertEquals(actualSoldByText, expectedReservedBy);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
