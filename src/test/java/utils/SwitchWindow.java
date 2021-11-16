package utils;

public class SwitchWindow extends AbstractTest{

    public void checkoutNewWindow(){
        getDriver().getWindowHandles()
                .forEach( e -> getDriver().switchTo().window(e));
    }

}
