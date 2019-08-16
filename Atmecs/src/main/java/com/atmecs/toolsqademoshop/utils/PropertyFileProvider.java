package com.atmecs.toolsqademoshop.utils;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.toolsqademoshop.constant.Constants;

import com.atmecs.toolsqademoshop.testbase.TestBase;

public class PropertyFileProvider extends TestBase 
{
	/*properties = ConfigReader.loadProperty(Constants.ABOUTUSPAGEWEBELEMENT_FILE);
		String aboutus = properties.getProperty("aboutus");

		openBrowser();
		Utils.ignoreClickInterceptAndClickOnElement(driver, aboutus); */

	public void accesspropertyfile() throws IOException
	{
		ConfigReader.properties=ConfigReader.loadProperty(Constants.ABOUTUSPAGEWEBELEMENT_FILE);
	}
}
