package com.briteErp.tests.functional_tests;

import com.briteErp.utilities.ConfigurationReader;
import com.briteErp.utilities.Driver;
import com.briteErp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.DriverPropertyInfo;
import java.sql.SQLOutput;
import java.util.List;

public class OrdersToInvoice extends TestBase {

    @Test
    public void login() throws InterruptedException {
        extentLogger = report.createTest("Order Number Checkbox");
        extentLogger.info("When the Order Number checkbox is selected verify remaining checkboxes get selected");

        pages.login().BriteErpLink.click();
        pages.login().login(ConfigurationReader.getProperty("emailUser"),
                ConfigurationReader.getProperty("passwordUser") + Keys.ENTER);
        pages.productsPage().salesLink.click();
        Thread.sleep(10);
        pages.invoicingPage().ordersToInvoice.click();
    }

//    1. When the "Order Number" checkbox header is selected all of the remaining checkboxes get selected.

    @Test
    public void orderNumberCheckbox() throws InterruptedException {

        login();

        Thread.sleep(1000);
        if (!pages.invoicingPage().orderNumberCheckboxHeader.isSelected())
            pages.invoicingPage().orderNumberCheckboxHeader.click();
        Assert.assertTrue(pages.invoicingPage().orderNumberCheckboxHeader.isSelected());
    }
    private void singleNumberCheckboxClick() {
        pages.invoicingPage().singleNumberCheckbox.click();
    }

//    2. When a single checkbox is selected verify that only that checkbox is selected and not any other checkboxes get selected.
    @Test
    public void singleNumberCheckbox() throws InterruptedException {
        login();

        Thread.sleep(3000);
        if (!pages.invoicingPage().singleNumberCheckbox.isSelected())
           singleNumberCheckboxClick();
        Assert.assertTrue(pages.invoicingPage().singleNumberCheckbox.isSelected());
            int count = 0;
         List<WebElement> listCheckbox = pages.invoicingPage().checkboxList;
        for(WebElement el : listCheckbox){

           if (!el.isSelected()){
               count++;
           }
        }
        System.out.println(count);

     }

//3. When at least one checkbox is selected, verify that "Print" and "Action" menu tabs appear at the top middle of the table.

    @Test
    public void printNaction() throws InterruptedException {
        login();
        Thread.sleep(3000);
        singleNumberCheckboxClick();
        /* new WebDriverWait (Driver.getDriver(),10); */
        Assert.assertTrue(pages.invoicingPage().printMenu.isDisplayed());

    }

//    4. When an "Action" tab is clicked verify that drop - down menu appears.
    @Test
    public void actionMenu() throws InterruptedException {
        login();
        Thread.sleep(3000);
        singleNumberCheckboxClick();
        pages.invoicingPage().actionMenu.click();
        List<WebElement> actionOptions = pages.invoicingPage().dropDownOptionsActions;

        for (WebElement option: actionOptions) {
            System.out.println(option.getText());
        }
        Assert.assertTrue(pages.invoicingPage().actionMenu.isDisplayed());
    }
}


