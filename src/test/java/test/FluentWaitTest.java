package test;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitTest {

    @Test
    public void waitForAlertWindow() {
        WebDriver driver = new ChromeDriver();

        // launching the browser
        driver.get("https://letcode.in/waits");

        // locate the button element
        driver.findElement(By.id("accept")).click();

        //Declare and initialise a fluent wait
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoAlertPresentException.class);

        Alert alert = (Alert) wait.until(new Function<WebDriver, Alert>() {
            public Alert apply(WebDriver driver) {
                return driver.switchTo().alert();
            }
        });

        // accept the alert
        alert.accept();

        driver.close();
    }
}
