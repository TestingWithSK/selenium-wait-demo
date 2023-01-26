package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ImplicitWaitTest {

    static WebDriver driver = null;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void withImplicitWait() {
        // launching the browser
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // clicking the start button
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        // applying implicit wait of 10 seconds.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // verifying message
        String message = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
        assertEquals("Hello World!", message);
    }

    @Test
    public void withoutImplicitWait() {
        // launching the browser
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // clicking the start button
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        // not applying wait, it will throw an exception - NoSuchElementException

        // verifying message
        String message = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
        assertEquals("Hello World!", message);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
