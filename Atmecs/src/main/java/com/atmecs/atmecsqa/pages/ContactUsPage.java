package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.helper.ConfigReader;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.BackToHomePage;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class ContactUsPage extends Base {

	Properties properties;

	//@Test(priority = 1)
	public void getContactUsPage() throws IOException {

		properties = ConfigReader.loadProperty(Constants.CONTACTUSPAGEWEBELEMENT_FILE);
		String ContactUsHomepage = properties.getProperty("ContactUsHomepage");
		openBrowser();
		Utils.ignoreClickInterceptAndClickOnElement(driver, ContactUsHomepage);
		BackToHomePage.backToHome();

	}

	//@Test(priority = 2)
	public void validateContactUsPortal() throws IOException {

		String ContactUsHomepage = properties.getProperty("ContactUsHomepage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, ContactUsHomepage);

		String ViewerName = properties.getProperty("ViewerName");
		Utils.ignoreClickInterceptAndClickOnElement(driver, ViewerName);
		driver.findElement(By.xpath(ViewerName)).sendKeys(properties.getProperty("viewerName"));

		String ViewerEmailID = properties.getProperty("ViewerEmailID");
		Utils.ignoreClickInterceptAndClickOnElement(driver, ViewerEmailID);
		driver.findElement(By.xpath(ViewerEmailID)).sendKeys(properties.getProperty("viewerEmailID"));

		String ViewerPhoneno = properties.getProperty("ViewerPhoneno");
		Utils.ignoreClickInterceptAndClickOnElement(driver, ViewerPhoneno);
		driver.findElement(By.xpath(ViewerPhoneno)).sendKeys(properties.getProperty("viewerPhoneno"));

		String ViewerCompanyName = properties.getProperty("ViewerCompanyName");
		Utils.ignoreClickInterceptAndClickOnElement(driver, ViewerCompanyName);
		driver.findElement(By.xpath(ViewerCompanyName)).sendKeys(properties.getProperty("viewerCompanyName"));

		String MessageField = properties.getProperty("MessageField");
		Utils.ignoreClickInterceptAndClickOnElement(driver, MessageField);
		driver.findElement(By.xpath(MessageField)).sendKeys(properties.getProperty("messageField"));

		String Submit = properties.getProperty("Submit");
		Utils.ignoreClickInterceptAndClickOnElement(driver, Submit);
		BackToHomePage.backToHome();

	}
}
