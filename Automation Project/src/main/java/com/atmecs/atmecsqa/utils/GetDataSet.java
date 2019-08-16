package com.atmecs.atmecsqa.utils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class GetDataSet 
{
	@SuppressWarnings("deprecation")
	public static void getDataSet(WebDriver driver, final String xpath,final String value)
	{
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		.ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS)
		.withTimeout(30, TimeUnit.SECONDS);

		fluentWait.until(new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(value);
		return true;
		}
		});
		}
}
