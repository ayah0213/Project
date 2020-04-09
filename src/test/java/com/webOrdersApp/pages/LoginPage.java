package com.webOrdersApp.pages;

import com.webOrdersApp.pages.pageBase.PageBase;
import com.webOrdersApp.utillities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement username;

                   // our elements
    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;


    @FindBy(id = "ctl00_MainContent_status")
    private WebElement invalidCredential;

    public String getInvalidCredentialText(){
        return invalidCredential.getText();
    }
    //manually Login method
    public void manuallyLogin(String username, String password){
       this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
    }

    // Automation Login method
    public void automaticlogin(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
    }

}
