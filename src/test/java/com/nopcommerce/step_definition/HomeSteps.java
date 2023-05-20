package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.HomePage;
import com.nopcommerce.page.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverManager {
   DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
       String myUrl = driverManager.getUrl();
        System.out.println(myUrl);
        assertThat(myUrl,is(endsWith("nopcommerce.com/")));
    }
    @When("^I click on the Log in$")
    public void i_click_on_the_Log_in() throws Throwable {
        homePage.clickLoginButton();
    }

    @Given("^I click on the register$")
    public void i_click_on_the_register() throws Throwable {
    homePage.registerOnHeader();
    }









}
