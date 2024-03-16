package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseCheckVWO {

    @Test
    @Description("Perform three scenarieo for app.vwo")
    public void vwocheck()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
    }
}
