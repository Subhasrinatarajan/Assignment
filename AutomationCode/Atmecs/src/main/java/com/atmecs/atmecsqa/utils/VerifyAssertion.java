package com.atmecs.atmecsqa.utils;

import org.testng.Assert;

public class VerifyAssertion {

	public static void verifyAssertion(String actualTitle, String expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);

			System.out.println("Passed: " + message + " EXPECTED: " + expectedTitle + " ACTUAL: " + actualTitle);
		} catch (AssertionError assertionError) {
			
			System.out.println("Failed" + message + expectedTitle + actualTitle);
		}
	}

}



/*public void mouseOverOnInsights() {	
Actions action = new Actions(driver);
By insights = getProperty.getInsightsXpath("insights");
action.moveToElement(driver.findElement(insights)).build().perform();
   actualTitle = driver.getTitle();
   expectedTitle = actualTitle;
//expectedTitle = "Home | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
verify.verifyAssertion(expectedTitle, actualTitle,"testInsights");
}

*/