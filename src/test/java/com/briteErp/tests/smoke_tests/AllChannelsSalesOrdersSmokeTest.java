package com.briteErp.tests.smoke_tests;

import com.briteErp.utilities.BrowserUtils;
import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.Driver;
import com.briteErp.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static com.briteErp.utilities.ApplicationConstants.ACCESS_ERROR_MESSAGE;
import static com.briteErp.utilities.BrowserUtils.waitForPageToLoad;

// AUTHOR : Osman Sahin
public class AllChannelsSalesOrdersSmokeTest extends TestBase {

    @Test
    public void SmokeTest() throws InterruptedException {
//  Tests if all the buttons and link are functional
        Driver.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        extentLogger = report.createTest("Export/Delete Options");
        extentLogger.info("Verifying export and delete options are available.");

        pages.login().BriteErpLink.click();

        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailMan"),ConfigurationReader.getProperty("passwordMan"));

        pages.productsPage().salesLink.click();
        waitForPageToLoad(10000);

        extentLogger.info("Navigating to All Channels Sales Orders page.");
        pages.allChannelsSalesOrdersPage().allChannelsSalesOrdersLink.click();
        Thread.sleep(5000);
      //  BrowserUtils.waitForVisibility(pages.allChannelsSalesOrdersPage().measuresMenu , 10);
        pages.allChannelsSalesOrdersPage().measuresMenu.click();
        pages.allChannelsSalesOrdersPage().total.click();
        pages.allChannelsSalesOrdersPage().priceSubtotal.click();
        pages.allChannelsSalesOrdersPage().productQuantity.click();
        waitForPageToLoad(5000);
        pages.allChannelsSalesOrdersPage().count.click();
        waitForPageToLoad(5000);
        pages.allChannelsSalesOrdersPage().flipAxis.click();
        waitForPageToLoad(5000);
        pages.allChannelsSalesOrdersPage().expandAll.click();
        waitForPageToLoad(5000);
        pages.allChannelsSalesOrdersPage().download.click();
        waitForPageToLoad(5000);
        if(!pages.allChannelsSalesOrdersPage().filters.isDisplayed()){
                BrowserUtils.waitForClickablility(pages.allChannelsSalesOrdersPage().advancedSearch,5);
        }
        Thread.sleep(5000);
        pages.allChannelsSalesOrdersPage().advancedSearch.click();
        pages.allChannelsSalesOrdersPage().filters.click();
        pages.allChannelsSalesOrdersPage().currentYearSales.click();
        pages.allChannelsSalesOrdersPage().addCustomFilter.click();
        pages.allChannelsSalesOrdersPage().groupBy.click();
        pages.allChannelsSalesOrdersPage().salesChannel.click();
        pages.allChannelsSalesOrdersPage().addCustomGroup.click();
        pages.allChannelsSalesOrdersPage().favorites.click();
        pages.allChannelsSalesOrdersPage().saveCurrentSearch.click();
        pages.allChannelsSalesOrdersPage().addToMyDashboard.click();

        extentLogger.pass("All the buttons and links are functional on All Channels Sales Order Page");
        Assert.assertEquals(pages.allChannelsSalesOrdersPage().allChannelsSalesOrdersTitle.getText(),"All Channels Sales Orders");


    }

}
