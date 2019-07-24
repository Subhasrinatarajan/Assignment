package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Priceline {

	public WebDriver driver;

	public ExtentReports reports;
	public ExtentTest test;

	@Test
	@Parameters("browser")
	public void beforeTest(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("--Testing is started in Chrome--");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("--Testing is started in FireFox--");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("ie")) {
			System.out.println("--Testing is started in Internet Explore--");

			driver = new InternetExplorerDriver();

		}
		String baseurl = "https://www.priceline.com";
		driver.get(baseurl);
		driver.manage().window().maximize();// Web driver methods

		Thread.sleep(800);

		driver.findElement(By.id("user-nav-sign-in")).click();
		driver.findElement(By.id("signin-first-name")).sendKeys("subhasrinatarajan@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"global-modal-sign-in-form\"]/div[5]/input")).sendKeys("Subha@se18");
		//driver.findElement(By.xpath("//*[@id=\"button-sign-in\"]")).click();
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		test = reports.startTest("Login functionality Verification");
		test.log(LogStatus.INFO, "Starting of tripadvisor login functionality Test case");

		test.log(LogStatus.PASS, "Successfully navigate to the tripadvisor HomePage");
		System.out.println("Application URL is Open");

		reports.endTest(test);
		reports.flush();

	}

	@AfterTest
	public void terminatetest() {
//driver.close();
	}

}
