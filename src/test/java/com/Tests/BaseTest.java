package com.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

public static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	@BeforeMethod
	public void setup() {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
//		driver=new ChromeDriver(options);
		
		driver.set(new ChromeDriver());
		driver.get().manage().window().maximize();
		driver.get().get("https://demowebshop.tricentis.com/");
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.get().quit();
		
	}
//
	  public WebDriver getDriver() {
	      return driver.get();
	  }
//
//	  public void removeDriver() {
//	      driverThreadLocal.remove();
//	  }
}
