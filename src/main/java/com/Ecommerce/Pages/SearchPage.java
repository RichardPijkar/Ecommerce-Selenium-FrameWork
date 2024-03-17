package com.Ecommerce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.Base.BaseClass;

public class SearchPage extends BaseClass{

	public SearchPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"sidebar\"]/form/div[1]/input")
	WebElement searchTxt;
	
	public void searchProduct() {
		searchTxt.sendKeys("ZARA COAT 3");
	}
}
