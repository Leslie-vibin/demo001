package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScript1 {
public WebDriver driver;
	
    @Test
    public void  test() {
		// TODO Auto-generated method stub
    	String browser=System.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
		 driver =new ChromeDriver();
			
		}
		if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		//String username=System.getProperty("username");
	    // String pass=System.getProperty("password");
		//welcome
		System.out.println("Hello");
		//Thank you
	
    }
    @Test
    public void  testpollscm() {
		// TODO Auto-generated method stub
		
		//welcome
		System.out.println("pollscm");
		//Thank you
	
    }
}
