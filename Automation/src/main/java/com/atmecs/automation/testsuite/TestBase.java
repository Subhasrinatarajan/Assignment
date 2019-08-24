package com.atmecs.automation.testsuite;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.atmecs.automation.commonutils.Utils;
import com.atmecs.automation.constant.Constants;

public class TestBase {
	public static Properties properties;
	public static WebDriver driver;

	@BeforeClass
	public static void openBrowser() throws IOException {
		Browser.browsers();
		Utils.webSite();
	}

	@AfterClass
	public static void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
	}
}
