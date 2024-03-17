 package com.Ecommerce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.Base.BaseClass;

public class LoginPage extends BaseClass{
@FindBy(id="userEmail")
WebElement emailFeild;
@FindBy(id="userPassword")
WebElement pswdFeild;
@FindBy(id="login")
WebElement btnLogin;
public LoginPage() {
	PageFactory.initElements(driver,this);
}

public void verifyLogin() throws Exception {
	Thread.sleep(2000);
	emailFeild.sendKeys("jimmy@yopmail.com");
	Thread.sleep(2000);
	pswdFeild.sendKeys("Test@123");
	Thread.sleep(2000);
	btnLogin.click();
	
	//return new ProductPage();
}
}
