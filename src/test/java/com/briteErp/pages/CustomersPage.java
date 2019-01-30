package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {
    public CustomersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
