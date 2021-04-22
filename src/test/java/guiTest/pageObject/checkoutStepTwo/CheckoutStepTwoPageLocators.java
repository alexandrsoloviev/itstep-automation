package guiTest.pageObject.checkoutStepTwo;

import org.openqa.selenium.By;

public class CheckoutStepTwoPageLocators {

    public static final By CLICK_FINISH_BUTTON = By.xpath("//*[@id=\"finish\"]");
    public static final By CONTENT_IS_VISIBLE = By.xpath("//span[contains(text(),'Checkout: Complete!')]");
}
