package creative;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static creative.Values.*;

public class Contacts extends Driver {

    public Contacts(WebDriver driver) {super(driver);}

    public void checkIfDataIsVisible(){
        for(String line : DATA) {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@class='tn-atom' and text()='" + line + "']"));
            Assertions.assertTrue(elements.get(0).isDisplayed(), "One of the elements on " +
                    "the contacts page is not present and/or visible");
        }
    }
}
