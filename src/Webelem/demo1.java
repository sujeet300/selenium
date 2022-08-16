package Webelem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{

public static void main(String[] args) throws InterruptedException 
{

//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
	WebDriver s=new ChromeDriver();
	
	s.get("https://www.facebook.com/");
	
	WebElement as = s.findElement(By.xpath("//input[@ type='text']"));
	
	as.sendKeys("abc");
	
	Thread.sleep(3000);
	
	as.sendKeys("hello");
}
	
	
}