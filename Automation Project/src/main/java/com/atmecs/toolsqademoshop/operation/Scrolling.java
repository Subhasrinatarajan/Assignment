package com.atmecs.toolsqademoshop.operation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.toolsqademoshop.testbase.TestBase;

public class Scrolling extends TestBase
{
	public static void scrolling_opr()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}
	public static void dropdown(String id, int value)
	{
		WebElement mySelectElement = driver.findElement(By.id(id));
	       Select topsclr= new Select(mySelectElement); 
	       topsclr.selectByIndex(value);
	}
}
