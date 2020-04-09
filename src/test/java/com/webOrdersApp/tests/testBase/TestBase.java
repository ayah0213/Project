package com.webOrdersApp.tests.testBase;

import com.webOrdersApp.utillities.ConfigurationReader;
import com.webOrdersApp.utillities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {

    // 1) open the door(TEST)
    @BeforeMethod
    public void setup(){
        String url = ConfigurationReader.getProperty("url");

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(url);
    }

    // 2) Close the door(TEst)
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
