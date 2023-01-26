package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ExplicitWaitTest {

    static WebDriver driver = null;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void waitForAlertAppears() {
        // launching the browser
        driver.get("https://letcode.in/waits");

        // clicking the button
        driver.findElement(By.id("accept")).click();

        // applying explicit wait of 10 seconds.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // applying expected condition to wait for alert
        wait.until(ExpectedConditions.alertIsPresent());

        // get the text of alert message
        String message = driver.switchTo().alert().getText();
        System.out.println(message);
    }

    @Test
    public void waitForElementLocated() {
        // launching the browser
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // clicking the start button
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // locate an element
        By locator = By.xpath("//div[@id='finish']/h4");

        // wait for checking the presence of the located element
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        // verifying message
        String message = driver.findElement(locator).getText();
        assertEquals("Hello World!", message);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
