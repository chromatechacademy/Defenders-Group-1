package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage{
 
//OVERVIEW LINK
@FindBy(xpath = "//a[normalize-space()='Overview']")
public WebElement overviewLink;

//AGENTS GRAPH LINK
@FindBy(xpath = "//a[normalize-space()='Agents Graph']")
public WebElement agentsGraphLink;

public RealEstateDashboardPage(){
    PageFactory.initElements(WebDriverUtils.driver, this);
}
}
