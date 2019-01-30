package com.briteErp.pages;

import com.briteErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AllChannelsSalesOrdersPage {
    public AllChannelsSalesOrdersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
