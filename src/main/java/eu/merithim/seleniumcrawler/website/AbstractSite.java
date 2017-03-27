package eu.merithim.seleniumcrawler.website;

import eu.merithim.seleniumcrawler.utils.ValidateWebsite;
import org.openqa.selenium.WebDriver;

/**
 * Created by Merithim on 27.03.2017.
 */
public abstract class AbstractSite {
    protected static WebDriver webDriver;
    public AbstractSite() {}
    public AbstractSite(WebDriver driver) {
        webDriver = driver;
    }
    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void goToSite(String url) {
        webDriver.get(url);
    }


}
