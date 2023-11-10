package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningElements {
    public static void main(String[] args) throws InterruptedException {




       // str.toLowerCase()
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.toolsqa.com/");


        //driver.get("https://www.list.am/en/");

        By by = By.name("login-button");
        //By by1 = By.id("login-button");
        By by1 = By.cssSelector("#login-button");

        By by2 = By.className("submit-button");
        By by3 = By.className("btn_action");
       // By by3 = By.cssSelector(".btn_action");

        //By by4 = By.tagName("input");
        //By by4 = By.cssSelector("input#login-button");

        By by4 = By.cssSelector("[data-test=username]");
        By by5 = By.linkText("Pets and Animals");
        By by6 = By.partialLinkText("Pets");
        By by7 = By.cssSelector("[data-test=password]");

//        WebElement pets = driver.findElement(by6);
//        pets.click();

        WebElement password = driver.findElement(by7);
        password.sendKeys("secret_sauce");
        //System.out.println(driver.getCurrentUrl());

        WebElement userName = driver.findElement(by4);
        userName.sendKeys("standard_user");

        WebElement loginButton = driver.findElement(by3);
        loginButton.click();

        Thread.sleep(3000);
        driver.close();
    }
}
