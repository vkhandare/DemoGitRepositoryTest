package com.projectName.qa.base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass {


@Test
  public void LogoTest() { 
	boolean flag =index.validateLogo();
	  Assert.assertTrue(flag);
  }

  @Test
  public void ImageTest() {
	    boolean flag =  index.validateImage();
		Assert.assertTrue(flag);
  }
      
  @Test
  public void signInLinkTest() {
	  boolean flg=  index.validateSignInlink();
	Assert.assertTrue(flg);
  }
  
  @Test 
  public void clickSignInLinkTest() {
	 loginPage =  index.ValidateClickSignInlink(); 
	 String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	 String actualUrl = driver.getCurrentUrl();
	 Assert.assertEquals(expectedUrl, actualUrl);
  }
  
  @Test
  public void validatecontactUsLinkTest() {
	  boolean a=  index.validateContactUslink();
		Assert.assertTrue(a);
		
		
  }
  @Test 
  public void validateClickcontactusLinkTest() { 
	 contactUs = index.ValidateClickContactUslink();
	 String expectedUrl = "http://automationpractice.com/index.php?controller=contact";
	 String actualUrl = driver.getCurrentUrl();
	 Assert.assertEquals(expectedUrl, actualUrl);
  }
  
}
