package com.atmecs.toolsqademoshop.operation;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;
import com.atmecs.toolsqademoshop.utils.Utils;


public class BackToHomePage extends TestBase {

	static Properties backToHomeProperties;

	public static void backto_hm() throws IOException {
		
		backToHomeProperties = ConfigReader.loadProperty(Constants.SHOPHOMEPAGE_FILE);
		String backto_hmpg = backToHomeProperties.getProperty("loc.link.backto_hmpg");
		Utils.click_operation(driver, backto_hmpg);
	}
}


