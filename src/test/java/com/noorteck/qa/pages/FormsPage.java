package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utilities.BaseClass;

public class FormsPage extends BaseClass {
	
	//Find all elements
	
	@FindBy(xpath = "//span[contains(text(),'Forms')]")
	WebElement formsLink;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newButton;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/input")
	WebElement nameField;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/textarea")
	WebElement introductionTextField;
	
	@FindBy (xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/textarea")
	WebElement completionTextField;
	
	@FindBy (xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/label")
	WebElement activeButton;
	
	@FindBy (xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[3]")
	WebElement saveButton;
	
	//Create the constructor of the class
	public FormsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Create all method for your elements (for each elements)
	
	public void clickFormsLink() {
		click(formsLink);
	}
	
	public void clickNewButton() {
		click(newButton);
	}
	
	public void enterName (String value) {
		enter(nameField, value);
	}
	
	public void enterIntroductionText(String value) {
		enter(introductionTextField, value);
	
	}
	
	public void entercompletionText(String value) {
		
		enter(completionTextField, value);
	}
	
	public void clickActiveCheckBox() {
		click(activeButton);

	}
	
	public void clickSaveButton() {
		click(saveButton);
		
	}
	
	
	
	
	
}

	