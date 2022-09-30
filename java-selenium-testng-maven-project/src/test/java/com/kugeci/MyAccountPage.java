package com.kugeci;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyAccountPage extends Setup {
	
	private static final By SIGNIN_BUTTON = By.className("login");
	private static final By EMAIL_ADDRESS = By.id("email_create");
	private static final By CREATE_ACCOUNT_BUTTON = By.id("SubmitCreate");
	private static final By MALE_RADIO_BUTTON = By.id("id_gender1");
	private static final By FEMALE_RADIO_BUTTON = By.id("id_gender2");
	private static final By FIRST_NAME_FIELD = By.id("customer_firstname");
	private static final By LAST_NAME_FIELD = By.id("customer_lastname");
	private static final By EMAIL_FIELD = By.id("email");
	private static final By PASSWORD_FIELD = By.id("passwd");	
	private static final By ADDRESS_FIRST_NAME_FIELD = By.id("firstname");
	private static final By ADDRESS_LAST_NAME_FIELD = By.id("lastname");
	private static final By ADDRESS_ONE_FIELD = By.id("address1");
	private static final By CITY_FIELD = By.id("city");
	private static final By STATE_FIELD = By.id("id_state");
	private static final By ZIP_FIELD = By.id("postcode");
	private static final By COUNTRY_FIELD = By.id("id_country");
	private static final By PHONE_MOBILE_FIELD = By.id("phone_mobile");
	private static final By ADDRESS_ALIAS_FIELD = By.id("alias");
	private static final By REGISTER_BUTTON = By.id("submitAccount");
	
	


	
	@Test
	public void loadHomePage() {
		    	
	driver.get("http://automationpractice.com/");
	
	driver.findElement(SIGNIN_BUTTON).click();
		
		sleepTime(4000);}
	
	@Test
	public void registerNewUserTest() {
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		createNewAccount();
		enterPersonalInfo();
		driver.findElement(REGISTER_BUTTON).click();

		
		
	}
	

	
	public void createNewAccount() {
		
		driver.findElement(EMAIL_ADDRESS).sendKeys("email09123487@email.com");
		
		driver.findElement(CREATE_ACCOUNT_BUTTON).click();
		
		
	
	}
		
		
	public void enterPersonalInfo() {
		
		WebDriverWait wait=new WebDriverWait(driver, 20, 250);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MALE_RADIO_BUTTON));
		
		driver.findElement(MALE_RADIO_BUTTON).click();
		driver.findElement(FIRST_NAME_FIELD).sendKeys("Betty");
		driver.findElement(LAST_NAME_FIELD).sendKeys("Boop");
		driver.findElement(EMAIL_FIELD).sendKeys("email09123487@email.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("HerBodyHerChoice!*");
		
		Select dayDropdown = new Select(driver.findElement(By.id("days")));
		dayDropdown.selectByValue("31");
		
		
		Select monthDropdown = new Select(driver.findElement(By.id("months")));
		monthDropdown.selectByValue("4");
		
		Select yearDropdown = new Select(driver.findElement(By.id("years")));
		yearDropdown.selectByValue("1978");
		
		driver.findElement(ADDRESS_FIRST_NAME_FIELD).sendKeys("Betty");
		driver.findElement(ADDRESS_LAST_NAME_FIELD).sendKeys("Boop");
		driver.findElement(ADDRESS_ONE_FIELD).sendKeys("24062 North Overhill");
		driver.findElement(CITY_FIELD).sendKeys("Heaven");
		
		Select countryDropdown = new Select(driver.findElement(By.id("id_country")));
		countryDropdown.selectByVisibleText("United States");
		
		driver.findElement(PHONE_MOBILE_FIELD).sendKeys("888-867-5309");
		driver.findElement(ADDRESS_ALIAS_FIELD).sendKeys("The Bestest Home");
		
	}
	
	


		
		
		
		


		

		

		
//		titleSelectTest(MALE_RADIO_BUTTON);
//		titleSelectTest(FEMALE_RADIO_BUTTON, );
//		titleSelectTest();
//		titleSelectTest("test");
		
	
	
	
//	public void titleSelectTest(By gender, String state) {
//		//do whatever up to this point
//		selectGender(gender);
//		//do whatever after this point
//		selectState(state)
//		
//	}
//	
//	public void titleSelectTest(By gender) {
//		//do whatever up to this point
//		selectGender(gender);
//		//do whatever after this point
//		selectState("illinois");
//		
//	}
//	
//	public void titleSelectTest(String gender) {
//		//do whatever up to this point
//		selectGender(gender);
//		//do whatever after this point
//		selectState("illinois");
//		
//	}
	
//	public void titleSelectTest() {
//		//do whatever up to this point
//		selectGender(MALE_RADIO_BUTTON);
//		//do whatever after this point
//		selectState("illinois");
//		
//	}
//	
//	public void selectGender(By gender) {
//		driver.findElement(gender).click();
//	}
//	
	


public static void main(String[] args) {
		// TODO Auto-generated method stub
;
	}

}
