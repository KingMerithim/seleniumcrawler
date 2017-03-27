package eu.merithim.seleniumcrawler.utils;

import eu.merithim.seleniumcrawler.website.AbstractSite;
import eu.merithim.seleniumcrawler.website.Website;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Merithim on 27.03.2017.
 */
public class SeleniumUtils {

    public static boolean waitForTitle(final String title) {
        WebDriver webDriver = WebDriverManager.getDriver();
        return (new WebDriverWait(webDriver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(title.toLowerCase());
            }
        });
    }
}
