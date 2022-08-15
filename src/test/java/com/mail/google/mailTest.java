package com.mail.google;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class mailTest {
    ChromeOptions options = new ChromeOptions();
    ChromeDriver wd = new ChromeDriver(options);

    public void test(String recipient, String themeMail, String textMail) throws Exception {
        wd.get("https://mail.google.com/");
        //             By.id
        wd.findElement(By.id("identifierId")).sendKeys("mylittletestcase@gmail.com");
        wd.findElement(By.id("identifierNext")).click();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //             By.xpath
        wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("testMAIL");
        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //             By.className
        wd.findElement(By.className("z0")).click();
        wd.findElement(By.className("vO")).sendKeys(recipient);
        //             By.name
        wd.findElement(By.name("subjectbox")).sendKeys(themeMail);
        //             By.cssSelector
        wd.findElement(By.cssSelector("[role=\"textbox\"]")).sendKeys(textMail);
        wd.findElement(By.cssSelector("[id=\":77\"]")).click();

    }

    @Test
    public void testRunner() {
        try {
            test("w4lm4re@gmail.com", "Very important!", "But nothing...");
        } catch (Exception e) {
            System.out.println("(ง ͠° ͟ʖ ͡°)ง");
        }
    }
}
