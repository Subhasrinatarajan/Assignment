package com.atmecs.atmecsqa.testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.constant.Constants;

import com.atmecs.atmecsqa.pages.AboutUsPage;
import com.atmecs.atmecsqa.pages.BackToHomePage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;

public class AboutUs extends Base {

	@Test
	public void getAboutUsPage() throws IOException {
		properties = ConfigReader.loadProperty(Constants.ABOUTUSPAGEWEBELEMENT_FILE);
		String aboutus = ConfigReader.getData("aboutus");
		openBrowser();
		AboutUsPage.aboutUsPage(driver, aboutus);
		BackToHomePage.backToHome();
	}

}
