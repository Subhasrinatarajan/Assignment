package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

public class ContactUsPage extends Base {

	
    //@Test(priority=1)
	public void getContactUsPage() {
		openBrowser();
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/contact-us/\"])[1]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
	}
	//@Test(priority=2)
	public void ContactUs()
	{
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/contact-us/\"])[1]")).click();
		driver.findElement(By.id("footertop")).click();
		driver.findElement(By.xpath("//input[@name=\"field1[]\"]")).sendKeys("Subha");
		driver.findElement(By.xpath("//input[@name=\"field2\"]")).sendKeys("subinatraj65@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"field3[]\"]")).sendKeys("78678689036");
		driver.findElement(By.xpath("//input[@name=\"field4[]\"]")).sendKeys("Atmecs");
		driver.findElement(By.xpath("//input[@class=\"validation-lenient\"]")).sendKeys("Verification");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     
	}
}
