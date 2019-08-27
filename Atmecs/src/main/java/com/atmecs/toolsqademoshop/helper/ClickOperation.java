package com.atmecs.toolsqademoshop.helper;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;


import com.atmecs.toolsqademoshop.testbase.TestBase;


public class ClickOperation extends TestBase {

	@SuppressWarnings("deprecation")
	public static void click_operation(WebDriver driver, final String xpath)
	{
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		.ignoring(ElementClickInterceptedException.class).pollingEvery(1, TimeUnit.SECONDS)
		.withTimeout(30, TimeUnit.SECONDS);

		fluentWait.until(new Function<WebDriver, Boolean>() {
		public Boolean apply(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
		return true;
		}
		});
		}
	public static void pg_click_opr(WebDriver driver, final String xpath) {
		
		click_operation(driver, xpath);
	}
}

