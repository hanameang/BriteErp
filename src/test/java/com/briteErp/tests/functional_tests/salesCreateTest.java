package com.briteErp.tests.functional_tests;

import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.briteErp.utilities.BrowserUtils.waitForPageToLoad;

public class salesCreateTest extends TestBase {

    @Test
    public void salesCreate() {

        extentLogger = report.createTest("Sales Create Options");
        extentLogger.info("Verifying create option is available.");

        pages.login().BriteErpLink.click();

        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"), ConfigurationReader.getProperty("passwordUser"));

        pages.allChannelsSalesOrdersPage().salesLink.click();
        waitForPageToLoad(10000);

        pages.allChannelsSalesOrdersPage().salesChannel.click();
        waitForPageToLoad(10000);

        pages.allChannelsSalesOrdersPage().createButton.click();
        waitForPageToLoad(10000);

        pages.allChannelsSalesOrdersPage().salesChannelBox.sendKeys("JapanX");
        waitForPageToLoad(10000);

        pages.allChannelsSalesOrdersPage().saveButton.click();

        extentLogger.info("Verifying create link is available");
        Assert.assertEquals(pages.allChannelsSalesOrdersPage().salesLink.getText(), "create");

    }

        @Test
        public void salesStatusTest() {

            extentLogger = report.createTest("Sales Create Options");
            extentLogger.info("Verifying create option is available.");

            pages.login().BriteErpLink.click();

            extentLogger.info("Login to application");
            pages.login().login(ConfigurationReader.getProperty("emailUser"), ConfigurationReader.getProperty("passwordUser"));

            pages.allChannelsSalesOrdersPage().salesLink.click();
            waitForPageToLoad(10000);

            pages.allChannelsSalesOrdersPage().salesChannel.click();
            waitForPageToLoad(10000);

            pages.allChannelsSalesOrdersPage().createButton.click();
            waitForPageToLoad(10000);

            pages.allChannelsSalesOrdersPage().salesChannelBox.sendKeys("JapanX");
            waitForPageToLoad(10000);

            pages.allChannelsSalesOrdersPage().activeLink.click();

            extentLogger.info("Clicking on 'Active' link ");
            extentLogger.info("Verifying user  able to change the product status ");








    }
}