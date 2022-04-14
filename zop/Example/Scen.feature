
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
 Scenario: Successful Signup with username and password
	Given User Launch Chrome browser 
	When User opens URL "https://www.demoblaze.com/" 
	And User enters Email as "12334242@gmail.com" and Password as "projecttest@123" 
	And Click on Signup
	Then verify alert message as "Sign up successful."
	And close browser 
