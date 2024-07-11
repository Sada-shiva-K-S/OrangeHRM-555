package UtilityObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActions 
{
	public static void RightClick(WebDriver driver,WebElement element)
	{
		Objects.Mounse(driver).contextClick(element).perform();
	}
	
	public static void DoubleClick(WebDriver driver,WebElement element)
	{
		Objects.Mounse(driver).doubleClick(element).perform();
	}
	
	public static void draganddrop(WebDriver driver,WebElement src,WebElement dst)
	{
		Objects.Mounse(driver).dragAndDrop(src,dst).perform();
	}
	
	public static void MounseHover(WebDriver driver,WebElement element)
	{
		Objects.Mounse(driver).moveToElement(element).perform();
	}
}
