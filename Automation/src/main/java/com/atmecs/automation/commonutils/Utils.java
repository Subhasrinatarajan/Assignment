package com.atmecs.automation.commonutils;

import java.util.concurrent.TimeUnit;
import com.atmecs.automation.constant.Constants;
import com.atmecs.automation.testsuite.TestBase;

public class Utils extends TestBase
{
	 public static void webSite()
	   {
		    driver.get(ConfigReader.properties.getProperty("link.url"));
		    driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
	   }
}