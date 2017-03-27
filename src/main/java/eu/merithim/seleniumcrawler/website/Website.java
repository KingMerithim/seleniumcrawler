package eu.merithim.seleniumcrawler.website;

import org.openqa.selenium.WebDriver;

/**
 * Created by Merithim on 27.03.2017.
 */
public class Website extends AbstractSite {
    protected static WebDriver webDriver;

    public Website(WebDriver driver) {
        super(driver);
    }
    public Website() {
        super(webDriver);
    }
}
