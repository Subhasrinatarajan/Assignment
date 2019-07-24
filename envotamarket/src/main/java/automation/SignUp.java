package automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.seelnium.url.Envotamarket;

public class SignUp extends Envotamarket
{
	@Test 
	public void linktext() 
	{
		driver.findElement(By.id("user-nav-sign-in")).click();
		driver.findElement(By.id("register-link-variant")).click();
		driver.findElement(By.id("registration-first-name")).sendKeys("Subhasri");
		driver.findElement(By.id("registration-last-name")).sendKeys("Natarajan");
		driver.findElement(By.id("registration-email")).sendKeys("subhasrinatarajan55@gmail.com");
		driver.findElement(By.id("registration-password")).sendKeys("Subha@se18");
        driver.findElement(By.id("registration-confirm-password")).sendKeys("Subha@se18");
        driver.findElement(By.id("registration-submit")).click();
		
	}
}
