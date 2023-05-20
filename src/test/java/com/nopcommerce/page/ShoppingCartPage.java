package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.nopcommerce.driver.DriverManager.driver;

public class ShoppingCartPage extends DriverManager {

    @FindBy(id = "checkout_attribute_1")
    WebElement giftWrapOption;

    @FindBy(id = "termsofservice")
    WebElement termsAndConditions;

    @FindBy(name = "checkout")
    WebElement checkoutButton;

    public void selectGiftWrapping(){
        giftWrapOption.click();
//        Actions builder = new Actions(driver);
//        Action clickOnGiftWrapping = builder.contextClick(giftWrapOption).build();
//        clickOnGiftWrapping.perform();
    }

    public void selectTermsAndConditions(){
        termsAndConditions.click();
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }
}
