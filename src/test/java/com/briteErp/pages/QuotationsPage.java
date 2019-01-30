package com.briteErp.pages;

import com.briteErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class QuotationsPage {

    public QuotationsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
