package guiTest.pageObject.inventory;

import guiTest.pageObject.basePage.BasePage;
import io.qameta.allure.Step;

public class InventoryPage extends BasePage {

    @Step("add ITEMS to cart")
    public static void addItemsToCart() {
        clickButton(InventoryPageLocators.CLICK_BACKPACK);
        clickButton(InventoryPageLocators.CLICK_JACKET);
        clickButton(InventoryPageLocators.CLICK_CART_LOGO);
        contentIsVisible(InventoryPageLocators.CONTENT_IS_VISIBLE);

    }
}
