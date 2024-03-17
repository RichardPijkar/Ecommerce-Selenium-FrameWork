package com.Ecommerce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.Base.BaseClass;

public class PaymentPage extends BaseClass {
	@FindBy(xpath = "/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[1]/form/div/div[2]/div[2]/input")
	WebElement Cvvno;
	
	@FindBy(xpath = "/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[1]/form/div/div[3]/div/input")
	WebElement NameOnCard;
	
	@FindBy(xpath = "/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/div/input")
	WebElement SelectCountry;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement SelectCountry1;
	
	@FindBy(xpath = "//a[normalize-space()='Place Order']")
	WebElement btnplce;
	

	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public void entrDetails() throws Exception {
		Thread.sleep(2000);
		Cvvno.sendKeys("453");
		Thread.sleep(2000);
		NameOnCard.sendKeys("Jimmy");
		Thread.sleep(2000);
		SelectCountry.sendKeys("india");
		Thread.sleep(2000);
		SelectCountry1.click();
		Thread.sleep(2000);
		btnplce.click();
	}
}
