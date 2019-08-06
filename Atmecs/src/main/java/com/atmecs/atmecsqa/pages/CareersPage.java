package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.helper.BackToHomePage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class CareersPage extends Base {
	Properties careersProperties;

	// @Test(priority=1)
	public void getCareersPage() throws IOException {
		careersProperties = ConfigReader.loadProperty(Constants.CAREERSWEBELEMENT_FILE);
		String careersHomePage = careersProperties.getProperty("careersHomePage");

		openBrowser();
		Utils.ignoreClickInterceptAndClickOnElement(driver, careersHomePage);
		BackToHomePage.backToHome();
	}

	// @Test(priority=2)
	public void hyderabadCareerHomePage() throws IOException {
		String careersHomePage = careersProperties.getProperty("careersHomePage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, careersHomePage);

		String hyderabadCareerHomePage = careersProperties.getProperty("hyderabadCareerHomePage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, hyderabadCareerHomePage);
	}

	// @Test(priority=3)
	public void bangaloreCareerHomePage() throws IOException {
		String bangaloreCareerHomePage = careersProperties.getProperty("bangaloreCareerHomePage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, bangaloreCareerHomePage);
	}

	// @Test(priority=4)
	public void chennaiCareerHomePage() throws IOException {

		String chennaiCareerHomePage = careersProperties.getProperty("chennaiCareerHomePage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, chennaiCareerHomePage);
		BackToHomePage.backToHome();
	}
}
