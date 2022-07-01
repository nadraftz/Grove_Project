package com.kugeci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.kugeci.Setup;
import com.kugeci.PageFactory.HomePage;
import com.kugeci.PageFactory.SearchResultPage;
import org.openqa.selenium.Keys;

public class LoginTest extends Setup {

	private static final By LOGIN_BUTTON = By.id("hf_title_signin_membership");
	private static final By EMAIL_FIELD = By.cssSelector("input[type='email']");
	private static final By PASSWORD_FIELD = By.cssSelector("input[type='password']");
	private static final By SIGN_IN = By.cssSelector("input[value='SIGN IN']");


	
    @BeforeClass
    public void beforeTest() {
    	GoToHomePage myGoToHomePage = new GoToHomePage(driver);
    	myGoToHomePage.beforeTest();
    	
		driver.get("http://www.automationpractice.com");		
		// maximizing the window
		driver.manage().window().maximize();
    }
	
	HomePage objHomePage; 
	SearchResultPage objSearchResultPage;
	@Test
    public void test_Search_Result_Page_Appear_Correct(){
        //Create Home Page object
//    	objHomePage = new HomePage(driver);

    	
	
  		
//    	wait_for_login_button();
//    	login_to_account();
//    	driver.navigate().refresh();
////    	wait_for_login_button();
////    	login_to_account();
//    	
//		
//    	try {
//    		Thread.sleep(4000);
//    		
//    	}catch(Exception ignored) {}
    	

    }
	
	public void wait_for_login_button() {
		WebDriverWait wait1 = new WebDriverWait(driver, 20, 250);
    	
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
    }
	
	public void login_to_account() {
    	driver.findElement(LOGIN_BUTTON).click();
    	driver.findElement(EMAIL_FIELD).sendKeys("joebuttermer321@gmail.com");
    	driver.findElement(PASSWORD_FIELD).sendKeys("Program12!");
    	driver.findElement(SIGN_IN).click();
	
	
	}

}

//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cheese");
//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
//// 	Google button for cheese search and hit enter
//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

//do a search at home page	
//objHomePage.SearchAtHomePage("disco");

// go the Search Result Page page	
//objSearchResultPage = new SearchResultPage(driver);

//Verify if search_result is returned	
//Assert.assertTrue(driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div.NJo7tc.Z26q7c.jGGQ5e > div > a > h3")).isDisplayed());

///html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
//
