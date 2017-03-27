package eu.merithim.seleniumcrawler.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Merithim on 27.03.2017.
 */
public  class WebDriverManager {

    private static final WebDriver driver;
    static {
        driver = new FirefoxDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
