Feature: Free CRM Login Feature

#	Scenario: Test login with valid credentials
#	Given User is on Free CRM Login page
#	When title of login page is Cogmento CRM
#	And User enters valid username and password
#	And User clicks on login button
#	Then User is on home page
#	And close the browser
#	
#	Scenario: Test login with Invalid credentials
#	Given User is on Free CRM Login page
#	When title of login page is Cogmento CRM
#	And User enters valid username "fahimn12" and password "password"
#	And User clicks on login button
#	Then close the browser
	
	
	Scenario Outline: Test login with Invalid credentials
	Given User is on Free CRM Login page
	When title of login page is Cogmento CRM
	And User enters valid username "<username>"  and password "<password>" 
	And User clicks on login button
	Then close the browser
	
	Examples:
	|username			|password     |
	|abc   				|noorteck123  |
	|fahimn12@gmail.com |wrongPass    |
	|fahimn12@gmail.com	|noorteck123  |
	|wrongUsername      |wrongPassword|
	
	# 1. wrong username correct password
	# 2. correct username password password 
	# 3. correct username correct password 
	# 4. wrong username wrong password
	
	
