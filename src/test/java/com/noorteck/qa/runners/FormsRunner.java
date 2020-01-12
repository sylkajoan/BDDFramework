package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/Forms.feature",
		glue = {"com.noorteck.qa.steps.FormsStepDef.java"})

public class FormsRunner {

}
