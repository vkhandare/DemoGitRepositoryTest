package com.projectName.qa.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BaseClass{
 
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	 WebElement  CustomerServicelabel;

	@FindBy(xpath="//select[@id='id_contact']")
	WebElement  Subjectheading;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='id_order']")
	WebElement OrderRef;

	@FindBy(xpath="//textarea[@id='message']")
	WebElement message;

	@FindBy(xpath="//input[@id='fileUpload']")
	WebElement attachfile;
	
	@FindBy(xpath="//button[@id='submitMessage']")
    WebElement button;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	WebElement successMsg;
	
	public  ContactUsPage(){

		PageFactory.initElements(driver, this);

		}
	
	public void validateCustomerServicelabel() {
		driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
	//String actualText =	CustomerServicelabel.getText();
	//return actualText;
		
	}
	
	public  void validateSubjectHeading() {
		
		Select select = new Select(Subjectheading);
		select.selectByIndex(2);	
	}
	
	public void validateEmail(String mail) {
		
		email.sendKeys(mail);
	}
	
public void validateOrderRef(String order) {
		
		email.sendKeys(order);
	}
public void validateMessage(String msg) {
	message.sendKeys(msg);
}

public void validateAttachFile(String path) {
//	attachfile.click();
	attachfile.sendKeys(path);
}

public void validateSubmitButton() {
	button.click();
}

 public String ContactFormSubmitMessage() {
	 
	return successMsg.getText();
	 
 }
}

