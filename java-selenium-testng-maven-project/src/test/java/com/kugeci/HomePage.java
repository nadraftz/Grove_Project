package com.kugeci;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebElement;		
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;	

public class HomePage extends Setup {
	
    @BeforeTest
    public void beforeChildTest() {
		driver.get("https://www.kugeci.com/");
		
		// maximizing the window
		driver.manage().window().maximize();	
    }
    
	@Test
	public void testTitle() throws UnsupportedEncodingException {
		// getBytes("US-ASCII") works for all languages.
	    byte[] expectedTitle = "酷歌词".getBytes("US-ASCII");
	    byte[] actualTitle = driver.getTitle().getBytes("US-ASCII");
	    Assert.assertTrue(Arrays.equals(expectedTitle, actualTitle));
	}
	
	@Test
	public void testSearch() throws UnsupportedEncodingException {
		byte[] expectedString = "搜搜".getBytes("US-ASCII");
		// use "Ranorex Selocity" Chrome plugin to quickly identify the css selector and xpath.
        WebElement search_field = driver.findElement(By.cssSelector(".form-control"));	        
        //WebElement search_field = driver.findElement(By.xpath("//div[@id='app']/nav//form[@action='https://www.kugeci.com/search']//input[@name='q']"));
        byte[] actualString = search_field.getAttribute("placeholder").getBytes("US-ASCII");
        Assert.assertEquals(actualString, expectedString, "Failure  message: Search filed text is wrong!");
	}
	
	//softAssert.assertAll() is a non-static method, so you need to initiate a object to use it.
	SoftAssert softAssert1 = new SoftAssert();
	@Test
	public void testLanguage() throws UnsupportedEncodingException {
		String expectedString = "English Version";
		String actualString = driver.findElement(By.cssSelector(".locale-en")).getText();
		// this test case contains 2 assertions, use soft assert to continue test if the 1st assertion failed.
		softAssert1.assertEquals(expectedString, actualString, String.format("Failure  message: Expected is %s, but actual is %s", expectedString, actualString));
		
		byte[] expectedBytes = "日本語版".getBytes("US-ASCII");	        
		byte[] actualBytes = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/ul[1]//a[@href='https://www.kugeci.com/locale/jp']")).getText().getBytes("US-ASCII");
		String expectedString1 = new String(expectedBytes);
		String actualString1 = new String(actualBytes);
		softAssert1.assertEquals(expectedBytes, actualBytes, String.format("Failure  message: Expected is %s, but actual is %s", expectedString1, actualString1));
		
		// assertEquals is a public static void method, but assertAll is a public void method. 
		// for non-static method, need to initiate an object to use it.
		// object softAssert was initiated in parent class.
		softAssert1.assertAll();
	}
	
	SoftAssert softAssert2 = new SoftAssert();
	@Test
	public void testTabs() throws UnsupportedEncodingException {
		byte[] expectedBytes1 = "首页".getBytes("US-ASCII");
		byte[] actualBytes1 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(1)")).getText().getBytes("US-ASCII");	        
		String expectedString1 = new String(expectedBytes1);
		String actualString1 = new String(actualBytes1);
		softAssert2.assertEquals(expectedBytes1, actualBytes1, String.format("Failure  message 1: Expected is %s, but actual is %s", expectedString1, actualString1));
		
		byte[] expectedBytes2 = "今日热门歌曲".getBytes("US-ASCII");
		byte[] actualBytes2 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(2)")).getText().getBytes("US-ASCII");	        
		String expectedString2 = new String(expectedBytes2);
		String actualString2 = new String(actualBytes2);
		softAssert2.assertEquals(expectedBytes2, actualBytes2, String.format("Failure  message 2: Expected is %s, but actual is %s", expectedString2, actualString2));
		
		byte[] expectedBytes3 = "热门歌曲".getBytes("US-ASCII");
		byte[] actualBytes3 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(3)")).getText().getBytes("US-ASCII");	        
		String expectedString3 = new String(expectedBytes3);
		String actualString3 = new String(actualBytes3);
		softAssert2.assertEquals(expectedBytes3, actualBytes3, String.format("Failure  message 3: Expected is %s, but actual is %s", expectedString3, actualString3));
		
		byte[] expectedBytes4 = "最新歌曲".getBytes("US-ASCII");
		byte[] actualBytes4 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(4)")).getText().getBytes("US-ASCII");	        
		String expectedString4 = new String(expectedBytes4);
		String actualString4 = new String(actualBytes4);
		softAssert2.assertEquals(expectedBytes4, actualBytes4, String.format("Failure  message 4: Expected is %s, but actual is %s", expectedString4, actualString4));
		
		byte[] expectedBytes5 = "歌手".getBytes("US-ASCII");
		byte[] actualBytes5 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(5)")).getText().getBytes("US-ASCII");	        
		String expectedString5 = new String(expectedBytes5);
		String actualString5 = new String(actualBytes5);
		softAssert2.assertEquals(expectedBytes5, actualBytes5, String.format("Failure  message 5: Expected is %s, but actual is %s", expectedString5, actualString5));
		
		byte[] expectedBytes6 = "作词".getBytes("US-ASCII");
		byte[] actualBytes6 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(6)")).getText().getBytes("US-ASCII");	        
		String expectedString6 = new String(expectedBytes6);
		String actualString6 = new String(actualBytes6);
		softAssert2.assertEquals(expectedBytes6, actualBytes6, String.format("Failure  message 6: Expected is %s, but actual is %s", expectedString6, actualString6));
		
		byte[] expectedBytes7 = "作曲".getBytes("US-ASCII");
		byte[] actualBytes7 = driver.findElement(By.cssSelector("#app .top-menu .top-menu-item:nth-of-type(7)")).getText().getBytes("US-ASCII");	        
		String expectedString7 = new String(expectedBytes7);
		String actualString7 = new String(actualBytes7);
		softAssert2.assertEquals(expectedBytes7, actualBytes7, String.format("Failure  message 7: Expected is %s, but actual is %s", expectedString7, actualString7));
		
		softAssert2.assertAll();
	}
	
