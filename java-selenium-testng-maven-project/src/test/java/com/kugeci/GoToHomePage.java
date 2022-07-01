package com.kugeci;
import org.openqa.selenium.WebDriver;

public class GoToHomePage {
	
	private WebDriver driver;
	
	public GoToHomePage (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
//	private WebDriver getDriver() {
//		return driver;
//	}

	public void beforeTest() {
		// TODO Auto-generated method stub	
//		driver = getDriver();
//		System.out.println("test");
		
		driver.get("http://www.automationpractice.com");		
		// maximizing the window
		driver.manage().window().maximize();
    }
		
		
	
		
		

	

}
