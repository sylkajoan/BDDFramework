package com.noorteck.qa.steps;

//import com.noorteck.qa.utilities.BaseClass;
import com.noorteck.qa.utilities.ReadProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//public class LoginStepDefinition extends BaseClass{
//	
//	@Given("^User is on Free CRM Login page$")
//	public void loginPage()  {
//	   prop = ReadProperties.getProperties(environmentDataFilePath);
//	   openBrowser();
//	   navigate(prop.getProperty("url"));
//	   initializeClassObj();
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void getLogTitle()  {
//		System.out.println(driver.getTitle());  
//	}
//
//	@When("^User enters valid username and password$")
//	public void enterCredentials()  {
//		loginObj.enterEmail(prop.getProperty("username"));
//		loginObj.enterPassword(prop.getProperty("password"));
//	}
//
//	@When("^User clicks on login button$")
//	public void clickLogin()  {
//		loginObj.clickLogin();
//	}	
//
//	@Then("^User is on home page$")
//	public void validateHomePage()  {
//		System.out.println(homeObj.getUserNameText());
//	}
//		
//	@When("^User enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
//		public void userName(String userName, String password)  {
//		loginObj.enterEmail(userName);
//		loginObj.enterPassword(password);  
//		}
//	
//	@Then("^close the browser$")
//	public void closeBrowser()  {
//		tearDown ();    //we can use driver.quit(); too...
//	}
//}

