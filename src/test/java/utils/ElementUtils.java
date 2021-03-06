package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.fail;

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
            fail("ОШИБКА: xpath -> " + xpath +  "не найден");
            getDriver().quit();
            return null;
        }
    }


    public static void sendKeys(String xpath, String text) {
        try {
            new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(text);
        } catch (Exception e){
            fail("ОШИБКА: xpath -> " + xpath + "\n" + " Значение : " + text + "\n" + "не найден");
            getDriver().quit();
        }
    }

    public static void click(String xpath) {
        try {
            new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            fail("ОШИБКА: xpath -> " + xpath + "\n" + "не найден");
            getDriver().quit();
        }
    }
}
