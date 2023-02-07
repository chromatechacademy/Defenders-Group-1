package com.chroma.appsCommon;

import com.chroma.pages.StudentLoginPage;
import com.chroma.pages.StudentSelectionsPage;
import com.chroma.stepsImplementation.RealEstateNewProjectSteps;
import com.chroma.pages.StudentClassPage;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.RealEstateAdminActiveAgentsPage;
import com.chroma.pages.RealEstateAdminAgentsPage;
import com.chroma.pages.RealEstateAdminInactiveAgentsPage;
import com.chroma.pages.RealEstateAdminIndexPage;
import com.chroma.pages.RealEstateAdminWelcomePage;
import com.chroma.pages.RealEstateAgentIndexPage;
import com.chroma.pages.RealEstateAgentWelcomePage;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.pages.RealEstateNewProjectPage;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.StudentDashboardPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static StudentLoginPage studentLoginPage;
    public static StudentDashboardPage studentDashboardPage;
    public static StudentDetailsPage studentDetailsPage;
    public static StudentSelectionsPage studentSelectionsPage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static StudentCategoriesPage studentCategoriesPage;
    public static StudentClassPage studentClassPage;
    public static StudentInformationPage studentInformationPage;
    public static BulkDeletePage bulkDeletePage;
    public static RealEstateAdminWelcomePage realEstateAdminWelcomePage;
    public static RealEstateAgentWelcomePage realEstateAgentWelcomePage;
    public static RealEstateAdminIndexPage realEstateAdminIndexPage;
    public static RealEstateAdminAgentsPage realEstateAdminAgentsPage;
    public static RealEstateAgentIndexPage realEstateAgentIndexPage;
    public static RealEstateAdminActiveAgentsPage realEstateAdminActiveAgentsPage;
    public static RealEstateAdminInactiveAgentsPage realEstateAdminInactiveAgentsPage;
    public static RealEstateDashboardPage realEstateDashboardPage;
    public static RealEstateNewProjectPage realEstateNewProjectPage;
    public static RealEstateNewProjectSteps realEstateNewProjectSteps;

    public void initializeAllPages() {
        studentLoginPage = new StudentLoginPage();
        studentDashboardPage = new StudentDashboardPage();
        studentDetailsPage = new StudentDetailsPage();
        studentSelectionsPage = new StudentSelectionsPage();
        studentAdmissionPage = new StudentAdmissionPage();
        studentCategoriesPage = new StudentCategoriesPage();
        studentClassPage = new StudentClassPage();
        bulkDeletePage = new BulkDeletePage();
        studentInformationPage = new StudentInformationPage();       
        realEstateAdminWelcomePage = new RealEstateAdminWelcomePage();
        realEstateAgentWelcomePage = new RealEstateAgentWelcomePage();
        realEstateAdminIndexPage = new RealEstateAdminIndexPage();
        realEstateAdminAgentsPage = new RealEstateAdminAgentsPage();
        realEstateAgentIndexPage = new RealEstateAgentIndexPage();
        realEstateAdminActiveAgentsPage = new RealEstateAdminActiveAgentsPage();
        realEstateAdminActiveAgentsPage = new RealEstateAdminActiveAgentsPage();
        realEstateDashboardPage = new RealEstateDashboardPage();
        realEstateNewProjectPage = new RealEstateNewProjectPage();
        realEstateNewProjectSteps = new RealEstateNewProjectSteps();
    }
}