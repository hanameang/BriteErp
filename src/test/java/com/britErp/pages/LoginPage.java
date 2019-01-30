package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (linkText = "BriteErpDemo")
    public WebElement BriteErpLink;

    @FindBy (id = "login")
    public WebElement emailBox;

    @FindBy (id = "password")
    public WebElement passwordBox;


    public void login(String email, String password){

        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);

    }



}
