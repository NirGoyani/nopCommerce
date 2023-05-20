package com.nopcommerce;

import com.nopcommerce.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverManager driverManager = new DriverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.gotoUrl();
        driverManager.maxWindow();
        driverManager.applyWait();
    }
    @After
    public void tearDown(){
        driverManager.closeWindow();
    }
}
