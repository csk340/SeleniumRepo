package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Extension {

    @Test
    @Description("Add the extension to chrome using selenium")
    public void method1()
    {

        ChromeOptions obj = new ChromeOptions();
       // obj.addArguments("--headless");//need to check again
        //obj.addExtensions(new File("C:/Users/AKASH KULKARNI/Downloads/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_5_19_0_0.crx"));
        WebDriver driver = new ChromeDriver(obj);
        driver.get("https://www.google.com");
        obj.addArguments("--window-size =800,600");

    }
}
