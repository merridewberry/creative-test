package creative;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static creative.Values.*;

public class SearchTest extends DriverTest {

    @BeforeAll
    public void goToGoogle() {
        DriverTest.driver.get(GOOGLE_URL);
    }

    @Test
    public void search() {
        new GoogleSearch(DriverTest.driver)
                .search()
                .goToContacts()
                .checkIfDataIsVisible();
    }
}
