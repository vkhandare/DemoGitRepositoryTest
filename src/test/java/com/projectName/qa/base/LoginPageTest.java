package com.projectName.qa.base;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
	
	//AccountsPage accountPage;
  @Test()
  public void validateAuthlabelTest() {
	  index.ValidateClickSignInlink();
	
	 System.out.println(loginPage.validateAuthenticationLabel());
	  String expected = "AUTHENTICATION";
	Assert.assertEquals(expected, loginPage.authentication.getText() );
  }
  @DataProvider
  public void getTestData() {
	  
  }
  
	@Test()
		public void loginTest() {
		index.ValidateClickSignInlink();
		loginPage.login("vishal.r.khandare@gmail.com", "Windows2021");
	    String ExpectedUrl = "http://automationpractice.com/index.php?controller=my-account";
	    String ActualUrl = driver.getCurrentUrl();
	    Assert.assertEquals(ActualUrl,ExpectedUrl);
			}
 
}
