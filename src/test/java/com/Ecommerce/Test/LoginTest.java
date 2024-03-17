package com.Ecommerce.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.Ecommerce.Base.BaseClass;
import com.Ecommerce.Pages.LoginPage;


public class LoginTest extends BaseClass {
	
	public LoginPage login;
	
	
	public LoginTest() {
		super();
	}

	@BeforeClass
	public void initialize() {
		setup();
		login = new LoginPage();
	}
	
	@Test(priority = 1)
	public void validateLogin() throws Exception {
		Thread.sleep(2000);
		login.verifyLogin();
	}
	
}
