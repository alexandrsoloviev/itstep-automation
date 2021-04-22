package guiTest.pageObject.cart;

import org.openqa.selenium.By;

public class CartPageLocators {

    public static final By CLICK_CHECKOUT_IN_CART = By.xpath("//*[@id=\"checkout\"]");
    public static final By CONTENT_IS_VISIBLE = By.xpath("//span[contains(text(),'Checkout: Your Information')]");



}
