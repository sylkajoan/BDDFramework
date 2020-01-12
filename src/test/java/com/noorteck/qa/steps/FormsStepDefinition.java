package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormsStepDefinition extends BaseClass{


//@When("^User navigates to Forms page$")
//public void navigateToForm()  {
//	formsObj.clickFormsLink();
//	
//}
//    
//@When("^User clicks new$")
//public void clicksNew()  {
//	formsObj.clickNewButton();
//   
//}
//
//@When("^User enters form data$")
//public void enterFormData(DataTable dataTable) {
//	//Convert Data Tale to List Map
//	List<Map<String, String>> ListMap =dataTable.asMaps(String.class, String.class);
//	
//	//Convert List Map to a Map
//	for (Map<String, String> map : ListMap) {
//		//use get() method to retrieve the value by passing the key
//		formsObj.enterName(map.get("name"));
//		formsObj.enterIntroductionText(map.get("introductionText"));
//		formsObj.entercompletionText(map.get("completionText"));
//		
//	}
//	
//}
//
//@Then("^User saves the form$")
//public void savesForm()  {
//	formsObj.clickSaveButton();
//
//	}


@When("^User navigates to forms page$")
public void navigatesPage()  {
	formsObj.clickFormsLink();
   
}

@When("^User click delete icon$")
public void user_click_delete_icon()  {
    
}

@When("^User clicks delete button$")
public void user_clicks_delete_button()  {
    
}

@Then("^User should be directed to Forms page$")
public void user_should_be_directed_to_Forms_page()  { 
	
	}

}
