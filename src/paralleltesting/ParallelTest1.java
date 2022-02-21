package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/New89/chromedriver_win32 (1)/chromedriver.exe");
        driver =  new ChromeDriver();

        driver.get("http://nop40.different.com.mk/");
        WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is Displayed");
    }

    @Test
    void homePageTitle(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/New89/chromedriver_win32 (1)/chromedriver.exe");
        driver =  new ChromeDriver();

        driver.get("http://nop40.different.com.mk/");

        Assert.assertEquals(driver.getTitle(), "Мото макс");
    }
}
