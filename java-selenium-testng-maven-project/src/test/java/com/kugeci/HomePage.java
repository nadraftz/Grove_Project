package com.kugeci;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebElement;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	

public class HomePage extends Setup {
	
    @BeforeTest
    public void beforeChildTest() {
    	//System.out.println("at HomePage beforeTest browser is " + this.browser);
		driver.get("https://www.kugeci.com/");
    }
    
	@Test				
	public void testTitle() throws UnsupportedEncodingException {
		//System.out.println("at HomePage testTitle");
	    byte[] expectedTitle = "酷歌词".getBytes("US-ASCII");
	    byte[] actualTitle = driver.getTitle().getBytes("US-ASCII");
	    Assert.assertTrue(Arrays.equals(expectedTitle, actualTitle));
	}
	
	@Test
	public void testSearch() throws UnsupportedEncodingException {
		//System.out.println("at HomePage testSearch");
		byte[] expectedString = "搜搜".getBytes("US-ASCII");
		// use "Ranorex Selocity" Chrome plugin to quickly identify the css selector and xpath.
        WebElement search_field = driver.findElement(By.cssSelector(".form-control"));	        
        //WebElement search_field = driver.findElement(By.xpath("//div[@id='app']/nav//form[@action='https://www.kugeci.com/search']//input[@name='q']"));
        byte[] actualString = search_field.getAttribute("placeholder").getBytes("US-ASCII");
        Assert.assertEquals(actualString, expectedString, "Failure  message: Search filed text is wrong!");
	}
	
}