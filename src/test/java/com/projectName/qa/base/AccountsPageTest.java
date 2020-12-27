package com.projectName.qa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsPageTest extends BaseClass{
	
	@Test
	public void validateOrderHistoryTest() {
		index.ValidateClickSignInlink();
		loginPage.login("vishal.r.khandare@gmail.com", "Windows2021");
		accountPage.validateOrderHistory();
		String expectedUrl = "http://automationpractice.com/index.php?controller=history";
		String ActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,ActualUrl);

	}

}
