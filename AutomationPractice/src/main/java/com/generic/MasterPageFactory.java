package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	
public MasterPageFactory(WebDriver driver){ //to remove Null Point Exceptions
	 
		PageFactory.initElements(driver,MasterPageFactory.this);
	}
	
	
	

	@FindBy(xpath="//*[@class='login']")	
	private	WebElement signinbtn;

	
	@FindBy(xpath="//*[@id='email']")	
	private	WebElement email;



	@FindBy(xpath="//*[@id='passwd']")	
	private	WebElement password;


	
	@FindBy(xpath="//*[@class='icon-lock left']")	
	private	WebElement logninbtn;



	public WebElement getSigninbtn() {
		return signinbtn;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogninbtn() {
		return logninbtn;
	}


	
	
	
	
	

}
