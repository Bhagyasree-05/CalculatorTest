package test.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorSeleniumTest {

    @Test
    public void testAddition() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/path/to/CalculatorTest/calculator.html");

        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        WebElement addBtn = driver.findElement(By.id("addBtn"));
        WebElement result = driver.findElement(By.id("result"));

        num1.sendKeys("5");
        num2.sendKeys("3");
        addBtn.click();

        Assert.assertEquals("8", result.getText());
        driver.quit();
    }
}
