package org.openemeta.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MyDataPageTest {

    // PLEASE RUN:
    // 1. StartServerTest - To start the server
    // 2. IngestSampleData - To ingest sample data
    // BEFORE RUNNING THIS TEST

    private static final String homeXPath = "/html/body/div/div/div[2]/div[1]/div/div[1]/a";
    private static final Integer sleepTime = 300;

    @Test
    public void checkMyDataPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        String originalHandle = webDriver.getWindowHandle();
        webDriver.get("http://localhost:8585");
        webDriver.manage().window().maximize();
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[2]/button")).click(); // What's new page 2
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[3]/button")).click(); // What's new page 3
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")).click(); // Change Logs
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[1]/div")).click(); // Close What's new
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/nav/button[2]")).click(); // My Data
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]/nav/button[3]")).click(); // Following
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[1]/div[1]/a/button")).click(); // Tables
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[1]/div[2]/a/button")).click(); // Topics
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[1]/div[3]/a/button")).click(); // Dashboard
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click();  // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[1]/div[4]/a/button")).click(); // Services
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[1]/div[5]/a/button")).click(); // Users
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[1]/div[6]/a/button")).click();  // Teams
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[2]/div[1]/p[1]")).click(); // Explore Assets
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[2]/div[2]/p[1]")).click(); // Register Service
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[2]/div[3]/p[2]/a")).click(); // Knowledgebase/docs
        Thread.sleep(2000);
        webDriver.switchTo().window(tabs.get(0));
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/section/div[2]/div[3]/p[2]/span")).click(); // Knowledgebase/API
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[1]/input")).sendKeys("dim"); // Search bar/dim
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[1]/div/div/div[4]/a")).click(); // Search bar/dim
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/a")).click(); // Explore
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/button")).click(); // Setting
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/a")).click(); // Setting/Teams
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/button")).click(); // Setting
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/a")).click(); // Setting/Tags
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div/button")).click(); // Setting
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/a")).click(); // Setting/Services
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/button")).click(); // What's New
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[2]/button")).click(); // What's new page 2
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[2]/div/div[2]/div/div[2]/div/ul/li[3]/button")).click(); // What's new page 3
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")).click(); // Change Logs
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/dialog/div[2]/div[1]/div")).click(); // Close What's new
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div/button/p")).click(); // Need Help
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/a/button")).click(); // Need Help/Docs
        Thread.sleep(2000);
        webDriver.switchTo().window(webDriver.getWindowHandle());
        webDriver.switchTo().window(tabs.get(0));
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div/button/p")).click(); // Need Help
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[3]/a/button")).click(); // Need Help/Slack
        Thread.sleep(2000);
        webDriver.switchTo().window(webDriver.getWindowHandle());
        webDriver.switchTo().window(tabs.get(0));
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div/button/p")).click(); // Need Help
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/a/button")).click(); // Need Help/API
        Thread.sleep(sleepTime);
        webDriver.findElement(By.xpath(homeXPath)).click(); // Home
        Thread.sleep(sleepTime);
        for(String handle : webDriver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                webDriver.switchTo().window(handle);
                webDriver.close();
            }
        }
        webDriver.switchTo().window(tabs.get(0)).close();
    }
}
