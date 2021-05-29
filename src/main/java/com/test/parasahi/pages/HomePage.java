package com.test.parasahi.pages;

import org.testng.Assert;

public class HomePage extends BasePage {	
	
	private static final String PRODUCT_SECTION_A = "(//*[@title='";
	private static final String PRODUCT_SECTION_B = "'])[2]";
	private static final String ACCOUNT_LINK = "//a[@class=\"account\"]";
	private static final String USERNAME_TEXT = "//a[@class=\"account\"]//span";
	
	public TshirtPage clickOnProductSection(String productSection) {
		String category =  PRODUCT_SECTION_A + productSection + PRODUCT_SECTION_B;
		waitFor(category).$(category).click();
		System.out.println("Clicked on "+productSection+" button");
		return this.switchToPage(TshirtPage.class);
	}
	
	public AccountPage clickOnAccountPage() {
		waitFor(ACCOUNT_LINK).$(ACCOUNT_LINK).click();
		return this.switchToPage(AccountPage.class);
	}
	

	public HomePage verifyUpdatedFirstNameOnTopRightCorner(String updatedFirstName) {

		waitForTextToAppear("Your personal information has been successfully updated.");
		Assert.assertTrue(
				waitFor(USERNAME_TEXT).$(USERNAME_TEXT).getText().trim().split(" ")[0].equalsIgnoreCase(updatedFirstName),
				"[Assert Failed]: Personal Info First Name is not updated. First name is: "+ waitFor(USERNAME_TEXT).$(USERNAME_TEXT).getText().trim().split(" ")[0] + " and expected : "
						+ updatedFirstName);
		System.out.println("[Assert Passed: Personal Info First Name is updated.");
		return this;
	}
	
}
