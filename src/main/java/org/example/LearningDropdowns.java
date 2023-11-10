package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
        WebElement country = driver.findElement(By.cssSelector("#country"));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("Armenia");
        countrySelect.selectByValue("118");
        countrySelect.selectByIndex(44);
//        WebElement countrySelect=driver.findElement(By.cssSelector("//option[text()=\"Armenia\"]"));
//        WebElement country=driver.findElement(By.cssSelector("#country"));
//        WebElement armenia = driver.findElement(By.xpath("//option[text()='Armenia']"));
//        armenia.click();



        //       driver.get("http://omayo.blogspot.com/");
//        WebElement volvo = driver.findElement(By.cssSelector("[value=volvox]"));
//        volvo.click();
//        WebElement multidropdown =driver.findElement(By.name("SiteMap"));
//        multidropdown.click();
//        WebElement doc1 = driver.findElement(By.id("ironman2"));
//        doc1.click();


    }
}
