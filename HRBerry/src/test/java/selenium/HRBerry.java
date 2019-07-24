package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRBerry {

@Test
    public static void main(String[] args) 
    {
    	//File file = new File("C:\\\\Users\\\\Subhasri.Natarajan\\\\Downloads\\\\chromedriver_win32\\chromedriver.exe");
    	//System.setProperty("webdriver.chromedriver.driver", file.getAbsolutePath());
    	WebDriver driver = new ChromeDriver();    	
    	System.setProperty("webdriver.chromedriver","C:\\Users\\Subhasri.Natarajan\\Downloads\\chromedriver_win32");
		
		
    	
        String baseUrl = "https://www.trivago.in/";
        String expectedTitle = "trivago";
        String actualTitle = "";
        driver.get(baseUrl);


        actualTitle = driver.getTitle();

        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}
