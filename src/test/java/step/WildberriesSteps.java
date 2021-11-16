package step;

import io.qameta.allure.Step;
import utils.ElementUtils;

import static page.WildberriesPage.*;

public class WildberriesSteps {

    @Step("Произвести поиск со значение {0}")
    public void search(String searchValue){
        ElementUtils.sendKeys(INPUT_SEARCH, searchValue);
    }

    @Step("Нажать накнопку 'Выполнить поиск'")
    public void clickButtonSearch(){
        ElementUtils.click(BUTTON_SEARCH);
    }

    @Step("Быбрать товар по индексу {0}")
    public void clickProductNumber(int count){
        ElementUtils
                .click("(//div[@class=\"product-card__wrapper\"])[" + count + "]");
    }
}
