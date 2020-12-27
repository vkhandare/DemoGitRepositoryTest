package com.projectName.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IndexPage extends BaseClass {
	
	@FindBy(xpath= "//img[@class='img-responsive']")
	WebElement  ImageGetSavingNow;

	 
	@FindBy(xpath= "//img[@class='logo img-responsive']")
	WebElement  YourLogoImage ;
	 
	@FindBy(xpath= "//div/a[contains(text(),'Contact us')]")
	WebElement  contactUslink;
	//a[@Title='Contact us']
	//div/a[contains(text(),'Contact us')]
	@FindBy(xpath= " //a[contains(text(), 'Sign in')]")
	WebElement  SignInLink;

	 
	@FindBy(xpath= "//input[@id='search_query_top']")
	WebElement  searchTextBox   ;

	@FindBy(xpath= " //a[@title= 'View my shopping cart']")
	WebElement  CartLink;

	public  IndexPage(){

	PageFactory.initElements(driver, this);

	}

	public boolean validateLogo(){

	YourLogoImage.isDisplayed();
	YourLogoImage.isEnabled();
	return true;
	}

	public boolean validateImage()
	{

	ImageGetSavingNow.isDisplayed();
	return true;
	}
	public  boolean validateContactUslink(){
		contactUslink.isDisplayed();
	//	contactUslink.isEnabled();
		return  true;
		}
	
	public ContactUsPage ValidateClickContactUslink(){

		contactUslink.click();
        return new ContactUsPage();
		}

	public  boolean validateSignInlink(){

	SignInLink.isDisplayed();
	SignInLink.isEnabled();

	return  true;
	}

	public LoginPage ValidateClickSignInlink(){

	SignInLink.click();
	return new LoginPage();
	}

}
