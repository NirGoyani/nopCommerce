package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.HomePage;
import com.nopcommerce.page.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class RegistrationSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    RegisterPage registerPage = new RegisterPage();

    @Given("^I select \"([^\"]*)\"$")
    public void i_select(String gender) throws Throwable {
        registerPage.selectGender(gender);
    }

    @Given("^I enter \"([^\"]*)\"$")
    public void i_enter(String firstName) throws Throwable {
        registerPage.enterFirstName(firstName);
    }

    @Given("^I enter Last Name$")
    public void i_enter_Last_Name(String lastName) throws Throwable {
        registerPage.enterLastName(lastName);
    }

    @Given("^I enter email$")
    public void i_enter_email(String email) throws Throwable {
        registerPage.enterEmail(email);
    }

    @Given("^I enter Password$")
    public void i_enter_Password(String password) throws Throwable {
        registerPage.enterPassword(password);
    }

    @Given("^I enter Confirm Password$")
    public void i_enter_Confirm_Password(String confirmPassword) throws Throwable {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @When("^I click on Register Button$")
    public void i_click_on_Register_Button() throws Throwable {
        registerPage.clickOnRegister();
    }

    @Then("^I should see My account on header$")
    public void i_should_see_My_account_on_header() throws Throwable {
        registerPage.myAccountButtonOnHeader();
    }

    @Given("^I enter following details to register$")
    public void i_enter_following_details_to_register(DataTable registrationTable) throws Throwable {
        List<Map<String, String>> data = registrationTable.asMaps(String.class, String.class);
        System.out.println(data);
        registerPage.selectGender(data.get(0).get("gender"));
        registerPage.enterFirstName(data.get(0).get("firstName"));
        registerPage.enterLastName(data.get(0).get("lastName"));
        registerPage.enterEmail(data.get(0).get("email"));
        registerPage.enterPassword(data.get(0).get("password"));
        registerPage.enterConfirmPassword(data.get(0).get("confirmPassword"));
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String jewelery) throws Throwable {
        registerPage.clickOnJewelery();
    }
}
