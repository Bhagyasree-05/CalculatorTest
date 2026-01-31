import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CalculatorSeleniumTest {

    @Test
    public void testAddition() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/ProgramData/Jenkins/.jenkins/workspace/CalculatorTestBuild/calculator.html");

        driver.findElement(By.id("num1")).sendKeys("2");
        driver.findElement(By.id("num2")).sendKeys("3");
        driver.findElement(By.id("addBtn")).click();

        String result = driver.findElement(By.id("result")).getText();
        assertEquals("5", result);

        driver.quit();
    }
}
