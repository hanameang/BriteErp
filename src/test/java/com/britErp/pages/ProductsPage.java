package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='btn-group btn-group-sm']/button[2]")
    public WebElement nextPageLink;

    @FindBy(linkText = "Products")
    public WebElement productsLink;

    @FindBy (linkText = "Sales")
    public WebElement salesLink;

    @FindBy (xpath = "//img[@src='http://52.39.162.23/web/image?model=product.template&field=image_small&id=29&unique=']")
    public  WebElement laptopE5023;

    @FindBy (xpath ="(//button[@class'btn btn-sm oe_stat_button'])[5]")
    public  WebElement laptopSalesLink;

    @FindBy (xpath = "//div[@class='o_checkbox']/input")
    public  WebElement checkBoxTest001;










}
