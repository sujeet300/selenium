package pom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comp 
{

	@FindBy(xpath="//div[text()='sujeet']") private WebElement name;
	WebDriver driver1;
	public comp(WebDriver driver)
	
	{
	
	PageFactory.initElements(driver, this);
	
	driver1=driver;
	
	}
	

	
	public void swchildwin()
	
	{
		
		
		Set<String> windid = driver1.getWindowHandles();
		
		ArrayList<String> sd=new ArrayList<String>(windid);
		driver1.switchTo().window(sd.get(1));
		
		
	}
	
	public String verfiry()
	
	{
		String nam = name.getText();
		return nam;
		
	}
}
