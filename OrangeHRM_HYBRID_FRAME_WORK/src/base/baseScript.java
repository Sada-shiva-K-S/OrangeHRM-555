package base;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.Home_Page_Repository;
import pageObjects.Login_Repository;

public class baseScript implements applicationConstants
{
	public Home_Page_Repository hp;
	public Properties pro;
	public static WebDriver driver;
	public WebDriverWait ew;
	public	Readproperties rp;
	
	@BeforeClass
	public void openbrowser() throws IOException, InterruptedException
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		rp = new Readproperties();
		hp = new Home_Page_Repository(driver);
		Thread.sleep(2000);
		String url = rp.url();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void method()
	{
		Login_Repository lgn = new Login_Repository(driver);
		String un = rp.un();
		String psw = rp.psw();
		ew=new WebDriverWait(driver, 10);
     ew.until(ExpectedConditions.visibilityOf(lgn.usn()));
		lgn.usn().sendKeys(un);
		ew.until(ExpectedConditions.visibilityOf(lgn.pwd()));
		lgn.pwd().sendKeys(psw);
		ew.until(ExpectedConditions.elementToBeClickable(lgn.lgn()));
		lgn.lgn().click();
	}
	@AfterMethod
	public void method1(ITestResult result)
	{
		if(result.FAILURE == result.getStatus())
		{
			Capture_defects.getdefect(result.getName());
		}
		ew.until(ExpectedConditions.elementToBeClickable(hp.logoutlogo()));
		hp.logoutlogo().click();
		ew.until(ExpectedConditions.elementToBeClickable(hp.logoutbtn()));
		hp.logoutbtn().click();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
}



