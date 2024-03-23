package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumProgram {
    @Test
    @Description("Verify user should able to login to project")
    public void BasicCheck() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://nextdoor.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='BaseButton__emelwr3 StyledButtonV3__19hidssk'][contains(.,'Log in')][1]")).click();
        driver.findElement(By.className("BaseButton__emelwr2")).click();
        driver.findElement(By.id("id_email")).sendKeys("ckulkarni+25us@nextdoor.com");
        driver.findElement(By.id("id_password")).sendKeys("3534545");
        driver.findElement(By.xpath("//*[@id=\"signin_button\"]/div")).click();
        Thread.sleep(3000);
        String error = driver.findElement(By.xpath("//span[@class='blocks-18st16j']")).getText();
        Assert.assertEquals(error, "Incorrect password");
//        driver.findElement(By.xpath("//div[@class='BaseButton__emelwr3 StyledButtonV3__19hidssk'][contains(.,'Log in')][1]")).click();
//        driver.findElement(By.xpath("//input[@class='blocks-kddr16']")).sendKeys("ckulkarni+25us@nextdoor.com");
//        driver.findElement(By.xpath("//input[@class='blocks-fpd3nj']")).sendKeys("Nextdoor12");
//        driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String attribute = driver.findElement(By.id("id_email")).getAttribute("data-testid");
        System.out.println(attribute);
        //driver.close();
        //driver.quit();
    }
}
