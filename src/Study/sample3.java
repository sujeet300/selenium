package Study;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		
		Thread.sleep(3000);
		
		s.navigate().to("https://www.dhl.com/in-en/home/tracking/tracking-express.html?submit=1&tracking-id=4872611726");
		Thread.sleep(3000);
		s.navigate().back();
		Thread.sleep(3000);
		
		s.navigate().forward();
		s.navigate().refresh();
		
		
	}
	
}