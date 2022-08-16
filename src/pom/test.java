package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test 
{
 
	Loginpage log;
	mblogin mb;
	pswlog ps;
	comp se;
	profilemy pp;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	
		
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssingh\\IT\\Chrome driver\\chromedriver.exe");
	 driver=new ChromeDriver();
		
		FileInputStream file=new FileInputStream("C:\\Users\\ssingh\\IT\\data.xlsx");
		  sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 log=new Loginpage(driver);
		 mb=new mblogin(driver);
		ps=new pswlog(driver);
		 se=new comp(driver);
		 pp=new profilemy(driver);
	}
	
	@BeforeMethod
	public void signin()
	
	{
		
		log.clicksignin();
		mb.mbnov(sh.getRow(0).getCell(0).getStringCellValue());
		mb.pswv();
		ps.pswv(sh.getRow(0).getCell(1).getStringCellValue());
		ps.pswcl();
		
		
		
	}
	@Test
	public void verify() throws InterruptedException
	
	{
		
		Thread.sleep(5000);
		
		log.mousemove();
		
		
		pp.mypclick();
		
		
		se.swchildwin();
		se.verfiry();
		
		String exp=sh.getRow(0).getCell(2).getStringCellValue();
		String act=se.verfiry();
		Assert.assertEquals(act, exp,"Fail");
		
	}
		
		
		

	
}
