package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilemy
{

	
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement profiled;
	
	WebDriver driver1;
	
	public profilemy(WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	

	
	public void mypclick()
	
	{
		
		profiled.click();
	}
	
	
}
