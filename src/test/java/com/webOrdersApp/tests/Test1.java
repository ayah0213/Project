package com.webOrdersApp.tests;

import com.webOrdersApp.pages.LoginPage;
import com.webOrdersApp.tests.testBase.TestBase;
import com.webOrdersApp.utillities.ConfigurationReader;
import com.webOrdersApp.utillities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1  {

   @BeforeMethod
   public void setup(){
      String url = ConfigurationReader.getProperty("url");

      Driver.getDriver().manage().window().maximize();
      Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Driver.getDriver().get(url);
   }


   @Test
    public void Test(){
       LoginPage obj = new LoginPage();
       obj.automaticlogin();
   }


   @AfterMethod
   public void tearDown(){
      Driver.closeDriver();
   }


   @Test
    public void Tes2(){
       LoginPage obj2 = new LoginPage();
       obj2.manuallyLogin("Tester1", "test1");
       Assert.assertEquals(obj2.getInvalidCredentialText(), "Invalid Login or Password1");
   }
}
