import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class checkoutItem {
    @Test
    public void openBrowser() throws InterruptedException {
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.edgedriver().setup();
//        ChromeOptions opt = new ChromeOptions();

        //apply chrome driver setup
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"item_4_title_link\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"checkout\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("randy");
        driver.findElement(By.id("last-name")).sendKeys("resha");
        driver.findElement(By.id("postal-code")).sendKeys("1155");
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"continue\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"finish\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//*[@id=\"back-to-products\"]")).click();

    }


}
