package com.redhu.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.redhu.Util.TestUtil;
import com.redhu.Util.WebEventListener;

public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListner;

	public TestBase() throws IOException {
		prop = new Properties();
		
		// below line are commented because these we were using for Take A class project. if you want to run 
		// take a class then uncommnet these.
	//	FileInputStream ip = new FileInputStream(
		//		"D:\\Home\\November\\SandeepTest\\src\\main\\java\\com\\TakeAClass\\qa\\config\\Config.properties");
		
		
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\KiwiTech\\Downloads\\7MB\\AutomationFramework-7MBAutomation\\src\\main\\java\\com\\redhu\\qa\\config\\Config1.properties");
				
				
		prop.load(ip);
	}

	public static void initialization() throws IOException {
		String browserName = prop.getProperty("browserName");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiwiTech\\Downloads\\7MB\\AutomationFramework-7MBAutomation\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\KiwiTech\\Downloads\\7MB\\AutomationFramework-7MBAutomation\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		/*
		 * @Parameters("browser")
		 * 
		 * 
		 * public static void multiBrowser(String browser) throws
		 * InterruptedException{ if(browser.equalsIgnoreCase("firefox")){
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Home\\November\\SeleniumEasy\\jars\\geckodriver.exe"); driver =
		 * new FirefoxDriver(); }if(browser.equalsIgnoreCase("chrome")){
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Home\\November\\SeleniumEasy\\jars\\chromedriver.exe"); driver =
		 * new ChromeDriver(); }
		 * 
		 */

		e_driver = new EventFiringWebDriver(driver);
		// Going to create eventListner object to register with event driver.
		eventListner = new WebEventListener() {
			
			public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
				// TODO Auto-generated method stub
				
			}
		};
		e_driver.register(eventListner);
		// assigning e_driver to main driver
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICTWAITTIMEOUT, TimeUnit.SECONDS);
		String myUrl = prop.getProperty("url");
		driver.get(myUrl);
	}
}
