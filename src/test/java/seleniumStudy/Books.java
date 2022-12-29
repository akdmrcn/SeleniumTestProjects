package seleniumStudy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Books {

    WebDriver driver;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown(){
        // driver.close();
    }
     @Test
    public void test01(){

       // 1-https://books-pwakit.appspot.com/ adresine gidin.
        driver.get("https://books-pwakit.appspot.com/");

        //2-"BOOKS" başlığının görünür olduğunu doğrulayın
        WebElement bookBasligi = driver.findElement(By.xpath("//*[text()='BOOKS']"));
        if (bookBasligi.isDisplayed()) {
            System.out.println("Passed");
        }else System.out.println("Failed");

        // 3-Arama çubuğunda "Selenium" u aratın.
//         WebElement selenium = driver.findElement(with(By.tagName("div")).below(bookBasligi));
//         selenium.click();
//         selenium.sendKeys("Selenium");

       // 4-Arama sonuçlarındaki ilk ürün isminin "Selenium" içerdiğini doğrulayın.

    }
}
