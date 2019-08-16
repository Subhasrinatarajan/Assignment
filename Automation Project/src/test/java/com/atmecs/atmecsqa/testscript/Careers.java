package com.atmecs.atmecsqa.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.constant.Constants;
import com.atmecs.atmecsqa.constant.GetTitle;
import com.atmecs.atmecsqa.pages.BackToHomePage;
import com.atmecs.atmecsqa.pages.CareersPage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Utils;
import com.atmecs.atmecsqa.utils.VerifyAssertion;

public class Careers extends Base {
	
	Properties properties;
	//@Test(priority=1)
	public void getCareersPage() throws IOException {
		properties = ConfigReader.loadProperty(Constants.CAREERSWEBELEMENT_FILE);
		String careersHomePage = properties.getProperty("careersHomePage");
		openBrowser();
		CareersPage.careersPage(driver, careersHomePage);
		//BackToHomePage.backToHome();
	}

	//@Test(priority=2)
	public void hyderabadCareerHomePage() throws IOException {
		String careersHomePage = properties.getProperty("careersHomePage");
		CareersPage.careersPage(driver, careersHomePage);

		String hyderabadCareerHomePage = properties.getProperty("hyderabadCareerHomePage");
		CareersPage.careersPage(driver, hyderabadCareerHomePage);
	}

	//@Test(priority=3)
	public void bangaloreCareerHomePage() throws IOException {
		String bangaloreCareerHomePage = properties.getProperty("bangaloreCareerHomePage");
		CareersPage.careersPage(driver, bangaloreCareerHomePage);
	}

	//@Test(priority=4)
	public void chennaiCareerHomePage() throws IOException {

		String chennaiCareerHomePage = properties.getProperty("chennaiCareerHomePage");
		CareersPage.careersPage(driver, chennaiCareerHomePage);
		BackToHomePage.backToHome();
		driver.close();
	}
}
