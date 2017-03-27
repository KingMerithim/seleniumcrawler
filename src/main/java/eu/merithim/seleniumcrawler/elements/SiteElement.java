package eu.merithim.seleniumcrawler.elements;

import eu.merithim.seleniumcrawler.website.AbstractSite;
import org.openqa.selenium.*;

import java.util.List;

/**
 * Created by Merithim on 27.03.2017.
 */
public class SiteElement implements WebElement {

    private WebDriver driver;
    private By byExpresseon;
    private WebElement element;

    public SiteElement(By findExpression) {
        this.driver = AbstractSite.getWebDriver();
        this.byExpresseon = findExpression;
    }

    public void click() {
        this.element = driver.findElement(byExpresseon);
        element.click();
    }

    public void submit() {
        this.element = driver.findElement(byExpresseon);
        element.submit();
    }

    public void sendKeys(CharSequence... charSequences) {
        this.element = driver.findElement(byExpresseon);
        element.sendKeys(charSequences);
    }

    public void clear() {
        this.element = driver.findElement(byExpresseon);
        element.clear();
    }

    public String getTagName() {
        this.element = driver.findElement(byExpresseon);
        return element.getTagName();
    }

    public String getAttribute(String s) {
        this.element = driver.findElement(byExpresseon);
        return element.getAttribute(s);
    }

    public boolean isSelected() {
        this.element = driver.findElement(byExpresseon);
        return element.isSelected();
    }

    public boolean isEnabled() {
        this.element = driver.findElement(byExpresseon);
        return element.isEnabled();
    }

    public String getText() {
        this.element = driver.findElement(byExpresseon);
        return element.getText();
    }

    public List<WebElement> findElements(By by) {
        this.element = driver.findElement(byExpresseon);
        return element.findElements(by);
    }

    public WebElement findElement(By by) {
        this.element = driver.findElement(byExpresseon);
        return element.findElement(by);
    }

    public boolean isDisplayed() {
        this.element = driver.findElement(byExpresseon);
        return element.isDisplayed();
    }

    public Point getLocation() {
        this.element = driver.findElement(byExpresseon);
        return element.getLocation();
    }

    public Dimension getSize() {
        this.element = driver.findElement(byExpresseon);
        return element.getSize();
    }

    public Rectangle getRect() {
        this.element = driver.findElement(byExpresseon);
        return element.getRect();
    }

    public String getCssValue(String s) {
        this.element = driver.findElement(byExpresseon);
        return element.getCssValue(s);
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        this.element = driver.findElement(byExpresseon);
        return element.getScreenshotAs(outputType);
    }
}
