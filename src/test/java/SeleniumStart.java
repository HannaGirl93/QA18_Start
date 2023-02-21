import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void testLogin(){

    }


    @AfterMethod
    public void postCondition(){

    }
}