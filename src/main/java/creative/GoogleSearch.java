package creative;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static creative.Values.*;

public class GoogleSearch  extends Driver {

    @FindBy(xpath = ".//input[@role='combobox']")
    WebElement searchField;

    List<WebElement> searchButton = driver.findElements(By.xpath(".//input[@value='Поиск в Google']"));

    @FindBy(xpath = ".//a[@href='https://crtweb.ru/']")
    WebElement siteLink;


    public GoogleSearch (WebDriver driver) {super(driver);}

    public void inputQuery() {
        searchField.sendKeys(QUERY);
    }

    public void clickSearch() {
        searchButton.get(1).click();
    }

    public void clickLink() {
        siteLink.click();
    }

    public void checkUrl() {
        Assertions.assertEquals(driver.getCurrentUrl(), SITE_URL, "Current URL is not equal to " + SITE_URL);
    }

    public MainPage search() {
        inputQuery();
        clickSearch();
        clickLink();
        checkUrl();
        return new MainPage(driver);
    }


}
