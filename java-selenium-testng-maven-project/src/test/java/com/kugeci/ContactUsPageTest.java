package com.kugeci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class ContactUsPageTest extends Setup {
		
//	private static final By SUBJECT_HEADING = By.cssSelector("#uniform-id_contact");
	private static final By EMAIL_ADDRESS = By.id("email");
	private static final By ORDER_REFERENCE = By.id("id_order");
	private static final By MESSAGE = By.id("message");
	private static final By SEND_BUTTON = By.id("submitMessage");
	

			
	@Test
		public void loadContactUsPage() {
			    	
			driver.get("http://automationpractice.com/index.php?controller=contact");
			
			sleepTime(4000);
			
//			driver.findElement(SUBJECT_HEADING).click();
			Select dropdown = new Select(driver.findElement(By.id("id_contact")));
			dropdown.selectByVisibleText("Customer service");
			
			sleepTime(2000);
	
	    	driver.findElement(EMAIL_ADDRESS).sendKeys("joebuttermer321@gmail.com");
	    	driver.findElement(ORDER_REFERENCE).sendKeys("8675309");
	    	driver.findElement(MESSAGE).sendKeys("Hello World");
	    	driver.findElement(SEND_BUTTON).click();

	    	WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	    	boolean successShown = successMessage.isDisplayed();
	    	Assert.assertEquals(successShown, true, "Success message was not displayed"); 
	    	
	    	
	    	sleepTime(2000);
	    	
	    	System.out.println("Did It?");
	    	
	    	
	    	}
	
	}

