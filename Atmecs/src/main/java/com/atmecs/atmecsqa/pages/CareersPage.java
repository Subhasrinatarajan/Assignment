package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

public class CareersPage extends Base
{
	//@Test(priority=1)
	public void getCareersPage() {
		openBrowser();
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/careers/\"])[1]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
	}
	//@Test(priority=2)
	public void hyderabadHomePage()
	{
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/careers/\"])[1]")).click();
		driver.findElement(By.xpath("//a[@href=\"http://www.atmecs.com/hyderabad-careers/\"]")).click();
	}
	/*public void toSearchingJobTitles() throws InterruptedException
	{
	  //driver.switchTo().frame("search-3");
		//Thread.sleep(5000);
	  //driver.findElement(By.xpath("//*[@id=\"s\"]")).click();
	  //driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("java developer");
	  driver.findElement(By.id("searchsubmit")).click();
	  driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();

	}*/
    
}
