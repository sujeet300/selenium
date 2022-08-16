package Study;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");	
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		Set<String> s = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(s);
		
	
		
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ada");
		driver.close();
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sujeet");
		
	
			
				
	}

}

		
		
		
