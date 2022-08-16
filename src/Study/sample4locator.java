package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4locator 

{

	public static void main(String[] args)
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		
		s.get("https://www.facebook.com/");
		
		s.findElement(By.xpath("//input[@ type='text']")).sendKeys("abc");
		
		//X path by attribute
		
		s.findElement(By.xpath("//input[@ type='password']")).sendKeys("123455");
		s.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//X path by text
		
		
		
	
		
	}
	
	
}
