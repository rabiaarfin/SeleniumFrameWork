package com.ebay.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.qa.util.TestUtil;

public class TestBase {
	public static WebDriver  driver;
	Properties prop;
	public WebDriverWait wait;


	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream FI=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ebay\\qa\\config\\config.properties");
		prop.load(FI);
	}
	public WebDriver init() {
		String BrowserName=prop.getProperty("browser");
		String path=prop.getProperty("path");
		System.setProperty("webdriver.chrome.driver", path);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver=new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
		String url=prop.getProperty("url");
		driver.get(url);
		return driver;
	}

}
