package Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screensch 
{
	
	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://web.whatsapp.com/");
		
	TakesScreenshot src=(TakesScreenshot) s;
	File sr = src.getScreenshotAs(OutputType.FILE);
	System.out.println(sr);
	
	File su=new File("D:\\Sujeet\\abc1.jpg");
	FileHandler.copy(sr, su);
	
	
		
	}

}
