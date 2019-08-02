package com.atmecs.atmecsqa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class Utils {

	public static void ignoreClickInterceptAndClickOnElement(WebDriver driver, final String xpath) {
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
}
