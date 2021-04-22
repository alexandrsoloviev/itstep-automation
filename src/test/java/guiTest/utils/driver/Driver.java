package guiTest.utils.driver;

import guiTest.utils.properties.ConfProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
    private final static Logger LOG = LogManager.getRootLogger();


    private Driver() {
    }


    public static WebDriver getDriver() {
        return (driver == null) ? driver = initDriver() : driver;

    }

    private static WebDriver initDriver() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        LOG.info("Driver initialization chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("BASE_PAGE_URL"));
        return driver;
    }

    public static void teardown() {
        if (driver != null) {
            driver.quit();
            LOG.info("Driver quit");
        }
    }

    public static void get(String uri) {
        driver.get(uri);
    }


}
