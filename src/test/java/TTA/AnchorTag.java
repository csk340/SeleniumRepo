package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;



public class AnchorTag {

    //Let's learn about linkText and partialLinkText
    @Test
    @Description("Verify user should able to get anchor tag element attributes, click on it and total anchor tag in page")
    public void anchorTagCheck() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.linkText("Start a free trial")).click();
        driver.navigate().back();
        Thread.sleep(4000);
        String anchor = driver.findElement(By.linkText("Start a free trial")).getAttribute("href");
        System.out.println(anchor);
        List <WebElement> anchorTagList = driver.findElements(By.tagName("a"));
        System.out.println(anchorTagList.size());
        for (int i=0;i<anchorTagList.size();i++)
        {

            System.out.println(anchorTagList.get(i).getText());
        }
    }
}
