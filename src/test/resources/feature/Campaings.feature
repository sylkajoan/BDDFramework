Feature: Campaigns Page Validation

Background: 
	Given User is logged in and in Home page 
@RegressionTest
Scenario Outline: Create new email content template 
	When User navigates to campaings page 
	And User clicks template 
	And User clicks new content template 
	And User enters name, subject, body in the field "<name>", "<subject>", "<body>" 
	And User clicks save button 
	Then User should be directed to the Content Templates Page 
	
	Examples: 
		|name		|subject		|body				|
		|Sanjay		| Batch 2		| Start date Feb 22, 2020	|
		|Rajesh		| Batch 2		| Start date FEb 22, 2020	|	
		

Scenario Outline: Create new sms content template
	When User navigates to campaings page
	And User clicks template
	And User clicks new content template
	And User clicks sms template 
	And User enters name and body in the field "<name>", "<body>"
	And User clicks save button
	Then User should be directed to the Content Templates Page
	
	Examples:
		|name	  | body  |
		|Sanjuan  | Sms 1 |
		|Carolina | Sms 2 | 
		|Jose     | Sms 3 |
		|John     | Sms 4 |
		|Victor   | Sms 5 |
		|Maria    | Sms 6 |
		|Hector   | Sms 7 |
		|Javier   | Sms 8 |
		|Sylvia   | Sms 9 |
		|Joanell  | Sms 10|