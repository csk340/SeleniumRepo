package TTA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumProgram {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://nextdoor.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='BaseButton__emelwr3 StyledButtonV3__19hidssk'][contains(.,'Log in')][1]")).click();
        driver.findElement(By.xpath("//input[@class='blocks-kddr16']")).sendKeys("ckulkarni+25us@nextdoor.com");
        driver.findElement(By.xpath("//input[@class='blocks-fpd3nj']")).sendKeys("Nextdoor12");
        driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();
        driver.quit();
    }
}
