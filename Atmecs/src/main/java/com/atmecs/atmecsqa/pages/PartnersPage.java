package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;



import com.atmecs.atmecsqa.helper.BackToHomePage;
import com.atmecs.atmecsqa.testbase.Base;

import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class PartnersPage extends Base{
	Properties properties;
	//Properties homeProperties;

	public void gotopartners() throws IOException {
		properties = ConfigReader.loadProperty(Constants.PARTNERSPAGEWEBELEMENT_FILE);
	//	homeProperties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		String partners = properties.getProperty("partners");
		//Base base = new Base();
		openBrowser();
	    Utils.ignoreClickInterceptAndClickOnElement(driver, partners);
	    

	//	String backToHomePage = homeProperties.getProperty("backToHomePage");
		//Utils.ignoreClickInterceptAndClickOnElement(base.driver, backToHomePage);
	    
	    
	    
	  BackToHomePage.backToHome();
	}

}