package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties extends baseScript
{
	
	public Readproperties() throws IOException
	{  
		FileInputStream fis = new FileInputStream(path_of_prop_file);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String url()
	{
		String url = pro.getProperty("testUrl");
		return url;
	}
	public String un()
	{
		String un = pro.getProperty("testUN");
		return un;
	}
	public String psw()
	{
		String psw = pro.getProperty("testPWD");
		return psw;
	}
}
