package com.atmecs.toolsqademoshop.operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.toolsqademoshop.testbase.TestBase;

public class Wait extends TestBase
{
    public static void ignoreTimeOut(String xpath)
    {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	 
    	wait.until(ExpectedConditions.elementToBeClickable(By.id(xpath)));
    }
}
