package com.noorteck.qa.tests;

import org.testng.annotations.Test;

import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.utilities.BaseClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest extends BaseClass {
	  LoginPage l;
	  
	 
	@Test
  public void loginTest() {
		l = new LoginPage();
		l.enterEmail(prop.getProperty("username"));
		l.enterPassword(prop.getProperty("password"));
		l.clickLogin();	
	}

	@Test
	public void negLoginTest() {
	l = new LoginPage();
	l.enterEmail(prop.getProperty("username"));
	l.enterPassword("wrongPassword");
	l.clickLogin();	

	}
}
