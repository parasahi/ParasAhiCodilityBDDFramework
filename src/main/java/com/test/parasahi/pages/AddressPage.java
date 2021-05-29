package com.test.parasahi.pages;

import org.openqa.selenium.JavascriptExecutor;

public class AddressPage extends BasePage {
	
private static final String BTN_PROCEEDTOCHECKOUT = "//button[@class=\"button btn btn-default button-medium\"]";
			
	public ShippingPage clickProceedToCheckoutOnAddressPage() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,1000)", "");
		waitFor(BTN_PROCEEDTOCHECKOUT).$(BTN_PROCEEDTOCHECKOUT).click();
		return this.switchToPage(ShippingPage.class);
	}
}
