package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends DriverManager {

    @FindBy(className = "ico-logout")
    WebElement logoutButton;

    public boolean clickOnLogout(){
        return logoutButton.isDisplayed();
    }

}
