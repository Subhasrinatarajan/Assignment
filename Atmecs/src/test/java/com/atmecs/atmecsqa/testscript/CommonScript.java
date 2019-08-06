package com.atmecs.atmecsqa.testscript;

import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.pages.HomePage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.pages.AboutUsPage;
import com.atmecs.atmecsqa.pages.PartnersPage;
import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.pages.ContactUsPage;
public class CommonScript extends Base
{
	//@Test
    public void validation() throws IOException
    {
    	openBrowser();
    	//HomePage
    	HomePage homePage=new HomePage();
    	homePage.getHomePage();
    	homePage.toCheckHomePageWedElements();
    	//AboutUsPage
    	AboutUsPage aboutUsPage=new AboutUsPage();
    	aboutUsPage.gotopartners();
    	//Partners
    	PartnersPage partnersPage=new PartnersPage();
    	partnersPage.gotopartners();
    	//CareersPage
    	CareersPage careersPage=new CareersPage();
    	careersPage.getCareersPage();
    	careersPage.hyderabadCareerHomePage();
    	careersPage.bangaloreCareerHomePage();
    	careersPage.chennaiCareerHomePage();
    	//ContactUsPage
    	ContactUsPage contactUsPage=new ContactUsPage();
    	contactUsPage.getContactUsPage();
    	contactUsPage.validateContactUsPortal();
    	
    }
}
