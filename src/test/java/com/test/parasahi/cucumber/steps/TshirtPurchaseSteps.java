package com.test.parasahi.cucumber.steps;

import com.test.parasahi.cucumber.steps.serenity.SerenitySteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class TshirtPurchaseSteps {

	@Steps
	SerenitySteps serenitySteps;
	String expectedTshirtName = "Faded Short Sleeve T-shirts";
	int initialStatusCount;
	

	@Given("I click on Signin Button")
	public void I_click_on_sign_in_Button() {
		serenitySteps.clickOnSignIn();
	}
	
	@When("I login to application using (.*) and (.*)")
	public void I_login_using_email_and_password(String emailId, String password)throws PendingException, InterruptedException
	{
		serenitySteps.loginToApplication(emailId, password);
	}
	
	@Then("I click on productSection (.*) link")
	public void I_click_on_Product_Section(String productSection) {
		serenitySteps.clickOnProductSection(productSection);
	}
				
	@Then("I click on Tshirt")
	public void I_click_on_Tshirt() {
		serenitySteps.clickOnTshirt();
	}
		
	@Then("I click Add To Cart")
	public void I_click_AddToCart() {
		serenitySteps.clickAddToCart();
	}
		
	@Then("I click Proceed To Checkout Button on Tshirt Page")
	public void I_click_ProceedToCheckout_on_Tshirt_Page() {
		serenitySteps.clickProceedToCheckoutOnTshirtPage();
	}
	
	@Then("I click Proceed To Checkout Button on Cart Summary Page")
	public void I_click_ProceedToCheckout_On_Cart_Summary_Page() {
		serenitySteps.clickProceedToCheckoutOnCartSummaryPage();
	}
	
	@Then("I click Proceed To Checkout Button on Address Page")
	public void I_click_ProceedToCheckout_On_Address_Page() {
		serenitySteps.clickProceedToCheckoutOnAddressPage();
	}
	
	@Then("I select Term And Condition checkBox")
	public void I_select_TermsAndCondition_Checkbox() {
		serenitySteps.selectTermsAndConditionCheckbox();
	}
	
	@Then("I click Proceed To Checkout Button on Shipping Page")
	public void I_click_ProceedToCheckout_On_Shipping_Page() {
		serenitySteps.clickProceedToCheckout();
	}
	
	@Then("I click Pay By Check Button on Payment Page")
	public void I_click_PayByCheck_On_Payment_Page() {
		serenitySteps.clickPayByCheque();
	}
	
	@Then("I click Confirm My Order Button on Order Summary Page")
	public void I_click__ConfirmMyOrder_Button_On_OrderSummary_Page() {
		serenitySteps.clickConfirmMyOrderButton();
	}
	
	@Then("I Verify Order Name on Order History Page")
	public void I_Verify_Order_Name_On_Order_History_Page() {
		serenitySteps.verifyPurchedOrderOnOrderHistoryPage(expectedTshirtName, initialStatusCount);
	}
	
	@Then("I get initial order count")
	public void I_get_Initial_Order_Count() {
		serenitySteps.getInitialOrderCount();
	}
	
}




