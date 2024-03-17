/**
 * 
 */
package com.Ecommerce.Base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class BaseClass {

	public static WebDriver driver;
	
	public static void impliWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
	}
}
