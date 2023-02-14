package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateProjectsPage;
import com.chroma.web.CommonUtils;

public class RealEstateProjectsStepImpl extends PageInitializer {

    /* Admin click on the projects dropdown on dashboard page */
    public static void dashboardDropDown() {
        RealEstateProjectsPage.projectsTabPageElement.click();
        CommonUtils.sleep(2000);
    }

    /* Elements to be displayed */
    public static void elementsDisplayed(String addNewProject, String projects, String active,
            String archived) {
        String actualAddNewProjectText = RealEstateProjectsPage.addNewProjectElement.getText();
        CommonUtils.assertTrue(actualAddNewProjectText.contains(addNewProject));
        String actualProjectsText = RealEstateProjectsPage.projectsPageElement.getText();
        CommonUtils.assertTrue(actualProjectsText.contains(projects));
        String actualActiveText = RealEstateProjectsPage.activeRadialButton.getText();
        CommonUtils.assertTrue(actualActiveText.contains(active));
        String actualArchivedText = RealEstateProjectsPage.archivedRadialButton.getText();
        CommonUtils.assertTrue(actualArchivedText.contains(archived));
        CommonUtils.nonMobileScreenshots();
    }
}
