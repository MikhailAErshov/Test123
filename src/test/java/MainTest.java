import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class MainTest extends WebTest {

    GooglePage googlePage = new GooglePage();
    @Test
    public void testLogin() {
        open("https://aptekaeconom.com/");
        Selenide.webdriver().driver().getWebDriver().manage().addCookie(new Cookie("current_region", "103006"));
        refresh();

//        googlePage.setSearch();
    }
}