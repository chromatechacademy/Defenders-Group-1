package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateSoldByMeStepimpl;
import cucumber.api.java.en.Then;

public class RealEstateSoldByMeStepDef extends PageInitializer {

    /* Agent clicks on sold by me button */
    @Then("the agent is scroll down to Sold By Me and clicks on it")
    public void the_agent_is_scroll_down_to_Sold_By_Me_and_clicks_on_it() {
        RealEstateSoldByMeStepimpl.soldByMe();
    }

    /* Pop up displayes with the text */
    @Then("a pop-up displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_displays_with_the_text(String expectedId, String expectedProject, String expectedPrice,
            String expectedBeds, String expectedBaths, String expectedCars, String expectedCarLots,
            String expectedStorageLots, String expectedLevel, String expectedAspect, String expectedTotalArea,
            String expectedStatus, String expectedSoldBy) {
        RealEstateSoldByMeStepimpl.popUpDisplayes(expectedId, expectedProject, expectedPrice, expectedBeds,
                expectedBaths, expectedCars, expectedCarLots, expectedStorageLots, expectedLevel, expectedAspect,
                expectedTotalArea, expectedStatus, expectedSoldBy);
    }

    /* Agent clicks on Close Button */
    @Then("the agent clicks on Close Button")
    public void the_agent_clicks_on_Close_Button() {
        realEstateSoldByMePage.soldByMeCloseButton.click();
    }

    /* Agent clicks on Reserved by Me */
    @Then("the agent clicks on Reserved By Me")
    public void the_agent_clicks_on_Reserved_By_Me() {
        realEstateSoldByMePage.reservedByMeButton.click();
    }

    /* Pop up window displayes */
    @Then("a pop-up window displays with the text: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void a_pop_up_window_displays_with_the_text(String expectedIdTwo, String expectedProjectTwo,
            String expectedPriceTwo, String expectedBedsTwo, String expectedBathsTwo, String expectedCarsTwo,
            String expectedCarLotsTwo, String expectedStorageLotsTwo,
            String expectedLevelTwo, String expectedAspectTwo, String expectedTotalAreaTwo, String expectedStatusTwo,
            String expectedReservedBy) {
        RealEstateSoldByMeStepimpl.popUpWindowDisplayes(expectedIdTwo, expectedProjectTwo, expectedPriceTwo,
                expectedBedsTwo, expectedBathsTwo, expectedCarsTwo, expectedCarLotsTwo, expectedStorageLotsTwo,
                expectedLevelTwo, expectedAspectTwo, expectedTotalAreaTwo, expectedStatusTwo, expectedReservedBy);
    }
}
