package com.atmecs.atmecsqa.constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import com.atmecs.atmecsqa.testbase.Base;

public class Constants extends Base 
{
    public final static String PROJECT_BASE_PATH= System.getProperty("user.dir");
    public final static long PAGE_LODE_TIMEOUT = 20;
	public final static long IMPLICIT_WAIT = 10;
	
	 @BeforeClass
	  public void readpath() throws IOException
	  {
		  readProperties();
	  }

	  public void getpath(By path)
	   {
		   WebElement gotooption = driver.findElement(path);
	       gotooption.click();
	   }
	   public void goToPartners()
	   {
		 //By partnerspath= By.xpath((String) properties.get("partners"));
		 By partnerspath= By.xpath((String) properties.get("partners"));
		 getpath(partnerspath);
	   }
	   public void backtohome()
	   {
		   By backtohomepath = By.xpath((String) properties.get("backtohome"));
		   getpath(backtohomepath);
	   }
	   public void gotoaboutus()
	   {
		   By aboutuspath = By.xpath((String) properties.get("aboutus"));
		   getpath(aboutuspath);
	   }

}