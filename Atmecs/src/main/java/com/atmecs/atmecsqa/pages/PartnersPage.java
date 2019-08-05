package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.CommonUtils;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class PartnersPage{
	Properties properties;

    @Test
	public void gotopartners() throws IOException {
		properties = ConfigReader.loadProperty(Constants.PARTNERSPAGEWEBELEMENT_FILE);
		String partners = properties.getProperty("partners");
		Base base = new Base();
		Utils utils = new Utils();
		base.openBrowser();
	    utils.explicitWaitClickOperation(base.driver, partners);
	    utils.backToHome();
	}

}