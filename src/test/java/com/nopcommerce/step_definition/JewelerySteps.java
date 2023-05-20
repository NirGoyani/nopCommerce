package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.JeweleryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class JewelerySteps extends DriverManager {
    JeweleryPage jeweleryPage = new JeweleryPage();

    @And("^I click on ADD TO CART button for Flower Girl Bracelet$")
    public void iClickOnADDTOCARTButtonForFlowerGirlBracelet() throws InterruptedException {
        jeweleryPage.clickOnShoppingCart();
        Thread.sleep(3000);
    }

    @Given("^I click on shopping cart$")
    public void i_click_on_shopping_cart() throws Throwable {
        jeweleryPage.clickOnShoppingCart();
    }


}
