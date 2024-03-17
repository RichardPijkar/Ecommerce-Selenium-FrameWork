package com.Ecommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.Base.BaseClass;

import java.util.List;

public class ProductPage extends BaseClass {

    @FindBy(css = ".mb-3")
    private List<WebElement> products;

    @FindBy(css = ".ng-animating")
    private WebElement spinner;

    private By addToCart = By.cssSelector(".card-body button:last-of-type");

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getProductList() {
        // Wait for products to load
        waitForSpinnerToDisappear();
        return products;
    }

    public WebElement getProductByName(String productName) throws Exception {
    	Thread.sleep(2000);
        // Wait for products to load
        waitForSpinnerToDisappear();
        // Find product by name
        Thread.sleep(2000);
        return getProductList().stream()
                .filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName))
                .findFirst().orElse(null);
    }

    public void addProductToCart(String productName) throws Exception {
    	Thread.sleep(2000);
        // Find product by name
        WebElement product = getProductByName(productName);
        if (product != null) {
            // Click "Add to Cart" button
            product.findElement(addToCart).click();
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    private void waitForSpinnerToDisappear() {
        // Wait for spinner to disappear
        // Implement your logic for waiting here
    }
}
