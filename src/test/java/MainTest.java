import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainTest extends WebTest {

    GooglePage googlePage = new GooglePage();
    @Test
    public void testLogin() {
        open("https://www.google.ru");

        googlePage.setSearch();
    }
}