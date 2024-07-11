package testCase;

import java.io.IOException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Excel_Reader;
import base.baseScript;
import pageObjects.Home_Page_Repository;

public class TC1 extends baseScript
{
	@Test
	public void tc1() throws IOException, InterruptedException
	{
		hp = new Home_Page_Repository(driver);
		ew.until(ExpectedConditions.elementToBeClickable(hp.pim()));
		hp.pim().click();
		ew.until(ExpectedConditions.elementToBeClickable(hp.add()));
		hp.add().click();
		String fn = Excel_Reader.data("Sheet1", 0, 0);
		String ln = Excel_Reader.data("sheet1", 0, 1);
		ew.until(ExpectedConditions.visibilityOf(hp.fn()));
		hp.fn().sendKeys(fn);
		ew.until(ExpectedConditions.visibilityOf(hp.ln()));
		hp.ln().sendKeys(ln);
		ew.until(ExpectedConditions.elementToBeClickable(hp.save()));
		hp.save().click();
		Assert.fail();
	}
}
