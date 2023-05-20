package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.LogoutPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class LogoutSteps extends DriverManager {
    LogoutPage logoutPage = new LogoutPage();

    @Then("^I should see Log out on header$")
    public void i_should_see_Log_out_on_header() throws Throwable {

        logoutPage.clickOnLogout();

//      boolean isLogoutButtonDisplayed = logoutPage.clickOnLogout();
//      assertThat(isLogoutButtonDisplayed, is(true));
    }
}
