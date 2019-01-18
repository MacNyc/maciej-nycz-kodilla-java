package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import com.sun.jndi.toolkit.dir.SearchFilter;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static void main (String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

    }
}
