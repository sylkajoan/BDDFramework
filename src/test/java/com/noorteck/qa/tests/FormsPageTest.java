package com.noorteck.qa.tests;

import org.testng.annotations.Test;

import com.noorteck.qa.utilities.BaseClass;

public class FormsPageTest extends BaseClass {
  @Test
  public void createNewForm() {
	  
	  formsObj.clickFormsLink();
	  formsObj.clickNewButton();
	  formsObj.enterName("Jorge");
	  formsObj.enterIntroductionText("Java");
	  formsObj.entercompletionText("Class");
	  formsObj.clickActiveCheckBox();
	  formsObj.clickSaveButton();
	  
  }
  
}
