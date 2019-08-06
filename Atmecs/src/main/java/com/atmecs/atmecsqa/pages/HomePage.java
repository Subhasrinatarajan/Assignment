package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.helper.ConfigReader;
import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.BackToHomePage;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class HomePage extends Base
{
	Properties homeProperties;
	//@Test(priority=1)
	public void getHomePage() throws IOException 
	{
		homeProperties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		String homePage = homeProperties.getProperty("homePage");
		
		openBrowser();
	    Utils.ignoreClickInterceptAndClickOnElement(driver, homePage);
				/*openBrowser();
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/\"])[1]")).click();*/
	}
    //@Test(priority=2)
	public void toCheckHomePageWedElements() throws IOException
	{
    	String exploreNow = homeProperties.getProperty("exploreNow");
	    Utils.ignoreClickInterceptAndClickOnElement(driver, exploreNow);
	    BackToHomePage.backToHome();
    	
	    String artificialHomePage = homeProperties.getProperty("artificialHomePage");
	    Utils.ignoreClickInterceptAndClickOnElement(driver, artificialHomePage);
	    BackToHomePage.backToHome();
	    
	    String augumentedHomePage = homeProperties.getProperty("augumentedHomePage");
	    Utils.ignoreClickInterceptAndClickOnElement(driver, augumentedHomePage);
	    BackToHomePage.backToHome();
	    
	    String internetHomePage = homeProperties.getProperty("internetHomePage");
	    Utils.ignoreClickInterceptAndClickOnElement(driver, internetHomePage);
	    BackToHomePage.backToHome();
	    
	    String roboticHomePage = homeProperties.getProperty("roboticHomePage");
	    Utils.ignoreClickInterceptAndClickOnElement(driver, roboticHomePage);
	    BackToHomePage.backToHome();
	    
	    String blockChainHomePage = homeProperties.getProperty("blockChainHomePage");
	    Utils.ignoreClickInterceptAndClickOnElement(driver, blockChainHomePage);
	    BackToHomePage.backToHome();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*//Explore now
		driver.findElement(By.xpath("//a[@href=\"http://www.atmecs.com//services/\"]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		//Artificial intelligence home page navigation
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/services/digital-life/artificial-intelligence-machine-learning/\"])[2]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		//Augumented reality home page navigation
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/services/digital-life/augmented-reality-virtual-reality/\"])[2]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		//Internet of things home page navigation
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/services/digital-life/internet-of-things/\"])[2]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		//Robotic process automation home page navigation
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/services/digital-life/robotic-process-automation-chatbots/\"])[2]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		//Blockchain home page navigation
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/services/digital-life/blockchain/\"])[2]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		driver.close();*/
	}
}
