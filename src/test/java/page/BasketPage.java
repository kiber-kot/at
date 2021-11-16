package page;

import org.openqa.selenium.support.PageFactory;
import utils.AbstractTest;

public class BasketPage extends AbstractTest {

    public BasketPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static String CLICK_COUNT = "//div[@class=\"count__input-number\"]//button[1]";
    public static String DELETE_PRODUCT = "//button/span[contains(text(), \"Удалить\")]";
    public static String CHECK_IS_NULL_BASKET = "//div[@class=\"basket-page__basket-empty basket-empty\"]/h1";
}
