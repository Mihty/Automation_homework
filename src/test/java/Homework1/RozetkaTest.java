package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RozetkaTest {
    private WebDriver driver;

    @BeforeClass
    public void initDriver()
    {
        driver = new ChromeDriver();
    }

    @Test
    public void testElementIsDisplayed() {
        driver.get("https://rozetka.com.ua/");

        WebElement element = driver.findElement(By.cssSelector("a.header__logo"));
        Assert.assertTrue(element.isDisplayed(), "Element is not displayed");
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }
}
