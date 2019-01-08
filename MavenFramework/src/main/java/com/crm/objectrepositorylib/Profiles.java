package com.crm.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genericlib.BaseClass;

public class Profiles extends BaseClass{
	
	
	

	/*************** Initialisation ********************/
	// @FindBy to store all webelement

	@FindBy(xpath = "//input[@value='New Profile']")
	private WebElement newprofilesbtn;
	

	
	

	public WebElement getNewprofilesbtn() {
		return newprofilesbtn;
	}





	/*************** Business Methods 
	 * @throws Throwable ********************/

	public void navigateToNewProfiles() throws Throwable {
		
		newprofilesbtn.click();
	}

}
