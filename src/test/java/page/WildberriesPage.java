package page;

import org.openqa.selenium.support.PageFactory;
import utils.AbstractTest;

public class WildberriesPage extends AbstractTest {

    public WildberriesPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static String INPUT_SEARCH = "//input[@placeholder=\"Я ищу...\"]";
    public static String BUTTON_SEARCH = "//button[@id=\"applySearchBtn\"]";
}
