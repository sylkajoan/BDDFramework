Feature: Forms Page Validation

Background: 
	Given User is logged in and in Home page
	
	@SmokeTest
	Scenario: Create new form
	
		When User navigates to Forms page
		And User clicks new
		And User enters form data
			|name | introductionText| completionText|
			|John | new Student     | Batch 2       |
		Then User saves the form