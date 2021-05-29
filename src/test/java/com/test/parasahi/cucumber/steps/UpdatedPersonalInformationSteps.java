package com.test.parasahi.cucumber.steps;

import com.test.parasahi.cucumber.steps.serenity.SerenitySteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UpdatedPersonalInformationSteps {
	
	
	@Steps
	SerenitySteps serenitySteps;	

	@Then("I click on Account Page")
	public void I_click_On_Account_Page() {
		serenitySteps.clickOnAccountPage();
	}
	
	@Then("I click on My Personal Infomation Page")
	public void I_click_On_MyPersonalInformation_Page() {
		serenitySteps.clickOnMyPersonalInfomation();
	}
	
	@Then("I changed Users (.*) on Personal Page")
	public void I_Change_FirstName_On_MyPersonalInformation_Page(String Name) throws PendingException, InterruptedException {
		serenitySteps.updateFirstName(Name);
	}
	
	@Then("I reset Users (.*) on Personal Page")
	public void I_Reset_FirstName_On_MyPersonalInformation_Page(String Name) throws PendingException, InterruptedException {
		serenitySteps.resetFirstName(Name);
	}
	
	@Then("I entered (.*) as required field on Personal Page")
	public void I_Enter_Updated_OldPassword_On_MyPersonalInformation_Page(String password) throws PendingException, InterruptedException {
		serenitySteps.enterCurrentPassword(password);
	}
	
	@Then("I Submitted Updated Personal info form")
	public void I_Submit_Updated_PersonalInformation() {
		serenitySteps.clickOnSaveButtonOfPersonalInfoPage();
	}
	
	@Then("I verify users (.*) on home page")
	public void I_verify_Updated_FirstName_on_home_page(String updatedFirstName) throws PendingException, InterruptedException {
		serenitySteps.verifyUpdatedFirstNameOnTopRightCorner(updatedFirstName);
	}
	
}
