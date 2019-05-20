package com.kugeci;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Setup {
	protected WebDriver driver;
	protected String browser;
	
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browser) throws Exception {
		this.browser = browser;
		if(browser.equals("Chrome")) {
			//System.out.println("at Setup beforeTest Chrome");
			System.setProperty("webdriver.chrome.driver","..\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			//System.out.println("at Setup beforeTest Firefox");
			System.setProperty("webdriver.gecko.driver","..\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		//System.out.println("at 15 seconds pause");
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		//System.out.println("at Setup afterTest");
		driver.quit();	
	}

}
