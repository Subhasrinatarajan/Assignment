package com.atmecs.atmecsqa.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

public class AllPages
{
	@Test
	public void validateAllPages() throws IOException
	{
		//Home
		  Home home=new Home();
		  home.getHomePage();
		  home.toCheckHomePageWedElements();
		//AboutUs
		  AboutUs aboutUs=new AboutUs();
		  aboutUs.getAboutUsPage();
		//Partners
		  Partners partners=new Partners();
		  partners.gotopartners();
		//Careers
		  Careers careers=new Careers();
		  careers.getCareersPage();
		  careers.hyderabadCareerHomePage();
		  careers.bangaloreCareerHomePage();
		  careers.chennaiCareerHomePage();
		//Contacts
		  ContactUs contactUs=new ContactUs();
		  contactUs.getContactUsPage();
		  contactUs.validateContactUsPortal();
	}
}
