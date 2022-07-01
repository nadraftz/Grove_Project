package com.kugeci;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WomenPageTests extends Setup {
	
	   @Test
	    public void loadWomensPage() {
	    	GoToHomePage myGoToHomePage = new GoToHomePage(driver);
	    	myGoToHomePage.beforeTest();
	    	
			driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");		
			// maximizing the window
			driver.manage().window().maximize();
	    }

}

