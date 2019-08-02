package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

public class ContactUsPage extends Base {

	@Test(priority=1)
	public void getContactUsPage() {
		openBrowser();
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/contact-us/\"])[1]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
	}

	/*public void checkingAllAtmecsTelPhoneNumber() throws Throwable {
		driver.findElement(By.xpath("(//a[@href=\"http://www.atmecs.com/contact-us/\"])[1]")).click();
		// Atmecs HeadQuarters SantaClara's branch Tel phone number verification
		driver.findElement(By.xpath("//a[@href=\"tel:+4086892266\"]")).click();
		Thread.sleep(3000);
		Alert alertCancel = driver.switchTo().alert();
		alertCancel.dismiss();

		// Atmecs R&D Center plano,Dalls Tel branch phone number verification
		driver.findElement(By.xpath("//a[@href=\"tel:+9725991919\"]")).click();
		// Atmecs Tempe,Arizona Tel branch phone number verification
		driver.findElement(By.xpath("//a[@href=\"tel:+4082106894\"]")).click();
		// Atmecs Hyderabad branch Tel phone number verification
		driver.findElement(By.xpath("//a[@//a[@href=\"tel:+914067681233\"]")).click();
		// back to home
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
	}*/
	@Test(priority=2)
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
