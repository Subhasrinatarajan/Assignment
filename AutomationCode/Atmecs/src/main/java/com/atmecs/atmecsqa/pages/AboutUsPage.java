package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

public class AboutUsPage extends Base 
{
	
	public void getAboutUsPage() {
		openBrowser();
		driver.findElement(By.xpath("//a[@href=\"http://www.atmecs.com/about-us/\"]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		driver.close();
	}
}
