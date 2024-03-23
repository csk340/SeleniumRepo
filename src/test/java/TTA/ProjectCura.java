package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class ProjectCura {
    @Test
    @Description("Verify user should able to use complex xpath in the project")
    public void  ComplexCheck()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        List<WebElement> anchor_a_tag = driver.findElements(By.tagName("a"));
        System.out.println(anchor_a_tag.size());
        for (int i=0;i<anchor_a_tag.size();i++)
        {
            System.out.println(anchor_a_tag.get(i).getText());
        }
       // driver.findElement(By.partialLinkText("Make")).click();
        System.out.println(driver.getCurrentUrl());
        //driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("John Doe");
        // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ThisIsNotAPassword");
        //driver.findElement(By.id("btn-login")).click();
        //Suppose scenario where we have only text in html but without <a tag then how to find that element? Ans: Using custom xpath using text()
        driver.findElement(By.xpath("//a[contains(text()='Make Appointment']")).click();
    }
}
