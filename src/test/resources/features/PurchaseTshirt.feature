Feature: User is able to Purchase T-Shirt

Scenario Outline: Purchace T-Shirt and Verify in Order History
	Given I click on Signin Button
	When I login to application using <emailId> and <password>
	Then I get initial order count
	Then I click on productSection <productSection> link 
	Then I click on Tshirt
	Then I click Add To Cart
	Then I click Proceed To Checkout Button on Tshirt Page
	Then I click Proceed To Checkout Button on Cart Summary Page
	Then I click Proceed To Checkout Button on Address Page
	Then I select Term And Condition checkBox
	Then I click Proceed To Checkout Button on Shipping Page
	Then I click Pay By Check Button on Payment Page
	Then I click Confirm My Order Button on Order Summary Page
	Then I Verify Order Name on Order History Page
	
	
	Examples: 
		| emailId | password | productSection |
		| paras.ahi@gmail.com | Tester@123 | T-shirts |
		