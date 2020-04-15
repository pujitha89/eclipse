package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
	public static void main(String args[])
	{
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	driver.findElement(By.name("firstname")).sendKeys("pujitha");
	driver.findElementByName("lastname").sendKeys("mundlapudi");
	driver.findElementByName("reg_email__").sendKeys("pujithakaranamm@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Pujitha89");
	driver.findElementById("day").sendKeys("2");
	driver.findElementById("month").sendKeys("Sept");
	driver.findElementById("year").sendKeys("1989");
    driver.findElementById("u_0_6").click();
    driver.findElementByName("websubmit").click();
    driver.findElementByName("reg_email_confirmation__").sendKeys("pujithakaranamm@gmail.com");
    driver.findElementByName("websubmit").click();
	
	
}
}