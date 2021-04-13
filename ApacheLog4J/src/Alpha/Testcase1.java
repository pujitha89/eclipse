package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
     private static Logger log=LogManager.getLogger(Testcase1.class.getName());
	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       log.info("navigate to url");
       driver.get("https://uk.yahoo.com/?p=us");
       log.debug("click on the signin button");
       driver.close();
       log.info("close the browser");
	}

}
