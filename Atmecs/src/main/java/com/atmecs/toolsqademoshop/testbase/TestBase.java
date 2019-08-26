package com.atmecs.toolsqademoshop.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.utils.CommonUtils;
import com.atmecs.toolsqademoshop.utils.PropertyFileProvider.PropertyReader;


public class TestBase {
	public static Properties properties;
	public static WebDriver driver;
	
    static PropertyReader propReader = PropertyReader.getInstance();   
	protected static String purchaseblack_tshirt = propReader.getValue("loc.link.purchaseblack_tshirt");
    protected static String addtocart = propReader.getValue("loc.btn.adddtocart");
    protected static String purchasecropped_tshirt = propReader.getValue("loc.link.puchasecropped_tshirt");
    protected static String viewCart= propReader.getValue("loc.icon.viewcart");
    protected static String back = propReader.getValue("loc.link.backtohomepage");
    protected static String firstprod = propReader.getValue("loc.span.firstproductvalue");
    protected static String secondprod=propReader.getValue("loc.span.secondproductvalue");
    protected static String grandtotal=propReader.getValue("loc.span.granttotalvalue");
    protected static String searchFunction = propReader.getValue("loc.icon.searchfunction");
    protected static String firstprodpath = propReader.getValue("loc.span.firstproductvalue");
    
    
    
	@BeforeClass
	public static void openBrowser() throws IOException {
		Browser.browsers();
	    CommonUtils.windowManagement();	
   
	}

	@AfterClass
	public static void quitBrowser() {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.quit();
	}
	
	public static void main(String[] args) {
		
	}
}
