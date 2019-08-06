package com.atmecs.atmecsqa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.helper.ConfigReader;
import com.atmecs.atmecsqa.testbase.Base;

public class BackToHomePage extends Base {

	static Properties backToHomeProperties;

	public static void backToHome() throws IOException {
		
		backToHomeProperties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		
	   //	Base base = new Base();
	
		String backToHomePage = backToHomeProperties.getProperty("backToHomePage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, backToHomePage);
	}
}
