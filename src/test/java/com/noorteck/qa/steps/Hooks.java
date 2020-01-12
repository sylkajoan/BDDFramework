package com.noorteck.qa.steps;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeTest(Scenario scenario) {
		setUp();
		System.out.println("Test Environment Set up");
		System.out.println("Executing Scenario: ["+ scenario.getName()+" ]");
	}
	
	@After
	public void afterTest(Scenario scenario) {
		System.out.println("Finished Executing Scenario: ["+ scenario.getName()+" ]");
		tearDown();
	}
	
	@Given("^User is logged in and in Home page$")
	public void loginToApp()   {
		loginObj.enterEmail(prop.getProperty("username"));
		loginObj.enterPassword(prop.getProperty("password"));
		loginObj.clickLogin();    
	}

}
