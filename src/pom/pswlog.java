package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pswlog 

{

	@FindBy(xpath="//input[@type='password']") WebElement passvalue;
	@FindBy(xpath="//a[@id='login-in-with-password']") WebElement signinb;
	
	public pswlog(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void pswv(String psd)
	
	{
		passvalue.sendKeys(psd);
		
		
	}
	
	public void pswcl()
	
	{
		
		signinb.click();
	}
	
}
