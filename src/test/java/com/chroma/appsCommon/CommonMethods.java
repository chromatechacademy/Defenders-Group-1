package com.chroma.appsCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.chroma.web.WebDriverUtils;

public class CommonMethods {

    /*
     * USED FOR COMMON XPATHS
     */
    public static WebElement inspectElement(String webElement) {
        return WebDriverUtils.driver.findElement(By.xpath(webElement));
    }

    /*
     * USE THIS METHOD WHEN ASSERTING TO HANDLE ASSERTEQUAL EXCEPTION WITH TRY CATCH
     * BLOCK
     */
    public static void handledAssertEqual(String actualValue, String expectedValue) {
        try {
            Assert.assertEquals(actualValue, expectedValue);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /*
     * USE THIS METHOD TO SELECT A VALUE FROM A DROP DOWN BY VISIBLE TEXT
     */
    public static void selectDropDownValue(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    /*
     * USE THIS METHOD TO SELECT A VALUE FROM A DROP DOWN BY VALUE
     */
    public static void selectDropDownValue(String value, WebElement element) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /*
     * USE THIS METHOD TO SELECT A VALUE FROM A DROP DOWN BY INDEX
     */
    public static void selectDropDownValue(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

}
