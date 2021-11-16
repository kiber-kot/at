package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbstractTest {

    @Getter
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public AbstractTest() {
        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            var allCookies = getDriver().manage().getCookies();
            allCookies.removeAll(allCookies);
        }
    }
}
