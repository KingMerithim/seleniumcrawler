package eu.merithim.seleniumcrawler.googletest.test;

import eu.merithim.seleniumcrawler.googletest.pages.MainSite;
import eu.merithim.seleniumcrawler.utils.SeleniumUtils;
import eu.merithim.seleniumcrawler.utils.WebDriverManager;
import eu.merithim.seleniumcrawler.website.AbstractSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Merithim on 27.03.2017.
 */
public class GoogleTest {


    @Test
    public void t01_firstTest() {

        WebDriver driver = WebDriverManager.getDriver();
        String searchString = "Hello World";
        MainSite googleMainSite = new MainSite(driver);
        googleMainSite.goToSite("http://www.google.de");
         googleMainSite.search(searchString);
        boolean titleDisplayed = SeleniumUtils.waitForTitle(searchString);
        Assert.assertTrue(titleDisplayed, "Title " + searchString + " is displayed.");
    }
}
