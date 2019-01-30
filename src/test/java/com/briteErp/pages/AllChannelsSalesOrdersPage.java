package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AllChannelsSalesOrdersPage {
    public AllChannelsSalesOrdersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
