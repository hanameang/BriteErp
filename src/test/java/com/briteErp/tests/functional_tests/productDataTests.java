package com.britErp.tests.functional_tests;

import com.britErp.utilities.ConfigurationReader;
import com.britErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class productDataTests extends TestBase {

    @Test
    public void exportDeleteOptions() throws InterruptedException {

        extentLogger = report.createTest("Export - Delete Options");
        extentLogger.info("Verifying user have export and delete options");

        pages.login().BriteErpLink.click();
        pages.login().login(ConfigurationReader.getProperty("emailUser"),ConfigurationReader.getProperty("passwordUser")+Keys.ENTER);
        pages.productsPage().salesLink.click();
        Thread.sleep(2000);
        pages.productsPage().productsLink.click();
        Thread.sleep(3000);
        pages.productsPage().laptopE5023.click();
        pages.productsPage().laptopSalesLink.click();
        Thread.sleep(2000);
        pages.productsPage().checkBoxTest001.click();
        Thread.sleep(2000);























    }
}
