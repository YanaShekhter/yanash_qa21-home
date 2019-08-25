package homeCom.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HW01WikiSearch {
    WebDriver driver;
    public void searchWiki() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page"); // with URL https://en.wikipedia.org the code is not working, issue with my browser.
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");


        driver.findElement(By.name("go")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
