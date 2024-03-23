package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathFunctions {

    @Test
    @Description("Verify user should able to use Xpath Functions")
    public void xpathFunctions()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //Using text()
        //driver.findElement(By.xpath("//a[text()='Make Appointment']")).click(); //pass

        //Using Starts With
        driver.findElement(By.xpath("//a[starts-with(@id, 'btn-make-appointment']")).click();
        //need to check syntax

        //Using contains
        //driver.findElement(By.xpath("//a[contains (@id, 'make')]")).click();//pass
        //If attribute then @needed in syntax
    }
}
