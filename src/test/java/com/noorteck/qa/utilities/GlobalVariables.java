package com.noorteck.qa.utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.CampaignsPage;

import com.noorteck.qa.pages.FormsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.TasksPage;
import com.noorteck.qa.tests.HomePageTest1;

public class GlobalVariables {
	
	public static String environmentDataFilePath = "./src/test/resources/configs/EnvironmentData.properties";
	public static int implicitWaitTime = 15;
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	//Application Page Class objects -- making global
	public static LoginPage loginObj;
	public static CampaignsPage campaingObj;
	public static FormsPage formsObj;
	public static HomePage homeObj;
	public static TasksPage taskObj;

	public static boolean controlFlag = true;
	
}
