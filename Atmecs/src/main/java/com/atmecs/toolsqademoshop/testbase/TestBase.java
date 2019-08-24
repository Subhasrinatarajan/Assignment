package com.atmecs.toolsqademoshop.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.utils.CommonUtils;
import com.atmecs.toolsqademoshop.utils.ConfigReader;


public class TestBase {
	public static Properties properties;
	public static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws IOException {
		Browser.browsers();
	    CommonUtils.windowManagement();	
   
	}

	@AfterClass
	public static void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
	}
}
