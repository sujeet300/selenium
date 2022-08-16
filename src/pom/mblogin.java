package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mblogin 
{




	
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mnno;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") WebElement passw;

	public mblogin(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mbnov(String mbno)
	{
		
		mnno.sendKeys(mbno);
		
	}
	
	public void pswv()
	
	{
		
		passw.click();
	}
	
	
	
}
