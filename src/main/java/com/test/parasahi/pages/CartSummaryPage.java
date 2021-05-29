package com.test.parasahi.pages;

public class CartSummaryPage extends BasePage {


	private static final String BTN_PROCEEDTOCHECKOUT = "//p[@class=\"cart_navigation clearfix\"]//a[@title=\"Proceed to checkout\"]";

	public AddressPage clickProceedToCheckoutOnCartSummaryPage() {
		waitFor(BTN_PROCEEDTOCHECKOUT).$(BTN_PROCEEDTOCHECKOUT).click();
		return this.switchToPage(AddressPage.class);
	}

}
