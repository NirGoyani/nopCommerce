package com.nopcommerce.page;

import com.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(className = "ico-login")
    WebElement loginButtonOnHeader;

    @FindBy(linkText = "Register")
    WebElement clickRegisterOnHeader;

    public void clickLoginButton(){
        loginButtonOnHeader.click();
    }

    public void registerOnHeader(){
        clickRegisterOnHeader.click();
    }

}
