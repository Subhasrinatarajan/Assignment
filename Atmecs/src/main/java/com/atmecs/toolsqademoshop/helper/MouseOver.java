package com.atmecs.toolsqademoshop.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.atmecs.toolsqademoshop.testbase.TestBase;

public class MouseOver extends TestBase {
	
	public static void mouseover(String xpath, WebElement menuOption) {
		Actions actions = new Actions(driver);

		driver.findElement(By.xpath(xpath));

		actions.moveToElement(menuOption).build().perform();
	}

}
