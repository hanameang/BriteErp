package com.briteErp.pages;

import com.briteErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {
    
    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement nextPageLink;

    @FindBy(linkText = "Products")
    public WebElement productsLink;

    @FindBy(linkText = "Sales")
    public WebElement salesLink;

    @FindBy (xpath = "//img[@src='http://52.39.162.23/web/image?model=product.template&field=image_small&id=28&unique=']")
    public  WebElement graphicsCard;

    @FindBy(xpath = "//img[@src='http://52.39.162.23/web/image?model=product.template&field=image_small&id=29&unique=']")
    public WebElement laptopE5023;

    @FindBy(xpath = "(//button[@class='btn btn-sm oe_stat_button'])[5]")
    public WebElement graphicsCardSalesLink;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody//td/div/input")
    public WebElement checkBoxSO007;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement dropDown;

    @FindBy(xpath = "//div[@class='btn-group o_dropdown open']/ul/li")
    public WebElement exportLink;

    @FindBy(xpath = "//div[@class='btn-group o_dropdown open']/ul/li[2]")
    public WebElement deleteLink;

    @FindBy(xpath = "(//button[@class='btn btn-sm oe_stat_button'])[6]")
    public WebElement activeLink;

    @FindBy(tagName = "h4")
    public WebElement errorMessageStatus;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-link o_chatter_button_schedule_activity']")
    public WebElement scheduleLink;

    @FindBy(xpath = "//label[@class='o_form_label o_required_modifier']")
    public WebElement activityDropdown;

    @FindBy(xpath = "//li[@class='ui-menu-item']")
    public WebElement firstOptionDropdown;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement scheduleButton;

    @FindBy(xpath = "(//h4)[5]")
    public WebElement errorMessageSchedule;


}
