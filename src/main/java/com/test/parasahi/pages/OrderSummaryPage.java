package com.test.parasahi.pages;

import org.openqa.selenium.JavascriptExecutor;

public class OrderSummaryPage extends BasePage {
	
private static final String BTN_CONFIRMMYORDER = "//button[@class=\"button btn btn-default button-medium\"]";
			
	public OrderHistoryPage clickConfirmMyOrderButton() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,700)", "");
		waitFor(BTN_CONFIRMMYORDER).$(BTN_CONFIRMMYORDER).click();
		waitForTextToAppear("Your order on My Store is complete.");
		return this.switchToPage(OrderHistoryPage.class);
	}
}

