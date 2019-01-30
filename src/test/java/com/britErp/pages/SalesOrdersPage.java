package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SalesOrdersPage {
    public SalesOrdersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
