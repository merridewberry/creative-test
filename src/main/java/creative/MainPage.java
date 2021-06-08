package creative;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static creative.Values.*;

public class MainPage extends Driver {

    @FindBy(xpath = ".//nav/input")
    WebElement menu;

    @FindBy(xpath = ".//a[@href='/contacts']")
    WebElement contacts;

    public MainPage(WebDriver driver) {super(driver);}

    public void clickMenu() {
        menu.click();
    }

    public void clickContacts() {
        contacts.click();
    }

    public void checkUrl() {
        Assertions.assertEquals(driver.getCurrentUrl(), CONTACTS_URL, "Current URL is not equal to " + CONTACTS_URL);
    }

    public Contacts goToContacts() {
        clickMenu();
        clickContacts();
        checkUrl();
        return new Contacts(driver);
    }


}
