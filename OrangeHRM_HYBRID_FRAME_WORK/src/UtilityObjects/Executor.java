package UtilityObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executor 
{
	public static void ClickAction(WebDriver driver,WebElement element)
	{
		Objects.JSE(driver).executeScript("arguments[0].Click();",element);
	}
	
	public static void ScrollActions(WebDriver driver,WebElement element)
	{
		Objects.JSE(driver).executeScript("arguments[0].ScrollIntoView();",element);
	}
	
	public static void passdata(WebDriver driver,WebElement element,String data)
	{
		Objects.JSE(driver).executeScript("arguments[0].Value='"+data+"'",element);
	}
}
