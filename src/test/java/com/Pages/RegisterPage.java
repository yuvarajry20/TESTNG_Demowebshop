package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {
	
  public RegisterPage(WebDriver driver) {
		super(driver);
	}
  @FindBy(xpath="//h1[text()='Register']")
  WebElement registerText;
  public String getRegisterPageText() {
	  return registerText.getText();
  }
}
