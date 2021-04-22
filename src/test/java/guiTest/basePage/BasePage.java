package guiTest.basePage;

import guiTest.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public  class BasePage {

    private static Actions actions = new Actions(Driver.getDriver());

    protected static WebElement initElement(By by) {
        return Driver.getDriver().findElement(by);
    }



    protected static void input(By element, String text) {

        initElement(element).sendKeys(text);
    }

    protected static void clickButton(By element) {
        initElement(element).click();

    }

    protected static void contentIsVisible (By element) {
        initElement(element).isDisplayed();
    }
}


