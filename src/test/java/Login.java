import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
    @Test
    public void main(){
        WebDriver driver;
        String baseurl = "https://www.saucedemo.com/";

        WebDriverManager.edgedriver().setup();
        //ChromeOptions opt =new ChromeOptions();
        driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println(title);

        WebElement ele1 = driver.findElement(By.id("Username"));
        ele1.click();
        ele1.sendKeys("standard_user");
        ele1.getText();
        WebElement ele2 = driver.findElement(By.className("button"));
        ele2.isDisplayed();
        ele2.click();

        driver.close();


    }
}
