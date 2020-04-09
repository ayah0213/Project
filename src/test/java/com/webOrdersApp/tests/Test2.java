package com.webOrdersApp.tests;

import com.webOrdersApp.pages.LoginPage;
import com.webOrdersApp.tests.testBase.TestBase;
import com.webOrdersApp.utillities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 extends TestBase  {

    // // Go to the url website
    //// second login to it with valid credentials

    @Test
    public void loginTest (){
        LoginPage loginTest = new LoginPage();
        loginTest.automaticlogin();
    }

    @Test
    public void manuallLoginTest(){
        LoginPage manuallLoginTEst = new LoginPage();
        manuallLoginTEst.manuallyLogin("Tester", "test");
    }
}
