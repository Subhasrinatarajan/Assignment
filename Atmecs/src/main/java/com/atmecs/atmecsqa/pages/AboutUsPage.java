package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.helper.ConfigReader;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.BackToHomePage;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class AboutUsPage extends Base {
	Properties properties;

	
	public void gotopartners() throws IOException {
		properties = ConfigReader.loadProperty(Constants.ABOUTUSPAGEWEBELEMENT_FILE);
		String aboutus = properties.getProperty("aboutus");

		openBrowser();
		Utils.ignoreClickInterceptAndClickOnElement(driver, aboutus);

		BackToHomePage.backToHome();
	}

}
