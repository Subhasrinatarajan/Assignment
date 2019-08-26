package com.atmecs.toolsqademoshop.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.operation.ClickOperation;
import com.atmecs.toolsqademoshop.testbase.TestBase;

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
