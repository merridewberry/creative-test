package creative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Driver {

    protected WebDriver driver;

    public Driver (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
