package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class CalculatorSeleniumTest {

    WebDriver driver;

    @Before
    public void setUp() {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();

        // Headless Chrome options for Jenkins
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // run without GUI
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        // Open local calculator HTML page (relative path)
        String path = "file://" + System.getProperty("user.dir") + "/Calculator.html";
        driver.get(path);
    }

    @Test
    public void testAddition() {
        driver.findElement(By.id("num1")).sendKeys("5");
        driver.findElement(By.id("num2")).sendKeys("3");
        driver.findElement(By.id("addBtn")).click();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Addition result: " + result);
        assertEquals("8", result);
    }

    @Test
    public void testSubtraction() {
        driver.findElement(By.id("num1")).sendKeys("10");
        driver.findElement(By.id("num2")).sendKeys("4");
        driver.findElement(By.id("subtractBtn")).click();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Subtraction result: " + result);
        assertEquals("6", result);
    }

    @Test
    public void testMultiplication() {
        driver.findElement(By.id("num1")).sendKeys("6");
        driver.findElement(By.id("num2")).sendKeys("7");
        driver.findElement(By.id("multiplyBtn")).click();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Multiplication result: " + result);
        assertEquals("42", result);
    }

    @Test
    public void testDivision() {
        driver.findElement(By.id("num1")).sendKeys("20");
        driver.findElement(By.id("num2")).sendKeys("5");
        driver.findElement(By.id("divideBtn")).click();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Division result: " + result);
        assertEquals("4", result);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // close browser
        }
    }
}
