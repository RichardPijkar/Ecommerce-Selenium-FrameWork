package com.Ecommerce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.Base.BaseClass;

public class MyCartPage extends BaseClass {
@FindBy(xpath="/html/body/app-root/app-dashboard/app-sidebar/nav/ul/li[4]/button")
WebElement cartBtn;
	
@FindBy(xpath="/html/body/app-root/app-profile/div/div[3]/ul/li[3]/button")
WebElement CheckOutBtn;
public MyCartPage() {
	PageFactory.initElements(driver, this);
}

public void clickOnCheckOut() throws Exception {
	Thread.sleep(2000);
	cartBtn.click();
	Thread.sleep(2000);
	CheckOutBtn.click();

}
}
