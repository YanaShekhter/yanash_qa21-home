import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HW02WikiSearch extends HW02TestBaseWiki{

    @Test
    public void TestSearchWiki() throws InterruptedException {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");

        driver.findElement(By.name("go")).click();
        Thread.sleep(5000);
    }
}
