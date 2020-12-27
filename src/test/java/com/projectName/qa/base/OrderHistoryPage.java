package com.projectName.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage extends BaseClass{

	@FindBy(xpath="//h1")
	WebElement orderHistoryHeading;
	
	@FindBy(xpath="//p[@class='info-title']")
	WebElement OrderPlacedMessage;

	OrderHistoryPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateOrderHistoryheading() {
		
	return	orderHistoryHeading.getText();
		
	}
	
	public String validateOrderPlacedMessage() {
		
		return	OrderPlacedMessage.getText();
			
		}
}
