package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    LoginPage loginPage = new LoginPage();



    @And("^I enter emailId \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterEmailIdAndPassword(String myEmail, String myPassword) throws Throwable {
       loginPage.enterEmailAndPassword(myEmail,myPassword);
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        loginPage.submitLoginDetails();
    }


}
