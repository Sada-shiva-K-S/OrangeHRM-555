package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Repository 
{
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usertf;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwdtf;
	
	@FindBy(xpath = "//button[.=' Login ']")
	private WebElement lgnbtn;
	
     public Login_Repository(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public WebElement usn()
 	{
 		return usertf;
 	}
 	
 	public WebElement pwd()
 	{
 		return pwdtf;
 	}
 	public WebElement lgn()
 	{
 		return lgnbtn;
 	}
}
