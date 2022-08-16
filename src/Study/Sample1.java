package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(3000);
		s.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		Thread.sleep(3000);
		
		s.quit();
		
		
		
	}
	
}
