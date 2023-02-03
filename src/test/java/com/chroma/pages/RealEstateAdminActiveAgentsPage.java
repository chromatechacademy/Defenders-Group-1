package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAdminActiveAgentsPage {
  

      /* GEORGE - DYNAMIC LOCATOR FOR DELETE DROPDOWN */
      public static WebElement activeAgentDeleteDropdownLocator(String activeAgentDdeleteDropdown) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + activeAgentDdeleteDropdown + "']//parent::td//parent::tr//child::td[4]//child::div//child::button//child::span"));
    }

       /* GEORGE - DYNAMIC LOCATOR FOR DELETE BUTTON */
       public static WebElement activeAgentDeleteLocator(String activeAgentDeleteButton) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + activeAgentDeleteButton + "']//parent::td//parent::tr//child::td[4]//child::div//child::ul//child::li//child::button"));
    }

    public RealEstateAdminActiveAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
     }
}