	SoftAssert softAssert3 = new SoftAssert();
	@Test
	public void testTables() throws UnsupportedEncodingException {		
		byte[] expectedBytes1 = "今日热门歌曲".getBytes("US-ASCII");	        
		byte[] actualBytes1 = driver.findElement(By.cssSelector("[class='col-md-8'] h3:nth-of-type(1)")).getText().getBytes("US-ASCII");
		String expectedString1 = new String(expectedBytes1);
		String actualString1 = new String(actualBytes1);
		softAssert3.assertTrue(actualString1.contains(expectedString1), String.format("Failure  message 1: Expected is %s, but actual is %s", expectedString1, actualString1));
	
		byte[] expectedBytes2 = "今日最新歌曲".getBytes("US-ASCII");	        
		byte[] actualBytes2 = driver.findElement(By.cssSelector("[class] h3:nth-child(4)")).getText().getBytes("US-ASCII");
		String expectedString2 = new String(expectedBytes2);
		System.out.println(expectedString2);
		String actualString2 = new String(actualBytes2);
		System.out.println(actualString2);
		softAssert3.assertTrue(actualString2.contains(expectedString2), String.format("Failure  message 2: Expected is %s, but actual is %s", expectedString2, actualString2));
	
		byte[] expectedBytes3 = "最新视频".getBytes("US-ASCII");	        
		byte[] actualBytes3 = driver.findElement(By.cssSelector("[class] [class='col-md-4'] h3:nth-of-type(1)")).getText().getBytes("US-ASCII");
		String expectedString3 = new String(expectedBytes3);
		String actualString3 = new String(actualBytes3);
		softAssert3.assertTrue(actualString3.contains(expectedString3), String.format("Failure  message 3: Expected is %s, but actual is %s", expectedString3, actualString3));
		
		byte[] expectedBytes4 = "热门歌手".getBytes("US-ASCII");	        
		byte[] actualBytes4 = driver.findElement(By.cssSelector("[class] [class] h3:nth-child(6)")).getText().getBytes("US-ASCII");
		String expectedString4 = new String(expectedBytes4);
		String actualString4 = new String(actualBytes4);
		softAssert3.assertTrue(actualString4.contains(expectedString4), String.format("Failure  message 4: Expected is %s, but actual is %s", expectedString4, actualString4));
		
		byte[] expectedBytes5 = "热门作词".getBytes("US-ASCII");	        
		byte[] actualBytes5 = driver.findElement(By.cssSelector("[class] [class] h3:nth-child(8)")).getText().getBytes("US-ASCII");
		String expectedString5 = new String(expectedBytes5);
		String actualString5 = new String(actualBytes5);
		softAssert3.assertTrue(actualString5.contains(expectedString5), String.format("Failure  message 5: Expected is %s, but actual is %s", expectedString5, actualString5));
		
		byte[] expectedBytes6 = "热门作曲".getBytes("US-ASCII");	        
		byte[] actualBytes6 = driver.findElement(By.cssSelector("[class] [class] h3:nth-child(10)")).getText().getBytes("US-ASCII");
		String expectedString6 = new String(expectedBytes6);
		String actualString6 = new String(actualBytes6);
		softAssert3.assertTrue(actualString6.contains(expectedString6), String.format("Failure  message 6: Expected is %s, but actual is %s", expectedString6, actualString6));
	
		softAssert3.assertAll();
	}
}