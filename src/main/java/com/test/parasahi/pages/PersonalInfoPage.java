package com.test.parasahi.pages;

public class PersonalInfoPage extends BasePage {

	private static final String NAME_FIELD_A = "//input[@name=\"";
	private static final String NAME_FIELD_B = "\"]";
	private static final String CURRENT_PASSWORD_FIELD = "//input[@id=\"old_passwd\"]";
	private static final String BTN_SAVE = "//button[@class=\"btn btn-default button button-medium\"]";
	
	

	public PersonalInfoPage updateFirstName(String Name) {

		String NAME_FIELD = NAME_FIELD_A + Name + NAME_FIELD_B;		
		$(NAME_FIELD).clear();
		$(NAME_FIELD).type("Updated");
		return this;
	}
	
	public PersonalInfoPage resetFirstName(String Name) {

		String NAME_FIELD = NAME_FIELD_A + Name + NAME_FIELD_B;		
		$(NAME_FIELD).clear();
		$(NAME_FIELD).type("Paras");
		return this;
	}

	public PersonalInfoPage enterCurrentPassword(String password) {
		$(CURRENT_PASSWORD_FIELD).type(password);		
		return this;
	}

	public HomePage clickOnSaveButton(){
		waitFor(BTN_SAVE).$(BTN_SAVE).click();
		return this.switchToPage(HomePage.class);
	}

}
