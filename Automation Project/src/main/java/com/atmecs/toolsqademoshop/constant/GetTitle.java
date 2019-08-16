package com.atmecs.toolsqademoshop.constant;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;


public class GetTitle

{
	public static String text;
	
	@SuppressWarnings("deprecation")
	public static void getText(WebDriver driver, final String xpath)
	{
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		.ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS)
		.withTimeout(30, TimeUnit.SECONDS);

		fluentWait.until(new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		text=element.getText();
		System.out.println("T is :"+text);
		return true;
		}
		});
		}
}
