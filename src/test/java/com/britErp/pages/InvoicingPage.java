package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class InvoicingPage {
    public InvoicingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
