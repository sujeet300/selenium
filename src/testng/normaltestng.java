package testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class normaltestng 
{

	@Test
	public void openbrowser()
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	
		
		
		
	}
}
