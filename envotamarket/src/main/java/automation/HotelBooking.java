package automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.seelnium.url.Envotamarket;

public class HotelBooking extends Envotamarket 
{
    @Test
    public void booking()
    {
    	driver.findElement(By.xpath("(//span[text()='CARS'])")).click();
    }
}
