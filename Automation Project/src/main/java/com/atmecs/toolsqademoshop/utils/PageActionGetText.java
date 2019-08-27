package com.atmecs.toolsqademoshop.utils;

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

import com.atmecs.toolsqademoshop.testbase.TestBase;

public class PageActionGetText 
{
	public static String text;
		@SuppressWarnings("deprecation")
		public static String get_text(WebDriver driver, final String xpath)
		{
			
			FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			.ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS)
			.withTimeout(30, TimeUnit.SECONDS);

			fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath(xpath));
			text=element.getText();
			return true;
			}
			});
			return text;
			}
}