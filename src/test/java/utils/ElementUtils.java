package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertFalse;

import java.time.Duration;

public class ElementUtils extends AbstractTest {


    public static void goToUrl(String url) {
        getDriver().get(url);
    }

    //TODO вынести ожидание в переменную в ресурсах
    public static String getText(String xpath){
        try{
            return new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        } catch (Exception e){
            assertFalse("ОШИБКА: xpath -> " + xpath +  "не найден", true);
            getDriver().quit();
            return null;
        }
    }


    public static void sendKeys(String xpath, String text) {
        try {
//            getDriver().findElement(By.xpath(xpath)).sendKeys(text);
            new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(text);
        } catch (Exception e){
            assertFalse("ОШИБКА: xpath -> " + xpath + "\n" + " Значение : " + text + "\n" + "не найден", true);
            getDriver().quit();
        }
    }

    public static void click(String xpath) {
        try {
            new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            assertFalse("ОШИБКА: xpath -> " + xpath + "\n" + "не найден", true);
            getDriver().quit();
        }
    }
}
