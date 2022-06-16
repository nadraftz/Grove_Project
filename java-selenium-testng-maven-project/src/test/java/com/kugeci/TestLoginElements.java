package com.kugeci;

import org.openqa.selenium.Keys;

import org.openqa.selenium.By;
import com.kugeci.Setup;
import org.openqa.selenium.WebDriver;
import com.kugeci.PageFactory.HomePage;


public class TestLoginElements{
	
	private WebDriver driver;
	
	public TestLoginElements(WebDriver driver){
		
		this.driver = driver;
		
	}
	
		private static final By EMAIL_FIELD = By.cssSelector("input[name='session_key']");
		private static final By PASSWORD_FIELD = By.cssSelector("input[type='password']");
		private static final By SIGN_IN = By.cssSelector("button[type='submit']");
		
				
	    HomePage objHomePage; 
	  
	
	public void test_login_element_code(){
		
	
		  objHomePage = new HomePage(driver);
		
    	
		driver.findElement(EMAIL_FIELD).sendKeys("joanne@forkitfoods.com");
    	driver.findElement(PASSWORD_FIELD).sendKeys("Gavin418!");
    	driver.findElement(SIGN_IN).sendKeys(Keys.RETURN);
    	
    	
		
    	String ad = driver.getCurrentUrl();
    	if(ad.equals("https://www.linkedin.com/feed/?trk=homepage-basic_signin-form_submit"))
    	{
    		System.out.println("test passed");
    	}
    	else
    	{
    		System.out.println("test failed");
    	}
    	try{
    		Thread.sleep(7000);
    	}
    	catch(Exception ignored){}

	
	}

}
