package com.briteErp.pages;

import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.Driver;
import com.briteErp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static com.briteErp.utilities.BrowserUtils.waitForPageToLoad;

public class AllChannelsSalesOrdersPage  extends TestBase {
    public AllChannelsSalesOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Sales")
    public WebElement salesLink;

    @FindBy(linkText = "SalesChannel")
    public WebElement salesChannel;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@id='o_field_input_2871']")
    public WebElement salesChannelBox ;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
    public WebElement saveButton ;


    @FindBy (linkText = "active")
    public WebElement activeLink ;






}











