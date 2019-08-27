package com.atmecs.toolsqademoshop.helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.atmecs.toolsqademoshop.constants.Constants;
import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class CommonUtils extends TestBase
{
   public static void windowManagement()
   {
	    driver.get(ConfigReader.properties.getProperty("link.url"));
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
   }
   
   public static void backToHome() throws IOException
   {
	   
		ClickOperation.pg_click_opr(driver, back);
		
   }
}
