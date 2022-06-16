package com.kugeci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;

import com.kugeci.Setup;
import com.kugeci.PageFactory.HomePage;

public class TestLogin extends Setup{
	

	    HomePage objHomePage; 
	    
	   @Test
	    public void test_login_screen(){
			
		    open_newpage_code("homepage");
			TestLoginElements myTestLoginElements = new TestLoginElements(driver);
			myTestLoginElements.test_login_element_code();
			
			try{
				
				Thread.sleep(7000);
				
			}
			
			catch(Exception ignored){}
			
			open_newpage_code("linkedin", "jobspage");
		
		}

		public void open_newpage_code(String L){
		
			
			//Create Home Page object
				objHomePage = new HomePage(driver);
				driver.manage().window().maximize();
   	
				driver.get("https://www.linkedin.com/");		
			// maximizing the window
				driver.manage().window().maximize();
		
	}
		
		public void open_newpage_code(String L, String J){
	
			 driver.findElement(By.cssSelector("#ember20 > svg")).click();
	    
				try{
					
					Thread.sleep(3000);
					
				}
				
				catch(Exception ignored){}
	    	
	    	
	  
			
			
			
		}
		
		
			



		
		
}
