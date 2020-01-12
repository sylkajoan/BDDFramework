package com.noorteck.qa.steps;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CampaingsStepDefinition extends BaseClass {
	
	@Given("^User is logged in and in CRM Home page$")
	public void NavigateToPage()   {
		campaingObj.clickCampaingsLink();    
	}

	@When("^User navigates to campaings page$")
	public void clickCampaingsLink()  {
	    campaingObj.clickCampaingsLink();
	}

	@When("^User clicks template$")
	public void clickTemplate()  {
	  campaingObj.clickTemplateButton();
	}

	@When("^User clicks new content template$")
	public void clickContent()  {
		campaingObj.clickNewContentTemplate(); 
	}

	@When("^User enters name, subject, body in the field \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enterEmailData(String name, String subject, String body) {
		campaingObj.enterName(name);
		campaingObj.enterSubject(subject);
		campaingObj.enterEmailBody(body);		
	}

	@When("^User clicks save button$")
	public void saveClick()  {
	   campaingObj.clickSave();
	}

	@Then("^User should be directed to the Content Templates Page$")
	public void inContentTempage()  {
		System.out.println("User is in Content Templates Page"); 
	}

	@When("^User clicks sms template$")
	public void clicksSmsTemplate()  {
		campaingObj.selectSmsContent(); 
	}
	    
	@When("^User enters name and body in the field \"([^\"]*)\", \"([^\"]*)\"$")
	public void enterSmsData(String name, String body)  {
		campaingObj.enterName(name);
		campaingObj.enterSmsBody (body);
	    
	}

	
	
	
	
	
	
}
