package com.atmecs.toolsqademoshop.testbase;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.atmecs.toolsqademoshop.constants.Constants;
import com.atmecs.toolsqademoshop.utils.ConfigReader;



public class Browser extends TestBase
{
    public static void browsers() throws IOException
    {
    	properties = ConfigReader.loadProperty(Constants.CONFIG_FILE);

		String browser = properties.getProperty("value.browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.CHROMEBROWSERDRIVER_FILE);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOXBROWSERDRIVER_FILE);
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver", Constants.IEBROWSERDRIVER_FILE);
			driver = new InternetExplorerDriver();
		}
    }
}
