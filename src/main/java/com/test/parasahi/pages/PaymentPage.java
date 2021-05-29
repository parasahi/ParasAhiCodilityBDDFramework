package com.test.parasahi.pages;

import org.openqa.selenium.JavascriptExecutor;

public class PaymentPage extends BasePage {
	private static final String BTN_PAYBYCHEQUE = "//a[@title=\"Pay by check.\"]";
	
	public OrderSummaryPage clickPayByCheque() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,600)", "");
		waitFor(BTN_PAYBYCHEQUE).$(BTN_PAYBYCHEQUE).click();
		return this.switchToPage(OrderSummaryPage.class);
	}
}
