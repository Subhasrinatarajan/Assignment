package com.atmecs.atmecsqa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecsqa.constant.Constants;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Utils;

public class BackToHomePage extends Base {

	static Properties backToHomeProperties;

	public static void backToHome() throws IOException {
		
		backToHomeProperties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		
	   //	Base base = new Base();
	
		String backToHomePage = backToHomeProperties.getProperty("backToHomePage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, backToHomePage);
	}
}
