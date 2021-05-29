package com.test.parasahi.pages;

public class LoginPage extends BasePage {

	private static final String SIGNIN_LINK = "//a[@class='login']";	
	private static final String USER_NAME = "//input[@id='email']";
	private static final String PASSWORD = "//input[@id='passwd']";
	private static final String LOGIN_BUTTON = "//button[@id='SubmitLogin']";

	/* Method used to login to the Application */

	public LoginPage clickOnSignIn() {
		open();
		waitFor(SIGNIN_LINK).$(SIGNIN_LINK).click();
		return this;
	}

	public HomePage loginToApplication(String emailId, String password) {
		
		waitFor(USER_NAME).$(USER_NAME).type(emailId);
		waitFor(PASSWORD).$(PASSWORD).type(password);		
		waitFor(LOGIN_BUTTON).$(LOGIN_BUTTON).click();		
		return this.switchToPage(HomePage.class);
	
	}

}
