package com.projectName.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountsPage extends BaseClass{
	

	@FindBy(xpath="//i[@class='icon-heart']")
	WebElement   wishlist;

	@FindBy(xpath="//i[@class='icon-ban-circle']")
	WebElement   myCreditSlip;

	@FindBy(xpath="//i[@class='icon-list-ol']")
	WebElement   orderHistory;

	@FindBy(xpath="//p[@class='info-account']")
	WebElement   Msg;

	//(Welcome to your account. Here you can manage all of your personal information and orders.)

	@FindBy(xpath="//i[@class='icon-chevron-left']")
	WebElement  home;
	 public AccountsPage() {
		  PageFactory.initElements(driver, this);
		 }

	public MyWishListPage validateWishList(){
    wishlist.click(); 
	return new MyWishListPage();
	}
	
	public OrderHistoryPage validateOrderHistory(){
		orderHistory.click(); 
		return new OrderHistoryPage();
		}
	
}
