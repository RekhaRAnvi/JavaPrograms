package justsoko.MavenJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class base 
{

	public void initializDriver() throws IOException
	
	{
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\MavenJava\\src\\main\\java\\justsoko\\MavenJava\\data.properties");
	    
		prop.load(fis);
		
	String browserName = prop.getProperty("browser");
	
	if(browserName=="chrome")
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver.exe");
	}
	else if (browserName=="firefox")
	{
		
	}
	else if (browserName=="IE")
	{
		
	}
	
	}
	

}
