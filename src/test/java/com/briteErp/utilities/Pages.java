package com.briteErp.utilities;

import com.briteErp.pages.*;

public class Pages {

    private LoginPage loginPage;
    private QuotationsPage quotationsPage;
    private ProductsPage productsPage;
    private InvoicingPage invoicingPage;
    private SalesOrdersPage salesOrdersPage;
    private CustomersPage customersPage;
    private ConfSalesChannelsPage confSalesChannelsPage;
    private AllChannelsSalesOrdersPage allChannelsSalesOrdersPage;
    private OrdersToUpsellPage ordersToUpsell;
    private SmokeTestHomePage smokeTestHomePage;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public QuotationsPage quotationsPage() {
        if (quotationsPage == null) {
            quotationsPage = new QuotationsPage();
        }
        return quotationsPage;
    }

    public ProductsPage productsPage() {
        if (productsPage == null) {
            productsPage = new ProductsPage();
        }
        return productsPage;
    }

    public CustomersPage customersPage() {
        if (customersPage == null) {
            customersPage = new CustomersPage();
        }
        return customersPage;
    }

    public SalesOrdersPage salesOrdersPage() {
        if (salesOrdersPage == null) {
            salesOrdersPage = new SalesOrdersPage();
        }
        return salesOrdersPage;
    }

    public InvoicingPage invoicingPage() {
        if (invoicingPage == null) {
            invoicingPage = new InvoicingPage();
        }
        return invoicingPage;
    }

    public ConfSalesChannelsPage confSalesChannelsPage() {
        if (confSalesChannelsPage == null) {
            confSalesChannelsPage = new ConfSalesChannelsPage();
        }
        return confSalesChannelsPage;
    }

    public AllChannelsSalesOrdersPage allChannelsSalesOrdersPage() {
        if (allChannelsSalesOrdersPage == null) {
            allChannelsSalesOrdersPage = new AllChannelsSalesOrdersPage();
        }
        return allChannelsSalesOrdersPage;
    }

    //getter for OrdersToUpsell page object class --->Mamura
    public OrdersToUpsellPage getOrdersToUpsell(){
        if(ordersToUpsell == null){
            ordersToUpsell = new OrdersToUpsellPage();
        }
        return ordersToUpsell;
    }

    //getter for SmokeTestHomePage page object class --->Mamura
    public SmokeTestHomePage getSmokeTestHomePage(){
        if(ordersToUpsell == null){
            smokeTestHomePage = new SmokeTestHomePage();
        }
        return smokeTestHomePage;
    }


}




