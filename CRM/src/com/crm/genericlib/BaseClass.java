package com.crm.genericlib;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.BrokenBarrierException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	RemoteWebDriver driver;
	DesiredCapabilities Des;
	@Parameters("browser")
	@BeforeTest
	public void configBeforeTest(String browserNAme) throws MalformedURLException{
		
		if(browserNAme.equals("firefox")){
		 Des=DesiredCapabilities.firefox();
		}else if(browserNAme.equals("chrome")){
			 Des=DesiredCapabilities.chrome();
		}else if(browserNAme.equals("ie")){
			 Des=DesiredCapabilities.internetExplorer();
		}
		
		
	URL  url=new URL("http://192.168.43.123:4444/wd/hub"); //hub server
       driver=new RemoteWebDriver(url,Des);
	   driver.get("http://192.168.43.123:8888");//app server
		
	}
	/*@BeforeMethod
	public void configBM()
	{
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
	}*/
	

}