package com.atmecs.atmecsqa.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.atmecsqa.testbase.Base;

public class PartnersPage extends Base {
    
	
	public void getPartnersPage() {
		openBrowser();
		driver.findElement(By.xpath("//a[@href=\"http://www.atmecs.com/partners/\"]")).click();
		driver.findElement(By.xpath("//a[@property=\"v:title\"]")).click();
		driver.close();
	}
}
