package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyFirstVWOProgram {
    @Test
    @Description("Verify proper errro message should dsisplay for invalid credentials")
    public void negativeTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("45364634");
        driver.findElement(By.id("login-password")).sendKeys("232433");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);
        String error = driver.findElement(By.id("js-notification-box-msg")).getText();
        Assert.assertEquals(error, "Your email, password, IP address or location did not match");
    }

}