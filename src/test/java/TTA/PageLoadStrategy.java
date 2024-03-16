package TTA;

import io.qameta.allure.Description;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PageLoadStrategy {

    @Test
    @Description("Verify user should able to check difference between Normal, Eager, None -> Page Load Strategy")
    public void pageloadstrategycheck()
    {
        ChromeOptions obj = new ChromeOptions();
        obj.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NONE);
        //Nomral: Will wait till all elements complete load , Eager: Only wait till getting title of web page
        //None: No wait just hit url and close it (or perform next steps)
        Proxy proxyobject = new Proxy();
        proxyobject.setHttpProxy("189.240.60.166");
        WebDriver obj2 = new ChromeDriver();
        obj2.get("https://thetestingacademy.com");
        System.out.println(obj2.getPageSource());
        //obj2.quit();
    }
}
