package com.ebay.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage LogP;
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
public void setup() throws IOException {
		init();
	 LogP=new LoginPage();
	 }
@Test (priority=1)
	public void titleTest() throws InterruptedException {
	String title=LogP.getTitlePage();
	Thread.sleep(200);
	System.out.println(title);
	Assert.assertEquals("Electronics, Cars, Fashion, Collectibles & More | eBay", title);
	}
	
	 @Test (priority=2)
	public void logintest() throws InterruptedException {
		wait=new WebDriverWait(driver,20);
		
		LogP.clickSignUP();
		
	}

@AfterTest
	public void exit() {
		driver.close();
	}
	
}
