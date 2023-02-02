package com.chroma.appsCommon;

import com.chroma.pages.StudentLoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.StudentDetails;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance

    public static SamplePage samplePage;
    public static StudentLoginPage studentLoginPage;
    public static StudentDashboardPage studentDashboardPage;
    public static StudentDetails studentDetailsPage;

    public void initializeAllPages() {

        samplePage = new SamplePage();
        studentLoginPage = new StudentLoginPage();
        studentDashboardPage = new StudentDashboardPage();
        studentDetailsPage = new StudentDetails();

    }

}