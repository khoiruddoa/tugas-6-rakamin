import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
    @Test
//    public void main(){
//        WebDriver driver;
//        String baseurl = "https://www.saucedemo.com/";
//
//        WebDriverManager.edgedriver().setup();
//        //ChromeOptions opt =new ChromeOptions();
//        driver =new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.get(baseurl);
//        String title = driver.getTitle();
//        System.out.println(title);
//
//        driver.close();
//
//
//    }

    public void success_login_case(){
        WebDriver driver;
        String baseurl = "https://www.saucedemo.com/";

        WebDriverManager.edgedriver().setup();
        //ChromeOptions opt =new ChromeOptions();
        driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        driver.close();
    }
}
