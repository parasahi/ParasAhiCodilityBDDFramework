package com.test.parasahi.pages;

import org.openqa.selenium.JavascriptExecutor;

public class TshirtPage extends BasePage {

	private static final String TSHIRT_NAME = "//a[@title=\"Faded Short Sleeve T-shirts\"]";
	private static final String TSHIRT_ICON = "//a[@class='product_img_link']";
	private static final String BTN_ADDTOCART = "//button[@class='exclusive']";
	private static final String BTN_PROCEEDTOCHECKOUT = "//a[@title='Proceed to checkout']";
		

	public String getTshirtName() {
		String expectedTshirtname = waitFor(TSHIRT_NAME).$(TSHIRT_NAME).getText(); 
		return expectedTshirtname;
	}
	
	
	public TshirtPage clickOnTshirt() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,100)", "");
		waitFor(TSHIRT_ICON).$(TSHIRT_ICON).click();
		return this;
	}

	public TshirtPage clickAddToCart() {
		
		getDriver().switchTo().frame(0);
		waitFor(BTN_ADDTOCART).$(BTN_ADDTOCART).click();
		return this;
	}

	public CartSummaryPage clickProceedToCheckoutOnTshirtPage() {
		waitForTextToAppear("Product successfully added to your shopping cart");
		waitFor(BTN_PROCEEDTOCHECKOUT).$(BTN_PROCEEDTOCHECKOUT).click();
		return this.switchToPage(CartSummaryPage.class);
	}
}
