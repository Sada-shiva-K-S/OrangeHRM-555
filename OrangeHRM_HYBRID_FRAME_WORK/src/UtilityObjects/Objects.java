package UtilityObjects;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Objects 
{
	public static Select dropdwon(WebElement element)
	{
		Select d=new Select(element);
		return d;
	}
	
	public static Actions Mounse(WebDriver driver)
	{
		 Actions act= new Actions(driver);
		return act;
	}
	
	public static JavascriptExecutor JSE(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
	
	public static Robot keyboard() throws AWTException
	{
		Robot r = new Robot();
		return r;
		
	}
}

