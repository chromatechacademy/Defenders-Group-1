package com.chroma.appsCommon;

import com.chroma.pages.StudentLoginPage;
import com.chroma.pages.StudentSelectionsPage;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminAgentsPage;
import com.chroma.pages.RealEstateAdminInactiveAgentsPage;
import com.chroma.pages.RealEstateAdminIndexPage;
import com.chroma.pages.RealEstateAdminWelcomePage;
import com.chroma.pages.RealEstateAgentIndexPage;
import com.chroma.pages.RealEstateAgentWelcomePage;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static StudentLoginPage studentLoginPage;
    public static StudentDashboardPage studentDashboardPage;
    public static StudentSelectionsPage studentSelectionsPage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static StudentCategoriesPage studentCategoriesPage;
    public static StudentInformationPage studentInformationPage;
    public static RealEstateAdminWelcomePage realEstateAdminWelcomePage;
    public static RealEstateAgentWelcomePage realEstateAgentWelcomePage;
    public static RealEstateAdminIndexPage realEstateAdminIndexPage;
    public static RealEstateAdminAgentsPage realEstateAdminAgentsPage;
    public static RealEstateAgentIndexPage realEstateAgentIndexPage;
    public static RealEstateAdminActiveAgentsPage realEstateAdminActiveAgentsPage;
    public static RealEstateAdminInactiveAgentsPage realEstateAdminInactiveAgentsPage;

    public void initializeAllPages() {
        studentLoginPage = new StudentLoginPage();
        studentDashboardPage = new StudentDashboardPage();
        studentSelectionsPage = new StudentSelectionsPage();
        studentAdmissionPage = new StudentAdmissionPage();
        studentCategoriesPage = new StudentCategoriesPage();
        studentInformationPage = new StudentInformationPage();
        realEstateAdminWelcomePage = new RealEstateAdminWelcomePage();
        realEstateAgentWelcomePage = new RealEstateAgentWelcomePage();
        realEstateAdminIndexPage = new RealEstateAdminIndexPage();
        realEstateAdminAgentsPage = new RealEstateAdminAgentsPage();
        realEstateAgentIndexPage = new RealEstateAgentIndexPage();
        realEstateAdminActiveAgentsPage = new RealEstateAdminActiveAgentsPage();
        realEstateAdminActiveAgentsPage = new RealEstateAdminActiveAgentsPage();
    }

}