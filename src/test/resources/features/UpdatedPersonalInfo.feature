Feature: User is able to Updated its Personal Infomation

Scenario Outline: Updated Personal Information And Verify
	Given I click on Signin Button
	When I login to application using <emailId> and <password>
	Then I click on Account Page
	Then I click on My Personal Infomation Page
	Then I changed Users <Name> on Personal Page
	Then I entered <password> as required field on Personal Page
	Then I Submitted Updated Personal info form
	Then I verify users <updatedFirstName> on home page
	Then I click on Account Page
	Then I click on My Personal Infomation Page
	Then I reset Users <Name> on Personal Page
	Then I entered <password> as required field on Personal Page
	Then I Submitted Updated Personal info form
	
	
	Examples: 
		| emailId | password | Name | updatedFirstName |
		| paras.ahi@gmail.com | Tester@123 | firstname | Updated |
		