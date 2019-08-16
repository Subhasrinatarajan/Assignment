package com.atmecs.toolsqademoshop.operation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.toolsqademoshop.testbase.TestBase;

public class MouseOver extends TestBase
{
	public static void mouseover(String xpath, WebElement menuOption)
	{
	  Actions actions = new Actions(driver);
      //Retrieve WebElement 'Music' to perform mouse hover 
    driver.findElement(By.xpath(xpath));
   //Mouse hover menuOption 'Music'
   actions.moveToElement(menuOption).perform();
}
	
}
