package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());

//        try {
//            URL url = new URL("https://www.google.com/");
//            driver.navigate().to(url);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();

        driver.quit();
    }
}