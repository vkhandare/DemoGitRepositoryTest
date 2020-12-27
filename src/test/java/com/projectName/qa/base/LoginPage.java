package com.projectName.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
 
       

		@FindBy(xpath="//h1")
        WebElement authentication;
        
		@FindBy(xpath= "//input[@id='email']")
		WebElement  userName;

		@FindBy(xpath= "//input[@id='passwd']")
		WebElement  password;


		@FindBy(xpath= "//button[@id='SubmitLogin']")
		WebElement  SingInButton;

		public LoginPage(){

		PageFactory.initElements(driver, this);

		}
		
		public String validateAuthenticationLabel() {
			
		return authentication.getText();
		//return authentication.isDisplayed();
		//return ActualLabel;
		
		}

		public AccountsPage login(String user,String pass){

		userName.sendKeys(user);
		password.sendKeys(pass);
		SingInButton.click();

		return new AccountsPage()  ;
		}

}
