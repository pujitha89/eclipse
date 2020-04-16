package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_1 {
	@Test 
   public void verifyUrl()
   { 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		String x=driver.getCurrentUrl();
		System.out.println(x);
	   
   }
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String x=driver.getTitle();
		System.out.println(x);
	}
}
