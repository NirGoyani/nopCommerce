package com.nopcommerce.step_definition;

import com.nopcommerce.driver.DriverManager;
import com.nopcommerce.page.LoginPage;
import com.nopcommerce.page.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class CommonSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Then("^I should see \"([^\"]*)\" text on \"([^\"]*)\" page$")
    public void iShouldSeeTextOnPage(String expectedText, String pageType1) throws Throwable {
        switch (pageType1){
            case "login":
                String actualMessage = loginPage.loginPageTitle();
                System.out.println(actualMessage);
                System.out.println(expectedText);
                assertThat(actualMessage,is(equalToIgnoringCase(expectedText)));
            case "registration":
                String message1 = registerPage.registerMessage();
                System.out.println(message1);
                System.out.println(expectedText);
                assertThat(message1,is(equalToIgnoringCase(expectedText)));
        }
    }

    @And("^the url should contain with \"([^\"]*)\"$")
    public void theUrlShouldContainWith(String expectedUrl) throws Throwable {
        switch (expectedUrl){
            case "/login":
                String actualUrlForLogin = driverManager.getUrl();
                System.out.println(actualUrlForLogin);
                assertThat(actualUrlForLogin,containsString(expectedUrl));
                System.out.println(expectedUrl);
            case "/registerresult":
                String actualUrlForRegistration = driverManager.getUrl();
                System.out.println(actualUrlForRegistration);
                assertThat(actualUrlForRegistration,containsString(expectedUrl));
                System.out.println(expectedUrl);
        }
    }

}
