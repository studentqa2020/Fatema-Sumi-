package com.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.AutomationPracticeLogin;

public class SmokeTestExecution {

	
 @BeforeTest
	 
	public void setup() {
	WebDriver driver = new ChromeDriver();
	 
 } 
@Test
public void loginTest() {
	new AutomationPracticeLogin().baselogin();

	
}
@AfterTest
public void teardown() {
	
 teardown();
	
	
	
}
	 
	 
	

	
	
}
