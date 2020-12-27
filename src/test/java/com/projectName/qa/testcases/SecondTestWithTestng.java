package com.projectName.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestWithTestng {
 public  WebDriver driver;
 public String url = "http://demo.guru99.com/test/newtours/";
	
 @BeforeTest
 public void launchBrowser() {
	 System.setProperty("webdriver.gecko.driver","D:\\drivers\\geckodriver.exe"); 
	 driver =new ChromeDriver();
	 driver.get(url);
 }
 
 
 @Test
 public void VerifyHomePage() {
	
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
 @AfterTest
 public void terminateTest()
 {
	 driver.close();
 }
}
