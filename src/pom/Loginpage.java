package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{

@FindBy(xpath="//a[@class='sign-in']") private WebElement profilename;
@FindBy(xpath="//div[text()='My Account']")WebElement myac;

WebDriver driver1;

public Loginpage(WebDriver driver)

{
	
PageFactory.initElements(driver,this);

driver1=driver;

}

public void clicksignin()

{
	
	profilename.click();	
	
}

public void mousemove()

{
	
	Actions act=new Actions(driver1);
	act.moveToElement(myac).perform();
}
	
}
