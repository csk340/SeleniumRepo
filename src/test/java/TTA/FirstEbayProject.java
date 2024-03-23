package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstEbayProject {

    @Test
    @Description ("Verify user should able to fetch items from list on page")
    public void FetchItems()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/b/PC-Desktops-All-In-One-Computers/179/bn_661752");
        driver.findElement(By.id("gh-ac")).sendKeys("mac mini");
        driver.findElement(By.id())
    }
}
