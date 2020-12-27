package com.projectName.qa.base;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
  public static WebDriver driver;
  public IndexPage index;
  public LoginPage loginPage;
  public ContactUsPage contactUs;
  public AccountsPage accountPage;
  public OrderHistoryPage orderHistoryPage;
  public MyWishListPage myWishListPage;
  Logger log =Logger.getLogger(BaseClass.class);
  @BeforeMethod
          public void setup() {
		  System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		  log.info("launching chrome browser");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	  driver.manage().deleteAllCookies();
		  driver.get("http://automationpractice.com/index.php");
		  log.info("launching AppliccationURl");
		  //http://automationpractice.com/index.php
		 //http://automationpractice.com/index.php?controller=contact
		  index=new IndexPage();
		  loginPage=new LoginPage();
		  contactUs=new ContactUsPage();
		  accountPage = new AccountsPage();
		  orderHistoryPage =new OrderHistoryPage();
		  myWishListPage = new MyWishListPage();
  }
  @AfterMethod
  public void tearDown() {
   driver.close();
  }
}
//IndexPage.java
//LoginPage.java