package com.test.parasahi.pages;

public class AccountPage extends BasePage {

	private static final String MYPERSONALINFO_LINK = "//a[@title=\"Information\"]";	
	
	public PersonalInfoPage clickOnMyPersonalInfomation() {
		waitFor(MYPERSONALINFO_LINK).$(MYPERSONALINFO_LINK).click();
		return this.switchToPage(PersonalInfoPage.class);
	}

}
