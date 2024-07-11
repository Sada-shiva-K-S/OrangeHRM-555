package UtilityObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions 
{
	public void SelectOption(WebElement element,Object Data)
	{
		Select SO = Objects.dropdwon(element);
		if(Data instanceof Integer)
		{
			SO.selectByIndex((Integer)Data);
		}
		else if (Data instanceof String)
		{
			SO.selectByValue((String)Data);
		}
		else 
		{
			SO.selectByVisibleText((String)Data);
		}
	}
	
	public void DSA(WebElement element)
	{ 
		Select SO = Objects.dropdwon(element);
		SO.deselectAll();
		
	}
}

