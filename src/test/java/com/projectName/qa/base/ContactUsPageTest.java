package com.projectName.qa.base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsPageTest extends BaseClass {
	
	@Test
	public void validateCustomerServicelabelTest()
	{
		index.ValidateClickContactUslink();
		String expectedtext ="CUSTOMER SERVICE - CONTACT US";
		String actualText = contactUs.CustomerServicelabel.getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedtext, actualText);
		
	}
  
	@Test
	
	public void submitContactUsFormSuccessfullyTest() throws InterruptedException {
		
		index.ValidateClickContactUslink();
		contactUs.validateSubjectHeading();
		contactUs.validateEmail("abc@gmail.com");
		contactUs.validateOrderRef("123");
		contactUs.validateAttachFile("D:\\Abc.txt");
		contactUs.validateMessage("How how areyou .My order is pending");
		contactUs.validateSubmitButton();
		Thread.sleep(500000);
		contactUs.ContactFormSubmitMessage();
		
	String expectedmessage = "Your message has been successfully sent to our team.";
	String Actualmsg= contactUs.successMsg.getText();
	System.out.println(Actualmsg);
	Assert.assertEquals(Actualmsg, expectedmessage);
		//Thread.sleep(30);
	}
}

