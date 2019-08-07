package com.atmecs.atmecsqa.testscript;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.constant.Constants;
import com.atmecs.atmecsqa.pages.BackToHomePage;
import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.pages.ContactPage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.GetDataSet;
import com.atmecs.atmecsqa.utils.Utils;

public class ContactUs extends Base {

	

	@Test(priority = 1)
	public void getContactUsPage() throws IOException {

		properties = ConfigReader.loadProperty(Constants.CONTACTUSPAGEWEBELEMENT_FILE);
		String contactUsHomepage =ConfigReader.getData("ContactUsHomepage");
		openBrowser();
		ContactPage.contactPage(driver, contactUsHomepage);
	

	}

	@Test(priority = 2)
	public void validateContactUsPortal() throws IOException {

	
		String viewerName =ConfigReader.getData("ViewerName");
		ContactPage.contactPage(driver, viewerName);
		GetDataSet.getDataSet(driver, viewerName, ConfigReader.getData("viewerName"));

		String viewerEmailID =ConfigReader.getData("ViewerEmailID");
		GetDataSet.getDataSet(driver, viewerEmailID, ConfigReader.getData("viewerEmailID"));

		String viewerPhoneno =ConfigReader.getData("ViewerPhoneno");
		GetDataSet.getDataSet(driver, viewerPhoneno, ConfigReader.getData("viewerPhoneno"));

		String viewerCompanyName =ConfigReader.getData("ViewerCompanyName");
		GetDataSet.getDataSet(driver, viewerCompanyName, ConfigReader.getData("viewerCompanyName"));

		String messageField =ConfigReader.getData("MessageField");
		GetDataSet.getDataSet(driver, messageField, ConfigReader.getData("messageField"));

		String submit =ConfigReader.getData("Submit");
		ContactPage.contactPage(driver, submit);
		BackToHomePage.backToHome();

	}
}
