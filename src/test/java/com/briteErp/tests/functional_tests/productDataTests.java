package com.briteErp.tests.functional_tests;

import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.briteErp.utilities.ApplicationConstants.ACCESS_ERROR_MESSAGE;
import static com.briteErp.utilities.BrowserUtils.waitForPageToLoad;

public class productDataTests extends TestBase {

   @Test (priority = 1)
    public void exportDeleteOptions() throws InterruptedException {

        extentLogger = report.createTest("Export/Delete Options");
        extentLogger.info("Verifying export and delete options are available.");

        pages.login().BriteErpLink.click();

        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),ConfigurationReader.getProperty("passwordUser"));

        pages.productsPage().salesLink.click();
        waitForPageToLoad(10000);

        pages.productsPage().productsLink.click();

        Thread.sleep(6000);
        extentLogger.info("Clicking on the product");
        pages.productsPage().graphicsCard.click();

        pages.productsPage().graphicsCardSalesLink.click();
        waitForPageToLoad(10000);

        extentLogger.info("Selecting first checkbox.");
        pages.productsPage().checkBoxSO007.click();
        waitForPageToLoad(10000);

        pages.productsPage().dropDown.click();

        extentLogger.info("Verifying export link is available");
        Assert.assertEquals(pages.productsPage().exportLink.getText(),"Export");
        Thread.sleep(4000);

        extentLogger.info("Verifying delete link is available");
        Assert.assertEquals(pages.productsPage().deleteLink.getText(),"Delete");
        Thread.sleep(2000);

    }

    @Test (priority = 2)
    public void productStatusTest() throws InterruptedException {

        extentLogger = report.createTest("Product status");
        extentLogger.info("Verifying that user is not able to change product status");

        pages.login().BriteErpLink.click();

        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),ConfigurationReader.getProperty("passwordUser"));

        waitForPageToLoad(10000);

        pages.productsPage().salesLink.click();
        extentLogger.info("Navigating to products page.");
        waitForPageToLoad(10000);

        pages.productsPage().productsLink.click();
        waitForPageToLoad(10000);

        extentLogger.info("Clicking on the product");
        pages.productsPage().graphicsCard.click();

        extentLogger.info("Clicking on 'Active' link ");
        pages.productsPage().activeLink.click();
        waitForPageToLoad(10000);


        extentLogger.info("Verifying user is not able to change the product status and gets an error message");

        Assert.assertEquals(pages.productsPage().errorMessageStatus.getText(),ACCESS_ERROR_MESSAGE);
        Thread.sleep(2000);


    }

    @Test (priority = 3)
    public void schedulingActivityTest() throws InterruptedException {

        extentLogger = report.createTest("Scheduling Activity");
        extentLogger.info("Verifying export and delete options are available.");

        pages.login().BriteErpLink.click();

        extentLogger.info("Login to application");
        pages.login().login(ConfigurationReader.getProperty("emailUser"),ConfigurationReader.getProperty("passwordUser"));

        pages.productsPage().salesLink.click();
        extentLogger.info("Navigating to products page.");
        waitForPageToLoad(10000);

        pages.productsPage().productsLink.click();
        waitForPageToLoad(10000);

        extentLogger.info("Clicking on the product");
        pages.productsPage().graphicsCard.click();

        pages.productsPage().scheduleLink.click();
        waitForPageToLoad(10000);

        pages.productsPage().activityDropdown.click();

        extentLogger.info("Selecting option from dropdown");
        pages.productsPage().firstOptionDropdown.click();
        Thread.sleep(1000);

        extentLogger.info("Clicking on the schedule button.");
        pages.productsPage().scheduleButton.click();

        extentLogger.info("Verifying user is not able to schedule any activity and gets an error message.");
        Assert.assertEquals(pages.productsPage().errorMessageSchedule.getText(),ACCESS_ERROR_MESSAGE);

        Thread.sleep(2000);



    }


}

       
      
