package com.atmecs.toolsqademoshop.utils;

import org.testng.Assert;

public class PageValidation {

	public static void pg_validation(String actualTitle, String expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);

			System.out.println("Passed: " + message + " EXPECTED: " + expectedTitle + " ACTUAL: " + actualTitle);
		} catch (AssertionError assertionError) {
			
			System.out.println("Failed" + message + expectedTitle + actualTitle);
		}
	}
	
	
}

     

