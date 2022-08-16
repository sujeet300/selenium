package Study;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");

		s.manage().window().maximize();
		s.manage().window().minimize();
		
		System.out.println(s.getTitle());
		System.out.println(s.getCurrentUrl());
		
		
		
	}
	
}