package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SleepTest {

    @Test
    public void withoutImplicitWait() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // launching the browser
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // clicking the start button
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        // applying Thread.sleep() command for 10 sec
        Thread.sleep(10000);

        // verifying message
        String message = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
        assertEquals("Hello World!", message);

        driver.quit();
    }
}
