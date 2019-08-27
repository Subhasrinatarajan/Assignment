package com.atmecs.toolsqademoshop.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.atmecs.toolsqademoshop.constants.Constants;
import com.atmecs.toolsqademoshop.helper.CommonUtils;
import com.atmecs.toolsqademoshop.utils.ConfigReader;
import com.atmecs.toolsqademoshop.utils.PropertyFileProvider.PropertyReader;
import com.relevantcodes.extentreports.ExtentReports;


public class TestBase  {
	public static Properties properties;
	public static WebDriver driver;
	
	
	protected static boolean grandtotalvalidation=true;
	protected static double sumofproducts;
	 
	 
	
    static PropertyReader propReader = PropertyReader.getInstance();   
    
    
	protected static String purchaseblack_tshirt = propReader.getValue("loc.link.purchaseblack_tshirt");
    protected static String addtocart = propReader.getValue("loc.btn.adddtocart");
    protected static String purchasecropped_tshirt = propReader.getValue("loc.link.puchasecropped_tshirt");
    protected static String viewCart= propReader.getValue("loc.icon.viewcart");
    protected static String back = propReader.getValue("loc.link.backtohomepage");
    protected static String searchFunction = propReader.getValue("loc.icon.searchfunction");
    protected static String firstprodpath = propReader.getValue("loc.span.firstproductvalue");
    protected static String secondprodpath = propReader.getValue("loc.span.secondproductvalue");
    protected static String grandtotalpath = propReader.getValue("loc.span.granttotalvalue");
    protected static String removegreydressProduct=propReader.getValue("loc.link.productremoval");

   
    
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
