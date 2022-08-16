package Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class customizedlistbox
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.id("u_0_0_O+")).click();
		//Thread.sleep(3000);
		
		//WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//month.click();
		
		//Thread.sleep(3000);
		
		//Select a=new Select(month);
		//a.selectByValue("12");
		//month.click();
		
		
	}
	
}
