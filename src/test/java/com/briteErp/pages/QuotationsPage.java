package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotationsPage {

    public QuotationsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
