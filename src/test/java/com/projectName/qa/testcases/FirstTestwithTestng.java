package com.projectName.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestwithTestng {
	
	public String url ="http://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
  @Test
  public void VerifyHomePage() {
	  driver = new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe");
	  driver.get(url);
	  String expectedTitle ="Welcome: Mercury Tours";
	 String actualTitle= driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @Test
  public void c_Test() {
	  
	  Assert.assertTrue(true);
	  
  }
  @Test
  public void b_Test() {
	  Assert.assertFalse(true);
  }
  
  @Test
  public void a_Test() {
	  Assert.fail();
  }
  
  @Test
  public void verifyLinkHome() {
	  
	  WebElement homelink = driver.findElement(By.linkText("Home"));
	boolean tr =  homelink.isDisplayed();
	  Assert.assertEquals(tr, true);
  }
  
}
