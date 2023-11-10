package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebElementMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
        WebElement textarea1 = driver.findElement(By.cssSelector("div#HTML11 textarea"));
        System.out.println(textarea1.getText());
        textarea1.clear();
        textarea1.sendKeys("Mariam");
        WebElement text2 = driver.findElement(By.id("Text1"));
        System.out.println(text2.getText());
        System.out.println(text2.getAttribute("class"));
        System.out.println(text2.getCssValue("color"));
        System.out.println(text2.getSize());
        System.out.println(text2.getLocation());
        System.out.println(text2.getTagName());
        System.out.println(text2.getAccessibleName());




        driver.quit();

    }
}
