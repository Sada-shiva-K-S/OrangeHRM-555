package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Repository 
{
//Login credentials
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement logoutlogo;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutbtn;
	
	public Home_Page_Repository(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logoutlogo()
	{
		return logoutlogo;
	}
	
	public WebElement logoutbtn()
	{
		return logoutbtn;
	}
//Login credentials
//TC1
	@FindBy(xpath = "(//span[.='PIM'])[1]")
	private WebElement pimbtn;
	
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement addempbtn;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement fntf;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lntf;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement savebtn;
	
	public WebElement pim()
	{
		return pimbtn;
	}
	
	public WebElement add()
	{
		return addempbtn;
	}
	
	public WebElement fn()
	{
		return fntf;
	}
	
	public WebElement ln()
	{
		return lntf;
	}
	
	public WebElement save()
	{
		return savebtn;
	}
}
