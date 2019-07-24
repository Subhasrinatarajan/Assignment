package automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.seelnium.url.Envotamarket;

public class Login extends Envotamarket
{
	@Test (priority=1)
	public void linktext()
	{
		driver.findElement(By.id("user-nav-sign-in")).click();
		driver.findElement(By.id("signin-first-name")).sendKeys("subhasrinatraj123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"global-modal-sign-in-form\"]/div[5]/input")).sendKeys("Subhasri123");
        driver.findElement(By.xpath("//*[@id=\"button-sign-in\"]")).click();
		
	}
}
