package eu.merithim.seleniumcrawler.googletest.pages;

import eu.merithim.seleniumcrawler.elements.SiteElement;
import eu.merithim.seleniumcrawler.website.Website;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Merithim on 27.03.2017.
 */
public class MainSite extends Website {

    SiteElement searchField = new SiteElement(By.name("q"));

    public MainSite(WebDriver driver) {
        super(driver);
    }

    public SearchResultSite search(String searchString) {
        searchField.sendKeys(searchString);
        searchField.submit();
        return new SearchResultSite();
    }
}
