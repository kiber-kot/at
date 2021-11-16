package step;

import io.qameta.allure.Step;
import utils.AbstractTest;
import utils.ElementUtils;

import static page.ProductLayoutPage.*;

public class ProductLayoutSteps extends AbstractTest {

    @Step("Добавить товар в корзину")
    public void addBasket(){
        ElementUtils.click(ADD_BASKET);
    }

    @Step("Перейти в корзину")
    public void goToBasket(){
        ElementUtils.click(IN_ADD_BASKET);
    }

    @Step("Сохранение названия товара")
    public String getNameProduct(){
        return ElementUtils.getText(NAME_PRODUCT);
    }
}
