import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStart {

    WebDriver wd;
    String str;
    int i;



    public void nonStatic(){
        System.out.println(this.i);
    }

    public static void staticMethod(){
        System.out.println(7 - 9);
    }
    @BeforeMethod
    public void preCondition(){
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/home");
//      wd.navigate().forward();
//      wd.navigate().back();
    }

    @Test
    public void testLogin(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
    }


    @AfterMethod
    public void postCondition(){
//      wd.close();
        wd.quit();
    }
}