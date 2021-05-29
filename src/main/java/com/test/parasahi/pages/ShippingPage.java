package com.test.parasahi.pages;

import org.openqa.selenium.JavascriptExecutor;


public class ShippingPage extends BasePage {
	
	private static final String TERMCONDITION_CHK = "//div[@class=\"checker\"]//span";
	private static final String BTN_PROCEEDTOCHECKOUT = "//*[@name=\"processCarrier\"]";
	
	
	public ShippingPage selectTermsAndConditionCheckbox() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,500)", "");
		waitFor(TERMCONDITION_CHK).$(TERMCONDITION_CHK).click();
		return this;
	}
	
	
	public PaymentPage clickProceedToCheckout() {
		waitFor(BTN_PROCEEDTOCHECKOUT).$(BTN_PROCEEDTOCHECKOUT).click();
		return this.switchToPage(PaymentPage.class);
	}
}
