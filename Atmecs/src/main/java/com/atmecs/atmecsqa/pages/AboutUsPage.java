package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;




import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class AboutUsPage{
	Properties properties;


	public void gotopartners() throws IOException {
		properties = ConfigReader.loadProperty(Constants.ABOUTUSPAGEWEBELEMENT_FILE);
		String partners = properties.getProperty("aboutus");
		Base base = new Base();
		base.openBrowser();
	    Utils.explicitWaitClickOperation(base.driver, partners);
		Utils utils = new Utils();
		utils.backToHome();
	}

}
