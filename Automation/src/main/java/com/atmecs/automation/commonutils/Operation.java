package com.atmecs.automation.commonutils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.automation.testsuite.TestBase;


public class Operation extends TestBase{
	/**
	 * Click operation
	 */
	@SuppressWarnings("deprecation")
	public static void clickFunction(WebDriver driver, final String xpath) {

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

	public static void clickOperation(WebDriver driver, final String xpath) {

		clickFunction(driver,xpath);
	}
	
	/**
	 * Submit Operation
	 */
	@SuppressWarnings("deprecation")
	public static void submitFunction(WebDriver driver, final String xpath) {

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
	
	public static void submitOperation(WebDriver driver, final String xpath) {

		submitFunction(driver, xpath);
	}
	
	/**
	 * MouseOver Operation
	 */
	public static void mouseover(String xpath, WebElement menuOption)
	{
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath(xpath));
		actions.moveToElement(menuOption).perform();
    }	
	
	/**
	 * Scrolling Operation
	 */
	public static void scrolling_opr()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
	
	/**
	 * DropDown Operation
	 */
	public static void dropdown(String id, int value)
	{
		WebElement mySelectElement = driver.findElement(By.id(id));
	       Select topsclr= new Select(mySelectElement); 
	       topsclr.selectByIndex(value);
	}
	
	/**
	 * Wait Operation
	 * @Category ExplicitWait Operation
	 */
	public static void ignoreTimeOut(String xpath)
    {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(By.id(xpath)));
    }

}
