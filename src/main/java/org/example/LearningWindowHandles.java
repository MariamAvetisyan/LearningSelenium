package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.Thread.sleep;

public class LearningWindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/");
        String handle = driver.getWindowHandle();

        driver.manage().window().maximize();
        sleep(4000);
        WebElement element = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        element.click();

        sleep(2000);
        WebElement trillo = driver.findElement(By.cssSelector("a[href='https://www.sugaroutfitters.com/addons/triblio-for-sugar']"));
        WebElement slack = driver.findElement(By.cssSelector("a[href='https://www.sugaroutfitters.com/addons/UpsertSlack']"));

        trillo.click();
        sleep(1000);
        slack.click();
        sleep(5000);

        switchToWindowByTitle(driver, "Upsert® Connector for Slack | SugarCRM Module");

//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if (!handle.equals(windowHandle)) {
//                driver.switchTo().window(windowHandle);
//            }
//        }

        element = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        element.click();

    }

    public static void switchToWindowByTitle(WebDriver driver, String title) {
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals(title)) {
                return;
            }
        }
    }
}
