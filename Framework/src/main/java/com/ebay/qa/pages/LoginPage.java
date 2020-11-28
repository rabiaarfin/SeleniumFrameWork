package com.ebay.qa.pages;

import java.io.IOException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import com.ebay.qa.base.TestBase;

public class LoginPage extends TestBase{
		public WebElement Register;
	//Page Factory -OR 
	//@FindBy(xpath="//div[@class='gh-wl-click-gen-error']//a")
		@FindBy(xpath="//span[@id='gh-ug']/a[1]")
	WebElement SigninBtn;
	
	//@FindBy(xpath="")
	 
	
 public LoginPage() throws IOException {
	// super();
	 PageFactory.initElements(driver, this);
 }
	


public String getTitlePage() {
	return driver.getTitle();
	
}
public SignInPage clickSignUP() {
	SigninBtn.click();
	
	return new SignInPage();
	
}
}
