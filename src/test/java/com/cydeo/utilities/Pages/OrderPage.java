package com.cydeo.utilities.Pages;

import com.cydeo.utilities.Properties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage{
    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "product")
    public WebElement dropdown;
    @FindBy(name ="quantity" )
    public WebElement inputquantitiy;
    @FindBy(name = "name")
    public WebElement inputname;
    @FindBy(name = "street")
    public WebElement inputstreet;
    @FindBy(name ="city" )
    public WebElement inputcity;
    @FindBy(name = "state")
    public WebElement inputstate;
    @FindBy(name = "zip")
    public WebElement inputzip;
}
