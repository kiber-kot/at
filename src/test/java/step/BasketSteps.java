package step;

import io.qameta.allure.Step;
import utils.AbstractTest;
import utils.ElementUtils;
import static org.junit.Assert.*;

import static page.BasketPage.*;

public class BasketSteps extends AbstractTest {

    @Step("Удалить товар из корзины")
    public void deleteProduct(){
        ElementUtils.click(CLICK_COUNT);
        ElementUtils.click(DELETE_PRODUCT);
    }

    @Step("Проверка выбранного товара в корзине {0}")
    public void checkTextInNameProduct(String value){
        var result = ElementUtils.getText(CHECK_IS_NULL_BASKET);
        if(!result.equals(value)){
            assertFalse("Ожидаемый результат:  " + value + " не равень фактическому: " + result, true);
        }
    }
}
