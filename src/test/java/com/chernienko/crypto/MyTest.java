package com.chernienko.crypto;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyTest {

    @Test
    public void testFormIsLoaded() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/automation/Selenium-Maven-Template/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-web-platform2.herokuapp.com/#/auth/?to=%2Fdashboard");
        Thread.sleep(5000);
        WebElement emailFeild = ((ChromeDriver) driver).findElementByClassName("form-wr");
        driver.quit();
    }


    @Test
    public void testInputDataSignIN() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/automation/Selenium-Maven-Template/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-web-platform2.herokuapp.com/#/auth/?to=%2Fdashboard");
        WebElement emailFeild = ((ChromeDriver) driver).findElementsByTagName("input").get(0);
        emailFeild.sendKeys("valera1994.08@gmail.com");

        WebElement passwordFeild = ((ChromeDriver) driver).findElementsByTagName("input").get(1);
        passwordFeild.sendKeys("1234abcd");
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testClickRegistration() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/automation/Selenium-Maven-Template/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-web-platform2.herokuapp.com/#/auth/?to=%2Fdashboard");
        WebElement registrationButton = ((ChromeDriver) driver).findElementsByTagName("span").get(1);
        registrationButton.click();
        Thread.sleep(2000);

        WebElement startRegistration = ((ChromeDriver) driver).findElementsByTagName("button").get(0);
        startRegistration.click();

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void InputTestRegistrationField() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/automation/Selenium-Maven-Template/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-web-platform2.herokuapp.com/#/auth/?to=%2Fdashboard");
        WebElement registrationButton = ((ChromeDriver) driver).findElementsByTagName("span").get(1);
        registrationButton.click();
        Thread.sleep(2000);

        WebElement startRegistration = ((ChromeDriver) driver).findElementsByTagName("button").get(0);
        startRegistration.click();

        Thread.sleep(2000);

        WebElement emailFeild = ((ChromeDriver) driver).findElementsByTagName("input").get(0);
        emailFeild.sendKeys("cherniienko.v@brights.cloud");

        WebElement passwordFeild = ((ChromeDriver) driver).findElementsByTagName("input").get(1);
        passwordFeild.sendKeys("1234abcd");

        WebElement repeatPasswordFeild = ((ChromeDriver) driver).findElementsByTagName("input").get(2);
        repeatPasswordFeild.sendKeys("1234abcd");

        Thread.sleep(5000);
    }
}

