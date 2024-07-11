package base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Capture_defects extends baseScript
{
	
	public static void getdefect(String FILENAME)
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	Date d = new Date();
	String d1 = d.toString().replace(":", "-");
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File(path_of_screenshots+FILENAME+" "+d1+".png");
	try 
	{
		FileHandler.copy(temp, perm);
	} 
	catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
