package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_images {
	public static void main(String args[]) throws InterruptedException
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.findElementByLinkText("Images").click();
	 // driver.findElementByXPath("https://www.google.co.uk/imghp?hl=en&tab=wi&authuser=0&ogbl").click();
	  Thread.sleep(4000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(4000);
	  driver.findElementById("gsr").sendKeys("selenium");
	}
}