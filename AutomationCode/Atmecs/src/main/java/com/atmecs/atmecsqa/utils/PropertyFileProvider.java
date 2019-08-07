package com.atmecs.atmecsqa.utils;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.constant.Constants;
import com.atmecs.atmecsqa.testbase.Base;

public class PropertyFileProvider extends Base 
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
