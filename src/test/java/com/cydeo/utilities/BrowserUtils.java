package com.cydeo.utilities;

import com.cydeo.utilities.Properties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void verifyTitle(String expectedtitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedtitle);
    }


    public static void verifyURL(String expectedURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }
    public static List<String> dropdownOptionsasstring(WebElement dropdownelement){
        Select select = new Select(dropdownelement);
        List< WebElement> actualOptionsWebelement = select.getOptions();
        List<String> actualoptionsstring = new ArrayList<>();
        for (WebElement webElement : actualOptionsWebelement) {
            actualoptionsstring.add(webElement.getText());
        }
        return actualoptionsstring;
    }
}
