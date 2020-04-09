package com.webOrdersApp.pages;

import com.webOrdersApp.pages.pageBase.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllProductsPage extends PageBase {

    @FindBy(linkText = "View all products")
    private WebElement ViewAllProductsLinkElement;

    @FindBy(className = "login_info")
    private WebElement WelcometesterElmeent;

    @FindBy(linkText = "Logout")
    private WebElement LogOutElement;

    @FindBy(id = "ctl00_logout")
    private WebElement LogOutById;

    @FindBy(tagName = "h1")
    private WebElement WebOrdersHeaderElement;

    @FindBy(xpath= "//input[@name='ctl00$MainContent$btnDelete']")
    private WebElement deleteButtonElementByName;

    @FindBy(xpath ="//input[@id='ctl00_MainContent_btnDelete']" )
    private WebElement deleteButtonElementById;

    @FindBy(xpath = "//input[@class='btnDeleteSelected']")
    private WebElement DeleteButtonElementByClass;

    @FindBy(css = "input[type='submit']")
    private WebElement DeleteButtonElementByTypeinCSS;




}
