package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class customized1 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");

		
		Actions act=new Actions(driver);
		act.contextClick().perform();
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
	
}
