package com.webOrdersApp.pages.pageBase;

import com.webOrdersApp.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase  {

    public PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy()
//    private WebElement UserName;
}

