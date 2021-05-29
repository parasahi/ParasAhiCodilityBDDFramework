package com.test.parasahi.cucumber.steps.serenity;


import com.test.parasahi.pages.AccountPage;
import com.test.parasahi.pages.AddressPage;
import com.test.parasahi.pages.BasePage;
import com.test.parasahi.pages.CartSummaryPage;
import com.test.parasahi.pages.HomePage;
import com.test.parasahi.pages.LoginPage;
import com.test.parasahi.pages.OrderHistoryPage;
import com.test.parasahi.pages.OrderSummaryPage;
import com.test.parasahi.pages.PaymentPage;
import com.test.parasahi.pages.PersonalInfoPage;
import com.test.parasahi.pages.ShippingPage;
import com.test.parasahi.pages.TshirtPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SerenitySteps extends ScenarioSteps {

	BasePage basePage;
		
	LoginPage loginPage;
	HomePage homePage;
	TshirtPage tshirtPage;
	CartSummaryPage cartSummaryPage;
	ShippingPage shippingPage;
	AddressPage addressPage;
	PaymentPage paymentPage;
	OrderSummaryPage orderSummaryPage;
	OrderHistoryPage orderHistoryPage;
	AccountPage accountPage;
	PersonalInfoPage personalInfoPage;

	/* BASE PAGE STEPS */

	@Step("I click on Signin Buttonr")
	public LoginPage clickOnSignIn() {
		return loginPage.clickOnSignIn();
	}
	
	
	@Step("I login to application using {0} and {1}")
	public HomePage loginToApplication(String emailid, String password) {
		return loginPage.loginToApplication(emailid, password);
	}
	
	@Step("I click on productSection {0} link")
	public TshirtPage clickOnProductSection(String productSection) {
		return homePage.clickOnProductSection(productSection);
	}
	

	@Step("I click on Tshirt")
	public TshirtPage clickOnTshirt() {
		return tshirtPage.clickOnTshirt();	
	}
	
	@Step("I click Add To Cart")
	public TshirtPage clickAddToCart() {
		return tshirtPage.clickAddToCart();	
	}
	
	@Step("I click Proceed To Checkout Button on Tshirt Page")
	public CartSummaryPage clickProceedToCheckoutOnTshirtPage() {
		return tshirtPage.clickProceedToCheckoutOnTshirtPage();	
	}
	
	@Step("I click Proceed To Checkout Button on Cart Summary Page")
	public AddressPage clickProceedToCheckoutOnCartSummaryPage() {
		return cartSummaryPage.clickProceedToCheckoutOnCartSummaryPage();	
	}
	
	@Step("I click Proceed To Checkout Button on Address Page")
	public ShippingPage clickProceedToCheckoutOnAddressPage() {
		return addressPage.clickProceedToCheckoutOnAddressPage();	
	}
	
	@Step("I select Term And Condition checkBox")
	public ShippingPage selectTermsAndConditionCheckbox() {
		return shippingPage.selectTermsAndConditionCheckbox();	
	}
	
	@Step("I click Proceed To Checkout Button on Shipping Page")
	public PaymentPage clickProceedToCheckout() {
		return shippingPage.clickProceedToCheckout();	
	}
	
	@Step("I click Pay By Check Button on Payment Pagee")
	public OrderSummaryPage clickPayByCheque() {
		return paymentPage.clickPayByCheque();	
	}
	
	@Step("I Click on Confirm My Order Button of Order Summary Page")
	public OrderHistoryPage clickConfirmMyOrderButton() {
		return orderSummaryPage.clickConfirmMyOrderButton();	
	}
	
	@Step("I Verify Order Name on Order History Page")
	public OrderHistoryPage verifyPurchedOrderOnOrderHistoryPage(String expectedTname, int initialOrderCount) {
		return orderHistoryPage.verifyPurchedOrderOnOrderHistoryPage(expectedTname, initialOrderCount);
	}
	
	@Step("I get initial order count")
	public int getInitialOrderCount() {
		return orderHistoryPage.getInitialOrderCount();
	}

	@Step("I click on Account Page")
	public AccountPage clickOnAccountPage() {
		return homePage.clickOnAccountPage();
	}
	
	@Step("I click on My Personal Infomation Page")
	public PersonalInfoPage clickOnMyPersonalInfomation() {
		return accountPage.clickOnMyPersonalInfomation();
	}
	
	@Step("I changed Users {0} on Personal Page")
	public PersonalInfoPage updateFirstName(String Name) {
		return personalInfoPage.updateFirstName(Name);
	}
	
	@Step("I reset Users {0} on Personal Page")
	public PersonalInfoPage resetFirstName(String Name) {
		return personalInfoPage.resetFirstName(Name);
	}

	@Step("I entered {0} as required field on Personal Page")
	public PersonalInfoPage enterCurrentPassword(String password) {
		return personalInfoPage.enterCurrentPassword(password);
	}
	
	@Step("I Submitted Updated Personal info form")
	public HomePage clickOnSaveButtonOfPersonalInfoPage() {
		return personalInfoPage.clickOnSaveButton();
	}
	
	@Step("I verify users {0} on home page")
	public HomePage verifyUpdatedFirstNameOnTopRightCorner(String updatedFirstName) {
		return homePage.verifyUpdatedFirstNameOnTopRightCorner(updatedFirstName);
	}

}
