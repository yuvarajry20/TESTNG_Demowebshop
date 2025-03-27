package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	HomePage objHome;
	RegisterPage objReg;
	
	
  @Test(dataProvider = "excelData", dataProviderClass = DPExcel.class)
  public void Register(String firstName, String lastName, String email, String password, String confirmPassword) {
	  objHome=new HomePage(getDriver());
	  objHome.register();
	  objReg=new RegisterPage(getDriver());
	  Assert.assertTrue(objReg.getRegisterPageText().contains("Register"));
	  objReg.setGender("male");
	  objReg.setFirstName(firstName);
	  objReg.setLastName(lastName);
	  objReg.setEmail(email);
	  objReg.setPassword(password);
	  objReg.setConfirmPassword(confirmPassword);
	  objReg.clickRegisterButton();
	  Assert.assertTrue(driver.get().getPageSource().contains("Your registration completed"), "Registration was not successful");
	  
  }
}
