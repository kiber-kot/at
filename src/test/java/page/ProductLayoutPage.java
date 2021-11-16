package page;

import org.openqa.selenium.support.PageFactory;
import utils.AbstractTest;

public class ProductLayoutPage extends AbstractTest {

    public ProductLayoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static String ADD_BASKET = "//button/span[text()=\"Добавить в корзину\"]/..";
    public static String IN_ADD_BASKET = "//div/a[contains(text(),\"Перейти в корзину\")]";
    public static String NAME_PRODUCT = "(//h1/span)[2]";
}
