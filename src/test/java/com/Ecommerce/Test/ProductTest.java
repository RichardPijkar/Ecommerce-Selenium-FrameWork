package com.Ecommerce.Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.Ecommerce.Base.BaseClass;
import com.Ecommerce.Pages.LoginPage;
import com.Ecommerce.Pages.MyCartPage;
import com.Ecommerce.Pages.PaymentPage;
import com.Ecommerce.Pages.ProductPage;
import com.Ecommerce.Pages.SearchPage;

public class ProductTest extends BaseClass {

	public ProductPage productPage;
	public LoginPage Lp;
	public MyCartPage cp;
	public PaymentPage pp;
	public SearchPage sp;
	
	public ProductTest() {
		super();
	}

	@BeforeClass
	public void initialize() {
		setup(); // Initialize WebDriver
		Lp = new LoginPage();
		productPage = new ProductPage(); // Initialize ProductPage
		cp = new MyCartPage();
		pp = new PaymentPage();
		sp = new SearchPage();
		
	}

	@Test(priority = 1)
	public void clickOnProductAndAddToCart() throws Exception {
		Lp.verifyLogin();
		Thread.sleep(2000);
		sp.searchProduct();
		Thread.sleep(2000);
		productPage.getProductByName("ADIDAS ORIGINAL");
		Thread.sleep(2000);
		productPage.addProductToCart("ADIDAS ORIGINAL");
		/*Thread.sleep(2000);
		cp.clickOnCheckOut();
		Thread.sleep(2000);
		pp.entrDetails();*/
	}
	@Test(priority = 2)
    public void click() throws Exception {
		
		Thread.sleep(2000);
		cp.clickOnCheckOut();
		Thread.sleep(2000);
		pp.entrDetails();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}

