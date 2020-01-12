package com.noorteck.qa.steps;

import org.junit.Assert;

import com.noorteck.qa.utilities.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TasksStepDefinition extends BaseClass{
	
	@When("^User navigates to tasks page$")
	public void navigatesToPage() {
		taskObj.clickTaskLink();
	}

	@When("^User clicks New$")
	public void clicksNewButton()   {
		taskObj.clickNew();   
	}

	@When("^User saves the task$")
	public void savesTask()  {
		taskObj.clickSave();   
	}

	@Then("^it should display error \"([^\"]*)\"$")
	public void expectedError(String expectedError)  {
		String actualError = taskObj.getTitleError();
		Assert.assertEquals(expectedError, actualError);   
	}

	@When("^User enters task title \"([^\"]*)\"$")
	public void TaskData(String titleValue)  {
		taskObj.enterTitle(titleValue);  
	}

	@Then("^the title of task should be displayed \"([^\"]*)\"$")
	public void expectedTitleTask(String expectedTitleHeader)  {
		String actualTitleHeader = taskObj.getTitleHeaderText();
		Assert.assertEquals(expectedTitleHeader, actualTitleHeader);
	
	}

}
