package com.atmecs.atmecsqa.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.constant.Constants;
import com.atmecs.atmecsqa.pages.BackToHomePage;
import com.atmecs.atmecsqa.pages.PartnersPage;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Utils;

public class Partners extends Base {
	Properties properties;
    @Test
	public void gotopartners() throws IOException {
		properties = ConfigReader.loadProperty(Constants.PARTNERSPAGEWEBELEMENT_FILE);

		String partners = ConfigReader.getData("partners");

		openBrowser();
		PartnersPage.partnersScript(driver, partners);

		BackToHomePage.backToHome();
	}

}