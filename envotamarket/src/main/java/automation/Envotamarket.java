package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Envotamarket {

	public WebDriver driver;

	public ExtentReports reports;
	public ExtentTest test;

	@Test
	@Parameters("browser")

	public void beforeTest(String browser)
	{

		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.out.println("--Testing is started in Chrome--");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) 
		{
			System.out.println("--Testing is started in FireFox--");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("ie")) 
		{
			System.out.println("--Testing is started in Internet Explore--");
			driver = new InternetExplorerDriver();
		}
		String baseurl = "https://www.priceline.com";
		driver.get(baseurl);
		driver.manage().window().maximize();// Web driver methods



		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		test = reports.startTest("Login functionality Verification");
		test.log(LogStatus.INFO, "Starting of tripadvisor login functionality Test case");
		test.log(LogStatus.PASS, "Successfully navigate to the tripadvisor HomePage");
		System.out.println("Application URL is Open");
		reports.endTest(test);
		reports.flush();

	}

	@AfterTest
	public void terminatetest() 
	{
		//driver.close();
		// Get Browser name and version.
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();

		// Get OS name.
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("OS = " + os + ", Browser = " + browserName + " " + browserVersion);
	}

}