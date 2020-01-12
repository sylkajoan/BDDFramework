package com.noorteck.qa.tests;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noorteck.qa.utilities.BaseClass;
import com.noorteck.qa.utilities.Common;

public class HomePageTest1 extends BaseClass {
	
	@Test (priority = 1)		//--> This way we use priority for the test cases.
	public void homePageUserNameTest() {
		String expectedUserName = "fahim noor";
		String actualUserName = homeObj.getUserNameText();
		boolean isEqual = Common.compareTwoValue(actualUserName, expectedUserName);
		Assert.assertTrue(isEqual);
	}
	
	@Test
	public void homePageTitleTest() {
		String expectedTitle = "Cogmento CRM";
		String actualTitle = homeObj.getHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		//boolean isEqual = Common.compareTwoValue(actualTitle, expectedTitle);
		//Assert.assertTrue(isEqual);  --> This is another way to complete the Assert part
									// --> But Fahim prefers the one that we have.
	}
	
}

