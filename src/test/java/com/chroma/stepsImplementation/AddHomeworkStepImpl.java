package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class AddHomeworkStepImpl extends PageInitializer {

    // Admin user clicks on Homework link
    public static void clickingOnHomeworkLink() {
        studentDashboardPage.homeworkLink.click();
        CommonUtils.sleep(1000);
        CommonUtils.nonMobileScreenshots();
    }

    // Admin user sees "Add homework" sub link
    public static void AddHomeworkAssertion(String subModuleLink) {
        String actualSubLinkText = studentDashboardPage.subLinkHomework.getText();
        CommonUtils.assertEquals(subModuleLink, actualSubLinkText);
        CommonUtils.nonMobileScreenshots();
    }
}
