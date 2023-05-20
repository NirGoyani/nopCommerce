package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JeweleryPage extends DriverManager {


    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartButton;

    @FindBy(linkText = "Shopping cart")
    WebElement shoppingCart;

    public void clickOnAddToCart(){
        addToCartButton.click();
    }

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }
}
