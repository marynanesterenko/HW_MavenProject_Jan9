package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {
    @Test
    public void homework() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://www.apple.com/");
        Thread.sleep(2000);
        firefox.manage().window().maximize();

        Thread.sleep(2000);
        firefox.findElement(By.id("ac-gn-link-search")).click();

        Thread.sleep(2000);
        firefox.findElement(By.id("ac-gn-searchform-input")).sendKeys("Airpods");
    }
}
