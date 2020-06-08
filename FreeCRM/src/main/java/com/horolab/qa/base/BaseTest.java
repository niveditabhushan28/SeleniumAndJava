package com.horolab.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.horolab.qa.util.TestUtil;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest() {
		try {
			prop = new Properties();
			FileInputStream ip = 
					new FileInputStream("D:\\Nivedita\\FreeCRM\\src\\main\\java\\com\\horolab\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//driver.getWindowHandle();
		
	}
	


}


