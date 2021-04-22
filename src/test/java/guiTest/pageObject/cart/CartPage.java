package guiTest.pageObject.cart;

import guiTest.pageObject.basePage.BasePage;
import io.qameta.allure.Step;

public class CartPage extends BasePage {

    @Step("click CHECKOUT button")
    public static void clickCheckoutButton(){
        clickButton(CartPageLocators.CLICK_CHECKOUT_IN_CART);
        contentIsVisible(CartPageLocators.CONTENT_IS_VISIBLE);

    }
}
