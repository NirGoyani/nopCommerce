package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.ShoppingCartPage;
import cucumber.api.java.en.Given;

import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingCartSteps extends DriverManager {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("^I select \"([^\"]*)\" for Gift Wrapping$")
    public void i_select_for_Gift_Wrapping(String giftWrap) throws Throwable {
        shoppingCartPage.selectGiftWrapping();
    }

    @Given("^I select terms and conditions$")
    public void i_select_terms_and_conditions() throws Throwable {
        shoppingCartPage.selectTermsAndConditions();
    }

    @Given("^I click on checkout button$")
    public void i_click_on_checkout_button() throws Throwable {
        shoppingCartPage.clickOnCheckoutButton();
    }

}
