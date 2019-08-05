package com.atmecs.atmecsqa.pages;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;
import com.atmecs.atmecsqa.utils.CommonUtils;
import com.atmecs.atmecsqa.utils.ConfigReader;
import com.atmecs.atmecsqa.utils.Constants;
import com.atmecs.atmecsqa.utils.Utils;

public class HomePage
{
	Properties properties;
	//@Test(priority=1)
	public void getHomePage() throws IOException 
	{
		properties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		String homePage = properties.getProperty("homePage");
		Base base = new Base();
		Utils utils=new Utils();
		base.openBrowser();
	    utils.explicitWaitClickOperation(base.driver, homePage);
				/*openBrowser();
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/\"])[1]")).click();*/
	}
    //@Test(priority=2)
	public void toCheckHomePageWedElements() throws IOException
	{
    	String exploreNow = properties.getProperty("exploreNow");
		Base base = new Base();
		Utils utils=new Utils();
		base.openBrowser();
	    utils.explicitWaitClickOperation(base.driver, exploreNow);
	    utils.backToHome();
    	
	    String artificialHomePage = properties.getProperty("artificialHomePage");
	    utils.explicitWaitClickOperation(base.driver, artificialHomePage);
	    utils.backToHome();
	    
	    String augumentedHomePage = properties.getProperty("augumentedHomePage");
	    utils.explicitWaitClickOperation(base.driver, augumentedHomePage);
	    utils.backToHome();
	    
	    String internetHomePage = properties.getProperty("internetHomePage");
	    utils.explicitWaitClickOperation(base.driver, internetHomePage);
	    utils.backToHome();
	    
	    String roboticHomePage = properties.getProperty("roboticHomePage");
	    utils.explicitWaitClickOperation(base.driver, roboticHomePage);
	    utils.backToHome();
	    
	    String blockChainHomePage = properties.getProperty("blockChainHomePage");
	    utils.explicitWaitClickOperation(base.driver, blockChainHomePage);
	    utils.backToHome();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
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
