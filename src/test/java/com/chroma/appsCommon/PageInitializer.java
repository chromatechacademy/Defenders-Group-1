package com.chroma.appsCommon;

import com.chroma.pages.StudentLoginPage;
import com.chroma.pages.StudentSeletionsPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance

    public static SamplePage samplePage;
    public static StudentLoginPage studentLoginPage;
    public static StudentDashboardPage studentDashboardPage;
    public static StudentSeletionsPage studentSeletionsPage;

    public void initializeAllPages() {
        samplePage = new SamplePage();
        studentLoginPage = new StudentLoginPage();
        studentDashboardPage = new StudentDashboardPage();
        studentSeletionsPage = new StudentSeletionsPage();
    }

}