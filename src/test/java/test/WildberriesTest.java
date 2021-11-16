package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import step.BasketSteps;
import step.ProductLayoutSteps;
import step.WildberriesSteps;
import utils.AbstractTest;
import utils.ElementUtils;
import utils.WaitUtils;
import org.junit.jupiter.api.Test;

@DisplayName("Wildberries")
public class WildberriesTest extends AbstractTest {

    private final String url  = "https://www.wildberries.ru";

    @DisplayName("Проверка добавления и удаление товара")
    @Test
    public void wilberiesTest() {
        ElementUtils.goToUrl(url);
        var wildberriesSteps = new WildberriesSteps();
        wildberriesSteps.search("Навальный кружка");
        wildberriesSteps.clickButtonSearch();
        wildberriesSteps.clickProductNumber(1);
        var productLayoutSteps = new ProductLayoutSteps();
        productLayoutSteps.addBasket();
        //TODO вынужденный слип из-за js подкрузки
        WaitUtils.wait(1);
        productLayoutSteps.goToBasket();
        var basket = new BasketSteps();
        basket.deleteProduct();
        basket.checkTextInNameProduct("В корзине пока ничего нет");

    }


    @BeforeEach
    private void deleteCok() {
        var allCookies = getDriver().manage().getCookies();
        allCookies.removeAll(allCookies);
    }

    @AfterEach
    private void finish() {
        getDriver().quit();
    }

}
