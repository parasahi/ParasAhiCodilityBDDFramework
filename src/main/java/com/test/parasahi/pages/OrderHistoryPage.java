package com.test.parasahi.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OrderHistoryPage extends BasePage {
	
			
	private static final String ACCOUNT_LINK = "//a[@class=\"account\"]";		
	private static final String BTN_ORDER = "//a[@title=\"Orders\"]";
	private static final String BTN_DETAIL = "(//td[@class=\"history_detail footable-last-column\"]//*[@class=\"btn btn-default button button-small\"])[1]";
	private static final String BTN_ACTUALPRODUCTNAME = "(//tbody//tr[@class=\"item\"])[1]//td[@class=\"bold\"]//label";
	private static final String STATUS = "//span[@class=\"label dark\"]";
	
	
	public int getInitialOrderCount() {
				
		waitFor(BTN_ORDER).$(BTN_ORDER).click();
		
		List<WebElement> status = getDriver().findElements(By.xpath(STATUS));
		int initialOrderCount = status.size();        
        System.out.println("Total Number of initial order Count on Order History = "  + initialOrderCount);  
		return initialOrderCount;
	}
	
	public OrderHistoryPage verifyPurchedOrderOnOrderHistoryPage(String expectedTname, int initialOrderCount) {
		
		waitFor(ACCOUNT_LINK).$(ACCOUNT_LINK).click();
		
		waitFor(BTN_ORDER).$(BTN_ORDER).click();
				
		waitFor(BTN_DETAIL).$(BTN_DETAIL).click();
		
		List<WebElement> status = getDriver().findElements(By.xpath(STATUS));
		int finalOrderCount = status.size();        
        System.out.println("Total Number of final order count on Order History = "  + finalOrderCount); 
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,800)", "");
				
		waitForTextToAppear("Faded Short Sleeve T-shirts - Color : Orange, Size : S");
		
		Assert.assertTrue(waitFor(BTN_ACTUALPRODUCTNAME).$(BTN_ACTUALPRODUCTNAME).getText().trim().contains(expectedTname),  "[Assert Failed]: Product not appearing on order History page.");
		System.out.println("[Assert Passed]: Product is appearing on order History page. Product is: "+ waitFor(BTN_ACTUALPRODUCTNAME).$(BTN_ACTUALPRODUCTNAME).getText()+" and expected : "+expectedTname);

		Assert.assertTrue(initialOrderCount<finalOrderCount,  "[Assert Failed]: Order not placed");
		System.out.println("[Assert Passed]: Order placed successfully");
		
		return this;
	}
	
}
