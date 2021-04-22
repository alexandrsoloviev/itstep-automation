package guiTest.pageObject.checkoutStepOne;

import org.openqa.selenium.By;

public class CheckoutStepOnePageLocators {

    public static final By INPUT_FIRST_NAME = By.xpath("//*[@id=\"first-name\"]");
    public static final By INPUT_LAST_NAME = By.xpath("//*[@id=\"last-name\"]");
    public static final By INPUT_POSTAL_CODE = By.xpath("//*[@id=\"postal-code\"]");
    public static final By CLICK_CONTINUE_BUTTON = By.xpath("//*[@id=\"continue\"]");
    public static final By CONTENT_IS_VISIBLE = By.xpath("//span[contains(text(),'Checkout: Overview')]");
}
