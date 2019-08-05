package com.atmecs.atmecsqa.utils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.atmecsqa.testbase.Base;

public class Utils 
{
	public void explicitWaitClickOperation(WebDriver driver,final String xpath) 
  {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		element.click();
				
 }
	Properties properties;

	public void backToHome() throws IOException 
	{
		properties = ConfigReader.loadProperty(Constants.HOMEPAGEWEBELEMENT_FILE);
		String backToHomePage = properties.getProperty("backToHomePage");
		Base base = new Base();
		explicitWaitClickOperation(base.driver, backToHomePage);
	}
}