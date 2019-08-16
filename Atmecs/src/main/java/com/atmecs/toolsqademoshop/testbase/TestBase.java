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
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class TestBase {
	public static Properties properties;
	public static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws IOException {
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
		driver.get(ConfigReader.properties.getProperty("link.url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}
	@AfterClass
	public static void  quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
	}
}

