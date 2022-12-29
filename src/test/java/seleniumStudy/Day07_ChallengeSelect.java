package seleniumStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day07_ChallengeSelect {

    /*
    1-https://rahulshettyacademy.com/AutomationPractice/ adresine gidin
    2-Dropdown Example menüsünün görünür olduğunu doğrulayın.
    3-Option3 ü seçin.
    4-Option3 ün seçili olduğunu doğrulayın.
    */
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        // 1-https://rahulshettyacademy.com/AutomationPractice/ adresine gidin
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 2-Dropdown Example menüsünün görünür olduğunu doğrulayın. 3-Option3 ü seçin.
        WebElement dropExDownMenu = driver.findElement(By.id("dropdown-class-example"));
        Assert.assertTrue(dropExDownMenu.isDisplayed());
        Select select = new Select(dropExDownMenu);
        select.selectByValue("option3");


        // 4-Option3 ün seçili olduğunu doğrulayın.
        String result = select.getFirstSelectedOption().getText();
        Assert.assertEquals("option3", result);

    }
        @AfterClass
        public static void afterClass() {
        driver.close();
    }
}
