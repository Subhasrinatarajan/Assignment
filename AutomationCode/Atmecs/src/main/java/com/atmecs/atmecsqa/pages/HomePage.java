package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

public class HomePage extends Base
{
	//@Test(priority=1)
	public void getHomePage() 
	{
		openBrowser();
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/\"])[1]")).click();
	}
    //@Test(priority=2)
	public void toCheckHomePageWedElements()
	{
		//Explore now
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
		driver.close();
	}
}
