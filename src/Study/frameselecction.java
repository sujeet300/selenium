package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameselecction 
{

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		
		//open website
		s.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//jumping to frame
		s.switchTo().frame("iframeResult");
		
		//finding and clicking the button
		s.findElement(By.xpath("//button[@type='button']")).click();
		
		
		
		
		
	}
	
}
